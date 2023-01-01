package com.example.tracetogether.Application.Quarantine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.tracetogether.Data.Model.UserQuarantine_Record;
import com.example.tracetogether.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Quarantine_User_UpdateRecord extends AppCompatActivity {

    /*DECLARE THE VARIABLE*/
    EditText name;
    UserQuarantine_Record user;

    /*Connect to the database*/
    DatabaseReference mydb;

    /*INSERT INPUT TO THE DATABASE*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine_user_update_record);

        name= findViewById(R.id.editName);

        user= new UserQuarantine_Record();

        mydb= FirebaseDatabase.getInstance().getReference().child("Users");
    }
}