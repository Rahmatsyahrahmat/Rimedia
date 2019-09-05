package com.rahmatsyah.rimedia.view.ui.like;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.rahmatsyah.rimedia.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LikeFragment extends Fragment implements TabLayout.OnTabSelectedListener {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    public LikeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_like, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tabLayout = view.findViewById(R.id.tlLike);
        viewPager = view.findViewById(R.id.vpLike);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity()!=null){
            LikePagerAdapter likePagerAdapter = new LikePagerAdapter(getActivity().getSupportFragmentManager(),tabLayout.getTabCount());
            viewPager.setAdapter(likePagerAdapter);
            viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
            viewPager.setCurrentItem(1);

            tabLayout.setOnTabSelectedListener(this);
        }
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
