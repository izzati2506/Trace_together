package com.example.tracetogether.Application.CheckIn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.tracetogether.Application.Homepage.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tracetogether.R;
/*
* This class is to display the check in main page for the user
* It contains with the latest check-in information and check in button to navigate to the next page
* which is select dependent. User may click on the view all text to view their past movement
*
* */
public class CheckIn_User extends AppCompatActivity {

    private Button checkIn;
    private ConstraintLayout history;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_checkin_page);
        //back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //check in button
        checkIn = findViewById(R.id.checkIn_Button);
        //history button
        history = findViewById(R.id.History);

        checkIn.setOnClickListener(new View.OnClickListener() {

            //CheckIn Button to navigate to select dependent page
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckIn_User.this, CheckIn_SelectDependent.class) );
            }
        });

        //View all Button to navigate to history page
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CheckIn_User.this, CheckIn_History.class));
            }
        });
    }
}
