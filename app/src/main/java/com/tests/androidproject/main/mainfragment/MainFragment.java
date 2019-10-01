package com.tests.androidproject.main.mainfragment;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tests.androidproject.R;
import com.tests.androidproject.base.BaseFragment;
import com.tests.androidproject.main.detail.DetailFragment;
import com.tests.androidproject.main.mainfragment.adapter.PostsAdapter;

import butterknife.BindView;

public class MainFragment extends BaseFragment implements MainView.View {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    MainFragmentPresenter mainFragmentPresenter;

    public static MainFragment newInstance() {
        MainFragment mainFragment = new MainFragment();
        return mainFragment;
    }

    @Override
    public int getContentViewId() {
        return R.layout.fragment_main;
    }

    @Override
    public void doOnViewCreated(android.view.View view, Bundle savedInstanceState) {
        mainFragmentPresenter = new MainFragmentPresenter(this);
        mainFragmentPresenter.getPosts(postsResponses -> {
            recyclerView.setAdapter(new PostsAdapter(postsResponses, post -> {
                navigateToFragment(DetailFragment.newInstance(post.getBody()), true);
            }));
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        });
    }


    @Override
    public void showToast(String message) {

    }
}
