package com.example.ClinicManager.ui.activity.medical_history;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.adapter.DrugAdapter;
import com.example.ClinicManager.ui.adapter.MedicalHistoryAdapter;

public class MedicalHistoryActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView medialHistoryRecycler;
    private MedicalHistoryAdapter medicalHistoryAdapter;
    private CardView addMedical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_history);

        medialHistoryRecycler = findViewById(R.id.medical_history_recycler);
        addMedical = findViewById(R.id.add_medical_button);

        addMedical.setOnClickListener(this);

        medialHistoryRecycler.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        medicalHistoryAdapter = new MedicalHistoryAdapter(this);

        medialHistoryRecycler.setAdapter(medicalHistoryAdapter);
    }

    @Override
    public void onClick(View view) {
        if(view == addMedical){
            startActivity(new Intent(this,AddHistoryActivity.class));
        }
    }
}