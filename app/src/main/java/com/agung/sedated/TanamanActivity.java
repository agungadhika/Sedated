package com.agung.sedated;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.Collections;

public class TanamanActivity extends AppCompatActivity {

    private String[] tanaman = {"Tanaman Sambiloto","Tanaman Rumput Mutiara","Tanaman Putri Malu","Tanaman Petai Cina","Tanaman Pare","Tanaman Pandan Wangi","Tanaman Pala","Tanaman Mengkudu","Tanaman Lidah Buaya","Tanaman Lengkuas","Tanaman Lada","Tanaman Kunyit","Tanaman Kumis Kucing","Tanaman Kencur"};
    private ArrayList<String> data  = new ArrayList<>();
    private ArrayAdapter<String> ad;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanaman);
        listView = findViewById(R.id.listitem1);
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);

        bottomNavigationView.setSelectedItemId(R.id.tanaman);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.penyakit:
                        startActivity(new Intent(getApplicationContext(),
                                HomeActivity.class));
                        overridePendingTransition(0,0);
                        Toast.makeText(TanamanActivity.this, "Menu Penyakit clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.tanaman:
                        Toast.makeText(TanamanActivity.this, "Menu Tanaman clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.info:
                        startActivity(new Intent(getApplicationContext(),
                                InfoActivity.class));
                        overridePendingTransition(0,0);
                        Toast.makeText(TanamanActivity.this, "Menu Info Aplikasi clicked", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });
        getData();

        ad = new ArrayAdapter<>
                (this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(ad);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Mendapatkan Nama pada salah satu item yang diklik, berdasarkan posisinya
                String getName = data.get(position);

                //Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
                Intent sendData = new Intent(TanamanActivity.this, DataPenyakit.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            }
        });
    }

    private void getData(){
        //Memasukan Semua Data mahasiswa kedalam ArrayList
        Collections.addAll(data, tanaman);
    }

    private void Logout() {
        FirebaseAuth.getInstance().signOut();
        Intent intToMain = new Intent(TanamanActivity.this, LoginActivity.class);
        startActivity(intToMain);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_button, menu);
        MenuItem menuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Type to search");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String Query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                ad.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:{
                Logout();
            }
        }
        return super.onOptionsItemSelected(item);
    }
}