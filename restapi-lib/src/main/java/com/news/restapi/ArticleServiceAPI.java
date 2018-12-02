package com.news.restapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ArticleServiceAPI {
	@GET("/article/test/test1")
	Call<String> test();
}
