package com.example.ClinicManager.ui.activity.drug_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.activity.add_drug.AddDrugActivity;
import com.example.ClinicManager.ui.activity.procedures.ProceduresActivity;
import com.example.ClinicManager.ui.adapter.DrugAdapter;
import com.example.ClinicManager.ui.adapter.ProceduresAdapter;

public class DrugListActivity extends AppCompatActivity {
    private DrugAdapter drugAdapter;
    private RecyclerView recyclerView;
    private CardView addDrug;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug_list);

        recyclerView = findViewById(R.id.procedures_recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        drugAdapter = new DrugAdapter(this);

        recyclerView.setAdapter(drugAdapter);

        addDrug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DrugListActivity.this, AddDrugActivity.class));
            }
        });
    }
}