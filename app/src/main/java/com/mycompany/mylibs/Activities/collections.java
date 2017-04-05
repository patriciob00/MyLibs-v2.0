package com.mycompany.mylibs.Activities;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mycompany.mylibs.R;
import com.mycompany.mylibs.add_activities.add_collection;

public class collections extends AppCompatActivity {
    CollapsingToolbarLayout collapse;
    Toolbar toolbar;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections);

        setBar();
    }

    public void setBar () {
            toolbar = ( Toolbar ) findViewById( R.id.bar_collection );
            toolbar.setTitle( "Coleções" );
            toolbar.setTitleTextColor( getResources().getColor( R.color.colorWhite ) );
            setSupportActionBar( toolbar );
            final ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled( true );
                actionBar.setDisplayHomeAsUpEnabled( true );
            }

        floatingActionButton = ( FloatingActionButton )findViewById( R.id.fab_title);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent( collections.this, add_collection.class );
                startActivity( data );
                //finish();
            }
        });
    }
}
