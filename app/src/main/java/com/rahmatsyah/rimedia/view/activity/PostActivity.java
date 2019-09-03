package com.rahmatsyah.rimedia.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rahmatsyah.rimedia.R;
import com.rahmatsyah.rimedia.utils.BottomNavigationViewHelper;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        BottomNavigationViewHelper.getIntance(this,this).enableNavigation();
    }
}
