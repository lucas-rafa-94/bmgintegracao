/**
 * SaqueComplementarParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.soap.bmgintegracao.br.bmg.econsig.webservice;

public class SaqueComplementarParameter  extends com.soap.bmgintegracao.br.bmg.econsig.webservice.DadosCartaoParameter  implements java.io.Serializable {
    private java.lang.Integer aberturaContaPagamento;

    private com.soap.bmgintegracao.br.bmg.econsig.webservice.AgenciaParameter agencia;

    private com.soap.bmgintegracao.br.bmg.econsig.webservice.BancoParameter banco;

    private int bancoOrdemPagamento;

    private com.soap.bmgintegracao.br.bmg.econsig.webservice.TelefoneParameter celular1;

    private java.lang.String codigoFormaEnvioTermo;

    private java.lang.Integer codigoLoja;

    private java.lang.Integer codigoSituacaoServidor;

    private com.soap.bmgintegracao.br.bmg.econsig.webservice.ContaParameter conta;

    private java.lang.String cpfAgente;

    private java.lang.String email;

    private int finalidadeCredito;

    private int formaCredito;

    private com.soap.bmgintegracao.br.bmg.econsig.webservice.EletroParameter[] listaEletro;

    private java.lang.Integer numeroExterno;

    private java.lang.Long protocoloMultiProdutos;

    private com.soap.bmgintegracao.br.bmg.econsig.webservice.Seguro[] seguros;

    private com.soap.bmgintegracao.br.bmg.econsig.webservice.TelefoneParameter telefoneFixoOuCelular;

    private java.lang.Double valorSaque;

    public SaqueComplementarParameter() {
    }

    public SaqueComplementarParameter(
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
           java.lang.String vinculoMatricula,
           java.lang.Integer aberturaContaPagamento,
           com.soap.bmgintegracao.br.bmg.econsig.webservice.AgenciaParameter agencia,
           com.soap.bmgintegracao.br.bmg.econsig.webservice.BancoParameter banco,
           int bancoOrdemPagamento,
           com.soap.bmgintegracao.br.bmg.econsig.webservice.TelefoneParameter celular1,
           java.lang.String codigoFormaEnvioTermo,
           java.lang.Integer codigoLoja,
           java.lang.Integer codigoSituacaoServidor,
           com.soap.bmgintegracao.br.bmg.econsig.webservice.ContaParameter conta,
           java.lang.String cpfAgente,
           java.lang.String email,
           int finalidadeCredito,
           int formaCredito,
           com.soap.bmgintegracao.br.bmg.econsig.webservice.EletroParameter[] listaEletro,
           java.lang.Integer numeroExterno,
           java.lang.Long protocoloMultiProdutos,
           com.soap.bmgintegracao.br.bmg.econsig.webservice.Seguro[] seguros,
           com.soap.bmgintegracao.br.bmg.econsig.webservice.TelefoneParameter telefoneFixoOuCelular,
           java.lang.Double valorSaque) {
        super(
            login,
            senha,
            loginConsig,
            codigoEntidade,
            cpf,
            senhaConsig,
            sequencialOrgao,
            agregacaoDeMargemParaSaqueComplementar,
            codigoTipoSeguro,
            cpfImpedidoComissionar,
            dadosLimiteDeSaqueComplementar,
            ipUsuario,
            matricula,
            matriculaInstituidor,
            numeroContaInterna,
            script,
            tipoSaque,
            valorAgregacaoDeMargemParaSaqueComplementar,
            vinculoMatricula);
        this.aberturaContaPagamento = aberturaContaPagamento;
        this.agencia = agencia;
        this.banco = banco;
        this.bancoOrdemPagamento = bancoOrdemPagamento;
        this.celular1 = celular1;
        this.codigoFormaEnvioTermo = codigoFormaEnvioTermo;
        this.codigoLoja = codigoLoja;
        this.codigoSituacaoServidor = codigoSituacaoServidor;
        this.conta = conta;
        this.cpfAgente = cpfAgente;
        this.email = email;
        this.finalidadeCredito = finalidadeCredito;
        this.formaCredito = formaCredito;
        this.listaEletro = listaEletro;
        this.numeroExterno = numeroExterno;
        this.protocoloMultiProdutos = protocoloMultiProdutos;
        this.seguros = seguros;
        this.telefoneFixoOuCelular = telefoneFixoOuCelular;
        this.valorSaque = valorSaque;
    }


    /**
     * Gets the aberturaContaPagamento value for this SaqueComplementarParameter.
     * 
     * @return aberturaContaPagamento
     */
    public java.lang.Integer getAberturaContaPagamento() {
        return aberturaContaPagamento;
    }


    /**
     * Sets the aberturaContaPagamento value for this SaqueComplementarParameter.
     * 
     * @param aberturaContaPagamento
     */
    public void setAberturaContaPagamento(java.lang.Integer aberturaContaPagamento) {
        this.aberturaContaPagamento = aberturaContaPagamento;
    }


    /**
     * Gets the agencia value for this SaqueComplementarParameter.
     * 
     * @return agencia
     */
    public com.soap.bmgintegracao.br.bmg.econsig.webservice.AgenciaParameter getAgencia() {
        return agencia;
    }


    /**
     * Sets the agencia value for this SaqueComplementarParameter.
     * 
     * @param agencia
     */
    public void setAgencia(com.soap.bmgintegracao.br.bmg.econsig.webservice.AgenciaParameter agencia) {
        this.agencia = agencia;
    }


    /**
     * Gets the banco value for this SaqueComplementarParameter.
     * 
     * @return banco
     */
    public com.soap.bmgintegracao.br.bmg.econsig.webservice.BancoParameter getBanco() {
        return banco;
    }


    /**
     * Sets the banco value for this SaqueComplementarParameter.
     * 
     * @param banco
     */
    public void setBanco(com.soap.bmgintegracao.br.bmg.econsig.webservice.BancoParameter banco) {
        this.banco = banco;
    }


    /**
     * Gets the bancoOrdemPagamento value for this SaqueComplementarParameter.
     * 
     * @return bancoOrdemPagamento
     */
    public int getBancoOrdemPagamento() {
        return bancoOrdemPagamento;
    }


    /**
     * Sets the bancoOrdemPagamento value for this SaqueComplementarParameter.
     * 
     * @param bancoOrdemPagamento
     */
    public void setBancoOrdemPagamento(int bancoOrdemPagamento) {
        this.bancoOrdemPagamento = bancoOrdemPagamento;
    }


    /**
     * Gets the celular1 value for this SaqueComplementarParameter.
     * 
     * @return celular1
     */
    public com.soap.bmgintegracao.br.bmg.econsig.webservice.TelefoneParameter getCelular1() {
        return celular1;
    }


    /**
     * Sets the celular1 value for this SaqueComplementarParameter.
     * 
     * @param celular1
     */
    public void setCelular1(com.soap.bmgintegracao.br.bmg.econsig.webservice.TelefoneParameter celular1) {
        this.celular1 = celular1;
    }


    /**
     * Gets the codigoFormaEnvioTermo value for this SaqueComplementarParameter.
     * 
     * @return codigoFormaEnvioTermo
     */
    public java.lang.String getCodigoFormaEnvioTermo() {
        return codigoFormaEnvioTermo;
    }


    /**
     * Sets the codigoFormaEnvioTermo value for this SaqueComplementarParameter.
     * 
     * @param codigoFormaEnvioTermo
     */
    public void setCodigoFormaEnvioTermo(java.lang.String codigoFormaEnvioTermo) {
        this.codigoFormaEnvioTermo = codigoFormaEnvioTermo;
    }


    /**
     * Gets the codigoLoja value for this SaqueComplementarParameter.
     * 
     * @return codigoLoja
     */
    public java.lang.Integer getCodigoLoja() {
        return codigoLoja;
    }


    /**
     * Sets the codigoLoja value for this SaqueComplementarParameter.
     * 
     * @param codigoLoja
     */
    public void setCodigoLoja(java.lang.Integer codigoLoja) {
        this.codigoLoja = codigoLoja;
    }


    /**
     * Gets the codigoSituacaoServidor value for this SaqueComplementarParameter.
     * 
     * @return codigoSituacaoServidor
     */
    public java.lang.Integer getCodigoSituacaoServidor() {
        return codigoSituacaoServidor;
    }


    /**
     * Sets the codigoSituacaoServidor value for this SaqueComplementarParameter.
     * 
     * @param codigoSituacaoServidor
     */
    public void setCodigoSituacaoServidor(java.lang.Integer codigoSituacaoServidor) {
        this.codigoSituacaoServidor = codigoSituacaoServidor;
    }


    /**
     * Gets the conta value for this SaqueComplementarParameter.
     * 
     * @return conta
     */
    public com.soap.bmgintegracao.br.bmg.econsig.webservice.ContaParameter getConta() {
        return conta;
    }


    /**
     * Sets the conta value for this SaqueComplementarParameter.
     * 
     * @param conta
     */
    public void setConta(com.soap.bmgintegracao.br.bmg.econsig.webservice.ContaParameter conta) {
        this.conta = conta;
    }


    /**
     * Gets the cpfAgente value for this SaqueComplementarParameter.
     * 
     * @return cpfAgente
     */
    public java.lang.String getCpfAgente() {
        return cpfAgente;
    }


    /**
     * Sets the cpfAgente value for this SaqueComplementarParameter.
     * 
     * @param cpfAgente
     */
    public void setCpfAgente(java.lang.String cpfAgente) {
        this.cpfAgente = cpfAgente;
    }


    /**
     * Gets the email value for this SaqueComplementarParameter.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SaqueComplementarParameter.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the finalidadeCredito value for this SaqueComplementarParameter.
     * 
     * @return finalidadeCredito
     */
    public int getFinalidadeCredito() {
        return finalidadeCredito;
    }


    /**
     * Sets the finalidadeCredito value for this SaqueComplementarParameter.
     * 
     * @param finalidadeCredito
     */
    public void setFinalidadeCredito(int finalidadeCredito) {
        this.finalidadeCredito = finalidadeCredito;
    }


    /**
     * Gets the formaCredito value for this SaqueComplementarParameter.
     * 
     * @return formaCredito
     */
    public int getFormaCredito() {
        return formaCredito;
    }


    /**
     * Sets the formaCredito value for this SaqueComplementarParameter.
     * 
     * @param formaCredito
     */
    public void setFormaCredito(int formaCredito) {
        this.formaCredito = formaCredito;
    }


    /**
     * Gets the listaEletro value for this SaqueComplementarParameter.
     * 
     * @return listaEletro
     */
    public com.soap.bmgintegracao.br.bmg.econsig.webservice.EletroParameter[] getListaEletro() {
        return listaEletro;
    }


    /**
     * Sets the listaEletro value for this SaqueComplementarParameter.
     * 
     * @param listaEletro
     */
    public void setListaEletro(com.soap.bmgintegracao.br.bmg.econsig.webservice.EletroParameter[] listaEletro) {
        this.listaEletro = listaEletro;
    }


    /**
     * Gets the numeroExterno value for this SaqueComplementarParameter.
     * 
     * @return numeroExterno
     */
    public java.lang.Integer getNumeroExterno() {
        return numeroExterno;
    }


    /**
     * Sets the numeroExterno value for this SaqueComplementarParameter.
     * 
     * @param numeroExterno
     */
    public void setNumeroExterno(java.lang.Integer numeroExterno) {
        this.numeroExterno = numeroExterno;
    }


    /**
     * Gets the protocoloMultiProdutos value for this SaqueComplementarParameter.
     * 
     * @return protocoloMultiProdutos
     */
    public java.lang.Long getProtocoloMultiProdutos() {
        return protocoloMultiProdutos;
    }


    /**
     * Sets the protocoloMultiProdutos value for this SaqueComplementarParameter.
     * 
     * @param protocoloMultiProdutos
     */
    public void setProtocoloMultiProdutos(java.lang.Long protocoloMultiProdutos) {
        this.protocoloMultiProdutos = protocoloMultiProdutos;
    }


    /**
     * Gets the seguros value for this SaqueComplementarParameter.
     * 
     * @return seguros
     */
    public com.soap.bmgintegracao.br.bmg.econsig.webservice.Seguro[] getSeguros() {
        return seguros;
    }


    /**
     * Sets the seguros value for this SaqueComplementarParameter.
     * 
     * @param seguros
     */
    public void setSeguros(com.soap.bmgintegracao.br.bmg.econsig.webservice.Seguro[] seguros) {
        this.seguros = seguros;
    }


    /**
     * Gets the telefoneFixoOuCelular value for this SaqueComplementarParameter.
     * 
     * @return telefoneFixoOuCelular
     */
    public com.soap.bmgintegracao.br.bmg.econsig.webservice.TelefoneParameter getTelefoneFixoOuCelular() {
        return telefoneFixoOuCelular;
    }


    /**
     * Sets the telefoneFixoOuCelular value for this SaqueComplementarParameter.
     * 
     * @param telefoneFixoOuCelular
     */
    public void setTelefoneFixoOuCelular(com.soap.bmgintegracao.br.bmg.econsig.webservice.TelefoneParameter telefoneFixoOuCelular) {
        this.telefoneFixoOuCelular = telefoneFixoOuCelular;
    }


    /**
     * Gets the valorSaque value for this SaqueComplementarParameter.
     * 
     * @return valorSaque
     */
    public java.lang.Double getValorSaque() {
        return valorSaque;
    }


    /**
     * Sets the valorSaque value for this SaqueComplementarParameter.
     * 
     * @param valorSaque
     */
    public void setValorSaque(java.lang.Double valorSaque) {
        this.valorSaque = valorSaque;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaqueComplementarParameter)) return false;
        SaqueComplementarParameter other = (SaqueComplementarParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aberturaContaPagamento==null && other.getAberturaContaPagamento()==null) || 
             (this.aberturaContaPagamento!=null &&
              this.aberturaContaPagamento.equals(other.getAberturaContaPagamento()))) &&
            ((this.agencia==null && other.getAgencia()==null) || 
             (this.agencia!=null &&
              this.agencia.equals(other.getAgencia()))) &&
            ((this.banco==null && other.getBanco()==null) || 
             (this.banco!=null &&
              this.banco.equals(other.getBanco()))) &&
            this.bancoOrdemPagamento == other.getBancoOrdemPagamento() &&
            ((this.celular1==null && other.getCelular1()==null) || 
             (this.celular1!=null &&
              this.celular1.equals(other.getCelular1()))) &&
            ((this.codigoFormaEnvioTermo==null && other.getCodigoFormaEnvioTermo()==null) || 
             (this.codigoFormaEnvioTermo!=null &&
              this.codigoFormaEnvioTermo.equals(other.getCodigoFormaEnvioTermo()))) &&
            ((this.codigoLoja==null && other.getCodigoLoja()==null) || 
             (this.codigoLoja!=null &&
              this.codigoLoja.equals(other.getCodigoLoja()))) &&
            ((this.codigoSituacaoServidor==null && other.getCodigoSituacaoServidor()==null) || 
             (this.codigoSituacaoServidor!=null &&
              this.codigoSituacaoServidor.equals(other.getCodigoSituacaoServidor()))) &&
            ((this.conta==null && other.getConta()==null) || 
             (this.conta!=null &&
              this.conta.equals(other.getConta()))) &&
            ((this.cpfAgente==null && other.getCpfAgente()==null) || 
             (this.cpfAgente!=null &&
              this.cpfAgente.equals(other.getCpfAgente()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.finalidadeCredito == other.getFinalidadeCredito() &&
            this.formaCredito == other.getFormaCredito() &&
            ((this.listaEletro==null && other.getListaEletro()==null) || 
             (this.listaEletro!=null &&
              java.util.Arrays.equals(this.listaEletro, other.getListaEletro()))) &&
            ((this.numeroExterno==null && other.getNumeroExterno()==null) || 
             (this.numeroExterno!=null &&
              this.numeroExterno.equals(other.getNumeroExterno()))) &&
            ((this.protocoloMultiProdutos==null && other.getProtocoloMultiProdutos()==null) || 
             (this.protocoloMultiProdutos!=null &&
              this.protocoloMultiProdutos.equals(other.getProtocoloMultiProdutos()))) &&
            ((this.seguros==null && other.getSeguros()==null) || 
             (this.seguros!=null &&
              java.util.Arrays.equals(this.seguros, other.getSeguros()))) &&
            ((this.telefoneFixoOuCelular==null && other.getTelefoneFixoOuCelular()==null) || 
             (this.telefoneFixoOuCelular!=null &&
              this.telefoneFixoOuCelular.equals(other.getTelefoneFixoOuCelular()))) &&
            ((this.valorSaque==null && other.getValorSaque()==null) || 
             (this.valorSaque!=null &&
              this.valorSaque.equals(other.getValorSaque())));
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
        if (getAberturaContaPagamento() != null) {
            _hashCode += getAberturaContaPagamento().hashCode();
        }
        if (getAgencia() != null) {
            _hashCode += getAgencia().hashCode();
        }
        if (getBanco() != null) {
            _hashCode += getBanco().hashCode();
        }
        _hashCode += getBancoOrdemPagamento();
        if (getCelular1() != null) {
            _hashCode += getCelular1().hashCode();
        }
        if (getCodigoFormaEnvioTermo() != null) {
            _hashCode += getCodigoFormaEnvioTermo().hashCode();
        }
        if (getCodigoLoja() != null) {
            _hashCode += getCodigoLoja().hashCode();
        }
        if (getCodigoSituacaoServidor() != null) {
            _hashCode += getCodigoSituacaoServidor().hashCode();
        }
        if (getConta() != null) {
            _hashCode += getConta().hashCode();
        }
        if (getCpfAgente() != null) {
            _hashCode += getCpfAgente().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += getFinalidadeCredito();
        _hashCode += getFormaCredito();
        if (getListaEletro() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaEletro());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaEletro(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumeroExterno() != null) {
            _hashCode += getNumeroExterno().hashCode();
        }
        if (getProtocoloMultiProdutos() != null) {
            _hashCode += getProtocoloMultiProdutos().hashCode();
        }
        if (getSeguros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeguros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeguros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTelefoneFixoOuCelular() != null) {
            _hashCode += getTelefoneFixoOuCelular().hashCode();
        }
        if (getValorSaque() != null) {
            _hashCode += getValorSaque().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaqueComplementarParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "SaqueComplementarParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aberturaContaPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aberturaContaPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "AgenciaParameter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "banco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "BancoParameter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bancoOrdemPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bancoOrdemPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("celular1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "celular1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "TelefoneParameter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoFormaEnvioTermo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoFormaEnvioTermo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoLoja");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoLoja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSituacaoServidor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoSituacaoServidor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "ContaParameter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfAgente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpfAgente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalidadeCredito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finalidadeCredito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaCredito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formaCredito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaEletro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaEletro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "EletroParameter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroExterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroExterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocoloMultiProdutos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocoloMultiProdutos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seguros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seguros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "Seguro"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefoneFixoOuCelular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefoneFixoOuCelular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "TelefoneParameter"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorSaque");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorSaque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "double"));
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
