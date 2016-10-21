package com.mycompany.mylibs.Activities;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mycompany.mylibs.R;
import com.mycompany.mylibs.add_activities.add_category;

public class categories extends AppCompatActivity {
    CollapsingToolbarLayout collapse;
    Toolbar toolbar;
    FloatingActionButton floatingActionButton;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        setBar();
    }

    public void setBar () {

            toolbar = ( Toolbar ) findViewById( R.id.bar_category );
            toolbar.setTitle( "Categorias" );
            toolbar.setTitleTextColor( getResources().getColor( R.color.colorWhite ) );
            setSupportActionBar( toolbar );
            final ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled( true );
                actionBar.setDisplayHomeAsUpEnabled( true );
            }

            floatingActionButton = ( FloatingActionButton )findViewById( R.id.fab_category);
            floatingActionButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent data = new Intent( categories.this, add_category.class );
                    startActivity( data );
                    finish();
                }
            });
        }
}
