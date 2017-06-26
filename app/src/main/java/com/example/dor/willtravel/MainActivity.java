package com.example.dor.willtravel;

import java.util.ArrayList;




import android.app.Activity;


import android.content.Intent;
import android.os.Bundle;


import android.util.Log;


import android.view.View;


import android.view.View.OnClickListener;


import android.widget.Button;


import android.widget.ListView;


import android.widget.Toast;




public class MainActivity extends Activity implements OnClickListener {




    ListView mListView;


    Button btnShowCheckedItems;





    ArrayList<Country> mCountrys;


    MultiSelectionAdapter<Country> mAdapter;





    @Override


    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        bindComponents();


        init();


        addListeners();


    }




    private void bindComponents() {


        // TODO Auto-generated method stub


        mListView = (ListView) findViewById(android.R.id.list);


        btnShowCheckedItems = (Button) findViewById(R.id.btnShowCheckedItems);


    }





    private void init() {


        // TODO Auto-generated method stub


        mCountrys = new ArrayList<Country>();

        String[] arr= {"חצבת","שפעת"};
        mCountrys.add(new Country("ארגנטינה",arr));


        mCountrys.add(new Country("מקסיקו",arr));


        mCountrys.add(new Country("בוליביה",arr));


        mCountrys.add(new Country("פרו",arr));


        mCountrys.add(new Country("ברזיל",arr));







        mAdapter = new MultiSelectionAdapter<Country>(this, mCountrys);


        mListView.setAdapter(mAdapter);


    }





    private void addListeners() {


        // TODO Auto-generated method stub


        btnShowCheckedItems.setOnClickListener(this);


    }




    @Override


    public void onClick(View v) {


        // TODO Auto-generated method stub





        if(mAdapter != null) {


            ArrayList<Country> mArrayCountrys = mAdapter.getCheckedItems();


            Log.d(MainActivity.class.getSimpleName(), "Selected Items: " + mArrayCountrys.toString());


            Toast.makeText(getApplicationContext(), "Selected Items: " + mArrayCountrys.toString(), Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this,VaccineListActivity.class);
            startActivity(intent);


        }


    }




}