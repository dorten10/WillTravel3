package com.example.dor.willtravel;

import java.io.Serializable;
import java.util.ArrayList;




import android.app.Activity;


import android.content.Intent;
import android.os.Bundle;


import android.os.Parcelable;
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
        String[] arr2= {"אבולה","סרטן תחת קקי שורף","אדמת"};
        String[] arr3= {"קדחת הנילוס","צרעת"};
        mCountrys.add(new Country("ארגנטינה",arr));


        mCountrys.add(new Country("מקסיקו",arr2));


        mCountrys.add(new Country("בוליביה",arr3));


        mCountrys.add(new Country("פרו",arr));


        mCountrys.add(new Country("ברזיל",arr2));







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


          // Toast.makeText(getApplicationContext(), "Selected Items: " + mArrayCountrys.toString(), Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this,VaccineListActivity.class);
            Log.d(MainActivity.class.getSimpleName(), " 1");
            Bundle bundle = new Bundle();
            Log.d(MainActivity.class.getSimpleName(), " 2");
            bundle.putParcelableArrayList("Countries", mArrayCountrys);
            Log.d(MainActivity.class.getSimpleName(), " 3");
            intent.putExtras(bundle);
            Log.d(MainActivity.class.getSimpleName(), " 4");
            startActivity(intent);

        }


    }




}