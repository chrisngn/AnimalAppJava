package com.example.songbird.animalappjava;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CatActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        setupUI();
    }

    private void setupUI() {
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new SectionsPagerAdapter(this, getSupportFragmentManager()));

        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        private static final int NUM_PAGES = 2;
        private final AppCompatActivity activity;

        public SectionsPagerAdapter(AppCompatActivity activity, FragmentManager fm) {
            super(fm);
            this.activity = activity;
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return CatFragment.newInstance();
                case 1:
                    return FactFragment.newInstance();
                default:
                    throw new IllegalStateException("SectionsPagerAdapter is trying to access illegal page");
            }
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return activity.getString(R.string.cat_title);
                case 1:
                    return activity.getString(R.string.fact_title);
                default:
                    return super.getPageTitle(position);
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }

}
