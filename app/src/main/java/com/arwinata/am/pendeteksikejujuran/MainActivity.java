package com.arwinata.am.pendeteksikejujuran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();                 //untuk memanggil fragment
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();  //untuk memanggil fragment

        fragmentTransaction.add(R.id.frame1, new FragmentSatu());
        fragmentTransaction.add(R.id.frame2, new FragmentDua());

        fragmentTransaction.commit();
    }
}
