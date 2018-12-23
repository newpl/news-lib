package com.news.restapi.exception;

public class RestAPIExceptionFactory {
	public static RestAPIException createException(Exception e) {
		return new RestAPIException(e.getMessage(), e);
	}
	public static RestAPIException createException(String message) {
		return new RestAPIException(message);
	}
}
