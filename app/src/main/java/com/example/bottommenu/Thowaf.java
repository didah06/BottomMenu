package com.example.bottommenu;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Thowaf extends AppCompatActivity implements thowaf1.OnFragmentInteractionListener,
        thowaf2.OnFragmentInteractionListener{

    Toolbar toolbar;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("thowaf");


    TabLayout tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("Penjelasan"));
        tabs.addTab(tabs.newTab().setText("Doa"));
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

    final ViewPager viewPager = findViewById(R.id.view_pager);
    PagerAdapterThowaf pagerAdapter = new PagerAdapterThowaf(getSupportFragmentManager(), tabs.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            viewPager.setCurrentItem(tab.getPosition());
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    });

}

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


}
