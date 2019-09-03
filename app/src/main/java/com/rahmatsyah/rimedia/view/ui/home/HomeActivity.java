package com.rahmatsyah.rimedia.view.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.rahmatsyah.rimedia.R;
import com.rahmatsyah.rimedia.utils.BottomNavigationViewHelper;

public class HomeActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        viewPager = findViewById(R.id.vpHome);

        HomePagerAdapter homePagerAdapter = new HomePagerAdapter(getSupportFragmentManager(),3);
        viewPager.setAdapter(homePagerAdapter);
        viewPager.setCurrentItem(1);

    }

    @Override
    public void onBackPressed() {
        switch (viewPager.getCurrentItem()){
            case 0:
                viewPager.setCurrentItem(1);
                break;
            case 1:
                super.onBackPressed();
                break;
            case 2:
                viewPager.setCurrentItem(1);
                break;
                default:
                    super.onBackPressed();
        }
    }
}
