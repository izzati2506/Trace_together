package com.example.tracetogether.Application.Registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tracetogether.R;

public class Registration_2 extends AppCompatActivity {

    Button button3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registeration_2);
        button3=(Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registration_2.this, Registration_3.class));
            }

        });
    }

    // Registration Intent to get to registration page
    public void openRegistration_3() {

        Intent intent3 = new Intent(Registration_2.this, Registration_3.class);
        startActivity(intent3);
    }

}

