package com.example.ClinicManager.ui.activity.sign_in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ClinicManager.MainActivity;
import com.example.ClinicManager.R;

public class SignInActivity extends AppCompatActivity {
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        signIn = findViewById(R.id.sign_in_button);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });
        
    }
}
