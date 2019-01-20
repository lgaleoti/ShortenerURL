package com.shortener.url.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.shortener.url.bo.ResetResponse;
import com.shortener.url.bo.analitics.StatisticsResponse;
import com.shortener.url.bo.expander.ExpandURLRequest;
import com.shortener.url.bo.expander.ExpandURLResponse;
import com.shortener.url.bo.shortener.ShortURLRequest;
import com.shortener.url.bo.shortener.ShortURLResponse;
import com.shortener.url.ws.ShortenerURL;
import com.shortener.url.ws.ShortenerURLServiceLocator;

@ManagedBean(name = "shortbean")
@ViewScoped
public class ShortenerURLBean {
	
	//
	private String shortenerOriginalURL;
	private String shortenerShortedURL;
	//
	private String expanderShortedURL;
	private String expanderOriginalURL;
	//
	private String resetResult;
	//
	private String statisticsResult;
	//
	
	public void shortURL() {
		
		try {
			ShortenerURLServiceLocator locator = new ShortenerURLServiceLocator();
			ShortenerURL shortener = locator.getShortenerURL();
			
			ShortURLRequest request = new ShortURLRequest();
			request.setUrl(shortenerOriginalURL);
			
			ShortURLResponse response = shortener.shortURL(request);
			this.shortenerShortedURL = response.toString();
			
		} catch (Exception e) {
			this.shortenerShortedURL = ("Error: " + e.getMessage());
		}
	}

	public void expandURL() {
		
		try {
			ShortenerURLServiceLocator locator = new ShortenerURLServiceLocator();
			ShortenerURL shortener = locator.getShortenerURL();
			
			ExpandURLRequest request = new ExpandURLRequest();
			request.setUrl(expanderShortedURL);
			
			ExpandURLResponse response = shortener.expandURL(request);
			this.expanderOriginalURL = response.toString();
			
		} catch (Exception e) {
			this.expanderOriginalURL = ("Error: " + e.getMessage());
		}
	}

	public void statistics() {
		
		try {
			ShortenerURLServiceLocator locator = new ShortenerURLServiceLocator();
			ShortenerURL shortener = locator.getShortenerURL();
			
			StatisticsResponse response = shortener.getStatistics();
			this.statisticsResult = response.toString();
			
		} catch (Exception e) {
			this.statisticsResult = ("Error: " + e.getMessage());
		}
	}

	public void reset() {
		
		try {
			ShortenerURLServiceLocator locator = new ShortenerURLServiceLocator();
			ShortenerURL shortener = locator.getShortenerURL();
			
			ResetResponse response = shortener.reset();
			this.resetResult = response.toString();
			
		} catch (Exception e) {
			this.resetResult = ("Error: " + e.getMessage());
		}
	}

	public String getShortenerOriginalURL() {
		return shortenerOriginalURL;
	}

	public void setShortenerOriginalURL(String shortenerOriginalURL) {
		this.shortenerOriginalURL = shortenerOriginalURL;
	}

	public String getShortenerShortedURL() {
		return shortenerShortedURL;
	}

	public void setShortenerShortedURL(String shortenerShortedURL) {
		this.shortenerShortedURL = shortenerShortedURL;
	}

	public String getExpanderShortedURL() {
		return expanderShortedURL;
	}

	public void setExpanderShortedURL(String expanderShortedURL) {
		this.expanderShortedURL = expanderShortedURL;
	}

	public String getExpanderOriginalURL() {
		return expanderOriginalURL;
	}

	public void setExpanderOriginalURL(String expanderOriginalURL) {
		this.expanderOriginalURL = expanderOriginalURL;
	}

	public String getResetResult() {
		return resetResult;
	}

	public void setResetResult(String resetReult) {
		this.resetResult = resetReult;
	}

	public String getStatisticsResult() {
		return statisticsResult;
	}

	public void setStatisticsResult(String statisticsResult) {
		this.statisticsResult = statisticsResult;
	}

}