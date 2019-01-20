/**
 * ShortenerURLServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.shortener.url.ws;

public class ShortenerURLServiceLocator extends org.apache.axis.client.Service implements com.shortener.url.ws.ShortenerURLService {

    public ShortenerURLServiceLocator() {
    }


    public ShortenerURLServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ShortenerURLServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ShortenerURL
    private java.lang.String ShortenerURL_address = "http://localhost:8080/ShortenerURLWeb/services/ShortenerURL";

    public java.lang.String getShortenerURLAddress() {
        return ShortenerURL_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ShortenerURLWSDDServiceName = "ShortenerURL";

    public java.lang.String getShortenerURLWSDDServiceName() {
        return ShortenerURLWSDDServiceName;
    }

    public void setShortenerURLWSDDServiceName(java.lang.String name) {
        ShortenerURLWSDDServiceName = name;
    }

    public com.shortener.url.ws.ShortenerURL getShortenerURL() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ShortenerURL_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getShortenerURL(endpoint);
    }

    public com.shortener.url.ws.ShortenerURL getShortenerURL(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.shortener.url.ws.ShortenerURLSoapBindingStub _stub = new com.shortener.url.ws.ShortenerURLSoapBindingStub(portAddress, this);
            _stub.setPortName(getShortenerURLWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setShortenerURLEndpointAddress(java.lang.String address) {
        ShortenerURL_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.shortener.url.ws.ShortenerURL.class.isAssignableFrom(serviceEndpointInterface)) {
                com.shortener.url.ws.ShortenerURLSoapBindingStub _stub = new com.shortener.url.ws.ShortenerURLSoapBindingStub(new java.net.URL(ShortenerURL_address), this);
                _stub.setPortName(getShortenerURLWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ShortenerURL".equals(inputPortName)) {
            return getShortenerURL();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://url.shortener.com", "ShortenerURLService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://url.shortener.com", "ShortenerURL"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ShortenerURL".equals(portName)) {
            setShortenerURLEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
