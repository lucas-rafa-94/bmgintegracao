/**
 * LimiteSaqueParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.soap.bmgintegracao.com.bmg.econsig.webservice;

public class LimiteSaqueParameter  extends com.soap.bmgintegracao.com.bmg.econsig.webservice.WebServiceBaseParameter  implements java.io.Serializable {
    private int codigoEntidade;

    private java.lang.Integer codigoTipoSeguro;

    private java.lang.Long codigoUnidadePagadora;

    private java.lang.String cpf;

    private java.util.Calendar dataNascimento;

    private java.lang.String grauInstrucao;

    private java.lang.Integer loja;

    private java.lang.String matricula;

    private java.lang.String matriculaInstituidor;

    private java.lang.Integer sequencialOrgao;

    private double valorMargem;

    private java.lang.String vinculoMatricula;

    public LimiteSaqueParameter() {
    }

    public LimiteSaqueParameter(
           java.lang.String login,
           java.lang.String senha,
           java.lang.String loginConsig,
           int codigoEntidade,
           java.lang.Integer codigoTipoSeguro,
           java.lang.Long codigoUnidadePagadora,
           java.lang.String cpf,
           java.util.Calendar dataNascimento,
           java.lang.String grauInstrucao,
           java.lang.Integer loja,
           java.lang.String matricula,
           java.lang.String matriculaInstituidor,
           java.lang.Integer sequencialOrgao,
           double valorMargem,
           java.lang.String vinculoMatricula) {
        super(
            login,
            senha,
            loginConsig);
        this.codigoEntidade = codigoEntidade;
        this.codigoTipoSeguro = codigoTipoSeguro;
        this.codigoUnidadePagadora = codigoUnidadePagadora;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.grauInstrucao = grauInstrucao;
        this.loja = loja;
        this.matricula = matricula;
        this.matriculaInstituidor = matriculaInstituidor;
        this.sequencialOrgao = sequencialOrgao;
        this.valorMargem = valorMargem;
        this.vinculoMatricula = vinculoMatricula;
    }


    /**
     * Gets the codigoEntidade value for this LimiteSaqueParameter.
     * 
     * @return codigoEntidade
     */
    public int getCodigoEntidade() {
        return codigoEntidade;
    }


    /**
     * Sets the codigoEntidade value for this LimiteSaqueParameter.
     * 
     * @param codigoEntidade
     */
    public void setCodigoEntidade(int codigoEntidade) {
        this.codigoEntidade = codigoEntidade;
    }


    /**
     * Gets the codigoTipoSeguro value for this LimiteSaqueParameter.
     * 
     * @return codigoTipoSeguro
     */
    public java.lang.Integer getCodigoTipoSeguro() {
        return codigoTipoSeguro;
    }


    /**
     * Sets the codigoTipoSeguro value for this LimiteSaqueParameter.
     * 
     * @param codigoTipoSeguro
     */
    public void setCodigoTipoSeguro(java.lang.Integer codigoTipoSeguro) {
        this.codigoTipoSeguro = codigoTipoSeguro;
    }


    /**
     * Gets the codigoUnidadePagadora value for this LimiteSaqueParameter.
     * 
     * @return codigoUnidadePagadora
     */
    public java.lang.Long getCodigoUnidadePagadora() {
        return codigoUnidadePagadora;
    }


    /**
     * Sets the codigoUnidadePagadora value for this LimiteSaqueParameter.
     * 
     * @param codigoUnidadePagadora
     */
    public void setCodigoUnidadePagadora(java.lang.Long codigoUnidadePagadora) {
        this.codigoUnidadePagadora = codigoUnidadePagadora;
    }


    /**
     * Gets the cpf value for this LimiteSaqueParameter.
     * 
     * @return cpf
     */
    public java.lang.String getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this LimiteSaqueParameter.
     * 
     * @param cpf
     */
    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }


    /**
     * Gets the dataNascimento value for this LimiteSaqueParameter.
     * 
     * @return dataNascimento
     */
    public java.util.Calendar getDataNascimento() {
        return dataNascimento;
    }


    /**
     * Sets the dataNascimento value for this LimiteSaqueParameter.
     * 
     * @param dataNascimento
     */
    public void setDataNascimento(java.util.Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    /**
     * Gets the grauInstrucao value for this LimiteSaqueParameter.
     * 
     * @return grauInstrucao
     */
    public java.lang.String getGrauInstrucao() {
        return grauInstrucao;
    }


    /**
     * Sets the grauInstrucao value for this LimiteSaqueParameter.
     * 
     * @param grauInstrucao
     */
    public void setGrauInstrucao(java.lang.String grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }


    /**
     * Gets the loja value for this LimiteSaqueParameter.
     * 
     * @return loja
     */
    public java.lang.Integer getLoja() {
        return loja;
    }


    /**
     * Sets the loja value for this LimiteSaqueParameter.
     * 
     * @param loja
     */
    public void setLoja(java.lang.Integer loja) {
        this.loja = loja;
    }


    /**
     * Gets the matricula value for this LimiteSaqueParameter.
     * 
     * @return matricula
     */
    public java.lang.String getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this LimiteSaqueParameter.
     * 
     * @param matricula
     */
    public void setMatricula(java.lang.String matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the matriculaInstituidor value for this LimiteSaqueParameter.
     * 
     * @return matriculaInstituidor
     */
    public java.lang.String getMatriculaInstituidor() {
        return matriculaInstituidor;
    }


    /**
     * Sets the matriculaInstituidor value for this LimiteSaqueParameter.
     * 
     * @param matriculaInstituidor
     */
    public void setMatriculaInstituidor(java.lang.String matriculaInstituidor) {
        this.matriculaInstituidor = matriculaInstituidor;
    }


    /**
     * Gets the sequencialOrgao value for this LimiteSaqueParameter.
     * 
     * @return sequencialOrgao
     */
    public java.lang.Integer getSequencialOrgao() {
        return sequencialOrgao;
    }


    /**
     * Sets the sequencialOrgao value for this LimiteSaqueParameter.
     * 
     * @param sequencialOrgao
     */
    public void setSequencialOrgao(java.lang.Integer sequencialOrgao) {
        this.sequencialOrgao = sequencialOrgao;
    }


    /**
     * Gets the valorMargem value for this LimiteSaqueParameter.
     * 
     * @return valorMargem
     */
    public double getValorMargem() {
        return valorMargem;
    }


    /**
     * Sets the valorMargem value for this LimiteSaqueParameter.
     * 
     * @param valorMargem
     */
    public void setValorMargem(double valorMargem) {
        this.valorMargem = valorMargem;
    }


    /**
     * Gets the vinculoMatricula value for this LimiteSaqueParameter.
     * 
     * @return vinculoMatricula
     */
    public java.lang.String getVinculoMatricula() {
        return vinculoMatricula;
    }


    /**
     * Sets the vinculoMatricula value for this LimiteSaqueParameter.
     * 
     * @param vinculoMatricula
     */
    public void setVinculoMatricula(java.lang.String vinculoMatricula) {
        this.vinculoMatricula = vinculoMatricula;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LimiteSaqueParameter)) return false;
        LimiteSaqueParameter other = (LimiteSaqueParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.codigoEntidade == other.getCodigoEntidade() &&
            ((this.codigoTipoSeguro==null && other.getCodigoTipoSeguro()==null) || 
             (this.codigoTipoSeguro!=null &&
              this.codigoTipoSeguro.equals(other.getCodigoTipoSeguro()))) &&
            ((this.codigoUnidadePagadora==null && other.getCodigoUnidadePagadora()==null) || 
             (this.codigoUnidadePagadora!=null &&
              this.codigoUnidadePagadora.equals(other.getCodigoUnidadePagadora()))) &&
            ((this.cpf==null && other.getCpf()==null) || 
             (this.cpf!=null &&
              this.cpf.equals(other.getCpf()))) &&
            ((this.dataNascimento==null && other.getDataNascimento()==null) || 
             (this.dataNascimento!=null &&
              this.dataNascimento.equals(other.getDataNascimento()))) &&
            ((this.grauInstrucao==null && other.getGrauInstrucao()==null) || 
             (this.grauInstrucao!=null &&
              this.grauInstrucao.equals(other.getGrauInstrucao()))) &&
            ((this.loja==null && other.getLoja()==null) || 
             (this.loja!=null &&
              this.loja.equals(other.getLoja()))) &&
            ((this.matricula==null && other.getMatricula()==null) || 
             (this.matricula!=null &&
              this.matricula.equals(other.getMatricula()))) &&
            ((this.matriculaInstituidor==null && other.getMatriculaInstituidor()==null) || 
             (this.matriculaInstituidor!=null &&
              this.matriculaInstituidor.equals(other.getMatriculaInstituidor()))) &&
            ((this.sequencialOrgao==null && other.getSequencialOrgao()==null) || 
             (this.sequencialOrgao!=null &&
              this.sequencialOrgao.equals(other.getSequencialOrgao()))) &&
            this.valorMargem == other.getValorMargem() &&
            ((this.vinculoMatricula==null && other.getVinculoMatricula()==null) || 
             (this.vinculoMatricula!=null &&
              this.vinculoMatricula.equals(other.getVinculoMatricula())));
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
        _hashCode += getCodigoEntidade();
        if (getCodigoTipoSeguro() != null) {
            _hashCode += getCodigoTipoSeguro().hashCode();
        }
        if (getCodigoUnidadePagadora() != null) {
            _hashCode += getCodigoUnidadePagadora().hashCode();
        }
        if (getCpf() != null) {
            _hashCode += getCpf().hashCode();
        }
        if (getDataNascimento() != null) {
            _hashCode += getDataNascimento().hashCode();
        }
        if (getGrauInstrucao() != null) {
            _hashCode += getGrauInstrucao().hashCode();
        }
        if (getLoja() != null) {
            _hashCode += getLoja().hashCode();
        }
        if (getMatricula() != null) {
            _hashCode += getMatricula().hashCode();
        }
        if (getMatriculaInstituidor() != null) {
            _hashCode += getMatriculaInstituidor().hashCode();
        }
        if (getSequencialOrgao() != null) {
            _hashCode += getSequencialOrgao().hashCode();
        }
        _hashCode += new Double(getValorMargem()).hashCode();
        if (getVinculoMatricula() != null) {
            _hashCode += getVinculoMatricula().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LimiteSaqueParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "LimiteSaqueParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEntidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoEntidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoSeguro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoTipoSeguro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoUnidadePagadora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoUnidadePagadora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataNascimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataNascimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grauInstrucao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grauInstrucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loja");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matriculaInstituidor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matriculaInstituidor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequencialOrgao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequencialOrgao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorMargem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorMargem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vinculoMatricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vinculoMatricula"));
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
