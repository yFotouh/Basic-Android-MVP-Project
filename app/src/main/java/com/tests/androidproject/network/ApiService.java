package com.tests.androidproject.network;

import com.tests.androidproject.models.dtos.response.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET("posts")
    Observable<List<Post>> getPosts();
}
