package com.example.ghimheesphoneappproject;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toolbar;

import java.util.ArrayList;


public class FilterFragment extends Fragment {
    GridView simpleGrid;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_filter, container, false);
        simpleGrid = view.findViewById(R.id.GVFilter);

        ArrayList<OptionsModel> optionsModelArrayList = new ArrayList<OptionsModel>();
        optionsModelArrayList.add(new OptionsModel("Malaysian Cabbages","$5.50/kg",R.drawable.download));
        optionsModelArrayList.add(new OptionsModel("Dutch Mushrooms","$8.50/kg",R.drawable.download__1_));
        optionsModelArrayList.add(new OptionsModel("Thai Broccoli","$4.00/kg",R.drawable.images));
        optionsModelArrayList.add(new OptionsModel("Phillipines Cabbages","$9.99/kg",R.drawable.download2));
        optionsModelArrayList.add(new OptionsModel("Indonesia Cabbages","$5.50/kg",R.drawable.download));
        optionsModelArrayList.add(new OptionsModel("Belgium Mushrooms","$8.50/kg",R.drawable.download__1_));
        optionsModelArrayList.add(new OptionsModel("USA Broccoli","$4.00/kg",R.drawable.images));
        optionsModelArrayList.add(new OptionsModel("China Cabbages","$9.99/kg",R.drawable.download2));

        ImageGVAdapter adapter = new ImageGVAdapter(this.getActivity(),optionsModelArrayList);
        simpleGrid.setAdapter(adapter);



        return view;
    }





}