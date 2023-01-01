package com.example.tracetogether.Application.Quarantine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.tracetogether.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Quarantine_Admin extends AppCompatActivity {

    /*Declare the variable to be insert*/

    EditText userid;
    EditText quarantine_startdate;
    EditText quarantine_enddate;
    EditText quarantine_address;
    //AdminQuarantine_Record admin;

    DatabaseReference mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine_admin);

        userid= findViewById(R.id.edituserid);
        quarantine_startdate= findViewById(R.id.start_date);
        quarantine_enddate= findViewById(R.id.end_date);
        quarantine_address= findViewById(R.id.quarantine_address);
        //admin= new UserQuarantine_Record();

        mydb= FirebaseDatabase.getInstance().getReference().child("Admins");
    }
}