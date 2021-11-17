package com.example.mc_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button defaultLayoutBtn;
    Button customListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defaultLayoutBtn = findViewById(R.id.defaultListViewBtn);
        defaultLayoutBtn.setOnClickListener(this);

        customListView=findViewById(R.id.customListView);
        customListView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.defaultListViewBtn:
                Intent intent = new Intent(MainActivity.this,DefaultListView.class);
                startActivity(intent);
                break;
            case R.id.customListView:
                Intent intent1 = new Intent(MainActivity.this,CustomListView.class);
                startActivity(intent1);
                break;
        }
    }
}