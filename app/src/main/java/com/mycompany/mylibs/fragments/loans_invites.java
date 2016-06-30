package com.mycompany.mylibs.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mycompany.mylibs.R;


public class loans_invites extends Fragment {

    public loans_invites() {
        // Required empty public constructor
    }

    public static loans_invites newInstance() {
        loans_invites fragment = new loans_invites();
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
        return inflater.inflate(R.layout.fragment_loans_invites, container, false);
    }
}
