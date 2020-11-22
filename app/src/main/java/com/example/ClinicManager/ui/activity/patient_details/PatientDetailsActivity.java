package com.example.ClinicManager.ui.activity.patient_details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.activity.edit_profile.AddOrEditPatientProfileActivity;
import com.example.ClinicManager.ui.activity.medical_history.MedicalHistoryActivity;
import com.example.ClinicManager.ui.activity.treatment_plan.TreatmentPlanActivity;

public class PatientDetailsActivity extends AppCompatActivity implements View.OnClickListener {
   private Button editProfileButton;
   private CardView medicalHistory,treatmentPlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);

        editProfileButton = findViewById(R.id.edit_profile_button);
        medicalHistory = findViewById(R.id.medical_History);
        treatmentPlan = findViewById(R.id.treatment_plan);

        editProfileButton.setOnClickListener(this);
        medicalHistory.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == editProfileButton){
            startActivity(new Intent(PatientDetailsActivity.this, AddOrEditPatientProfileActivity.class));
        }
        else if(view == medicalHistory){
            startActivity(new Intent(PatientDetailsActivity.this, MedicalHistoryActivity.class));

        }else if(view == treatmentPlan){
            startActivity(new Intent(PatientDetailsActivity.this, TreatmentPlanActivity.class));

        }
    }
}