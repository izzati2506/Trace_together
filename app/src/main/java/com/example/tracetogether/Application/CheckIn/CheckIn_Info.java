package com.example.tracetogether.Application.CheckIn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tracetogether.R;
/*
*
* This class is able to display the check in information details
*
* */
public class CheckIn_Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_checkin_info);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Declaration for button
        Button returnB = findViewById(R.id.countinueButton);

        //Navigate to check-out information page
        returnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckIn_Info.this, CheckOut_Info.class));
            }
        });
    }


}
