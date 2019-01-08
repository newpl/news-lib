package com.news.restapi.user.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserAuthRestVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7000264684689683945L;
	/**
	 * 
	 */
	private long userNo;
	private String userId;
	private String password;
}
