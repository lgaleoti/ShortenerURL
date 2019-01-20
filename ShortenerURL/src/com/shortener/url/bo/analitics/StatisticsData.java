package com.shortener.url.bo.analitics;

public class StatisticsData {

	private String persistenceStartDate;
	private int shortURLQuantityPerHour;
	private int expandURLQuantityPerHour;
	private int shortURLEntriesQuantity;
	private int expandURLEntriesQuantity;
	
	public String getPersistenceStartDate() {
		return persistenceStartDate;
	}
	public void setPersistenceStartDate(String persistenceStartDate) {
		this.persistenceStartDate = persistenceStartDate;
	}
	public int getShortURLQuantityPerHour() {
		return shortURLQuantityPerHour;
	}
	public void setShortURLQuantityPerHour(int shortURLQuantityPerHour) {
		this.shortURLQuantityPerHour = shortURLQuantityPerHour;
	}
	public int getExpandURLQuantityPerHour() {
		return expandURLQuantityPerHour;
	}
	public void setExpandURLQuantityPerHour(int expandURLQuantityPerHour) {
		this.expandURLQuantityPerHour = expandURLQuantityPerHour;
	}
	public int getShortURLEntriesQuantity() {
		return shortURLEntriesQuantity;
	}
	public void setShortURLEntriesQuantity(int shortURLEntriesQuantity) {
		this.shortURLEntriesQuantity = shortURLEntriesQuantity;
	}
	public int getExpandURLEntriesQuantity() {
		return expandURLEntriesQuantity;
	}
	public void setExpandURLEntriesQuantity(int expandURLEntriesQuantity) {
		this.expandURLEntriesQuantity = expandURLEntriesQuantity;
	}

	

}
