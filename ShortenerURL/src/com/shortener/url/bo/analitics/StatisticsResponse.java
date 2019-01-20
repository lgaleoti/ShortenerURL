package com.shortener.url.bo.analitics;

public class StatisticsResponse {

	private int code;
	private String message;
	private String statistics;
	
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
	public String getStatistics() {
		return statistics;
	}
	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}
	@Override
	public String toString() {
		return "StatisticsResponse [code=" + code + ", message=" + message + ", statistics=" + statistics + "]";
	}

}
