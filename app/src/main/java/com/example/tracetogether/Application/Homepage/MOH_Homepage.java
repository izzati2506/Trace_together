package com.example.tracetogether.Application.Homepage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.tracetogether.Application.CheckIn.*;
import com.example.tracetogether.Application.Quarantine.Quarantine_MOH;
import com.example.tracetogether.Application.Vaccination.VacHomeMoh;
import com.example.tracetogether.R;

public class MOH_Homepage extends AppCompatActivity {

    ConstraintLayout check, btnVac, btnQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moh_home);

        check = findViewById(R.id.CheckIn);
        btnVac = findViewById(R.id.Vaccine);
        btnQua = findViewById(R.id.Quarantine);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MOH_Homepage.this, CheckIn_MOH.class));
            }
        });

        btnVac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MOH_Homepage.this, VacHomeMoh.class));
            }
        });

        btnQua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MOH_Homepage.this, Quarantine_MOH.class));
            }
        });
    }
}
