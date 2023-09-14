package com.edu.botones;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.edu.botones.view.OtroFragment;
import com.edu.botones.view.PrincipalFragment;
import com.edu.botones.view.SecondFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    PrincipalFragment homeFragment = new PrincipalFragment();
    SecondFragment secondFragment = new SecondFragment();
    OtroFragment otroFragment = new OtroFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        selectionFr(navigationView);
        loadFragment(homeFragment);
    }
    private void loadFragment(Fragment fr){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container,fr);
        transaction.commit();
    }
    private void selectionFr(BottomNavigationView navigation){
        navigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case 1:
                        loadFragment(homeFragment);
                        break;
                    case 2:
                        loadFragment(secondFragment);
                        break;
                    case 3:
                        loadFragment(otroFragment);
                        break;
                }
                return true;
            }
        });
    }
}