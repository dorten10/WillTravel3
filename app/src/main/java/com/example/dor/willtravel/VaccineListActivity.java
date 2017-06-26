package com.example.dor.willtravel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VaccineListActivity extends AppCompatActivity {
    private ArrayList<Country> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccine_list);

    }
}
