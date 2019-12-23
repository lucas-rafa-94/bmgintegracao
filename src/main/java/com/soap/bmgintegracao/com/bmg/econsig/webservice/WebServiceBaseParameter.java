/**
 * WebServiceBaseParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.soap.bmgintegracao.com.bmg.econsig.webservice;

public class WebServiceBaseParameter  extends com.soap.bmgintegracao.com.bmg.econsig.webservice.WebServiceParameter  implements java.io.Serializable {
    private java.lang.String loginConsig;

    public WebServiceBaseParameter() {
    }

    public WebServiceBaseParameter(
           java.lang.String login,
           java.lang.String senha,
           java.lang.String loginConsig) {
        super(
            login,
            senha);
        this.loginConsig = loginConsig;
    }


    /**
     * Gets the loginConsig value for this WebServiceBaseParameter.
     * 
     * @return loginConsig
     */
    public java.lang.String getLoginConsig() {
        return loginConsig;
    }


    /**
     * Sets the loginConsig value for this WebServiceBaseParameter.
     * 
     * @param loginConsig
     */
    public void setLoginConsig(java.lang.String loginConsig) {
        this.loginConsig = loginConsig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebServiceBaseParameter)) return false;
        WebServiceBaseParameter other = (WebServiceBaseParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.loginConsig==null && other.getLoginConsig()==null) || 
             (this.loginConsig!=null &&
              this.loginConsig.equals(other.getLoginConsig())));
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
        if (getLoginConsig() != null) {
            _hashCode += getLoginConsig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebServiceBaseParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "WebServiceBaseParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginConsig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginConsig"));
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

}
