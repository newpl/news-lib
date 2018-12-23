package com.news.restapi.article;

import java.util.List;

import com.news.restapi.article.vo.ArticleRestVO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ArticleServiceClient {
	@GET("/api/article/test/test1/{title}")
	Call<List<ArticleRestVO>> getArticleListByTitle(@Path("title") String title, @Query("userNo") long userNo);
}
