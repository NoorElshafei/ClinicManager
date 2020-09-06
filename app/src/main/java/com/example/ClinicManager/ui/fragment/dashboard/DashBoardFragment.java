package com.example.ClinicManager.ui.fragment.dashboard;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.activity.new_schedule.NewScheduleActivity;


public class DashBoardFragment extends Fragment {

    private DashBoardViewModel mViewModel;
    private ImageView addAppointment;

    public static DashBoardFragment newInstance() {
        return new DashBoardFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dash_board_fragment, container, false);
        addAppointment = view.findViewById(R.id.add_appointment);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(DashBoardViewModel.class);
        // TODO: Use the ViewModel

        addAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NewScheduleActivity.class);
                startActivity(intent);
            }
        });

    }

}