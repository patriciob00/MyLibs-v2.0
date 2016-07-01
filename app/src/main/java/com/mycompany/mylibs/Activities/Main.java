package com.mycompany.mylibs.Activities;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.mycompany.mylibs.R;
import com.mycompany.mylibs.fragments.buys_frag;
import com.mycompany.mylibs.fragments.loans_frag;
import com.mycompany.mylibs.fragments.message_frag;

import java.util.ArrayList;
import java.util.List;


public class Main extends ActionBarActivity {

    private Toolbar toolbar;
    DrawerLayout drawerLayout;
    CoordinatorLayout content;
    NavigationView navView;
    Intent data;
    ViewPager pager;
    TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        SetToolbar();
        SetupTabs();
        SetNavDrawer();
    }

    public void SetToolbar() {
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDefaultDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24px);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    public void SetNavDrawer() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        content = (CoordinatorLayout) findViewById(R.id.content);
        navView = (NavigationView) findViewById(R.id.navigation);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.titles:
                        item.setChecked(true);
                        data = new Intent(Main.this, collections.class);
                        startActivity(data);
                        break;
                    case R.id.volume:
                        item.setChecked(true);
                        data = new Intent(Main.this, itens.class);
                        data.putExtra("collection", "Tempo");
                        startActivity(data);
                        break;
                    case R.id.categories:
                        item.setChecked(true);
                        data = new Intent ( Main.this, categories.class);
                        startActivity( data );
                        break;
                    case R.id.loans:
                        item.setChecked(true);
                        data = new Intent ( Main.this, messages.class);
                        startActivity( data );
                        break;
                    case R.id.profile:
                        item.setChecked(true);
                        data = new Intent ( Main.this, profile.class);
                        startActivity( data );
                        break;
                    case R.id.settings:
                        item.setChecked(true);
                        data = new Intent ( Main.this, settings.class);
                        startActivity( data );
                        break;
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

    private void setupViewPager( ViewPager viewPager ) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new loans_frag(), "EMPRÉSTIMOS");
        adapter.addFrag(new buys_frag(), "COMPRAS");
        adapter.addFrag(new message_frag(), "MENSAGENS");
        viewPager.setAdapter( adapter );
    }

    public void SetupTabs() {
        tab = (TabLayout) findViewById(R.id.tabs);
        pager = (ViewPager) findViewById(R.id.pager);

        setupViewPager( pager );
        tab.setupWithViewPager( pager );

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                if (drawerLayout != null) {
                    drawerLayout.openDrawer(GravityCompat.START);
                    return true;
                }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();

        return true;
    }
}
