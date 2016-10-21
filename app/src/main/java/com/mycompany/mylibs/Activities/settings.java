package com.mycompany.mylibs.Activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.mycompany.mylibs.R;

public class settings extends AppCompatActivity {
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        setBar();
    }

    public void setBar () {
        toolbar = ( Toolbar ) findViewById( R.id.bar_settings );
        toolbar.setTitle( "Settings" );
        toolbar.setTitleTextColor( getResources().getColor( R.color.colorWhite ) );
        setSupportActionBar( toolbar );
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDefaultDisplayHomeAsUpEnabled( true );
            actionBar.setDisplayHomeAsUpEnabled( true );
        }
    }
}

