package com.rahmatsyah.rimedia.view.ui.search;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rahmatsyah.rimedia.R;
import com.rahmatsyah.rimedia.utils.BottomNavigationViewHelper;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        BottomNavigationViewHelper.getIntance(this,this).enableNavigation();
    }
}
