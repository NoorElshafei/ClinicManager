package com.example.ClinicManager.ui.activity.patient_details;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.activity.edit_profile.EditProfileActivity;

public class PatientDetailsActivity extends AppCompatActivity {
   private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);

        button = findViewById(R.id.edit_profile_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PatientDetailsActivity.this, EditProfileActivity.class));
            }
        });
    }
}