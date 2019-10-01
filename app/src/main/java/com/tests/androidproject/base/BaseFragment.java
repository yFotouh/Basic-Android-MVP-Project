package com.tests.androidproject.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.tests.androidproject.main.MainActivity;

import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment implements IFragment {
    ProgressDialog progressDialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getContentViewId(), container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        doOnViewCreated(view, savedInstanceState);
    }

    public void navigateToFragment(Fragment fragment, boolean addToBackStack) {
        ((BaseAppCompatActivity) getActivity()).navigateToFragment(fragment, addToBackStack);
    }

    public void doWithProgressDialog() {


    }

    @Override
    public void showProgressDialog() {
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("loading");
        progressDialog.show();
    }

    @Override
    public void hideProgressDialog() {
        progressDialog.hide();
    }
}
