package com.mycompany.mylibs.Activities;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.mycompany.mylibs.R;
import com.mycompany.mylibs.fragments.buys_frag;
import com.mycompany.mylibs.fragments.loans_frag;

import java.util.ArrayList;
import java.util.List;

public class market extends AppCompatActivity {

    CoordinatorLayout content;
    Toolbar toolbar;
    FloatingActionButton floatingActionButton;
    ViewPager pager;
    TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);
        setBar();
        SetupTabs();
    }

    public void setBar() {

        toolbar = ( Toolbar ) findViewById( R.id.market_bar );
        toolbar.setTitle( "Market" );
        toolbar.setTitleTextColor( getResources().getColor( R.color.colorWhite ) );
        setSupportActionBar( toolbar );
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDefaultDisplayHomeAsUpEnabled( true );
            actionBar.setDisplayHomeAsUpEnabled( true );
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

    private void setupViewPager( ViewPager viewPager ) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new loans_frag(), "VENDER");
        adapter.addFrag(new buys_frag(), "COMPRAR");
        adapter.addFrag(new loans_frag(), "EMPRÉSTIMO");
        viewPager.setAdapter( adapter );
    }

    public void SetupTabs() {
        tab = (TabLayout) findViewById(R.id.tabs);
        pager = (ViewPager) findViewById(R.id.pager);

        setupViewPager( pager );
        tab.setupWithViewPager( pager );
    }
}
