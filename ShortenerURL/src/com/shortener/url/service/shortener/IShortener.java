package com.shortener.url.service.shortener;

import com.shortener.url.bo.ResetResponse;
import com.shortener.url.bo.analitics.StatisticsResponse;
import com.shortener.url.bo.expander.ExpandURLRequest;
import com.shortener.url.bo.expander.ExpandURLResponse;
import com.shortener.url.bo.shortener.ShortURLRequest;
import com.shortener.url.bo.shortener.ShortURLResponse;

public interface IShortener {
	
	public ShortURLResponse shortURL(ShortURLRequest request);
	public ExpandURLResponse expandURL(ExpandURLRequest request);
	public StatisticsResponse getStatistics();
	public ResetResponse reset();

}
