package com.shortener.url.service;

import java.util.HashMap;
import java.util.Map;

public class ShortenerConstants {

	public static int SUCCESS_CODE = 0;
	public static int UNSUPORTED_ENCODING_EXCEPTION_CODE = -1;
	public static int NO_SUCH_ALGORITHM_EXCEPTION_CODE = -2;
	public static int GENERAL_EXCEPTION_CODE = -3;
	public static int URL_NOT_SHORTED_EXCEPTION_CODE = -4;
	public static int UNKNOW_EXCEPTION_CODE = -5;
	
	public static int TINY_URL_LENGTH = 10;
	public static String TINY_URL_HOST = "http://www.tinyurl.com/";

}
