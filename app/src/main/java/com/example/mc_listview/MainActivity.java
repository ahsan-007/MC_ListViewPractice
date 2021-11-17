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
    Button seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defaultLayoutBtn = findViewById(R.id.defaultListViewBtn);
        defaultLayoutBtn.setOnClickListener(this);

        customListView=findViewById(R.id.customListView);
        customListView.setOnClickListener(this);

        seekBar=findViewById(R.id.seekBarBtn);
        seekBar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){
            case R.id.defaultListViewBtn:
                intent = new Intent(MainActivity.this,DefaultListView.class);
                break;
            case R.id.customListView:
                intent = new Intent(MainActivity.this,CustomListView.class);
                break;
            case R.id.seekBarBtn:
                intent = new Intent(MainActivity.this,SeekBarPrac.class);
                break;
        }
        startActivity(intent);
    }
}