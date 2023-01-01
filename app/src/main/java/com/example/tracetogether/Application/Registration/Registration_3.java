package com.example.tracetogether.Application.Registration;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tracetogether.R;

public class Registration_3 extends AppCompatActivity {
    Button Register_btn;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_3);
        Register_btn=(Button) findViewById(R.id.Register_btn);

        Register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Registration_3.this, Registration_4.class));
            }
        });
    }


    // Registration Intent to get to registration page

    public void openRegistration_4() {
        Intent intent = new Intent(Registration_3.this, Registration_4.class);
        startActivity(intent);
    }

}
