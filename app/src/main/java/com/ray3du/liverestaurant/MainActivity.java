package com.ray3du.liverestaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set up pager layout
        TabLayout tabs = findViewById(R.id.tabs);
        ViewPager viewPager = findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new HomeFragment());
        viewPagerAdapter.addFragment(new ReservationsFragment());
        viewPagerAdapter.addFragment(new MenusFragment());
        viewPagerAdapter.addFragment(new CartFragment());

        viewPager.setAdapter(viewPagerAdapter);
        tabs.setupWithViewPager(viewPager);

        @SuppressLint("InflateParams")
        View tabOne = getLayoutInflater().inflate(R.layout.tabs5, null);
        Objects.requireNonNull(tabs.getTabAt(0)).setCustomView(tabOne);
        @SuppressLint("InflateParams")
        View tabTwo = getLayoutInflater().inflate(R.layout.tabs1, null);
        Objects.requireNonNull(tabs.getTabAt(1)).setCustomView(tabTwo);
        @SuppressLint("InflateParams")
        View tabThree = getLayoutInflater().inflate(R.layout.tabs2, null);
        Objects.requireNonNull(tabs.getTabAt(2)).setCustomView(tabThree);
        @SuppressLint("InflateParams")
        View tabFour = getLayoutInflater().inflate(R.layout.tabs3, null);
        Objects.requireNonNull(tabs.getTabAt(3)).setCustomView(tabFour);

    }
}