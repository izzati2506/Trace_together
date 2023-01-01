package com.example.tracetogether.Application.Quarantine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.tracetogether.R;

import android.view.View;
import android.widget.Button;

public class Quarantine_User_Covid19status extends AppCompatActivity {
    Button btn_starthealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine_user_covid19status);
        btn_starthealth= findViewById(R.id.start_health);

        btn_starthealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quarantine_User_Covid19status.this,Quarantine_User_HealthStatus.class));
            }
        });
    }

}