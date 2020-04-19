package com.example.bottommenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class TabActivity extends AppCompatActivity  implements Haji1.OnFragmentInteractionListener,
        Haji2.OnFragmentInteractionListener,
        Haji3.OnFragmentInteractionListener{

    /*private Toolbar toolbar;
    private static ViewPager viewPager;
    private static TabLayout tabLayout;
    private TabsAdapter tabsAdapter;
    ArrayList<Fragment> fragments;*/

    /*ViewPager viewPager;
    TabLayout tabLayout;
    ArrayList<Fragment> fragments;*/
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("fiqih haji");
        /*viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);

        fragments =new ArrayList<>();

        fragments.add(new TamattuFrag());
        fragments.add(new TamattuFrag());
        fragments.add(new TamattuFrag());


        TabsAdapter tabsAdapter = new TabsAdapter(getSupportFragmentManager(), getApplicationContext(), fragments);
        viewPager.setAdapter(tabsAdapter);

        tabLayout.setupWithViewPager(viewPager);*/
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("Haji Tamattu"));
        tabs.addTab(tabs.newTab().setText("Haji Ifrod"));
        tabs.addTab(tabs.newTab().setText("Haji Qiron"));
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = findViewById(R.id.view_pager);
        PagerAdapterHaji pagerAdapter = new PagerAdapterHaji(getSupportFragmentManager(), tabs.getTabCount());
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

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.search){
            startActivity(new Intent(this, Searchview.class));
        }
        return true;
    }


    }





