package com.shortener.url.service;

import java.net.URL;

import com.shortener.url.bo.expander.ExpandURLRequest;
import com.shortener.url.bo.shortener.ShortURLRequest;

public class ServiceValidateUtil {

	/**
	 * Check the Short operation parameters
	 * @param request
	 * @throws Exception
	 */
	public static void validateShortOperation(ShortURLRequest request) throws Exception {
		
		if (request.getUrl() == null || request.getUrl().trim().equals("") || !isValid(request.getUrl())) {
			throw new Exception("Invalid URL parameter");
		}
		
	}

	/**
	 * Check the Expand operation parameters
	 * @param request
	 * @throws Exception
	 */
	public static void validateExpandOperation(ExpandURLRequest request) throws Exception {

		if (request.getUrl() == null || request.getUrl().trim().equals("") || !isValid(request.getUrl())) {
			throw new Exception("Invalid URL parameter");
		}
		
	}

	/**
	 * Validate a URL
	 * @param url
	 * @return
	 */
	private static boolean isValid(String url) {
		
		try {
			new URL(url);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
