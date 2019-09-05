package com.rahmatsyah.rimedia.view.ui.like;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.rahmatsyah.rimedia.R;
import com.rahmatsyah.rimedia.utils.BottomNavigationViewHelper;

public class LikeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like);
        BottomNavigationViewHelper.getIntance(this,this).enableNavigation();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.likeFrame,new LikeFragment()).commit();

    }
}
