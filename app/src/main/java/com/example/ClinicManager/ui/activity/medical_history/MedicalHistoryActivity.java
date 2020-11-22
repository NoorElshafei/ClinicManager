package com.example.ClinicManager.ui.activity.medical_history;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.adapter.DrugAdapter;
import com.example.ClinicManager.ui.adapter.MedicalHistoryAdapter;

public class MedicalHistoryActivity extends AppCompatActivity {
    private RecyclerView medialHistoryRecycler;
    private MedicalHistoryAdapter medicalHistoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_history);

        medialHistoryRecycler = findViewById(R.id.medical_history_recycler);

        medialHistoryRecycler.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        medicalHistoryAdapter = new MedicalHistoryAdapter(this);

        medialHistoryRecycler.setAdapter(medicalHistoryAdapter);
    }
}