package com.example.tracetogether.Application.Vaccination;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.tracetogether.R;

public class UserStatusPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_status_page);
    }

    // when click back, link to the page stated
    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(UserStatusPage.this, VacHomeUser.class));
    }
}