package org.techtown.proverbpractice;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class PagerManager extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> items = new ArrayList<Fragment>();

    public PagerManager(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment) {
        this.items.add(fragment);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return this.items.size();
    }
}
