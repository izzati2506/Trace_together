package com.example.tracetogether.Application.CheckIn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tracetogether.Application.Homepage.MOH_Homepage;
import com.example.tracetogether.R;
/*
*
* This page is to scan the Qr code
*
* */

public class Qr_Scanner extends AppCompatActivity {

    private Button scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_qr_scanner);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //declaration for scan button
        scan = findViewById(R.id.scanButton);

        //Scan button to navigate to check info page
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Qr_Scanner.this, CheckIn_Info.class));
            }
        });
    }
}
