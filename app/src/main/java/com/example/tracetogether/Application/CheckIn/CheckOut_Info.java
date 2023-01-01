package com.example.tracetogether.Application.CheckIn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tracetogether.R;
/*
*
* This class is to display  check out information details
*
* */
public class CheckOut_Info extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_checkout_info);

        //declaration for return button
        Button returnB = findViewById(R.id.ReturnButton);

        //Return button to navigate to check in main page for the user
        returnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckOut_Info.this, CheckIn_User.class));
            }
        });

    }
}
