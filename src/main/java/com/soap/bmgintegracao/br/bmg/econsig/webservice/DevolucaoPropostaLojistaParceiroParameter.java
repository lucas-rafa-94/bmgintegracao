/**
 * DevolucaoPropostaLojistaParceiroParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.soap.bmgintegracao.br.bmg.econsig.webservice;

public class DevolucaoPropostaLojistaParceiroParameter  implements java.io.Serializable {
    private java.lang.Boolean erro;

    private java.lang.Object excecao;

    private java.lang.String mensagem;

    private java.lang.Boolean resultado;

    public DevolucaoPropostaLojistaParceiroParameter() {
    }

    public DevolucaoPropostaLojistaParceiroParameter(
           java.lang.Boolean erro,
           java.lang.Object excecao,
           java.lang.String mensagem,
           java.lang.Boolean resultado) {
           this.erro = erro;
           this.excecao = excecao;
           this.mensagem = mensagem;
           this.resultado = resultado;
    }


    /**
     * Gets the erro value for this DevolucaoPropostaLojistaParceiroParameter.
     * 
     * @return erro
     */
    public java.lang.Boolean getErro() {
        return erro;
    }


    /**
     * Sets the erro value for this DevolucaoPropostaLojistaParceiroParameter.
     * 
     * @param erro
     */
    public void setErro(java.lang.Boolean erro) {
        this.erro = erro;
    }


    /**
     * Gets the excecao value for this DevolucaoPropostaLojistaParceiroParameter.
     * 
     * @return excecao
     */
    public java.lang.Object getExcecao() {
        return excecao;
    }


    /**
     * Sets the excecao value for this DevolucaoPropostaLojistaParceiroParameter.
     * 
     * @param excecao
     */
    public void setExcecao(java.lang.Object excecao) {
        this.excecao = excecao;
    }


    /**
     * Gets the mensagem value for this DevolucaoPropostaLojistaParceiroParameter.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this DevolucaoPropostaLojistaParceiroParameter.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the resultado value for this DevolucaoPropostaLojistaParceiroParameter.
     * 
     * @return resultado
     */
    public java.lang.Boolean getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this DevolucaoPropostaLojistaParceiroParameter.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.Boolean resultado) {
        this.resultado = resultado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DevolucaoPropostaLojistaParceiroParameter)) return false;
        DevolucaoPropostaLojistaParceiroParameter other = (DevolucaoPropostaLojistaParceiroParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.erro==null && other.getErro()==null) || 
             (this.erro!=null &&
              this.erro.equals(other.getErro()))) &&
            ((this.excecao==null && other.getExcecao()==null) || 
             (this.excecao!=null &&
              this.excecao.equals(other.getExcecao()))) &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado())));
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
        if (getErro() != null) {
            _hashCode += getErro().hashCode();
        }
        if (getExcecao() != null) {
            _hashCode += getExcecao().hashCode();
        }
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DevolucaoPropostaLojistaParceiroParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "DevolucaoPropostaLojistaParceiroParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "erro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excecao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excecao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
