package com.example.tracetogether.Application.Vaccination;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tracetogether.Data.Model.Vaccination_Record;
import com.example.tracetogether.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserViewAppt extends AppCompatActivity {

    TextView vacType, vacLocation, vacDate, vacTime;
    EditText medId;
    Button btnSubmit;
    Vaccination_Record user;
    DatabaseReference dbref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_view_appt);

        vacType = findViewById(R.id.tvVacType);
        vacLocation = findViewById(R.id.tvVacLoc);
        vacDate = findViewById(R.id.tvVacDate);
        vacTime = findViewById(R.id.tvVacTime);
        medId = findViewById(R.id.etMedId);
        btnSubmit = findViewById(R.id.btnSub);

        user = new Vaccination_Record();

        // declare reference for database
        dbref = FirebaseDatabase.getInstance().getReference().child("patient_list");

        // link to next page on button click
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // trigger value in database on data change
                dbref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()) {
                            String data = snapshot.getValue().toString();
                            vacType.setText(data);
                            vacLocation.setText(data);
                            vacDate.setText(data);
                            vacTime.setText(data);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                // if MOH TGR ID equals then link to next page
                if(medId.getText().toString().equals("456")) {
                    startActivity(new Intent(UserViewAppt.this, PostVacSymptom.class));
                }
                else {
                    Toast.makeText(UserViewAppt.this, "Please enter correct credential", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
