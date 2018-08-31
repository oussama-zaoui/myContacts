package com.example.ouss.mycontact;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSectionsPagerAdapter=new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager=findViewById(R.id.cont);
        setupViewPager(mViewPager);
        TabLayout tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }

    public void setupViewPager(ViewPager viewPager){
        SectionsPagerAdapter adapter=new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragments(new Fragment1(),"Journal");
        adapter.addFragments( new Fragment2(),"Favoris");
        adapter.addFragments(new Fragment3(),"Contacts");
        viewPager.setAdapter(adapter);
    }
}
