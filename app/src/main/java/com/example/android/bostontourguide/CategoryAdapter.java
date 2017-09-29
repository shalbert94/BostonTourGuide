package com.example.android.bostontourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by shalom on 2017-04-11.
 */

public class CategoryAdapter extends FragmentPagerAdapter{
    final int PAGE_COUNT = 4;
    private String[] tabTitles = {"Attractions", "Museums", "Parks", "Theaters"};
    private Context context;


    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return AttractionsFragment.newInstance(position + 1);
            case 1:
                return MuseumsFragment.newInstance(position + 1);
            case 2:
                return ParksFragment.newInstance(position + 1);
            case 3:
                return TheatersFragment.newInstance(position + 1);
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
