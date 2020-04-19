package com.example.bottommenu;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

class PagerAdapterIhram extends FragmentStatePagerAdapter {
    int num;

    public PagerAdapterIhram(@NonNull FragmentManager context, int tabCount) {
        super(context);
        this.num = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Ihram fragmentihram = new Ihram();
                return fragmentihram;
            case 1:
                Miqot fragmentMiqot = new Miqot();
                return fragmentMiqot;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return num;
    }

}
