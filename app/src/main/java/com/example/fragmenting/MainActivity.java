package com.example.fragmenting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button chatbutton=(Button) findViewById(R.id.buttin1);
        Button statusbutton=(Button) findViewById(R.id.buttin2);
        Button callbutton=(Button) findViewById(R.id.buttin3);
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.myframe,new fragment_test());
        ft.commit();
        chatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.myframe,new fragment_test());
                ft.commit();
            }
        });
        statusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           FragmentManager fm=getSupportFragmentManager();
           FragmentTransaction ft=fm.beginTransaction();
           ft.add(R.id.myframe,new bfragment());
           ft.commit();
            }
        });
        callbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(R.id.myframe,new cfragment());
                ft.commit();
            }
        });

    }
}