package com.rahmatsyah.rimedia.view.ui.home;


import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.rahmatsyah.rimedia.R;
import com.rahmatsyah.rimedia.utils.BottomNavigationViewHelper;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeActivity activity;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        activity = (HomeActivity) getActivity();
        BottomNavigationViewHelper.getIntance(getContext(),getActivity()).enableNavigation();
        ImageView ivDirectMessage = view.findViewById(R.id.ivDirectMessageAppBarHome),
                ivNewStory = view.findViewById(R.id.ivCameraAppBarHome);
        ivDirectMessage.setOnClickListener(this);
        ivNewStory.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ivDirectMessageAppBarHome:
                activity.toDirectMessage();
                break;
            case R.id.ivCameraAppBarHome:
                activity.toNewStory();
                break;
        }
    }
}
