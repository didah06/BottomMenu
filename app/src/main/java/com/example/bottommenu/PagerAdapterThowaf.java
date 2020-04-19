package com.example.bottommenu;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

class PagerAdapterThowaf extends FragmentStatePagerAdapter {
    int num;

    public PagerAdapterThowaf(@NonNull FragmentManager fm, int Number) {
        super(fm);
        this.num = Number;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:

                thowaf1 fragment1 = new thowaf1();
                return fragment1;
            case 1:
                thowaf2 fragment2 = new thowaf2();
                return fragment2;
            case 2:
                thowaf3 fragment3 = new thowaf3();
                return fragment3;
            case 3:
                thowaf4 fragment4 = new thowaf4();
                return fragment4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
