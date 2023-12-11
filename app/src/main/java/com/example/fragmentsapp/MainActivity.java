package com.example.fragmentsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button f1, f2, f3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = findViewById(R.id.button);
        f2 = findViewById(R.id.button1);
        f3 = findViewById(R.id.button2);

        goToFragment(new SecondFrag(), 0);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFragment(new FirstFrag(), 1);
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFragment(new SecondFrag(), 1);
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  goToFragment(new ThirdFrag(),1 );
            }
        });





    }

    public void goToFragment(Fragment fragment, int flag){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        if(flag == 0){ ft.add(R.id.frameLayout, fragment);}
        else  {ft.replace(R.id.frameLayout, fragment);}

            ft.commit();


    }
}