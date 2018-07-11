package com.cvrce.jitunayak715.shoppingcart.TabLayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private  final List<String> frgamentTitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return frgamentTitle.get(position);
    }

    @Override
    public int getCount() {
        return frgamentTitle.size();
    }

    public void addFragment(Fragment fragment ,String title)
    {

        fragmentList.add(fragment);
        frgamentTitle.add(title);

    }
}
