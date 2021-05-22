package com.example.ghimheesphoneappproject;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.appcompat.widget.Toolbar;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class ShoppingFragment extends Fragment {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_shopping,container,false);

        Toolbar toolbar = (Toolbar)view.findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

      return view;
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }


    private void getMenuInflater() {
    }
}