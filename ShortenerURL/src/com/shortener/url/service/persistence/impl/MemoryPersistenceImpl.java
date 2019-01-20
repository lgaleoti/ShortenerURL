package com.shortener.url.service.persistence.impl;

import java.util.HashMap;
import java.util.Map;

import com.shortener.url.bo.PersistenceEntry;
import com.shortener.url.bo.analitics.StatisticsData;
import com.shortener.url.service.persistence.IPersistence;

public class MemoryPersistenceImpl implements IPersistence{
	
	private Map<String, PersistenceEntry<String, String>> direct;
	private Map<String, PersistenceEntry<String, String>> reverse;
	
	public MemoryPersistenceImpl() {
		System.out.println("*** Initializing ShortenerURL persistence ***");
		this.direct = new HashMap<String, PersistenceEntry<String, String>>();
		this.reverse = new HashMap<String, PersistenceEntry<String, String>>();
	}
	
	public synchronized void put(String key, PersistenceEntry<String, String> entry) {
		this.direct.put(key, entry);
		
		PersistenceEntry<String, String> entryReverse = new PersistenceEntry<String, String>(entry.getValue(), key);
		this.reverse.put(entry.getValue(), entryReverse);
	}

	public synchronized PersistenceEntry<String, String> getShortURL(String key) {
		return direct.get(key);
	}
	public synchronized PersistenceEntry<String, String> getExpandURL(String key) {
		return reverse.get(key);
	}

	public StatisticsData getStatistics() {
		StatisticsData data = new StatisticsData();
		data.setShortURLEntriesQuantity(this.direct.size());
		data.setExpandURLEntriesQuantity(this.reverse.size());
		return data;
	}

	public void reset() {
		this.direct = new HashMap<String, PersistenceEntry<String, String>>();
		this.reverse = new HashMap<String, PersistenceEntry<String, String>>();
		
	}
}
