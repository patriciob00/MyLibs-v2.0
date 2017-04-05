package com.mycompany.mylibs.add_activities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.mycompany.mylibs.R;

public class add_item extends AppCompatActivity {
    Toolbar toolbar;
    Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        SetToolbar();
        saveBtn = (Button) findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void SetToolbar() {
        toolbar = (Toolbar) findViewById( R.id.bar_new_item );
        toolbar.setTitle("Add Item");
        toolbar.setTitleTextColor( getResources().getColor( R.color.colorWhite ) );
        setSupportActionBar( toolbar );
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDefaultDisplayHomeAsUpEnabled( true );
            actionBar.setDisplayHomeAsUpEnabled( true );
            actionBar.setDisplayShowHomeEnabled( true );
        }
    }
}
