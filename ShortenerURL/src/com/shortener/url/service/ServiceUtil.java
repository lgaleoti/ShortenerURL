package com.shortener.url.service;

import java.util.Date;

import com.google.gson.Gson;
import com.shortener.url.bo.PersistenceEntry;
import com.shortener.url.bo.ResetResponse;
import com.shortener.url.bo.analitics.StatisticsData;
import com.shortener.url.bo.analitics.StatisticsResponse;
import com.shortener.url.bo.expander.ExpandURLResponse;
import com.shortener.url.bo.shortener.ShortURLResponse;

public class ServiceUtil {

	/**
	 * Create a ShortURLResponse
	 * @param code
	 * @param message
	 * @param entry
	 * @return
	 */
	public static ShortURLResponse createShorURLResponse(int code, String message, PersistenceEntry<String, String> entry) {
		ShortURLResponse response = new ShortURLResponse();
		response.setCode(code);
		response.setMessage(message);
		response.setNewURL(entry != null ? entry.getValue() : null);
		return response;
	}

	/**
	 * Create a ExpandURLResponse
	 * @param code
	 * @param message
	 * @param entry
	 * @return
	 */
	public static ExpandURLResponse createExpandURLResponse(int code, String message, PersistenceEntry<String, String> entry) {
		ExpandURLResponse response = new ExpandURLResponse();
		response.setCode(code);
		response.setMessage(message);
		response.setOriginalURL(entry != null ? entry.getValue() : null);
		return response;
	}

	/**
	 * Create a error ShortURLResponse
	 * @param code
	 * @param message
	 * @return
	 */
	public static ShortURLResponse createShorURLResponse(int code, String message) {
		ShortURLResponse response = new ShortURLResponse();
		response.setCode(code);
		response.setMessage(message);
		return response;
	}
	
	/**
	 * Create a error ExpandURLResponse
	 * @param code
	 * @param message
	 * @return
	 */
	public static ExpandURLResponse createExpandURLResponse(int code, String message) {
		ExpandURLResponse response = new ExpandURLResponse();
		response.setCode(code);
		response.setMessage(message);
		return response;
	}

	/**
	 * Create a StatisticsResponse
	 * @param code
	 * @param message
	 * @param data
	 * @return
	 */
	public static StatisticsResponse createStatisticResponse(int code, String message, StatisticsData data) {
		String toJson = (new Gson()).toJson(data);
		StatisticsResponse response = new StatisticsResponse();
		response.setCode(code);
		response.setMessage(message);
		response.setStatistics(toJson);
		return response;
	}

	/**
	 * Create a error StatisticsResponse
	 * @param code
	 * @param message
	 * @return
	 */
	public static StatisticsResponse createStatisticResponse(int code, String message) {
		StatisticsResponse response = new StatisticsResponse();
		response.setCode(code);
		response.setMessage(message);
		return response;
	}

	/**
	 * Create a ResetResponse
	 * @param code
	 * @param message
	 * @return
	 */
	public static ResetResponse createResetResponse(int code, String message) {
		ResetResponse response = new ResetResponse();
		response.setCode(code);
		response.setMessage(message);
		response.setDate(new Date());
		return response;
	}
	
}
