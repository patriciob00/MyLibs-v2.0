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

import com.mycompany.mylibs.add_activities.add_item;

public class itens extends AppCompatActivity {
    Toolbar toolbar;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itens);

        setBar();
    }

    public void setBar () {

            toolbar = ( Toolbar ) findViewById( R.id.bar_itens );
            toolbar.setTitle( "Itens" );
            toolbar.setTitleTextColor( getResources().getColor( R.color.colorWhite ) );
            setSupportActionBar( toolbar );
            final ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled( true );
                actionBar.setDisplayHomeAsUpEnabled( true );
            }

        floatingActionButton = ( FloatingActionButton )findViewById( R.id.fab_itens);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent( itens.this, add_item.class );
                startActivity( data );
                //finish();
            }
        });
    }
}
