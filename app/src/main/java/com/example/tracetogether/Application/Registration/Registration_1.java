package com.example.tracetogether.Application.Registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tracetogether.Application.Login.Login;
import com.example.tracetogether.R;

public class Registration_1 extends AppCompatActivity {

    Button button2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registeration_1);

            button2=(Button) findViewById(R.id.button2);

            button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Registration_1.this, Registration_2.class));
            }

        });
    }

    // Registration Intent to get to registration page
    public void openRegistration_2() {

        Intent intent = new Intent(Registration_1.this, Registration_2.class);
        startActivity(intent);
    }
}



