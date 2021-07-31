package com.lightningspace.gh.pro_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private MaterialToolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.topAppBar);

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
    }
}