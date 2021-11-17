package com.example.mc_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListView extends AppCompatActivity {

    ArrayList<Integer> images;
    ArrayList<String> names;
    ArrayList<String> phoneNumbers;
    ArrayAdapter<String> arrayAdapter;
    ListView customListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        images=new ArrayList<>();
        names=new ArrayList<>();
        phoneNumbers=new ArrayList<>();

        images.add(R.drawable.ahsan);
        images.add(R.drawable.suleman);
        images.add(R.drawable.junaid);
        images.add(R.drawable.omer);
        images.add(R.drawable.aazam);
        images.add(R.drawable.noor);
        images.add(R.drawable.ali);
        images.add(R.drawable.khuram);

        names.add("Muhammad Ahsan");
        names.add("Suleman Sohail");
        names.add("Junaid Ashfaq");
        names.add("Omer Shareef Bhatti");
        names.add("Aazam Jutt");
        names.add("Noor Muhammad");
        names.add("Ali Ahmad");
        names.add("Khuram Qamar");

        phoneNumbers.add("0321-1234567");
        phoneNumbers.add("0322-7654321");
        phoneNumbers.add("0311-1214197");
        phoneNumbers.add("0336-3124657");
        phoneNumbers.add("0300-3234667");
        phoneNumbers.add("0302-4444197");
        phoneNumbers.add("0306-8975657");
        phoneNumbers.add("0331-4309123");

        arrayAdapter = new
                MyArrayAdapter(this,images,names,phoneNumbers);

        customListView = findViewById(R.id.customListViewComp);
        customListView.setAdapter(arrayAdapter);
    }
}