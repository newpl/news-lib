package com.news.restapi.user;

import java.util.List;

import com.news.restapi.user.vo.UserAuthRestVO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserServiceClient {
	@GET("/api/user/authorization/{userId}")
	Call<UserAuthRestVO> authorization(@Path("userId") String userId);

	@GET("/api/user/role/{userNo}")
	Call<List<String>> getGrantedRole(@Path("userNo") long userNo);

	@GET("/api/user/{userId}")
	Call<UserAuthRestVO> getUserInfo(@Query("userId") String userId);
}
