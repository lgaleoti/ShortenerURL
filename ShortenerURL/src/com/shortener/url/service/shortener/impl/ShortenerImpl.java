package com.shortener.url.service.shortener.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.shortener.url.bo.PersistenceEntry;
import com.shortener.url.bo.ResetResponse;
import com.shortener.url.bo.analitics.StatisticsData;
import com.shortener.url.bo.analitics.StatisticsResponse;
import com.shortener.url.bo.expander.ExpandURLRequest;
import com.shortener.url.bo.expander.ExpandURLResponse;
import com.shortener.url.bo.shortener.ShortURLRequest;
import com.shortener.url.bo.shortener.ShortURLResponse;
import com.shortener.url.service.ServiceFactory;
import com.shortener.url.service.ServiceUtil;
import com.shortener.url.service.ServiceValidateUtil;
import com.shortener.url.service.ShortenerConstants;
import com.shortener.url.service.ShortenerUtil;
import com.shortener.url.service.persistence.IPersistence;
import com.shortener.url.service.shortener.IShortener;

public class ShortenerImpl implements IShortener {

	private int shortOperations = 0;
	private int expandOperations = 0;
	private Date startDate;
	

	public ShortenerImpl() {
		System.out.println("*** Initializing ShortenerURL service ***");
		ServiceFactory.getPersistence();
		this.shortOperations = 0;
		this.expandOperations = 0;
		this.startDate = new Date();
	}

	/**
	 * Short a URL
	 */
	public ShortURLResponse shortURL(ShortURLRequest request) {
		System.out.println("*** Shortening URL ***");
		ShortURLResponse ret = null;
		this.shortOperations++;
		
		try {

			// 1 - Validate request parameters
			ServiceValidateUtil.validateShortOperation(request);

			// 2 - Check if URL was shorted previously
			IPersistence persistence = ServiceFactory.getPersistence();
			PersistenceEntry<String, String> entry = persistence.getShortURL(request.getUrl());

			// 2.1 - Not shorted yet
			if (entry == null) {
				
				try {
					
					// 2.1.1 - Short operation
					String newUrl = ShortenerUtil.shortURL(request.getUrl());
					entry = new PersistenceEntry<String, String>(request.getUrl(), newUrl);
					
					// 2.1.2 - Persist shorted url
					persistence.put(request.getUrl(), entry);
					ret = ServiceUtil.createShorURLResponse(ShortenerConstants.SUCCESS_CODE, null, entry);
					
				} catch (UnsupportedEncodingException e) {
					ret = ServiceUtil.createShorURLResponse(ShortenerConstants.UNSUPORTED_ENCODING_EXCEPTION_CODE, e.getMessage());
				} catch (NoSuchAlgorithmException e) {
					ret = ServiceUtil.createShorURLResponse(ShortenerConstants.NO_SUCH_ALGORITHM_EXCEPTION_CODE, e.getMessage());
				} catch (Exception e) {
					ret = ServiceUtil.createShorURLResponse(ShortenerConstants.GENERAL_EXCEPTION_CODE, e.getMessage());
				}

			}else { // 2.2 - Shorted previously
				ret = ServiceUtil.createShorURLResponse(ShortenerConstants.SUCCESS_CODE, null, entry);
			}

		} catch (Exception e) {
			ret = ServiceUtil.createShorURLResponse(ShortenerConstants.GENERAL_EXCEPTION_CODE, e.getMessage());
		}
		System.out.println("*** Done ***");
		return ret;
	}

	/**
	 * Expand a URL
	 */
	public ExpandURLResponse expandURL(ExpandURLRequest request) {
		System.out.println("*** Expanding URL ***");
		ExpandURLResponse ret = null;
		this.expandOperations++;
		
		try {
			
			// 1 - Validate request parameters
			ServiceValidateUtil.validateExpandOperation(request);
			
			// 2 - Find URL previously shorted
			IPersistence persistence = ServiceFactory.getPersistence();
			PersistenceEntry<String, String> entry = persistence.getExpandURL(request.getUrl());
			
			// 2.1 - Founded URL previously shorted
			if (entry != null) {
				ret = ServiceUtil.createExpandURLResponse(ShortenerConstants.SUCCESS_CODE, null, entry);
				
			}else { // 2.2 - Not founded URL previously shorted
				ret = ServiceUtil.createExpandURLResponse(ShortenerConstants.URL_NOT_SHORTED_EXCEPTION_CODE, "URL shorted not founded", entry);

			}
			
		} catch (Exception e) {
			ret = ServiceUtil.createExpandURLResponse(ShortenerConstants.UNKNOW_EXCEPTION_CODE, e.getMessage());
		}
		System.out.println("*** Done ***");
		return ret;
	}

	/**
	 * Collect statistics from short/expand service
	 */
	public StatisticsResponse getStatistics() {
		System.out.println("*** Gathering statistics ***");
		StatisticsResponse ret = null;
		
		try {
			
			Date now = new Date();
			long diff = (now.getTime() - this.startDate.getTime()) / (60 * 60 * 1000) + 1;
			
			IPersistence persistence = ServiceFactory.getPersistence();
			
			StatisticsData data = persistence.getStatistics();
			data.setPersistenceStartDate(new SimpleDateFormat().format(this.startDate));
			data.setShortURLQuantityPerHour((int)(this.shortOperations / diff));
			data.setExpandURLQuantityPerHour((int)(this.expandOperations / diff));
			
			ret = ServiceUtil.createStatisticResponse(ShortenerConstants.SUCCESS_CODE, null, data);
			
		} catch (Exception e) {
			ret = ServiceUtil.createStatisticResponse(ShortenerConstants.UNKNOW_EXCEPTION_CODE, e.getMessage());
		} catch (Throwable e) {
			ret = ServiceUtil.createStatisticResponse(ShortenerConstants.UNKNOW_EXCEPTION_CODE, e.getMessage());
		}
		
		System.out.println("*** Done ***");
		return ret;
	}

	/**
	 * Reset short/expand service statistics
	 */
	public ResetResponse reset() {
		System.out.println("*** Reset ***");
		ResetResponse ret = null;
		
		try {

			IPersistence persistence = ServiceFactory.getPersistence();
			persistence.reset();
			this.shortOperations = 0;
			this.expandOperations = 0;
			ret = ServiceUtil.createResetResponse(ShortenerConstants.SUCCESS_CODE, null);
			
		} catch (Exception e) {
			ret = ServiceUtil.createResetResponse(ShortenerConstants.GENERAL_EXCEPTION_CODE, e.getMessage());
		}
		System.out.println("*** Done ***");
		return ret;
	}

}
