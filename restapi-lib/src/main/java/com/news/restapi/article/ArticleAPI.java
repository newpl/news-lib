package com.news.restapi.article;

import java.util.List;

import com.news.restapi.article.vo.ArticleRestVO;
import com.news.restapi.config.ApiServiceFactory;
import com.news.restapi.exception.RestAPIExceptionFactory;

import retrofit2.Response;

public class ArticleAPI {
	private static ArticleServiceClient client;

	static {
		client = ApiServiceFactory.getClient(ArticleServiceClient.class);
	}

	public static List<ArticleRestVO> getArticleListByTitle(ArticleRestVO articleVO) {
		try {
			Response<List<ArticleRestVO>> response = client
					.getArticleListByTitle(articleVO.getTitle(), articleVO.getUserNo()).execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				throw RestAPIExceptionFactory.createException(response.errorBody().toString());
			}
		} catch (Exception e) {
			throw RestAPIExceptionFactory.createException(e);
		}
	}
}
