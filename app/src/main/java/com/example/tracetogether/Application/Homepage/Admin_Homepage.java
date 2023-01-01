package com.example.tracetogether.Application.Homepage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.tracetogether.Application.Login.Login;
import com.example.tracetogether.Application.Profile.User_Profile;
import com.example.tracetogether.Application.Quarantine.Quarantine_Admin;
import com.example.tracetogether.R;

public class Admin_Homepage extends AppCompatActivity {

    ConstraintLayout btnQuarantine, btnProfile;
    ImageView btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_home);

        btnQuarantine = findViewById(R.id.quarantine);
        btnProfile = findViewById(R.id.profile);
        btnLogout = findViewById(R.id.logout);

        btnQuarantine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Admin_Homepage.this, Quarantine_Admin.class));
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Admin_Homepage.this, User_Profile.class));
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Admin_Homepage.this, Login.class));
            }
        });
    }
}
