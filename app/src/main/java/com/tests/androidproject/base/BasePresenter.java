package com.tests.androidproject.base;

import com.tests.androidproject.utils.Threading;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public abstract class BasePresenter<T extends IView> {
    protected T iView;

    public <T> void doWithProgressDialog(Observable<T> observable, Consumer<T> finished) {
        iView.showProgressDialog();
        Threading.async(observable, t -> {
            iView.hideProgressDialog();
            finished.accept(t);
        }, throwable -> {
            iView.hideProgressDialog();
        });

    }

}
