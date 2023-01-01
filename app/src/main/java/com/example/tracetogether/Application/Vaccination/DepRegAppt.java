package com.example.tracetogether.Application.Vaccination;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tracetogether.R;

public class DepRegAppt extends AppCompatActivity {

    TextView depName, depIc, depPhoneNo;
    Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dep_reg_appt);

        depName = findViewById(R.id.tvDepName);
        depIc = findViewById(R.id.tvDepIc);
        depPhoneNo = findViewById(R.id.tvDepPhone);
        btnConfirm = findViewById(R.id.btnCon);

        // on button click, go to next page
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}