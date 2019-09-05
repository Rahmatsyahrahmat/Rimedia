package com.rahmatsyah.rimedia.view.ui.like;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class LikePagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public LikePagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FollowingFragment();
            case 1:
                return new YourFragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
