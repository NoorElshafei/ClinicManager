package com.example.ClinicManager.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.activity.patient_details.PatientDetailsActivity;

public class PatientAdapter extends RecyclerView.Adapter<PatientAdapter.PatientViewHolder> {

    Context context;

    public PatientAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public PatientAdapter.PatientViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.patient_item, parent, false);
        return new PatientViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PatientViewHolder holder, int position) {

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

    public class PatientViewHolder extends RecyclerView.ViewHolder {

        public PatientViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
