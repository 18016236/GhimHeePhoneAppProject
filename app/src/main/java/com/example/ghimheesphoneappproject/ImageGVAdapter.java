package com.example.ghimheesphoneappproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ImageGVAdapter extends ArrayAdapter<OptionsModel> {

    public ImageGVAdapter(@NonNull Context context, ArrayList<OptionsModel> optionsModelArrayList) {
        super(context, 0, optionsModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_gridview, parent, false);
        }
        OptionsModel optionsModel = getItem(position);
        TextView optionsTV = listitemView.findViewById(R.id.idTVCourse);
        ImageView optionsIV = listitemView.findViewById(R.id.idOptions);
        optionsTV.setText(optionsModel.getItem_name());
        optionsIV.setImageResource(optionsModel.getImgid());
        return listitemView;

    }
}
