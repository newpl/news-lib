package com.news.restapi.exception;

public class RestAPIException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2220566643836753737L;

	public RestAPIException(String message) {
		super(message);
	}
	
	public RestAPIException(String message, Throwable e) {
		super(message, e);
	}

}
