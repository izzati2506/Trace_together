package com.example.tracetogether.Application.Quarantine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tracetogether.R;
public class Quarantine_User_Record extends AppCompatActivity {
    Button btn_update;
    Button btn_health;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine_user_record);
        btn_update= findViewById(R.id.go_update);
        btn_health= findViewById(R.id.go_health);

        /*To direct the update button to the User update record page*/
        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quarantine_User_Record.this, Quarantine_User_UpdateRecord.class));
            }
        });

        /*To direct the health status button to Quarantine health status question page*/
        btn_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Quarantine_User_Record.this, Quarantine_User_HealthStatus.class));
            }
        });



    }




}