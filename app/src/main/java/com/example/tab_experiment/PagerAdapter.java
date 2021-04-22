package com.example.tab_experiment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class PagerAdapter extends FragmentStatePagerAdapter {

    int behavior;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.behavior = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new tab1_fragment();
            case 1: return new tab2_fragment();
            case 2: return new tab3_fragment();
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return behavior;
    }
}
