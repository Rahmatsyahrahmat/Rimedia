package com.rahmatsyah.rimedia.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rahmatsyah.rimedia.R;
import com.rahmatsyah.rimedia.view.ui.home.HomeActivity;
import com.rahmatsyah.rimedia.view.ui.like.LikeActivity;
import com.rahmatsyah.rimedia.view.ui.post.PostActivity;
import com.rahmatsyah.rimedia.view.ui.profile.ProfileActivity;
import com.rahmatsyah.rimedia.view.ui.search.SearchActivity;


public class BottomNavigationViewHelper implements BottomNavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemReselectedListener{

    private static final String MENU_ITEM_ID = "menu_item_id";

    private Context context;
    private BottomNavigationView bottomNavigationView;

    private BottomNavigationViewHelper(Context context, Activity activity){
        this.context = context;
        bottomNavigationView = activity.findViewById(R.id.bottomNavigationView);
        if (activity.getIntent().getExtras()!=null){
            bottomNavigationView.setSelectedItemId(activity.getIntent().getExtras().getInt(MENU_ITEM_ID,R.id.menuHome));
        }
    }

    public static BottomNavigationViewHelper getIntance(Context context, Activity activity){
        return new BottomNavigationViewHelper(context,activity);
    }

    public void enableNavigation(){
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setOnNavigationItemReselectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.menuHome:
                startActivity(HomeActivity.class,R.id.menuHome);
                break;
            case R.id.menuSearch:
                startActivity(SearchActivity.class,R.id.menuSearch);
                break;
            case R.id.menuPost:
                startActivity(PostActivity.class,R.id.menuPost);
                break;
            case R.id.menuLike:
                startActivity(LikeActivity.class,R.id.menuLike);
                break;
            case R.id.menuProfile:
                startActivity(ProfileActivity.class,R.id.menuProfile);
                break;
        }
        return false;
    }

    private void startActivity(Class<?> dest, int itemId){
        Intent intent = new Intent(context,dest);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        intent.putExtra(MENU_ITEM_ID,itemId);
        context.startActivity(intent);
    }

    @Override
    public void onNavigationItemReselected(@NonNull MenuItem menuItem) {

    }
}
