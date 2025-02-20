package com.example.tg_patient_profile.view.general;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.tg_patient_profile.R;

public class MainPageWithMenuActivity extends AppCompatActivity {

    DrawerLayout menu_DrawerLayout;
    Button menu_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page_with_menu);
        menu_DrawerLayout = findViewById(R.id.menu_drawerLayout);
        menu_button = findViewById(R.id.menu_button_main_page);

        menu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("clikced","yes");
                if (menu_DrawerLayout.isDrawerOpen(GravityCompat.START)) {
                    menu_DrawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    menu_DrawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });




    }
}
