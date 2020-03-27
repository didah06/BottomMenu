package com.example.bottommenu;

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

public class TabActivity extends AppCompatActivity {

    /*private Toolbar toolbar;
    private static ViewPager viewPager;
    private static TabLayout tabLayout;
    private TabsAdapter tabsAdapter;
    ArrayList<Fragment> fragments;*/

    ViewPager viewPager;
    TabLayout tabLayout;
    ArrayList<Fragment> fragments;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.toolbar));
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);

        fragments =new ArrayList<>();

        fragments.add(new TamattuFrag());
        fragments.add(new TamattuFrag());
        fragments.add(new TamattuFrag());


        TabsAdapter tabsAdapter = new TabsAdapter(getSupportFragmentManager(), getApplicationContext(), fragments);
        viewPager.setAdapter(tabsAdapter);

        tabLayout.setupWithViewPager(viewPager);


    }
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem searchIem = menu.findItem(R.id.search);
        final SearchView searchView = (SearchView) searchIem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                                              @SuppressLint("SetTextI18n")
                                              @Override
                                              public boolean onQueryTextSubmit(String query) {
                                                  Hasil.setText("Hasil Pencarian: "+query);
                                                  Toast.makeText(getApplicationContext(),query, Toast.LENGTH_SHORT).show();

                                                  searchView.clearFocus();
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        item.getItemId()==R.id.back{
            startActivity(new Intent(this, HomeFragment.class));
        }
        return true;
    }*/
}

        /*toolbar = findViewById(R.id.toolbar);
        if (getSupportActionBar() == null){
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setTitle("Haji");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setOffscreenPageLimit(3);

        fragments = new ArrayList<>();
        fragments.add(new TamattuFrag());
        fragments.add(new QiranFrag());
        fragments.add(new IfradFrag());

        tabLayout = findViewById(R.id.tablayout);
        createTabFragment();


        final Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        final TabLayout tabLayout = findViewById(R.id.tablayout);
        TabItem tamattu = findViewById(R.id.tamattu);
        TabItem qiran = findViewById(R.id.qiran);
        TabItem ifrad = findViewById(R.id.ifrad);
        viewPager = findViewById(R.id.viewPager);


        fragments = new ArrayList<>();
        fragments.add(new TamattuFrag());
        fragments.add(new QiranFrag());
        fragments.add(new IfradFrag());

        TabsAdapter tabsAdapter = new TabsAdapter(getSupportFragmentManager(), getApplicationContext(), fragments);
        viewPager.setAdapter(tabsAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(TabActivity.this,
                            R.color.colorAccent));
                } else if (tab.getPosition() == 1) {
                    Toast.makeText(TabActivity.this, "Qiran Fragment", Toast.LENGTH_SHORT).show();
                } else if (tab.getPosition() == 2){
                    Toast.makeText(TabActivity.this, "Ifrad Fragment", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    }

    private void createTabFragment() {
        tabsAdapter = new TabsAdapter(getSupportFragmentManager(), getApplicationContext(), fragments);
        viewPager.setAdapter(tabsAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;

    }*/





