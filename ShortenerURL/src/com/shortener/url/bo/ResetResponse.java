package com.shortener.url.bo;

import java.util.Date;

public class ResetResponse extends BaseResponse {
	
	private Date date;

	@Override
	public String toString() {
		return "ResetResponse [code=" + getCode() + ", message=" + getMessage() + 
				", date=" + getDate() + "]";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
