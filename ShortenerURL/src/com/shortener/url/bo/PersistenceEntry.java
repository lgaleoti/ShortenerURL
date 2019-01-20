package com.shortener.url.bo;

import java.io.Serializable;

public class PersistenceEntry<K, V> implements Serializable {

	private static final long serialVersionUID = 2447115594855555504L;
	private K key;
	private V value;

	public PersistenceEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}
