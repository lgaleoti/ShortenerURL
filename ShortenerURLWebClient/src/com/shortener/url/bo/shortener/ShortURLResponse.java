/**
 * ShortURLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.shortener.url.bo.shortener;

public class ShortURLResponse  extends com.shortener.url.bo.BaseResponse  implements java.io.Serializable {
    private java.lang.String newURL;

    public ShortURLResponse() {
    }

    public ShortURLResponse(
           int code,
           java.lang.String message,
           java.lang.String newURL) {
        super(
            code,
            message);
        this.newURL = newURL;
    }


    /**
     * Gets the newURL value for this ShortURLResponse.
     * 
     * @return newURL
     */
    public java.lang.String getNewURL() {
        return newURL;
    }


    /**
     * Sets the newURL value for this ShortURLResponse.
     * 
     * @param newURL
     */
    public void setNewURL(java.lang.String newURL) {
        this.newURL = newURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShortURLResponse)) return false;
        ShortURLResponse other = (ShortURLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.newURL==null && other.getNewURL()==null) || 
             (this.newURL!=null &&
              this.newURL.equals(other.getNewURL())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNewURL() != null) {
            _hashCode += getNewURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShortURLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://shortener.bo.url.shortener.com", "ShortURLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://shortener.bo.url.shortener.com", "newURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

	@Override
	public String toString() {
		return "ShortURLResponse [code=" + getCode() + ", message=" + getMessage() + 
				", originalURL=" + getNewURL() + "]";
	}

}
