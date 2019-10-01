package com.tests.androidproject.main.detail;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tests.androidproject.R;
import com.tests.androidproject.base.BaseFragment;

import butterknife.BindView;

public class DetailFragment extends BaseFragment {
    @BindView(R.id.tv_details)
    TextView detailsTv;
    String text;

    public static DetailFragment newInstance(String text) {
        DetailFragment detailFragment = new DetailFragment();
        detailFragment.text = text;
        return detailFragment;
    }

    @Override
    public int getContentViewId() {
        return R.layout.fragment_details;
    }

    @Override
    public void doOnViewCreated(View view, Bundle savedInstanceState) {
        detailsTv.setText(text);
    }
}
