package com.example.tracetogether.Application.Vaccination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tracetogether.R;

public class VacHomeUser extends AppCompatActivity {

    Button buttonVacSelf, buttonVacDep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vac_home_user);

        buttonVacSelf = findViewById(R.id.btnVacSelf);
        buttonVacDep = findViewById(R.id.btnVacDep);

        // link to next page
        buttonVacSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VacHomeUser.this, UserConfirmAppt.class));
            }
        });

        //link to next page
        buttonVacDep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VacHomeUser.this, DepRegAppt.class);
                startActivity(intent);
            }
        });
    }
}