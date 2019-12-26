/**
 * DadosCartaoParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.soap.bmgintegracao.br.bmg.econsig.webservice;

public class DadosCartaoParameter  extends com.soap.bmgintegracao.br.bmg.econsig.webservice.CartaoDisponivelParameter  implements java.io.Serializable {
    private java.lang.Boolean agregacaoDeMargemParaSaqueComplementar;

    private java.lang.Integer codigoTipoSeguro;

    private boolean cpfImpedidoComissionar;

    private com.soap.bmgintegracao.br.bmg.econsig.webservice.DadosLimiteDeSaque dadosLimiteDeSaqueComplementar;

    private java.lang.String ipUsuario;

    private java.lang.String matricula;

    private java.lang.String matriculaInstituidor;

    private java.lang.Long numeroContaInterna;

    private java.lang.String script;

    private int tipoSaque;

    private java.lang.Double valorAgregacaoDeMargemParaSaqueComplementar;

    private java.lang.String vinculoMatricula;

    public DadosCartaoParameter() {
    }

    public DadosCartaoParameter(
           java.lang.String login,
           java.lang.String senha,
           java.lang.String loginConsig,
           int codigoEntidade,
           java.lang.String cpf,
           java.lang.String senhaConsig,
           java.lang.Integer sequencialOrgao,
           java.lang.Boolean agregacaoDeMargemParaSaqueComplementar,
           java.lang.Integer codigoTipoSeguro,
           boolean cpfImpedidoComissionar,
           com.soap.bmgintegracao.br.bmg.econsig.webservice.DadosLimiteDeSaque dadosLimiteDeSaqueComplementar,
           java.lang.String ipUsuario,
           java.lang.String matricula,
           java.lang.String matriculaInstituidor,
           java.lang.Long numeroContaInterna,
           java.lang.String script,
           int tipoSaque,
           java.lang.Double valorAgregacaoDeMargemParaSaqueComplementar,
           java.lang.String vinculoMatricula) {
        super(
            login,
            senha,
            loginConsig,
            codigoEntidade,
            cpf,
            senhaConsig,
            sequencialOrgao);
        this.agregacaoDeMargemParaSaqueComplementar = agregacaoDeMargemParaSaqueComplementar;
        this.codigoTipoSeguro = codigoTipoSeguro;
        this.cpfImpedidoComissionar = cpfImpedidoComissionar;
        this.dadosLimiteDeSaqueComplementar = dadosLimiteDeSaqueComplementar;
        this.ipUsuario = ipUsuario;
        this.matricula = matricula;
        this.matriculaInstituidor = matriculaInstituidor;
        this.numeroContaInterna = numeroContaInterna;
        this.script = script;
        this.tipoSaque = tipoSaque;
        this.valorAgregacaoDeMargemParaSaqueComplementar = valorAgregacaoDeMargemParaSaqueComplementar;
        this.vinculoMatricula = vinculoMatricula;
    }


    /**
     * Gets the agregacaoDeMargemParaSaqueComplementar value for this DadosCartaoParameter.
     * 
     * @return agregacaoDeMargemParaSaqueComplementar
     */
    public java.lang.Boolean getAgregacaoDeMargemParaSaqueComplementar() {
        return agregacaoDeMargemParaSaqueComplementar;
    }


    /**
     * Sets the agregacaoDeMargemParaSaqueComplementar value for this DadosCartaoParameter.
     * 
     * @param agregacaoDeMargemParaSaqueComplementar
     */
    public void setAgregacaoDeMargemParaSaqueComplementar(java.lang.Boolean agregacaoDeMargemParaSaqueComplementar) {
        this.agregacaoDeMargemParaSaqueComplementar = agregacaoDeMargemParaSaqueComplementar;
    }


    /**
     * Gets the codigoTipoSeguro value for this DadosCartaoParameter.
     * 
     * @return codigoTipoSeguro
     */
    public java.lang.Integer getCodigoTipoSeguro() {
        return codigoTipoSeguro;
    }


    /**
     * Sets the codigoTipoSeguro value for this DadosCartaoParameter.
     * 
     * @param codigoTipoSeguro
     */
    public void setCodigoTipoSeguro(java.lang.Integer codigoTipoSeguro) {
        this.codigoTipoSeguro = codigoTipoSeguro;
    }


    /**
     * Gets the cpfImpedidoComissionar value for this DadosCartaoParameter.
     * 
     * @return cpfImpedidoComissionar
     */
    public boolean isCpfImpedidoComissionar() {
        return cpfImpedidoComissionar;
    }


    /**
     * Sets the cpfImpedidoComissionar value for this DadosCartaoParameter.
     * 
     * @param cpfImpedidoComissionar
     */
    public void setCpfImpedidoComissionar(boolean cpfImpedidoComissionar) {
        this.cpfImpedidoComissionar = cpfImpedidoComissionar;
    }


    /**
     * Gets the dadosLimiteDeSaqueComplementar value for this DadosCartaoParameter.
     * 
     * @return dadosLimiteDeSaqueComplementar
     */
    public com.soap.bmgintegracao.br.bmg.econsig.webservice.DadosLimiteDeSaque getDadosLimiteDeSaqueComplementar() {
        return dadosLimiteDeSaqueComplementar;
    }


    /**
     * Sets the dadosLimiteDeSaqueComplementar value for this DadosCartaoParameter.
     * 
     * @param dadosLimiteDeSaqueComplementar
     */
    public void setDadosLimiteDeSaqueComplementar(com.soap.bmgintegracao.br.bmg.econsig.webservice.DadosLimiteDeSaque dadosLimiteDeSaqueComplementar) {
        this.dadosLimiteDeSaqueComplementar = dadosLimiteDeSaqueComplementar;
    }


    /**
     * Gets the ipUsuario value for this DadosCartaoParameter.
     * 
     * @return ipUsuario
     */
    public java.lang.String getIpUsuario() {
        return ipUsuario;
    }


    /**
     * Sets the ipUsuario value for this DadosCartaoParameter.
     * 
     * @param ipUsuario
     */
    public void setIpUsuario(java.lang.String ipUsuario) {
        this.ipUsuario = ipUsuario;
    }


    /**
     * Gets the matricula value for this DadosCartaoParameter.
     * 
     * @return matricula
     */
    public java.lang.String getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this DadosCartaoParameter.
     * 
     * @param matricula
     */
    public void setMatricula(java.lang.String matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the matriculaInstituidor value for this DadosCartaoParameter.
     * 
     * @return matriculaInstituidor
     */
    public java.lang.String getMatriculaInstituidor() {
        return matriculaInstituidor;
    }


    /**
     * Sets the matriculaInstituidor value for this DadosCartaoParameter.
     * 
     * @param matriculaInstituidor
     */
    public void setMatriculaInstituidor(java.lang.String matriculaInstituidor) {
        this.matriculaInstituidor = matriculaInstituidor;
    }


    /**
     * Gets the numeroContaInterna value for this DadosCartaoParameter.
     * 
     * @return numeroContaInterna
     */
    public java.lang.Long getNumeroContaInterna() {
        return numeroContaInterna;
    }


    /**
     * Sets the numeroContaInterna value for this DadosCartaoParameter.
     * 
     * @param numeroContaInterna
     */
    public void setNumeroContaInterna(java.lang.Long numeroContaInterna) {
        this.numeroContaInterna = numeroContaInterna;
    }


    /**
     * Gets the script value for this DadosCartaoParameter.
     * 
     * @return script
     */
    public java.lang.String getScript() {
        return script;
    }


    /**
     * Sets the script value for this DadosCartaoParameter.
     * 
     * @param script
     */
    public void setScript(java.lang.String script) {
        this.script = script;
    }


    /**
     * Gets the tipoSaque value for this DadosCartaoParameter.
     * 
     * @return tipoSaque
     */
    public int getTipoSaque() {
        return tipoSaque;
    }


    /**
     * Sets the tipoSaque value for this DadosCartaoParameter.
     * 
     * @param tipoSaque
     */
    public void setTipoSaque(int tipoSaque) {
        this.tipoSaque = tipoSaque;
    }


    /**
     * Gets the valorAgregacaoDeMargemParaSaqueComplementar value for this DadosCartaoParameter.
     * 
     * @return valorAgregacaoDeMargemParaSaqueComplementar
     */
    public java.lang.Double getValorAgregacaoDeMargemParaSaqueComplementar() {
        return valorAgregacaoDeMargemParaSaqueComplementar;
    }


    /**
     * Sets the valorAgregacaoDeMargemParaSaqueComplementar value for this DadosCartaoParameter.
     * 
     * @param valorAgregacaoDeMargemParaSaqueComplementar
     */
    public void setValorAgregacaoDeMargemParaSaqueComplementar(java.lang.Double valorAgregacaoDeMargemParaSaqueComplementar) {
        this.valorAgregacaoDeMargemParaSaqueComplementar = valorAgregacaoDeMargemParaSaqueComplementar;
    }


    /**
     * Gets the vinculoMatricula value for this DadosCartaoParameter.
     * 
     * @return vinculoMatricula
     */
    public java.lang.String getVinculoMatricula() {
        return vinculoMatricula;
    }


    /**
     * Sets the vinculoMatricula value for this DadosCartaoParameter.
     * 
     * @param vinculoMatricula
     */
    public void setVinculoMatricula(java.lang.String vinculoMatricula) {
        this.vinculoMatricula = vinculoMatricula;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DadosCartaoParameter)) return false;
        DadosCartaoParameter other = (DadosCartaoParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.agregacaoDeMargemParaSaqueComplementar==null && other.getAgregacaoDeMargemParaSaqueComplementar()==null) || 
             (this.agregacaoDeMargemParaSaqueComplementar!=null &&
              this.agregacaoDeMargemParaSaqueComplementar.equals(other.getAgregacaoDeMargemParaSaqueComplementar()))) &&
            ((this.codigoTipoSeguro==null && other.getCodigoTipoSeguro()==null) || 
             (this.codigoTipoSeguro!=null &&
              this.codigoTipoSeguro.equals(other.getCodigoTipoSeguro()))) &&
            this.cpfImpedidoComissionar == other.isCpfImpedidoComissionar() &&
            ((this.dadosLimiteDeSaqueComplementar==null && other.getDadosLimiteDeSaqueComplementar()==null) || 
             (this.dadosLimiteDeSaqueComplementar!=null &&
              this.dadosLimiteDeSaqueComplementar.equals(other.getDadosLimiteDeSaqueComplementar()))) &&
            ((this.ipUsuario==null && other.getIpUsuario()==null) || 
             (this.ipUsuario!=null &&
              this.ipUsuario.equals(other.getIpUsuario()))) &&
            ((this.matricula==null && other.getMatricula()==null) || 
             (this.matricula!=null &&
              this.matricula.equals(other.getMatricula()))) &&
            ((this.matriculaInstituidor==null && other.getMatriculaInstituidor()==null) || 
             (this.matriculaInstituidor!=null &&
              this.matriculaInstituidor.equals(other.getMatriculaInstituidor()))) &&
            ((this.numeroContaInterna==null && other.getNumeroContaInterna()==null) || 
             (this.numeroContaInterna!=null &&
              this.numeroContaInterna.equals(other.getNumeroContaInterna()))) &&
            ((this.script==null && other.getScript()==null) || 
             (this.script!=null &&
              this.script.equals(other.getScript()))) &&
            this.tipoSaque == other.getTipoSaque() &&
            ((this.valorAgregacaoDeMargemParaSaqueComplementar==null && other.getValorAgregacaoDeMargemParaSaqueComplementar()==null) || 
             (this.valorAgregacaoDeMargemParaSaqueComplementar!=null &&
              this.valorAgregacaoDeMargemParaSaqueComplementar.equals(other.getValorAgregacaoDeMargemParaSaqueComplementar()))) &&
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
        if (getAgregacaoDeMargemParaSaqueComplementar() != null) {
            _hashCode += getAgregacaoDeMargemParaSaqueComplementar().hashCode();
        }
        if (getCodigoTipoSeguro() != null) {
            _hashCode += getCodigoTipoSeguro().hashCode();
        }
        _hashCode += (isCpfImpedidoComissionar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDadosLimiteDeSaqueComplementar() != null) {
            _hashCode += getDadosLimiteDeSaqueComplementar().hashCode();
        }
        if (getIpUsuario() != null) {
            _hashCode += getIpUsuario().hashCode();
        }
        if (getMatricula() != null) {
            _hashCode += getMatricula().hashCode();
        }
        if (getMatriculaInstituidor() != null) {
            _hashCode += getMatriculaInstituidor().hashCode();
        }
        if (getNumeroContaInterna() != null) {
            _hashCode += getNumeroContaInterna().hashCode();
        }
        if (getScript() != null) {
            _hashCode += getScript().hashCode();
        }
        _hashCode += getTipoSaque();
        if (getValorAgregacaoDeMargemParaSaqueComplementar() != null) {
            _hashCode += getValorAgregacaoDeMargemParaSaqueComplementar().hashCode();
        }
        if (getVinculoMatricula() != null) {
            _hashCode += getVinculoMatricula().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DadosCartaoParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "DadosCartaoParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agregacaoDeMargemParaSaqueComplementar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agregacaoDeMargemParaSaqueComplementar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTipoSeguro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoTipoSeguro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfImpedidoComissionar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpfImpedidoComissionar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosLimiteDeSaqueComplementar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dadosLimiteDeSaqueComplementar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "DadosLimiteDeSaque"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matriculaInstituidor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matriculaInstituidor"));
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
        elemField.setFieldName("script");
        elemField.setXmlName(new javax.xml.namespace.QName("", "script"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSaque");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoSaque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorAgregacaoDeMargemParaSaqueComplementar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorAgregacaoDeMargemParaSaqueComplementar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vinculoMatricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vinculoMatricula"));
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
