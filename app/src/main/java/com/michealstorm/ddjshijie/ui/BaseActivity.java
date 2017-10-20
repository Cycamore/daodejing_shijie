package com.michealstorm.ddjshijie.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.michealstorm.ddjshijie.R;
import com.michealstorm.ddjshijie.fragment.ImageFragment;
import com.michealstorm.ddjshijie.fragment.MuluFragment;

import java.util.ArrayList;
import java.util.List;


public class BaseActivity extends FragmentActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private List<Fragment> mFragmentList = new ArrayList<>();
    int currentMenuIndex = 0;
    private FrameLayout mContainer;
    private BottomNavigationView navigation;
    private int fragmentContainerId = R.id.main_container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        initView();
        if (savedInstanceState == null) {

            navigation.getMenu().getItem(currentMenuIndex).setChecked(true);
            navigation.setOnNavigationItemSelectedListener(this);

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.main_container, mFragmentList.get(0));
            ft.commit();

        }

    }

    private void initView() {
        mFragmentList.add(new MuluFragment());   //首页
        mFragmentList.add(ImageFragment.newInstance(R.drawable.mm2));
        mFragmentList.add(ImageFragment.newInstance(R.drawable.mm3));

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (getCurrentMenuItemId() == item.getItemId()) {
            return true;
        } else {
            Fragment fragment = mFragmentList.get(getMenuItemIndex(item));
            FragmentTransaction ft = obtainFragmentTransaction();
            getCurrentFragment().onPause();
            if (fragment.isAdded()) {
                fragment.onResume();
            } else {
                ft.add(fragmentContainerId, fragment);
            }
            showTab(getMenuItemIndex(item));
            ft.commit();
        }


        return true;
    }

    private int getMenuItemIndex(MenuItem item) {
        if (item.getItemId() == R.id.navigation_home) {
            return 0;
        } else if (item.getItemId() == R.id.navigation_dashboard) {
            return 1;
        } else if (item.getItemId() == R.id.navigation_notifications) {
            return 2;
        }
        return 100;
    }

    private Fragment getCurrentFragment() {
        return mFragmentList.get(currentMenuIndex);
    }

    private int getCurrentMenuItemId() {
        return navigation.getMenu().getItem(currentMenuIndex).getItemId();
    }

    private FragmentTransaction obtainFragmentTransaction() {
        return getSupportFragmentManager().beginTransaction();

    }

    private void showTab(int idx) {
        for (int i = 0; i < mFragmentList.size(); i++) {
            Fragment fragment = mFragmentList.get(i);
            FragmentTransaction ft = obtainFragmentTransaction();

            if (idx == i) {
                ft.show(fragment);
            } else {
                ft.hide(fragment);
            }
            ft.commit();
        }
        currentMenuIndex = idx;
    }
}
