/**
 * ShortenerURL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.shortener.url.ws;

public interface ShortenerURL extends java.rmi.Remote {
    public com.shortener.url.bo.ResetResponse reset() throws java.rmi.RemoteException;
    public com.shortener.url.bo.shortener.ShortURLResponse shortURL(com.shortener.url.bo.shortener.ShortURLRequest request) throws java.rmi.RemoteException;
    public com.shortener.url.bo.analitics.StatisticsResponse getStatistics() throws java.rmi.RemoteException;
    public com.shortener.url.bo.expander.ExpandURLResponse expandURL(com.shortener.url.bo.expander.ExpandURLRequest request) throws java.rmi.RemoteException;
}
