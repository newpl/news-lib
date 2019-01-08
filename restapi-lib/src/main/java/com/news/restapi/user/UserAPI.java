package com.news.restapi.user;

import java.util.List;

import com.news.restapi.config.ApiServiceFactory;
import com.news.restapi.exception.RestAPIExceptionFactory;
import com.news.restapi.user.vo.UserAuthRestVO;

import retrofit2.Response;

public class UserAPI {
	private static UserServiceClient client;

	static {
		client = ApiServiceFactory.getClient(UserServiceClient.class);
	}

	public static UserAuthRestVO authorization(String userId) {
		try {
			Response<UserAuthRestVO> response = client
					.authorization(userId).execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				throw RestAPIExceptionFactory.createException(response.errorBody().toString());
			}
		} catch (Exception e) {
			throw RestAPIExceptionFactory.createException(e);
		}
	}

	public static UserAuthRestVO getUserinfoByUserId(String userId) {
		try {
			Response<UserAuthRestVO> response = client
					.getUserInfo(userId).execute();
			if (response.isSuccessful()) {
				return response.body();
			} else {
				throw RestAPIExceptionFactory.createException(response.errorBody().toString());
			}
		} catch (Exception e) {
			throw RestAPIExceptionFactory.createException(e);
		}
	}

	public static List<String> getGrantedRole(long userNo) {
		try {
			Response<List<String>> response = client
					.getGrantedRole(userNo).execute();
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
