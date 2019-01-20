package com.shortener.url.ws;

public class ShortenerURLProxy implements com.shortener.url.ws.ShortenerURL {
  private String _endpoint = null;
  private com.shortener.url.ws.ShortenerURL shortenerURL = null;
  
  public ShortenerURLProxy() {
    _initShortenerURLProxy();
  }
  
  public ShortenerURLProxy(String endpoint) {
    _endpoint = endpoint;
    _initShortenerURLProxy();
  }
  
  private void _initShortenerURLProxy() {
    try {
      shortenerURL = (new com.shortener.url.ws.ShortenerURLServiceLocator()).getShortenerURL();
      if (shortenerURL != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)shortenerURL)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)shortenerURL)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (shortenerURL != null)
      ((javax.xml.rpc.Stub)shortenerURL)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.shortener.url.ws.ShortenerURL getShortenerURL() {
    if (shortenerURL == null)
      _initShortenerURLProxy();
    return shortenerURL;
  }
  
  public com.shortener.url.bo.ResetResponse reset() throws java.rmi.RemoteException{
    if (shortenerURL == null)
      _initShortenerURLProxy();
    return shortenerURL.reset();
  }
  
  public com.shortener.url.bo.shortener.ShortURLResponse shortURL(com.shortener.url.bo.shortener.ShortURLRequest request) throws java.rmi.RemoteException{
    if (shortenerURL == null)
      _initShortenerURLProxy();
    return shortenerURL.shortURL(request);
  }
  
  public com.shortener.url.bo.analitics.StatisticsResponse getStatistics() throws java.rmi.RemoteException{
    if (shortenerURL == null)
      _initShortenerURLProxy();
    return shortenerURL.getStatistics();
  }
  
  public com.shortener.url.bo.expander.ExpandURLResponse expandURL(com.shortener.url.bo.expander.ExpandURLRequest request) throws java.rmi.RemoteException{
    if (shortenerURL == null)
      _initShortenerURLProxy();
    return shortenerURL.expandURL(request);
  }
  
  
}