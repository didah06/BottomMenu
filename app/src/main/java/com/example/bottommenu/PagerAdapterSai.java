package com.example.bottommenu;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapterSai extends FragmentStatePagerAdapter {
    int num;

    public PagerAdapterSai(@NonNull FragmentManager fm, int Number) {
        super(fm);
        this.num = Number;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:

                Sai1 fragment1 = new Sai1();
                return fragment1;
            case 1:
                Sai2 fragment2 = new Sai2();
                return fragment2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return num;
    }
}
