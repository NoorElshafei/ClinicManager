package com.example.ClinicManager.ui.fragment.appointment_list;

import androidx.lifecycle.ViewModelProviders;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.CalendarContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ClinicManager.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class AppointmentListFragment extends Fragment {

    private AppointmentListViewModel mViewModel;

    public static AppointmentListFragment newInstance() {
        return new AppointmentListFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.appointment_list_fragment, container, false);

      /*  Date c = Calendar.getInstance().getTime();

        ContentResolver cr = getContext().getContentResolver();
        ContentValues values = new ContentValues();

        values.put(CalendarContract.Events.DTSTART, c.getTime());
        values.put(CalendarContract.Events.TITLE, "title");
        values.put(CalendarContract.Events.DESCRIPTION, "comment");

        TimeZone timeZone = TimeZone.getDefault();
        values.put(CalendarContract.Events.EVENT_TIMEZONE, timeZone.getID());

// Default calendar
        values.put(CalendarContract.Events.CALENDAR_ID, 1);

        //values.put(CalendarContract.Events.RRULE, "FREQ=DAILY;UNTIL=" + dtUntill);
// Set Period for 1 Hour
        values.put(CalendarContract.Events.DURATION, "+P1H");

        values.put(CalendarContract.Events.HAS_ALARM, 1);

        SimpleDateFormat yyyymmdd = new SimpleDateFormat("yyyymmdd");
        Calendar dt = view.findViewById(R.id.calendar);

                // where untilDate is a date instance of your choice,for example 30/01/2012
                dt.setTime(dt.getTime());


        // if you want the event until 30/01/2012 we add one day from our day
        // because UNTIL in RRule sets events Before the last day want for event
        dt.add(Calendar.DATE, 1);
        String dtUntill = yyyymmdd.format(dt.getTime());

        Uri uri = cr.insert(CalendarContract.Events.CONTENT_URI, values);

       *//* // get the event ID that is the last element in the Uri
        long eventID = Long.parseLong(uri.getLastPathSegment());
        // add 10 minute reminder for the event
        ContentValues reminders = new ContentValues();
        reminders.put(CalendarContract.Reminders.EVENT_ID, eventID);
        reminders.put(CalendarContract.Reminders.METHOD, CalendarContract.Reminders.METHOD_ALERT);
        reminders.put(CalendarContract.Reminders.MINUTES, 10);*/
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AppointmentListViewModel.class);
        // TODO: Use the ViewModel

    }

    public void addEvent() {
        Date c = Calendar.getInstance().getTime();
        ContentResolver cr = getContext().getContentResolver();
        ContentValues eventValues = new ContentValues();
        eventValues.put(CalendarContract.Events.TITLE, "title");
        eventValues.put(CalendarContract.Events.EVENT_LOCATION, "location");
        eventValues.put(CalendarContract.Events.DTSTART, c.getTime());
        eventValues.put(CalendarContract.Events.DTEND, c.getTime());
        eventValues.put(CalendarContract.Events.CALENDAR_ID, "1");//Defaul calendar
        eventValues.put(CalendarContract.Events.EVENT_TIMEZONE, TimeZone.SHORT);
        cr.insert(CalendarContract.Events.CONTENT_URI, eventValues);
    }
}