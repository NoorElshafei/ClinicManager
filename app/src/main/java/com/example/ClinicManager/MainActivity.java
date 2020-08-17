package com.example.ClinicManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.ClinicManager.ui.fragment.appointment_list.AppointmentListFragment;
import com.example.ClinicManager.ui.fragment.dashboard.DashBoardFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private DrawerLayout drawer;
    private ImageView menu;
    private LinearLayout appointmentMenuItem, dashBoardMenuItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer = findViewById(R.id.drawer_layout);
        menu = findViewById(R.id.menu_image);
        appointmentMenuItem = findViewById(R.id.appointment_menu_item);
        dashBoardMenuItem = findViewById(R.id.dashboard_menu_item);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, DashBoardFragment.newInstance(), "DashBoardFragment")
                .commit();

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getDrawer().isDrawerOpen(GravityCompat.START)) {
                    getDrawer().closeDrawer(GravityCompat.START);
                } else {
                    getDrawer().openDrawer(GravityCompat.START);
                }
            }
        });


        dashBoardMenuItem.setOnClickListener(this);
        appointmentMenuItem.setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {

        if (getDrawer().isDrawerOpen(GravityCompat.START)) {
            getDrawer().closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public DrawerLayout getDrawer() {
        return drawer;
    }

    @Override
    public void onClick(View view) {
        if (view == appointmentMenuItem) {
            openFragment(new AppointmentListFragment());
        } else if (view == dashBoardMenuItem) {
            openFragment(new DashBoardFragment());
        }
    }

    private void openFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment).addToBackStack(null).commit();
        getDrawer().closeDrawer(GravityCompat.START);
    }
}
