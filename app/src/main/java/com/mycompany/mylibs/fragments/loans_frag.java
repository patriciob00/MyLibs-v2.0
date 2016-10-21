package com.mycompany.mylibs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mycompany.mylibs.R;


public class loans_frag extends Fragment {

    public loans_frag() {
        // Required empty public constructor
    }

    public static loans_frag newInstance() {
        loans_frag fragment = new loans_frag();
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
        View v = inflater.inflate(R.layout.fragment_loans_frag, container, false);

        /*FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), loans_invites.class);
                startActivity(in);
            }
        });*/

        return v;
    }
}
