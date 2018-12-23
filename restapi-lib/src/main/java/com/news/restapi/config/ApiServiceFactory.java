package com.news.restapi.config;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ApiServiceFactory {
	public static <T> T getApiService(String url, Class<T> type) {
		return (T) createRestAdapter(url).create(type);
	}

	public static <T> T getClient(Class<T> type) {
		return (T) createRestAdapter("127.0.0.1").create(type);
	}

	private static Retrofit createRestAdapter(String url) {
		return new Retrofit.Builder().baseUrl(url).client(getHttpClient())
				.addConverterFactory(ScalarsConverterFactory.create())
				.addConverterFactory(GsonConverterFactory.create()).build();
	}

	private static OkHttpClient getHttpClient() {
		HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
		logging.setLevel(Level.BASIC);
		OkHttpClient.Builder httpClient = new OkHttpClient().newBuilder();
		httpClient.connectTimeout(10, TimeUnit.SECONDS).readTimeout(10, TimeUnit.SECONDS).writeTimeout(10,
				TimeUnit.SECONDS);
		httpClient.interceptors().add(logging);
		return httpClient.build();
	}
}
