 package com.lightningspace.gh.pro_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

 public class MainActivity extends AppCompatActivity {
    private MaterialToolbar toolbar;
    private DrawerLayout drawerLayout;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.topAppBar);
        ExtendedFloatingActionButton extendedFloatingActionButton = findViewById(R.id.extendedFloatingActionButton);

        toolbar.setNavigationOnClickListener(view -> {
            Snackbar snackbar = Snackbar.make(toolbar,"Menu Tabbed",Snackbar.LENGTH_SHORT);
            snackbar.show();
           drawerLayout = findViewById(R.id.drawerLayout);
            drawerLayout.openDrawer(GravityCompat.START);
        });

        toolbar.setOnMenuItemClickListener(item -> {
            switch (item.getItemId()){
                case R.id.favorite:
                    Snackbar snackbarF = Snackbar.make(toolbar,"Favorite Tabbed",Snackbar.LENGTH_SHORT);
                    snackbarF.show();
                    return true;
                case R.id.search:
                    Snackbar snackbarS = Snackbar.make(toolbar,"Search Tabbed",Snackbar.LENGTH_SHORT);
                    snackbarS.show();
                    return true;
                case R.id.more:
                    Snackbar snackbarM = Snackbar.make(toolbar,"More Tabbed",Snackbar.LENGTH_SHORT);
                    snackbarM.show();
                    return true;
            }
            return false;
        });

        MaterialCardView card = findViewById(R.id.card);
        card.setOnClickListener(view ->{
                Snackbar snackbar = Snackbar.make(card,"Card Tabbed",Snackbar.LENGTH_SHORT);
                snackbar.show();
        });

        MaterialButton download = findViewById(R.id.downloadBtn);
        download.setOnClickListener(view -> {
            Snackbar snackbar = Snackbar.make(download,"Download Button Tabbed",Snackbar.LENGTH_SHORT);
            snackbar.show();
        });

        MaterialButton share = findViewById(R.id.shareIcon);
        share.setOnClickListener(view -> {
            Snackbar snackbar = Snackbar.make(share,"Share Icon Tabbed",Snackbar.LENGTH_SHORT);
            snackbar.show();
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.popular:
                    Snackbar snackbarP = Snackbar.make(toolbar,"Popular Tabbed",Snackbar.LENGTH_SHORT);
                    snackbarP.show();
                    return true;
                case R.id.premier:
                    Snackbar snackbarPr = Snackbar.make(toolbar,"Premier Tabbed",Snackbar.LENGTH_SHORT);
                    snackbarPr.show();
                    return true;
                case R.id.live:
                    Snackbar snackbarL = Snackbar.make(toolbar,"Live Tabbed",Snackbar.LENGTH_SHORT);
                    snackbarL.show();
                    return true;
                case R.id.newIcon:
                    Snackbar snackbarN = Snackbar.make(toolbar,"New Tabbed",Snackbar.LENGTH_SHORT);
                    snackbarN.show();
                    return true;
                case R.id.watched:
                    Snackbar snackbarW = Snackbar.make(toolbar,"Watched Tabbed",Snackbar.LENGTH_SHORT);
                    snackbarW.show();
                    return true;
            }
            return false;
        });

        extendedFloatingActionButton.setOnClickListener(view -> {
            Snackbar snackbar = Snackbar.make(extendedFloatingActionButton,"Extended FAB Tabbed",Snackbar.LENGTH_SHORT);
            snackbar.show();
        });

    }
}