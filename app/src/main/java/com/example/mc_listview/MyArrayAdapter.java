package com.example.mc_listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyArrayAdapter extends ArrayAdapter {
    private final Activity context;
    private final ArrayList<Integer> images;
    private final ArrayList<String> names;
    private final ArrayList<String> phoneNumbers;

    public MyArrayAdapter(Activity context, ArrayList<Integer> images, ArrayList<String> names, ArrayList<String> phoneNumbers) {
        super(context,R.layout.custom_list_item,names);
        this.context = context;
        this.images = images;
        this.names = names;
        this.phoneNumbers = phoneNumbers;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View singleEntityView = inflater.inflate(R.layout.custom_list_item,null,true);

        ImageView img = singleEntityView.findViewById(R.id.image);
        img.setImageResource(images.get(position));

        TextView name = singleEntityView.findViewById(R.id.name);
        name.setText(names.get(position));

        TextView phoneNumber = singleEntityView.findViewById(R.id.phone);
        phoneNumber.setText(phoneNumbers.get(position));

        return singleEntityView;
    }
}
