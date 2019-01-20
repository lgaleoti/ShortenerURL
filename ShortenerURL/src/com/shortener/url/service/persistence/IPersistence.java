package com.shortener.url.service.persistence;

import com.shortener.url.bo.PersistenceEntry;
import com.shortener.url.bo.analitics.StatisticsData;

public interface IPersistence {
	
	public void put(String key, PersistenceEntry<String, String> entry);
	public PersistenceEntry<String, String> getShortURL(String key);
	public PersistenceEntry<String, String> getExpandURL(String key);
	public StatisticsData getStatistics();
	public void reset();

}
