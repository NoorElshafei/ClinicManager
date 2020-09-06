package com.example.ClinicManager.ui.activity.sign_up;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ClinicManager.MainActivity;
import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.activity.sign_in.SignInActivity;

public class SignUpActivity extends AppCompatActivity {
    Button signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signUp = findViewById(R.id.signUp_button);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
