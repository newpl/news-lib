package com.news.restapi.article;

import java.util.List;

import com.news.restapi.article.vo.ArticleRestVO;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ArticleServiceClient {
	@GET("/article/test/test1")
	Call<List<ArticleRestVO>> getArticleListByTitle(String title);
}
