package com.shortener.url.bo.shortener;

import com.shortener.url.bo.BaseResponse;

public class ShortURLResponse extends BaseResponse {
	
	private String newURL;

	public String getNewURL() {
		return newURL;
	}
	public void setNewURL(String newURL) {
		this.newURL = newURL;
	}
	@Override
	public String toString() {
		return "ShortURLResponse [code=" + getCode() + ", message=" + getMessage() + 
				", originalURL=" + getNewURL() + "]";
	}

}
