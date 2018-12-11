package com.news.common.base;

public class BaseVO {
	private String deleteYn;
	private String createdDatetime;
	private String updatedDatetime;
	private String createdSourceId;
	private String updatedSourceId;

	public String getDeleteYn() {
		return deleteYn;
	}

	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}

	public String getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(String createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public String getUpdatedDatetime() {
		return updatedDatetime;
	}

	public void setUpdatedDatetime(String updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}

	public String getCreatedSourceId() {
		return createdSourceId;
	}

	public void setCreatedSourceId(String createdSourceId) {
		this.createdSourceId = createdSourceId;
	}

	public String getUpdatedSourceId() {
		return updatedSourceId;
	}

	public void setUpdatedSourceId(String updatedSourceId) {
		this.updatedSourceId = updatedSourceId;
	}

}
