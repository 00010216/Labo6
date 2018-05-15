package com.example.kcruz.labo6drawer.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kcruz.labo6drawer.R;

public class RestaurantOffersFragment extends Fragment{
    TextView newFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_offers, container,false);

        newFragment = view.findViewById(R.id.txt_title);

        return view;
    }
}
