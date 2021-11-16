package com.example.mc_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class DefaultListView extends AppCompatActivity implements View.OnClickListener {

    EditText friendName;
    Button addName;
    ArrayList<String> friendNames;
    ArrayAdapter<String> arrayAdapter;
    ListView friendListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_list_view);

        friendName = findViewById(R.id.friendName);

        friendNames = new ArrayList<String>();

        friendListView=findViewById(R.id.friendListView);

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendNames);

        friendListView.setAdapter(arrayAdapter);

        addName=findViewById(R.id.addName);
        addName.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = friendName.getText().toString();
        if(!name.equals("")){
            friendNames.add(name);
            arrayAdapter.notifyDataSetChanged();
        }
    }
}