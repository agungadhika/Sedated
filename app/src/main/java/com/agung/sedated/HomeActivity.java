package com.agung.sedated;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    Button btnlogout;
    private String[] penyakit = {"Asma","Asam Urat","Batuk","Bisul","Campak","Cholera","Demam","Demam Meriang","Darah Rendah","Darah Tinggi","Flu","Ginjal","Gondong","Jerawat","Kanker","Kencing Batu","Kencing Manis","Kolesterol", "Maag","Migrain"};
    private ArrayList<String> data  = new ArrayList<>();
    private ArrayAdapter<String> ad;
    ListView listView;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listView = findViewById(R.id.listitem);
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);

        bottomNavigationView.setSelectedItemId(R.id.penyakit);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.penyakit:
                        Toast.makeText(HomeActivity.this, "Menu Penyakit clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.tanaman:
                        startActivity(new Intent(getApplicationContext(),
                                TanamanActivity.class));
                        overridePendingTransition(0,0);
                        Toast.makeText(HomeActivity.this, "Menu Tanaman clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.info:
                        startActivity(new Intent(getApplicationContext(),
                                InfoActivity.class));
                        overridePendingTransition(0,0);
                        Toast.makeText(HomeActivity.this, "Menu Info Aplikasi clicked", Toast.LENGTH_SHORT).show();
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

                String getName = data.get(position);


                Intent sendData = new Intent(HomeActivity.this, DataPenyakit.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            }
        });
    }
    private void getData(){
        //Memasukan Semua Data mahasiswa kedalam ArrayList
        Collections.addAll(data, penyakit);
    }

    private void Logout() {
        FirebaseAuth.getInstance().signOut();
        Intent intToMain = new Intent(HomeActivity.this, LoginActivity.class);
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