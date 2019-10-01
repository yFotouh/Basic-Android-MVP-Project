package com.tests.androidproject.main.mainfragment;

import com.tests.androidproject.base.BaseIView;
import com.tests.androidproject.base.BasePresenter;
import com.tests.androidproject.base.IView;
import com.tests.androidproject.models.dtos.response.Post;
import com.tests.androidproject.network.ApiClient;
import com.tests.androidproject.utils.Threading;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class MainFragmentPresenter extends BasePresenter<IView> {
    public MainFragmentPresenter(MainView.View view) {
        this.iView = view;
    }

    public void getPosts(Consumer<List<Post>> finished) {
        doWithProgressDialog(ApiClient.getApiService().getPosts(), finished);
    }


}
