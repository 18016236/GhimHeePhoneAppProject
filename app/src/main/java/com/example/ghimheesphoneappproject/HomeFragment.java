package com.example.ghimheesphoneappproject;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        TextView tvPrice = view.findViewById(R.id.tvCost1);

        String text = "$5.50/kg";

        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.RED);

        ss.setSpan(fcsRed, 0,7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        tvPrice.setText(ss);

        return view;
    }
}