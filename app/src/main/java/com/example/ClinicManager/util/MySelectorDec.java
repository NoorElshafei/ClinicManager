package com.example.ClinicManager.util;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.example.ClinicManager.R;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;

public class MySelectorDec implements DayViewDecorator {

    private Drawable drawable  = null;
    public MySelectorDec(Context context) {
        drawable = context.getResources().getDrawable(R.drawable.my_selector_calendar);
    }
    @Override
    public boolean shouldDecorate(CalendarDay day) {
        return true;
    }

    @Override
    public void decorate(DayViewFacade view) {
        view.setSelectionDrawable(drawable);
    }
}
