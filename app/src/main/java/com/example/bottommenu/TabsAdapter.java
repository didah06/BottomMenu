package com.example.bottommenu;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TabsAdapter extends FragmentPagerAdapter {

    Context context;
    ArrayList<Fragment> fragments;

    public TabsAdapter(FragmentManager fm, Context context, ArrayList<Fragment> fragments) {
        super(fm);
        this.context = context;
        this.fragments = fragments;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0){
            fragment = new TamattuFrag();
        }
        else if (position == 1){
            fragment = new QiranFrag();
        }
        else if (position == 2){
            fragment = new IfradFrag();
        }
        return fragment;

    }
    @Override
    public CharSequence getPageTitle(int position){
        String title = null;
        if (position == 0)
        {
            title = "tamattu";
        }else if (position == 1){
            title = "qiran";
        }else if (position == 2){
            title = "ifrad";
        }
        return title;
    }
}
   /*ArrayList<Fragment> fragments;
   Context context;


    public TabsAdapter(FragmentManager fm, Context context, ArrayList<Fragment> fragments) {
        super(fm);
        this.context = context;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0){
            fragment = new TamattuFrag();
        }
        else if (position == 1){
            fragment = new QiranFrag();
        }
        else if (position == 2){
            fragment = new IfradFrag();
        }
        return fragment;

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position){
        String title = null;
        if (position == 0)
        {
            title = "tamattu";
        }else if (position == 1){
            title = "qiran";
        }else if (position == 2){
            title = "ifrad";
        }
        return title;
    }
}*/
