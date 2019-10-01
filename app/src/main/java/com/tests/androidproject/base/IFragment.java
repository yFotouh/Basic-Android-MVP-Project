package com.tests.androidproject.base;

import android.os.Bundle;
import android.view.View;

public interface IFragment {
   int getContentViewId();
   void doOnViewCreated(View view, Bundle savedInstanceState);
   void showProgressDialog();
   void hideProgressDialog();
}
