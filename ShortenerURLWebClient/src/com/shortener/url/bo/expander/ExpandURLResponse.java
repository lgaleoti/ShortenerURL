/**
 * ExpandURLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.shortener.url.bo.expander;

public class ExpandURLResponse  implements java.io.Serializable {
    private int code;

    private java.lang.String message;

    private java.lang.String originalURL;

    public ExpandURLResponse() {
    }

    public ExpandURLResponse(
           int code,
           java.lang.String message,
           java.lang.String originalURL) {
           this.code = code;
           this.message = message;
           this.originalURL = originalURL;
    }


    /**
     * Gets the code value for this ExpandURLResponse.
     * 
     * @return code
     */
    public int getCode() {
        return code;
    }


    /**
     * Sets the code value for this ExpandURLResponse.
     * 
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }


    /**
     * Gets the message value for this ExpandURLResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ExpandURLResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the originalURL value for this ExpandURLResponse.
     * 
     * @return originalURL
     */
    public java.lang.String getOriginalURL() {
        return originalURL;
    }


    /**
     * Sets the originalURL value for this ExpandURLResponse.
     * 
     * @param originalURL
     */
    public void setOriginalURL(java.lang.String originalURL) {
        this.originalURL = originalURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpandURLResponse)) return false;
        ExpandURLResponse other = (ExpandURLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.code == other.getCode() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.originalURL==null && other.getOriginalURL()==null) || 
             (this.originalURL!=null &&
              this.originalURL.equals(other.getOriginalURL())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCode();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getOriginalURL() != null) {
            _hashCode += getOriginalURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpandURLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://expander.bo.url.shortener.com", "ExpandURLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://expander.bo.url.shortener.com", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://expander.bo.url.shortener.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://expander.bo.url.shortener.com", "originalURL"));
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
		return "ExpandURLResponse [code=" + code + ", message=" + message + ", originalURL=" + originalURL + "]";
	}

}
