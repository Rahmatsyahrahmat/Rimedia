package com.rahmatsyah.rimedia.view.ui.home;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahmatsyah.rimedia.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewStoryFragment extends Fragment {


    public NewStoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_story, container, false);
    }

}
