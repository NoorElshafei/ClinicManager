package com.example.ClinicManager.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.activity.patient_details.PatientDetailsActivity;

public class DrugAdapter extends RecyclerView.Adapter<DrugAdapter.DrugViewHolder> {

    Context context;

    public DrugAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public DrugAdapter.DrugViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.drug_item, parent, false);
        return new DrugViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DrugViewHolder holder, int position) {

      /*  holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PatientDetailsActivity.class);
                context.startActivity(intent);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class DrugViewHolder extends RecyclerView.ViewHolder {

        public DrugViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
