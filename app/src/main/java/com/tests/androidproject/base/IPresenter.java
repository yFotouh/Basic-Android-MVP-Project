package com.tests.androidproject.base;

import android.view.View;

public interface IPresenter {
    void setView(View view);

    View getView();
}
