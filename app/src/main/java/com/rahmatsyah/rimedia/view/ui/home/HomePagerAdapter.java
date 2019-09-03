package com.rahmatsyah.rimedia.view.ui.home;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class HomePagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public HomePagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new NewStoryFragment();
            case 1:
                return new HomeFragment();
            case 2:
                return new DirectMessageFragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
