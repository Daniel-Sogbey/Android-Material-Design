 package com.lightningspace.gh.pro_one;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private MaterialToolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.topAppBar);
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton);

        toolbar.setNavigationOnClickListener(view -> {
            Snackbar snackbar = Snackbar.make(toolbar,"Menu Tabbed",Snackbar.LENGTH_SHORT);
            snackbar.show();
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

        floatingActionButton.setOnClickListener(view -> {
            Snackbar snackbar = Snackbar.make(floatingActionButton,"FAB Tabbed",Snackbar.LENGTH_SHORT);
            snackbar.show();
        });

    }
}