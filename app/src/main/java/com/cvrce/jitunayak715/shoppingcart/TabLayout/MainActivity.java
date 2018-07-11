package com.cvrce.jitunayak715.shoppingcart.TabLayout;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.cvrce.jitunayak715.shoppingcart.R;


public class MainActivity extends AppCompatActivity  {

Toolbar toolbar;
TabLayout tabLayout;
ViewPager viewPager;
DrawerLayout drawerLayout;
NavigationView navigationView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        drawerLayout = findViewById(R.id.navigation_drawer);
        navigationView = findViewById(R.id.navigation_view);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        //navigationView.setNavigationItemSelectedListener(this);
       toggle.getDrawerArrowDrawable().setColor(0xFFFFFFFF);


        viewPager = (ViewPager)findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(),"ELECTRONICS" );
        adapter.addFragment(new TwoFragment(),"BOOK & MORE");
        adapter.addFragment(new ThreeFragment(),"HOME APPLIANCE");
        adapter.addFragment(new TwoFragment(),"LIFE STYLE");
        adapter.addFragment(new ThreeFragment(),"MORE");

        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        tabLayout.setupWithViewPager(viewPager);

//        tabLayout.getTabAt(0).setIcon(R.drawable.phone_white);
//        tabLayout.getTabAt(1).setIcon(R.drawable.sms_white);
//        tabLayout.getTabAt(2).setIcon(R.drawable.contacts_white);

    }



}

