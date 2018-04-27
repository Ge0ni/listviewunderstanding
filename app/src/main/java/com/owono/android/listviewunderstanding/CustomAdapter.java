package com.owono.android.listviewunderstanding;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Constructor;

/**
 * Created by owono on 26.04.2018.
 */

class CustomAdapter extends ArrayAdapter<String>{

    public CustomAdapter(@NonNull Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater listInflater = LayoutInflater.from(getContext());
        View customView = listInflater.inflate(R.layout.custom_row, parent, false);

        String singleFoodItem = getItem(position);
        TextView textView = (TextView) customView.findViewById(R.id.text_in_list);
        ImageView imageView = (ImageView) customView.findViewById(R.id.logo);

        textView.setText(singleFoodItem);
        imageView.setImageResource(R.drawable.sika_png);
        return customView;
    }
}
