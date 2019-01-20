package com.shortener.url.bo.expander;

public class ExpandURLResponse {
	
	private int code;
	private String message;
	private String originalURL;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getOriginalURL() {
		return originalURL;
	}
	public void setOriginalURL(String newURL) {
		this.originalURL = newURL;
	}
	@Override
	public String toString() {
		return "ExpandURLResponse [code=" + code + ", message=" + message + ", originalURL=" + originalURL + "]";
	}

}
