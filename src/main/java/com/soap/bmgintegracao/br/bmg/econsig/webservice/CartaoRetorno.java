/**
 * CartaoRetorno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.soap.bmgintegracao.br.bmg.econsig.webservice;

public class CartaoRetorno  implements java.io.Serializable {
    private boolean cpfImpedidoComissionar;

    private java.lang.String entidade;

    private boolean liberado;

    private java.lang.String matricula;

    private java.lang.String mensagemImpedimento;

    private java.lang.String numeroAdesao;

    private java.lang.String numeroCartao;

    private java.lang.Long numeroContaInterna;

    private java.lang.String orgao;

    public CartaoRetorno() {
    }

    public CartaoRetorno(
           boolean cpfImpedidoComissionar,
           java.lang.String entidade,
           boolean liberado,
           java.lang.String matricula,
           java.lang.String mensagemImpedimento,
           java.lang.String numeroAdesao,
           java.lang.String numeroCartao,
           java.lang.Long numeroContaInterna,
           java.lang.String orgao) {
           this.cpfImpedidoComissionar = cpfImpedidoComissionar;
           this.entidade = entidade;
           this.liberado = liberado;
           this.matricula = matricula;
           this.mensagemImpedimento = mensagemImpedimento;
           this.numeroAdesao = numeroAdesao;
           this.numeroCartao = numeroCartao;
           this.numeroContaInterna = numeroContaInterna;
           this.orgao = orgao;
    }


    /**
     * Gets the cpfImpedidoComissionar value for this CartaoRetorno.
     * 
     * @return cpfImpedidoComissionar
     */
    public boolean isCpfImpedidoComissionar() {
        return cpfImpedidoComissionar;
    }


    /**
     * Sets the cpfImpedidoComissionar value for this CartaoRetorno.
     * 
     * @param cpfImpedidoComissionar
     */
    public void setCpfImpedidoComissionar(boolean cpfImpedidoComissionar) {
        this.cpfImpedidoComissionar = cpfImpedidoComissionar;
    }


    /**
     * Gets the entidade value for this CartaoRetorno.
     * 
     * @return entidade
     */
    public java.lang.String getEntidade() {
        return entidade;
    }


    /**
     * Sets the entidade value for this CartaoRetorno.
     * 
     * @param entidade
     */
    public void setEntidade(java.lang.String entidade) {
        this.entidade = entidade;
    }


    /**
     * Gets the liberado value for this CartaoRetorno.
     * 
     * @return liberado
     */
    public boolean isLiberado() {
        return liberado;
    }


    /**
     * Sets the liberado value for this CartaoRetorno.
     * 
     * @param liberado
     */
    public void setLiberado(boolean liberado) {
        this.liberado = liberado;
    }


    /**
     * Gets the matricula value for this CartaoRetorno.
     * 
     * @return matricula
     */
    public java.lang.String getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this CartaoRetorno.
     * 
     * @param matricula
     */
    public void setMatricula(java.lang.String matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the mensagemImpedimento value for this CartaoRetorno.
     * 
     * @return mensagemImpedimento
     */
    public java.lang.String getMensagemImpedimento() {
        return mensagemImpedimento;
    }


    /**
     * Sets the mensagemImpedimento value for this CartaoRetorno.
     * 
     * @param mensagemImpedimento
     */
    public void setMensagemImpedimento(java.lang.String mensagemImpedimento) {
        this.mensagemImpedimento = mensagemImpedimento;
    }


    /**
     * Gets the numeroAdesao value for this CartaoRetorno.
     * 
     * @return numeroAdesao
     */
    public java.lang.String getNumeroAdesao() {
        return numeroAdesao;
    }


    /**
     * Sets the numeroAdesao value for this CartaoRetorno.
     * 
     * @param numeroAdesao
     */
    public void setNumeroAdesao(java.lang.String numeroAdesao) {
        this.numeroAdesao = numeroAdesao;
    }


    /**
     * Gets the numeroCartao value for this CartaoRetorno.
     * 
     * @return numeroCartao
     */
    public java.lang.String getNumeroCartao() {
        return numeroCartao;
    }


    /**
     * Sets the numeroCartao value for this CartaoRetorno.
     * 
     * @param numeroCartao
     */
    public void setNumeroCartao(java.lang.String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }


    /**
     * Gets the numeroContaInterna value for this CartaoRetorno.
     * 
     * @return numeroContaInterna
     */
    public java.lang.Long getNumeroContaInterna() {
        return numeroContaInterna;
    }


    /**
     * Sets the numeroContaInterna value for this CartaoRetorno.
     * 
     * @param numeroContaInterna
     */
    public void setNumeroContaInterna(java.lang.Long numeroContaInterna) {
        this.numeroContaInterna = numeroContaInterna;
    }


    /**
     * Gets the orgao value for this CartaoRetorno.
     * 
     * @return orgao
     */
    public java.lang.String getOrgao() {
        return orgao;
    }


    /**
     * Sets the orgao value for this CartaoRetorno.
     * 
     * @param orgao
     */
    public void setOrgao(java.lang.String orgao) {
        this.orgao = orgao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartaoRetorno)) return false;
        CartaoRetorno other = (CartaoRetorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cpfImpedidoComissionar == other.isCpfImpedidoComissionar() &&
            ((this.entidade==null && other.getEntidade()==null) || 
             (this.entidade!=null &&
              this.entidade.equals(other.getEntidade()))) &&
            this.liberado == other.isLiberado() &&
            ((this.matricula==null && other.getMatricula()==null) || 
             (this.matricula!=null &&
              this.matricula.equals(other.getMatricula()))) &&
            ((this.mensagemImpedimento==null && other.getMensagemImpedimento()==null) || 
             (this.mensagemImpedimento!=null &&
              this.mensagemImpedimento.equals(other.getMensagemImpedimento()))) &&
            ((this.numeroAdesao==null && other.getNumeroAdesao()==null) || 
             (this.numeroAdesao!=null &&
              this.numeroAdesao.equals(other.getNumeroAdesao()))) &&
            ((this.numeroCartao==null && other.getNumeroCartao()==null) || 
             (this.numeroCartao!=null &&
              this.numeroCartao.equals(other.getNumeroCartao()))) &&
            ((this.numeroContaInterna==null && other.getNumeroContaInterna()==null) || 
             (this.numeroContaInterna!=null &&
              this.numeroContaInterna.equals(other.getNumeroContaInterna()))) &&
            ((this.orgao==null && other.getOrgao()==null) || 
             (this.orgao!=null &&
              this.orgao.equals(other.getOrgao())));
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
        _hashCode += (isCpfImpedidoComissionar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEntidade() != null) {
            _hashCode += getEntidade().hashCode();
        }
        _hashCode += (isLiberado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMatricula() != null) {
            _hashCode += getMatricula().hashCode();
        }
        if (getMensagemImpedimento() != null) {
            _hashCode += getMensagemImpedimento().hashCode();
        }
        if (getNumeroAdesao() != null) {
            _hashCode += getNumeroAdesao().hashCode();
        }
        if (getNumeroCartao() != null) {
            _hashCode += getNumeroCartao().hashCode();
        }
        if (getNumeroContaInterna() != null) {
            _hashCode += getNumeroContaInterna().hashCode();
        }
        if (getOrgao() != null) {
            _hashCode += getOrgao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartaoRetorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "CartaoRetorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfImpedidoComissionar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpfImpedidoComissionar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liberado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "liberado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemImpedimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensagemImpedimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAdesao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroAdesao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCartao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroCartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroContaInterna");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroContaInterna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
