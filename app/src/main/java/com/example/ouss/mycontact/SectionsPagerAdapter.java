package com.example.ouss.mycontact;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class SectionsPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments=new ArrayList<>();
    ArrayList<String> strings=new ArrayList<>();

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }

    public void addFragments(Fragment fragment, String title){
        fragments.add(fragment);
        strings.add(title);
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
