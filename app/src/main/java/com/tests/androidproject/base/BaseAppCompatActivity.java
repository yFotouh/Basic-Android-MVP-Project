package com.tests.androidproject.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.tests.androidproject.R;

public abstract class BaseAppCompatActivity extends AppCompatActivity implements IActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        doOnCreate();
    }

    protected void doOnCreate() {


    }

    protected int getFrameResource() {
        return R.id.main_frame;
    }

    public void navigateToFragment(Fragment fragment, boolean addToBackStack) {
        FragmentTransaction ft = this.getSupportFragmentManager().beginTransaction();
        ft.replace(getFrameResource(), fragment, fragment.getClass().getSimpleName());
        if (addToBackStack)
            ft.addToBackStack(fragment.getClass().getSimpleName());
        ft.commitAllowingStateLoss();

    }
}
