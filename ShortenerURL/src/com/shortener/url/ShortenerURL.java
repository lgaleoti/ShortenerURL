package com.shortener.url;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shortener.url.bo.ResetResponse;
import com.shortener.url.bo.analitics.StatisticsResponse;
import com.shortener.url.bo.expander.ExpandURLRequest;
import com.shortener.url.bo.expander.ExpandURLResponse;
import com.shortener.url.bo.shortener.ShortURLRequest;
import com.shortener.url.bo.shortener.ShortURLResponse;
import com.shortener.url.service.ServiceFactory;
import com.shortener.url.service.shortener.IShortener;

public class ShortenerURL {
	
	public ShortenerURL() {
		ServiceFactory.getShortener();
	}
	
	public ShortURLResponse shortURL(ShortURLRequest request) {
		IShortener shortener = ServiceFactory.getShortener();
		return shortener.shortURL(request);
		
	}

	public ExpandURLResponse expandURL(ExpandURLRequest request) {
		IShortener shortener = ServiceFactory.getShortener();
		return shortener.expandURL(request);
		
	}

	public StatisticsResponse getStatistics() {
		IShortener shortener = ServiceFactory.getShortener();
		return shortener.getStatistics();
	}

	public static void main(String[] args) {
		ShortenerURL shortener = new ShortenerURL();
		
		ShortURLRequest shortRequest = new ShortURLRequest();
		//shortRequest.setUrl("http://www.google.com.br");
		
		ShortURLResponse shortResponse = shortener.shortURL(shortRequest);
		System.out.println(shortResponse);

		ExpandURLRequest expandRequest = new ExpandURLRequest();
		expandRequest.setUrl(shortResponse.getNewURL());

		ExpandURLResponse expandResponse = shortener.expandURL(expandRequest);
		System.out.println(expandResponse);
		
		StatisticsResponse statisticsResponse = shortener.getStatistics();
		System.out.println(statisticsResponse);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(statisticsResponse.getStatistics());
		System.out.println(json);

		ResetResponse resetResponse = shortener.reset();
		System.out.println(resetResponse);
		
		expandResponse = shortener.expandURL(expandRequest);
		System.out.println(expandResponse);
		
	}

	public ResetResponse reset() {
		IShortener shortener = ServiceFactory.getShortener();
		return shortener.reset();
	}

}
