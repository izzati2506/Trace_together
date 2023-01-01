package com.example.tracetogether.Application.Vaccination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tracetogether.Data.Model.Vaccination_Record;
import com.example.tracetogether.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MohEditAppt extends AppCompatActivity {

    EditText name, ic, phoneNo;
    Button btnSubmit;
    Vaccination_Record user;

    DatabaseReference dbref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moh_edit_appt);

        name = findViewById(R.id.etName);
        ic = findViewById(R.id.etIc);
        phoneNo = findViewById(R.id.etPhone);
        btnSubmit = findViewById(R.id.btnSub);

        user = new Vaccination_Record();

        dbref = FirebaseDatabase.getInstance().getReference().child("patient_list");

        // on button click, go to next page
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user.setName(name.getText().toString().trim());
                user.setIc(ic.getText().toString().trim());
                user.setPhoneNo(phoneNo.getText().toString().trim());

                dbref.push().setValue(user);

                Toast.makeText(MohEditAppt.this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MohEditAppt.this, MohViewAppt.class));
            }
        });
    }
}