/**
 * ShortenerURLService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.shortener.url.ws;

public interface ShortenerURLService extends javax.xml.rpc.Service {
    public java.lang.String getShortenerURLAddress();

    public com.shortener.url.ws.ShortenerURL getShortenerURL() throws javax.xml.rpc.ServiceException;

    public com.shortener.url.ws.ShortenerURL getShortenerURL(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
