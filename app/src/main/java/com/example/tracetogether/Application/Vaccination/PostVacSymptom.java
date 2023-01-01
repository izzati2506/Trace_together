package com.example.tracetogether.Application.Vaccination;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.tracetogether.R;

public class PostVacSymptom extends AppCompatActivity {

    CheckBox chb1, chb2, chb3, chb4, chb5, chb6;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_vac_symptom);

        chb1 = findViewById(R.id.cb1);
        chb2 = findViewById(R.id.cb2);
        chb3 = findViewById(R.id.cb3);
        chb4 = findViewById(R.id.cb4);
        chb5 = findViewById(R.id.cb5);
        chb6 = findViewById(R.id.cb6);
        btnSubmit = findViewById(R.id.btnSub);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(chb1.isChecked() && chb2.isChecked() && chb3.isChecked() && chb4.isChecked() && chb5.isChecked() && chb6.isChecked()) {
                    Toast.makeText(PostVacSymptom.this, "Please consult nearest medical officer", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(PostVacSymptom.this, UserStatusPage.class));
                }
                else {
                    startActivity(new Intent(PostVacSymptom.this, UserStatusPage.class));
                }
            }
        });
    }
}