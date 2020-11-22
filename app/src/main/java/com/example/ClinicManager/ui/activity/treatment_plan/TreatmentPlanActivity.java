package com.example.ClinicManager.ui.activity.treatment_plan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.adapter.MedicalHistoryAdapter;
import com.example.ClinicManager.ui.adapter.TreatmentAdapter;

public class TreatmentPlanActivity extends AppCompatActivity {
    private TreatmentAdapter treatmentAdapter;
    private RecyclerView treatRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatement_plan);

        treatRecycler = findViewById(R.id.treatment_plan_recycler);

        treatRecycler.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        treatmentAdapter = new TreatmentAdapter(this);

        treatRecycler.setAdapter(treatmentAdapter);
    }
}