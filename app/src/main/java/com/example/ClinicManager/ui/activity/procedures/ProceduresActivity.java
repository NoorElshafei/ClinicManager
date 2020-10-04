package com.example.ClinicManager.ui.activity.procedures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.adapter.PatientAdapter;
import com.example.ClinicManager.ui.adapter.ProceduresAdapter;
import com.example.ClinicManager.ui.fragment.patient.PatientsViewModel;

public class ProceduresActivity extends AppCompatActivity {

    private ProceduresAdapter proceduresAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedures);

        recyclerView = findViewById(R.id.procedures_recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        proceduresAdapter = new ProceduresAdapter(this);

        recyclerView.setAdapter(proceduresAdapter);

    }
}