package com.example.mc_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button defaultLayoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defaultLayoutBtn = findViewById(R.id.defaultListViewBtn);
        if(defaultLayoutBtn==null){
            Log.d("Status===============","Null");
        }else{
            Log.d("Status===============","Not Null");
        }
        defaultLayoutBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.defaultListViewBtn:
                Intent intent = new Intent(MainActivity.this,DefaultListView.class);
                startActivity(intent);
        }
    }
}