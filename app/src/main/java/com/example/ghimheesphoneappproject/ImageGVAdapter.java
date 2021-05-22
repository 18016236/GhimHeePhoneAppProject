package com.example.ghimheesphoneappproject;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class ImageGVAdapter extends ArrayAdapter<OptionsModel> {

    public ImageGVAdapter(@NonNull Context context, int resource, @NonNull OptionsModel[] objects) {
        super(context, resource, objects);
    }
}
