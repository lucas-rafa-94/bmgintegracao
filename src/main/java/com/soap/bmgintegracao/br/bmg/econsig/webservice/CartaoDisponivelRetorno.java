/**
 * CartaoDisponivelRetorno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.soap.bmgintegracao.br.bmg.econsig.webservice;

public class CartaoDisponivelRetorno  implements java.io.Serializable {
    private boolean agregacaoDeMargemParaSaqueComplementar;

    private com.soap.bmgintegracao.br.bmg.econsig.webservice.CartaoRetorno[] cartoesRetorno;

    private com.soap.bmgintegracao.br.bmg.econsig.webservice.FormaEnvioRetorno[] formasEnvio;

    public CartaoDisponivelRetorno() {
    }

    public CartaoDisponivelRetorno(
           boolean agregacaoDeMargemParaSaqueComplementar,
           com.soap.bmgintegracao.br.bmg.econsig.webservice.CartaoRetorno[] cartoesRetorno,
           com.soap.bmgintegracao.br.bmg.econsig.webservice.FormaEnvioRetorno[] formasEnvio) {
           this.agregacaoDeMargemParaSaqueComplementar = agregacaoDeMargemParaSaqueComplementar;
           this.cartoesRetorno = cartoesRetorno;
           this.formasEnvio = formasEnvio;
    }


    /**
     * Gets the agregacaoDeMargemParaSaqueComplementar value for this CartaoDisponivelRetorno.
     * 
     * @return agregacaoDeMargemParaSaqueComplementar
     */
    public boolean isAgregacaoDeMargemParaSaqueComplementar() {
        return agregacaoDeMargemParaSaqueComplementar;
    }


    /**
     * Sets the agregacaoDeMargemParaSaqueComplementar value for this CartaoDisponivelRetorno.
     * 
     * @param agregacaoDeMargemParaSaqueComplementar
     */
    public void setAgregacaoDeMargemParaSaqueComplementar(boolean agregacaoDeMargemParaSaqueComplementar) {
        this.agregacaoDeMargemParaSaqueComplementar = agregacaoDeMargemParaSaqueComplementar;
    }


    /**
     * Gets the cartoesRetorno value for this CartaoDisponivelRetorno.
     * 
     * @return cartoesRetorno
     */
    public com.soap.bmgintegracao.br.bmg.econsig.webservice.CartaoRetorno[] getCartoesRetorno() {
        return cartoesRetorno;
    }


    /**
     * Sets the cartoesRetorno value for this CartaoDisponivelRetorno.
     * 
     * @param cartoesRetorno
     */
    public void setCartoesRetorno(com.soap.bmgintegracao.br.bmg.econsig.webservice.CartaoRetorno[] cartoesRetorno) {
        this.cartoesRetorno = cartoesRetorno;
    }


    /**
     * Gets the formasEnvio value for this CartaoDisponivelRetorno.
     * 
     * @return formasEnvio
     */
    public com.soap.bmgintegracao.br.bmg.econsig.webservice.FormaEnvioRetorno[] getFormasEnvio() {
        return formasEnvio;
    }


    /**
     * Sets the formasEnvio value for this CartaoDisponivelRetorno.
     * 
     * @param formasEnvio
     */
    public void setFormasEnvio(com.soap.bmgintegracao.br.bmg.econsig.webservice.FormaEnvioRetorno[] formasEnvio) {
        this.formasEnvio = formasEnvio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartaoDisponivelRetorno)) return false;
        CartaoDisponivelRetorno other = (CartaoDisponivelRetorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.agregacaoDeMargemParaSaqueComplementar == other.isAgregacaoDeMargemParaSaqueComplementar() &&
            ((this.cartoesRetorno==null && other.getCartoesRetorno()==null) || 
             (this.cartoesRetorno!=null &&
              java.util.Arrays.equals(this.cartoesRetorno, other.getCartoesRetorno()))) &&
            ((this.formasEnvio==null && other.getFormasEnvio()==null) || 
             (this.formasEnvio!=null &&
              java.util.Arrays.equals(this.formasEnvio, other.getFormasEnvio())));
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
        _hashCode += (isAgregacaoDeMargemParaSaqueComplementar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCartoesRetorno() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCartoesRetorno());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCartoesRetorno(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormasEnvio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFormasEnvio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFormasEnvio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartaoDisponivelRetorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "CartaoDisponivelRetorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agregacaoDeMargemParaSaqueComplementar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agregacaoDeMargemParaSaqueComplementar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartoesRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartoesRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "CartaoRetorno"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formasEnvio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formasEnvio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "FormaEnvioRetorno"));
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
