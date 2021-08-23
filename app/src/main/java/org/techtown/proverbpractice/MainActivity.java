package org.techtown.proverbpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
//주석
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(4); //오류 내볼것 딱히 초과해도 뭐가 생기는지모름

        PagerManager pagermanager = new PagerManager(getSupportFragmentManager());

        ProverbArray proverbarray = new ProverbArray();
        pagermanager.addFragment(proverbarray);

        ProverbFragment proverbfragment = new ProverbFragment();
        pagermanager.addFragment(proverbfragment);

        MainFragment mainfragment = new MainFragment();
        pagermanager.addFragment(mainfragment);

        GoodWordFragment goodWordFragment = new GoodWordFragment();
        pagermanager.addFragment(goodWordFragment);

        pager.setAdapter(pagermanager);
        pager.setCurrentItem(1);

    }
}