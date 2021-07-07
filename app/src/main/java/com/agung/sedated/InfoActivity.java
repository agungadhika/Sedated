package com.agung.sedated;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);

        bottomNavigationView.setSelectedItemId(R.id.info);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.penyakit:
                        startActivity(new Intent(getApplicationContext(),
                                HomeActivity.class));
                        overridePendingTransition(0,0);
                        Toast.makeText(InfoActivity.this, "Menu Penyakit clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.tanaman:
                        startActivity(new Intent(getApplicationContext(),
                                TanamanActivity.class));
                        overridePendingTransition(0,0);
                        Toast.makeText(InfoActivity.this, "Menu Tanaman clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.info:
                        Toast.makeText(InfoActivity.this, "Menu Info Aplikasi clicked", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });
    }

}