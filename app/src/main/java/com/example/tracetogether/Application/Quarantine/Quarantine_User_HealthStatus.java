package com.example.tracetogether.Application.Quarantine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tracetogether.R;

public class Quarantine_User_HealthStatus extends AppCompatActivity {

    Button btn_submit_health;

    /*To direct the submit button back to user quarantine record page*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine_user_health_status);

        btn_submit_health= findViewById(R.id.submit_health);

        btn_submit_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quarantine_User_HealthStatus.this,Quarantine_User_Record.class));
            }
        });
    }
}