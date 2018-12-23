package com.news.restapi.article.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class ArticleRestVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8927041032092533509L;
	private int aricleNo;
	private int userNo;
	private int articleStatus;
	private String title;
	private String contents;
	private int categoryNo;
	private char deleteYn;
}
