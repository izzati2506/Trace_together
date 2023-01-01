package com.example.tracetogether.Application.CheckIn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.tracetogether.R;

/*
*
* This class is to display the list of movement history for the user.
* MOH staff may click on the user name to view their past movement
* */

public class CheckIn_MOH extends AppCompatActivity {

    private ConstraintLayout user1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moh_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Decalaration for view user information
        user1 = findViewById(R.id.user1);

        //Navigate to user information
        user1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CheckIn_MOH.this, CheckIn_UserMovement.class));
            }
        });
    }
}
