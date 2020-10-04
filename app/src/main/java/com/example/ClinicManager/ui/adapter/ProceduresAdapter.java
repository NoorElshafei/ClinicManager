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

public class ProceduresAdapter  extends RecyclerView.Adapter<ProceduresAdapter.ProceduresViewHolder> {
    Context context ;

    public ProceduresAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ProceduresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.procedures_item, parent, false);
        return new ProceduresViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProceduresViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PatientDetailsActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class ProceduresViewHolder extends RecyclerView.ViewHolder {
        public ProceduresViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
