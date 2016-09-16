package com.mycompany.mylibs.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.mycompany.mylibs.R;

public class splash extends AppCompatActivity {
    private final int SPLASH_TIME = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent( splash.this, Main.class);
                startActivity( intent );
                finish();
            }
        } , SPLASH_TIME);
    }
}
