package com.mycompany.mylibs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mycompany.mylibs.R;


public class buys_frag extends Fragment {

    public buys_frag() {
        // Required empty public constructor
    }
    public static buys_frag newInstance() {
        buys_frag fragment = new buys_frag();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buy_frag, container, false);
    }
}