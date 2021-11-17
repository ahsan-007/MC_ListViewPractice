package com.example.mc_listview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DefaultListView extends AppCompatActivity {

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
        friendListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                new AlertDialog.Builder(DefaultListView.this)
                        .setTitle("Delete Record")
                        .setMessage("Are you sure?")
                        .setIcon(R.drawable.ic_baseline_delete_forever_24)
                        .setCancelable(false)
                        .setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DefaultListView.this,
                                        friendNames.get(position) + " removed",
                                        Toast.LENGTH_SHORT).show();
                                friendNames.remove(position);
                                arrayAdapter.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).show();

            }
        });

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendNames);

        friendListView.setAdapter(arrayAdapter);

        addName=findViewById(R.id.addName);
        addName.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name = friendName.getText().toString();
                String message = "Please Enter a Name";
                if(!name.equals("")){
                    friendNames.add(name);
                    arrayAdapter.notifyDataSetChanged();
                    friendName.setText("");
                    message="Name Added";
                }
                Toast.makeText(DefaultListView.this,message,Toast.LENGTH_SHORT).show();
            }
        });

    }
}