package org.techtown.proverbpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(2); //오류 내볼것

        PagerManager pagermanager = new PagerManager(getSupportFragmentManager());

        ProverbFragment proverbfragment = new ProverbFragment();
        pagermanager.addFragment(proverbfragment);

        GoodWordFragment goodWordFragment = new GoodWordFragment();
        pagermanager.addFragment(goodWordFragment);

        pager.setAdapter(pagermanager);

    }
}