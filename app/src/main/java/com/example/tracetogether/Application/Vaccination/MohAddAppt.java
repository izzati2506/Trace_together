package com.example.tracetogether.Application.Vaccination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.tracetogether.Data.Model.Vaccination_Record;
import com.example.tracetogether.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MohAddAppt extends AppCompatActivity {

    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired time passed between two back presses.
    private long mBackPressed;

    EditText name, ic, phoneNo;
    Spinner vacType, vacLocation, vacDate, vacTime;
    Button btnSubmit;
    Vaccination_Record user;

    DatabaseReference dbref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moh_add_appt);

        name = findViewById(R.id.etName);
        ic = findViewById(R.id.etIc);
        phoneNo = findViewById(R.id.etPhone);
        vacType = findViewById(R.id.spinVacType);
        vacLocation = findViewById(R.id.spinVacLocation);
        vacDate = findViewById(R.id.spinVacDate);
        vacTime = findViewById(R.id.spinVacTime);
        btnSubmit = findViewById(R.id.btnSub);
        user = new Vaccination_Record();

        dbref = FirebaseDatabase.getInstance().getReference().child("patient_list");

        // spinner array for vaccine type
        String[] vac_type = {"Select", "Astrazaneca", "Cansino", "Pfizer", "Sinovac"};
        ArrayAdapter adapter1 = new ArrayAdapter(MohAddAppt.this,android.R.layout.simple_list_item_1,vac_type);
        vacType.setAdapter(adapter1);

        // spinner array for vaccination location
        String[] vac_location = {"Select", "PPV Johor", "PPV Kedah", "PPV Kelantan", "PPV Melaka", "PPV Negeri Sembilan", "PPV Pahang",
                "PPV Perak", "PPV Perlis", "PPV Pulau Pinang", "PPV Selangor", "PPV Terengganu", "PPV Sabah", "PPV Sarawak",
                "PPV WP Kuala Lumpur", "PPV WP Putrajaya", "PPV WP Labuan"};
        ArrayAdapter adapter2 = new ArrayAdapter(MohAddAppt.this,android.R.layout.simple_list_item_1,vac_location);
        vacLocation.setAdapter(adapter2);

        // spinner array for vaccination date
        String[] vac_date = {"Select", "01/06/2022", "02/06/2022", "03/06/2022", "04/06/2022", "05/06/2022", "06/06/2022", "07/06/2022"};
        ArrayAdapter adapter3 = new ArrayAdapter(MohAddAppt.this,android.R.layout.simple_list_item_1,vac_date);
        vacDate.setAdapter(adapter3);

        // spinner array for vaccination time
        String[] vac_time = {"Select", "9:00AM", "10:00AM", "11:00AM", "12:00PM", "01:00PM", "02:00PM", "03:00PM", "04:00PM"};
        ArrayAdapter adapter4 = new ArrayAdapter(MohAddAppt.this,android.R.layout.simple_list_item_1,vac_time);
        vacTime.setAdapter(adapter4);

        // on button click, link to next page
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // if user select "Select, toast message
                if(vacType.getSelectedItem().toString().equals("Select") || vacType.getSelectedItem().toString().equals("Select") ||
                        vacDate.getSelectedItem().toString().equals("Select") || vacTime.getSelectedItem().toString().equals("Select")) {
                    Toast.makeText(MohAddAppt.this, "Please make selection", Toast.LENGTH_SHORT).show();
                }
                else {
                    user.setName(name.getText().toString().trim());
                    user.setIc(ic.getText().toString().trim());
                    user.setPhoneNo(phoneNo.getText().toString().trim());
                    user.setVacType(vacType.getSelectedItem().toString().trim());
                    user.setVacLocation(vacLocation.getSelectedItem().toString().trim());
                    user.setVacDate(vacDate.getSelectedItem().toString().trim());
                    user.setVacTime(vacTime.getSelectedItem().toString().trim());

                    dbref.push().setValue(user);

                    Toast.makeText(MohAddAppt.this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MohAddAppt.this, MohViewAppt.class));
                    finish();
                }
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis())
        {
            super.onBackPressed();
            return;
        }
        else { Toast.makeText(getBaseContext(), "Tap back button in order to exit", Toast.LENGTH_SHORT).show(); }

        mBackPressed = System.currentTimeMillis();
    }
}