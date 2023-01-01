package com.example.tracetogether.Application.Quarantine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tracetogether.R;

public class Quarantine_User_updateselftest extends AppCompatActivity {

    Button btn_submit_test;

    /*To direct user after click the submit button to go to the user main page*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine_updateselftest);

        btn_submit_test= findViewById(R.id.submit_test);

        btn_submit_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quarantine_User_updateselftest.this,Quarantine_User.class));
            }
        });
    }
}