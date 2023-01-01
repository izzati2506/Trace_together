package com.example.tracetogether.Application.Homepage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.tracetogether.Application.CheckIn.CheckIn_User;
import com.example.tracetogether.Application.Dependent.DependentPage;
import com.example.tracetogether.Application.Quarantine.Quarantine_User;
import com.example.tracetogether.Application.Vaccination.VacHomeUser;
import com.example.tracetogether.R;

public class User_Homepage extends AppCompatActivity {

    ConstraintLayout check, btnVac, btnDep, btnQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_home);

        check = findViewById(R.id.checkIn);
        btnVac = findViewById(R.id.vaccine);
        btnDep = findViewById(R.id.dependent);
        btnQua = findViewById(R.id.quarantine);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(User_Homepage.this, CheckIn_User.class));
            }
        });

        btnVac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User_Homepage.this, VacHomeUser.class));
            }
        });

        btnDep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User_Homepage.this, DependentPage.class));
            }
        });

        btnQua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User_Homepage.this, Quarantine_User.class));
            }
        });
    }
}
