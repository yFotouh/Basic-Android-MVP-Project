package com.tests.androidproject.main;

import com.tests.androidproject.R;
import com.tests.androidproject.base.BaseAppCompatActivity;
import com.tests.androidproject.main.mainfragment.MainFragment;

public class MainActivity extends BaseAppCompatActivity {

    @Override
    protected void doOnCreate() {
        super.doOnCreate();
        navigateToFragment(MainFragment.newInstance(),false);
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }
}
