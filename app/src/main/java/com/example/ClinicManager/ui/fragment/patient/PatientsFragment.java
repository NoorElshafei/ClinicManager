package com.example.ClinicManager.ui.fragment.patient;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.adapter.PatientAdapter;


public class PatientsFragment extends Fragment {

    private PatientsViewModel mViewModel;
    private PatientAdapter patientAdapter;
    private RecyclerView recyclerView;

    public static PatientsFragment newInstance() {
        return new PatientsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.patients_fragment, container, false);

        recyclerView = view.findViewById(R.id.patient_recycler);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(PatientsViewModel.class);
        // TODO: Use the ViewModel

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        patientAdapter = new PatientAdapter(getContext());

        recyclerView.setAdapter(patientAdapter);
    }

}
