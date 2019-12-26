/**
 * ResultadoConsultaElegibilidadeDeSeguro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.soap.bmgintegracao.br.bmg.econsig.webservice;

public class ResultadoConsultaElegibilidadeDeSeguro  implements java.io.Serializable {
    private boolean elegivel;

    private java.lang.String motivoDeNaoEligibilidade;

    private com.soap.bmgintegracao.br.bmg.econsig.webservice.Seguro seguro;

    public ResultadoConsultaElegibilidadeDeSeguro() {
    }

    public ResultadoConsultaElegibilidadeDeSeguro(
           boolean elegivel,
           java.lang.String motivoDeNaoEligibilidade,
           com.soap.bmgintegracao.br.bmg.econsig.webservice.Seguro seguro) {
           this.elegivel = elegivel;
           this.motivoDeNaoEligibilidade = motivoDeNaoEligibilidade;
           this.seguro = seguro;
    }


    /**
     * Gets the elegivel value for this ResultadoConsultaElegibilidadeDeSeguro.
     * 
     * @return elegivel
     */
    public boolean isElegivel() {
        return elegivel;
    }


    /**
     * Sets the elegivel value for this ResultadoConsultaElegibilidadeDeSeguro.
     * 
     * @param elegivel
     */
    public void setElegivel(boolean elegivel) {
        this.elegivel = elegivel;
    }


    /**
     * Gets the motivoDeNaoEligibilidade value for this ResultadoConsultaElegibilidadeDeSeguro.
     * 
     * @return motivoDeNaoEligibilidade
     */
    public java.lang.String getMotivoDeNaoEligibilidade() {
        return motivoDeNaoEligibilidade;
    }


    /**
     * Sets the motivoDeNaoEligibilidade value for this ResultadoConsultaElegibilidadeDeSeguro.
     * 
     * @param motivoDeNaoEligibilidade
     */
    public void setMotivoDeNaoEligibilidade(java.lang.String motivoDeNaoEligibilidade) {
        this.motivoDeNaoEligibilidade = motivoDeNaoEligibilidade;
    }


    /**
     * Gets the seguro value for this ResultadoConsultaElegibilidadeDeSeguro.
     * 
     * @return seguro
     */
    public com.soap.bmgintegracao.br.bmg.econsig.webservice.Seguro getSeguro() {
        return seguro;
    }


    /**
     * Sets the seguro value for this ResultadoConsultaElegibilidadeDeSeguro.
     * 
     * @param seguro
     */
    public void setSeguro(com.soap.bmgintegracao.br.bmg.econsig.webservice.Seguro seguro) {
        this.seguro = seguro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadoConsultaElegibilidadeDeSeguro)) return false;
        ResultadoConsultaElegibilidadeDeSeguro other = (ResultadoConsultaElegibilidadeDeSeguro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.elegivel == other.isElegivel() &&
            ((this.motivoDeNaoEligibilidade==null && other.getMotivoDeNaoEligibilidade()==null) || 
             (this.motivoDeNaoEligibilidade!=null &&
              this.motivoDeNaoEligibilidade.equals(other.getMotivoDeNaoEligibilidade()))) &&
            ((this.seguro==null && other.getSeguro()==null) || 
             (this.seguro!=null &&
              this.seguro.equals(other.getSeguro())));
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
        _hashCode += (isElegivel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMotivoDeNaoEligibilidade() != null) {
            _hashCode += getMotivoDeNaoEligibilidade().hashCode();
        }
        if (getSeguro() != null) {
            _hashCode += getSeguro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultadoConsultaElegibilidadeDeSeguro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "ResultadoConsultaElegibilidadeDeSeguro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elegivel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elegivel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoDeNaoEligibilidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motivoDeNaoEligibilidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seguro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seguro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "Seguro"));
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
