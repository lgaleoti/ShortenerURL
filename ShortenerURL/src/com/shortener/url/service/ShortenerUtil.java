package com.shortener.url.service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

import sun.misc.BASE64Encoder;

public class ShortenerUtil {
	
	/**
	 * Short a URL
	 * @param originalURL
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public static String shortURL(String originalURL) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String uuid = UUID.randomUUID().toString();
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		
		String toEncode = originalURL + uuid;
		byte[] hash = digest.digest(toEncode.getBytes("UTF-8"));
		String newURL = new BASE64Encoder().encode(hash);
		return (ShortenerConstants.TINY_URL_HOST + trunc(newURL));
		
	}

	/**
	 * Trunc a URL
	 * @param newURL
	 * @return
	 */
	private static String trunc(String newURL) {
		Random r = new Random();
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < ShortenerConstants.TINY_URL_LENGTH; i++) {
			builder.append(newURL.charAt(r.nextInt(newURL.length())));
		}
		return builder.toString();
	}

}
