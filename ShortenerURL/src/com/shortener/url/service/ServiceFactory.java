package com.shortener.url.service;

import com.shortener.url.service.persistence.IPersistence;
import com.shortener.url.service.persistence.impl.MemoryPersistenceImpl;
import com.shortener.url.service.shortener.IShortener;
import com.shortener.url.service.shortener.impl.ShortenerImpl;

public class ServiceFactory {

	private static IPersistence instancePersistence;
	private static IShortener instanceShortener;
	
	public static IPersistence getPersistence() {
		if (instancePersistence == null) {
			instancePersistence = new MemoryPersistenceImpl();
		}
		return instancePersistence;
		
	}
	public static IShortener getShortener() {
		if (instanceShortener == null) {
			instanceShortener = new ShortenerImpl();
		}
		return instanceShortener;
		
	}
}
