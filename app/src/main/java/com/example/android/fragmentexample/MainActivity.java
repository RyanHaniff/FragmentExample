package com.example.android.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fragment One
        FragmentOne firstFragment = new FragmentOne();

        firstFragment.setArguments(getIntent().getExtras());

        //for the getSupportFragmentManager to work the fragment object that your are repalcing the
        //frame layou with must import the: import android.support.v4.app.Fragment;
        //if not you will get an error saying it cannot resolve the method add()
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_one, firstFragment).commit();

        //Fragment Two
        FragmentTwo secondFragment = new FragmentTwo();

        // In case this activity was started with special instructions from an
        // Intent, pass the Intent's extras to the fragment as arguments
        secondFragment.setArguments(getIntent().getExtras());

        // Add the fragment to the 'fragment_two' FrameLayout
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_two, secondFragment).commit();

    }
}
