package com.tests.androidproject.base;

import android.os.Bundle;

import com.tests.androidproject.main.mainfragment.MainView;

public interface BaseIView {
    void doOnViewCreated(android.view.View view, Bundle savedInstanceState);
}
