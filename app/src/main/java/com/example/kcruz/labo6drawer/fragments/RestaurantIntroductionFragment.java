package com.example.kcruz.labo6drawer.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kcruz.labo6drawer.R;

public class RestaurantIntroductionFragment extends Fragment {

    TextView newFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_information_view, container,false);

        newFragment = view.findViewById(R.id.txt_title);

        return view;
    }

    @Override
    public void onResume() {
        getActivity().setTitle(R.string.about);
        super.onResume();
    }
}
