package com.example.ClinicManager.ui.fragment.my_clinic;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.activity.clinic_profile.ClinicProfileActivity;
import com.example.ClinicManager.ui.activity.procedures.ProceduresActivity;


public class MyClinicFragment extends Fragment {

    private MyClinicViewModel mViewModel;
    private LinearLayout profileLinear,procedureLinear;

    public static MyClinicFragment newInstance() {
        return new MyClinicFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_clinic_fragment, container, false);
        profileLinear = view.findViewById(R.id.clinic_profile) ;
        procedureLinear = view.findViewById(R.id.procedure_Linear) ;
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MyClinicViewModel.class);
        // TODO: Use the ViewModel


        profileLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ClinicProfileActivity.class));
            }
        });
        procedureLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ProceduresActivity.class));
            }
        });
    }

}