package com.example.dor.willtravel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.Arrays;


public class VaccineListActivity extends AppCompatActivity {
     ArrayList<Country> countries;
    Button btn;
     TextView txt;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(VaccineListActivity.class.getSimpleName(), "1");
        setContentView(R.layout.activity_vaccine_list);
        txt=(TextView) findViewById(R.id.textView);
        btn=(Button) findViewById(R.id.btnLink);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.hevra.org.il/מרפאה-מטיילים/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        countries = this.getIntent().getExtras().getParcelableArrayList("Countries");
        Log.d(VaccineListActivity.class.getSimpleName(), "2 "+countries.size());
        txt.setText("הנה רשימת החיסונים למדינות שבחרת:\n");
        for(int i=0;i<countries.size();i++){
            txt.append(countries.get(i).getName()+": ");
            txt.append(Arrays.toString(countries.get(i).getVaccines())+"\n");
        }


    }





}
