package com.tests.androidproject.main.mainfragment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.tests.androidproject.R;
import com.tests.androidproject.base.IAdapterCallBack;
import com.tests.androidproject.models.dtos.response.Post;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.BookViewHolder> {

    private List<Post> posts;
    IAdapterCallBack<Post> callBack;

    public PostsAdapter(List<Post> posts, IAdapterCallBack<Post> callBack) {
        this.posts = posts;
        this.callBack = callBack;
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.viewholder_posts, parent, false);

        return new BookViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        holder.title.setText(posts.get(position).getTitle());
        holder.itemView.setOnClickListener(view1 -> {
            callBack.itemClicked(posts.get(position));

        });
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        public TextView title;

        public BookViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.tv_title);
        }
    }
}
