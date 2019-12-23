/**
 * CartaoParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.soap.bmgintegracao.com.bmg.econsig.webservice;

public class CartaoParameter  extends com.soap.bmgintegracao.com.bmg.econsig.webservice.ParametersPropostaConsignacao  implements java.io.Serializable {
    private java.lang.Boolean cpfImpedidoComissionar;

    private com.soap.bmgintegracao.com.bmg.econsig.cartao.parameter.DadosLimiteDeSaque dadosLimiteDeSaqueComplementar;

    private java.lang.Integer layoutCartao;

    private java.lang.Long numeroContaInterna;

    private java.lang.Integer numeroExterno;

    private java.lang.Integer numeroParcelas;

    private java.lang.Integer parceriaComercial;

    private java.lang.Boolean permiteSomenteFormaCreditoTED;

    private java.lang.String script;

    private java.lang.String tipoDocumentoIdentificacao;

    private java.lang.Integer tipoEmissaoCartao;

    private java.lang.Integer tipoSaque;

    private java.lang.Double valorParcela;

    private java.lang.Double valorSaque;

    public CartaoParameter() {
    }

    public CartaoParameter(
           java.lang.String login,
           java.lang.String senha,
           int aberturaContaPagamento,
           com.soap.bmgintegracao.com.bmg.econsig.webservice.AgenciaParameter agencia,
           java.lang.Boolean agregacaoDeMargemParaSaqueComplementar,
           boolean associado,
           com.soap.bmgintegracao.com.bmg.econsig.webservice.BancoParameter banco,
           int bancoOrdemPagamento,
           com.soap.bmgintegracao.com.bmg.econsig.webservice.BoletoParameter[] boletoPagamento,
           java.lang.String cargo,
           com.soap.bmgintegracao.com.bmg.econsig.webservice.ClienteParameter cliente,
           boolean clientePreCadastrado,
           java.lang.String cnpjEmpregador,
           java.lang.Integer codEnt,
           java.lang.String codigoAverbacao,
           java.lang.String codigoEntidade,
           java.lang.String codigoFormaEnvioTermo,
           java.lang.Integer codigoLoja,
           java.lang.String codigoServico,
           java.lang.Integer codigoSituacaoServidor,
           java.lang.Integer codigoTabela,
           com.soap.bmgintegracao.com.bmg.econsig.webservice.ContaParameter conta,
           java.lang.String cpf,
           java.lang.String cpfAgente,
           java.lang.String criterioIof,
           java.lang.String criterioTac,
           java.lang.String criterioTlf,
           java.util.Calendar dataAdmissao,
           java.util.Calendar dataFator,
           java.util.Calendar dataRenda,
           double descontoAdicional,
           double descontoCompulsorio,
           double descontoOutro,
           boolean descontoPossuiCartao,
           double descontoVoluntario,
           int finalidadeCredito,
           int formaCredito,
           java.lang.String identificadorMargem,
           boolean ignorarInconsistenciasPN,
           java.lang.Boolean incluiSeguroVidaFederal,
           java.lang.Integer indSeguroAderente,
           com.soap.bmgintegracao.com.bmg.econsig.webservice.IndicacaoParameter indicacao,
           java.lang.String informacoesAdicionais,
           boolean inserirAtendimentoPlusoft,
           java.lang.String ipUsuario,
           java.lang.Double latitude,
           com.soap.bmgintegracao.com.bmg.econsig.webservice.Contrato[] listaContrato,
           com.soap.bmgintegracao.com.bmg.econsig.webservice.EletroParameter[] listaEletro,
           java.lang.String loginConsig,
           java.lang.Double longitude,
           double margem,
           java.lang.String matricula,
           java.lang.String matriculaInstituidor,
           java.lang.Long numeroApolice,
           java.lang.String numeroCartao,
           java.lang.String numeroPeculio,
           short numeroPrestacoes,
           java.lang.String numeroPropostaExterna,
           java.lang.Long numeroSorteio,
           boolean possuiCartao,
           java.lang.Integer produto,
           java.lang.Long protocoloMultiProdutos,
           com.soap.bmgintegracao.com.bmg.econsig.common.model.cet.RetornoCetPn retornoCetPn,
           com.soap.bmgintegracao.com.bmg.econsig.webservice.Seguro[] seguros,
           java.lang.String senhaConsig,
           java.lang.String senhaSME,
           java.lang.Integer sequencialOrgao,
           java.lang.Integer tipoBeneficio,
           java.lang.Short tipoDomicilioBancario,
           java.lang.String ufContaBeneficio,
           java.lang.String unidadePagadora,
           java.lang.Boolean utilizaUserConsig,
           java.lang.Boolean validouSenha,
           java.lang.Double valorAgregacaoDeMargemParaSaqueComplementar,
           java.lang.Double valorCapitalSegurado,
           double valorIof,
           double valorPrestacao,
           double valorRenda,
           java.lang.Double valorResidual,
           java.lang.Double valorSeguroVidaFederal,
           double valorSolicitado,
           java.lang.String vinculoMatricula,
           java.lang.Boolean cpfImpedidoComissionar,
           com.soap.bmgintegracao.com.bmg.econsig.cartao.parameter.DadosLimiteDeSaque dadosLimiteDeSaqueComplementar,
           java.lang.Integer layoutCartao,
           java.lang.Long numeroContaInterna,
           java.lang.Integer numeroExterno,
           java.lang.Integer numeroParcelas,
           java.lang.Integer parceriaComercial,
           java.lang.Boolean permiteSomenteFormaCreditoTED,
           java.lang.String script,
           java.lang.String tipoDocumentoIdentificacao,
           java.lang.Integer tipoEmissaoCartao,
           java.lang.Integer tipoSaque,
           java.lang.Double valorParcela,
           java.lang.Double valorSaque) {
        super(
            login,
            senha,
            aberturaContaPagamento,
            agencia,
            agregacaoDeMargemParaSaqueComplementar,
            associado,
            banco,
            bancoOrdemPagamento,
            boletoPagamento,
            cargo,
            cliente,
            clientePreCadastrado,
            cnpjEmpregador,
            codEnt,
            codigoAverbacao,
            codigoEntidade,
            codigoFormaEnvioTermo,
            codigoLoja,
            codigoServico,
            codigoSituacaoServidor,
            codigoTabela,
            conta,
            cpf,
            cpfAgente,
            criterioIof,
            criterioTac,
            criterioTlf,
            dataAdmissao,
            dataFator,
            dataRenda,
            descontoAdicional,
            descontoCompulsorio,
            descontoOutro,
            descontoPossuiCartao,
            descontoVoluntario,
            finalidadeCredito,
            formaCredito,
            identificadorMargem,
            ignorarInconsistenciasPN,
            incluiSeguroVidaFederal,
            indSeguroAderente,
            indicacao,
            informacoesAdicionais,
            inserirAtendimentoPlusoft,
            ipUsuario,
            latitude,
            listaContrato,
            listaEletro,
            loginConsig,
            longitude,
            margem,
            matricula,
            matriculaInstituidor,
            numeroApolice,
            numeroCartao,
            numeroPeculio,
            numeroPrestacoes,
            numeroPropostaExterna,
            numeroSorteio,
            possuiCartao,
            produto,
            protocoloMultiProdutos,
            retornoCetPn,
            seguros,
            senhaConsig,
            senhaSME,
            sequencialOrgao,
            tipoBeneficio,
            tipoDomicilioBancario,
            ufContaBeneficio,
            unidadePagadora,
            utilizaUserConsig,
            validouSenha,
            valorAgregacaoDeMargemParaSaqueComplementar,
            valorCapitalSegurado,
            valorIof,
            valorPrestacao,
            valorRenda,
            valorResidual,
            valorSeguroVidaFederal,
            valorSolicitado,
            vinculoMatricula);
        this.cpfImpedidoComissionar = cpfImpedidoComissionar;
        this.dadosLimiteDeSaqueComplementar = dadosLimiteDeSaqueComplementar;
        this.layoutCartao = layoutCartao;
        this.numeroContaInterna = numeroContaInterna;
        this.numeroExterno = numeroExterno;
        this.numeroParcelas = numeroParcelas;
        this.parceriaComercial = parceriaComercial;
        this.permiteSomenteFormaCreditoTED = permiteSomenteFormaCreditoTED;
        this.script = script;
        this.tipoDocumentoIdentificacao = tipoDocumentoIdentificacao;
        this.tipoEmissaoCartao = tipoEmissaoCartao;
        this.tipoSaque = tipoSaque;
        this.valorParcela = valorParcela;
        this.valorSaque = valorSaque;
    }


    /**
     * Gets the cpfImpedidoComissionar value for this CartaoParameter.
     * 
     * @return cpfImpedidoComissionar
     */
    public java.lang.Boolean getCpfImpedidoComissionar() {
        return cpfImpedidoComissionar;
    }


    /**
     * Sets the cpfImpedidoComissionar value for this CartaoParameter.
     * 
     * @param cpfImpedidoComissionar
     */
    public void setCpfImpedidoComissionar(java.lang.Boolean cpfImpedidoComissionar) {
        this.cpfImpedidoComissionar = cpfImpedidoComissionar;
    }


    /**
     * Gets the dadosLimiteDeSaqueComplementar value for this CartaoParameter.
     * 
     * @return dadosLimiteDeSaqueComplementar
     */
    public com.soap.bmgintegracao.com.bmg.econsig.cartao.parameter.DadosLimiteDeSaque getDadosLimiteDeSaqueComplementar() {
        return dadosLimiteDeSaqueComplementar;
    }


    /**
     * Sets the dadosLimiteDeSaqueComplementar value for this CartaoParameter.
     * 
     * @param dadosLimiteDeSaqueComplementar
     */
    public void setDadosLimiteDeSaqueComplementar(com.soap.bmgintegracao.com.bmg.econsig.cartao.parameter.DadosLimiteDeSaque dadosLimiteDeSaqueComplementar) {
        this.dadosLimiteDeSaqueComplementar = dadosLimiteDeSaqueComplementar;
    }


    /**
     * Gets the layoutCartao value for this CartaoParameter.
     * 
     * @return layoutCartao
     */
    public java.lang.Integer getLayoutCartao() {
        return layoutCartao;
    }


    /**
     * Sets the layoutCartao value for this CartaoParameter.
     * 
     * @param layoutCartao
     */
    public void setLayoutCartao(java.lang.Integer layoutCartao) {
        this.layoutCartao = layoutCartao;
    }


    /**
     * Gets the numeroContaInterna value for this CartaoParameter.
     * 
     * @return numeroContaInterna
     */
    public java.lang.Long getNumeroContaInterna() {
        return numeroContaInterna;
    }


    /**
     * Sets the numeroContaInterna value for this CartaoParameter.
     * 
     * @param numeroContaInterna
     */
    public void setNumeroContaInterna(java.lang.Long numeroContaInterna) {
        this.numeroContaInterna = numeroContaInterna;
    }


    /**
     * Gets the numeroExterno value for this CartaoParameter.
     * 
     * @return numeroExterno
     */
    public java.lang.Integer getNumeroExterno() {
        return numeroExterno;
    }


    /**
     * Sets the numeroExterno value for this CartaoParameter.
     * 
     * @param numeroExterno
     */
    public void setNumeroExterno(java.lang.Integer numeroExterno) {
        this.numeroExterno = numeroExterno;
    }


    /**
     * Gets the numeroParcelas value for this CartaoParameter.
     * 
     * @return numeroParcelas
     */
    public java.lang.Integer getNumeroParcelas() {
        return numeroParcelas;
    }


    /**
     * Sets the numeroParcelas value for this CartaoParameter.
     * 
     * @param numeroParcelas
     */
    public void setNumeroParcelas(java.lang.Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }


    /**
     * Gets the parceriaComercial value for this CartaoParameter.
     * 
     * @return parceriaComercial
     */
    public java.lang.Integer getParceriaComercial() {
        return parceriaComercial;
    }


    /**
     * Sets the parceriaComercial value for this CartaoParameter.
     * 
     * @param parceriaComercial
     */
    public void setParceriaComercial(java.lang.Integer parceriaComercial) {
        this.parceriaComercial = parceriaComercial;
    }


    /**
     * Gets the permiteSomenteFormaCreditoTED value for this CartaoParameter.
     * 
     * @return permiteSomenteFormaCreditoTED
     */
    public java.lang.Boolean getPermiteSomenteFormaCreditoTED() {
        return permiteSomenteFormaCreditoTED;
    }


    /**
     * Sets the permiteSomenteFormaCreditoTED value for this CartaoParameter.
     * 
     * @param permiteSomenteFormaCreditoTED
     */
    public void setPermiteSomenteFormaCreditoTED(java.lang.Boolean permiteSomenteFormaCreditoTED) {
        this.permiteSomenteFormaCreditoTED = permiteSomenteFormaCreditoTED;
    }


    /**
     * Gets the script value for this CartaoParameter.
     * 
     * @return script
     */
    public java.lang.String getScript() {
        return script;
    }


    /**
     * Sets the script value for this CartaoParameter.
     * 
     * @param script
     */
    public void setScript(java.lang.String script) {
        this.script = script;
    }


    /**
     * Gets the tipoDocumentoIdentificacao value for this CartaoParameter.
     * 
     * @return tipoDocumentoIdentificacao
     */
    public java.lang.String getTipoDocumentoIdentificacao() {
        return tipoDocumentoIdentificacao;
    }


    /**
     * Sets the tipoDocumentoIdentificacao value for this CartaoParameter.
     * 
     * @param tipoDocumentoIdentificacao
     */
    public void setTipoDocumentoIdentificacao(java.lang.String tipoDocumentoIdentificacao) {
        this.tipoDocumentoIdentificacao = tipoDocumentoIdentificacao;
    }


    /**
     * Gets the tipoEmissaoCartao value for this CartaoParameter.
     * 
     * @return tipoEmissaoCartao
     */
    public java.lang.Integer getTipoEmissaoCartao() {
        return tipoEmissaoCartao;
    }


    /**
     * Sets the tipoEmissaoCartao value for this CartaoParameter.
     * 
     * @param tipoEmissaoCartao
     */
    public void setTipoEmissaoCartao(java.lang.Integer tipoEmissaoCartao) {
        this.tipoEmissaoCartao = tipoEmissaoCartao;
    }


    /**
     * Gets the tipoSaque value for this CartaoParameter.
     * 
     * @return tipoSaque
     */
    public java.lang.Integer getTipoSaque() {
        return tipoSaque;
    }


    /**
     * Sets the tipoSaque value for this CartaoParameter.
     * 
     * @param tipoSaque
     */
    public void setTipoSaque(java.lang.Integer tipoSaque) {
        this.tipoSaque = tipoSaque;
    }


    /**
     * Gets the valorParcela value for this CartaoParameter.
     * 
     * @return valorParcela
     */
    public java.lang.Double getValorParcela() {
        return valorParcela;
    }


    /**
     * Sets the valorParcela value for this CartaoParameter.
     * 
     * @param valorParcela
     */
    public void setValorParcela(java.lang.Double valorParcela) {
        this.valorParcela = valorParcela;
    }


    /**
     * Gets the valorSaque value for this CartaoParameter.
     * 
     * @return valorSaque
     */
    public java.lang.Double getValorSaque() {
        return valorSaque;
    }


    /**
     * Sets the valorSaque value for this CartaoParameter.
     * 
     * @param valorSaque
     */
    public void setValorSaque(java.lang.Double valorSaque) {
        this.valorSaque = valorSaque;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartaoParameter)) return false;
        CartaoParameter other = (CartaoParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cpfImpedidoComissionar==null && other.getCpfImpedidoComissionar()==null) || 
             (this.cpfImpedidoComissionar!=null &&
              this.cpfImpedidoComissionar.equals(other.getCpfImpedidoComissionar()))) &&
            ((this.dadosLimiteDeSaqueComplementar==null && other.getDadosLimiteDeSaqueComplementar()==null) || 
             (this.dadosLimiteDeSaqueComplementar!=null &&
              this.dadosLimiteDeSaqueComplementar.equals(other.getDadosLimiteDeSaqueComplementar()))) &&
            ((this.layoutCartao==null && other.getLayoutCartao()==null) || 
             (this.layoutCartao!=null &&
              this.layoutCartao.equals(other.getLayoutCartao()))) &&
            ((this.numeroContaInterna==null && other.getNumeroContaInterna()==null) || 
             (this.numeroContaInterna!=null &&
              this.numeroContaInterna.equals(other.getNumeroContaInterna()))) &&
            ((this.numeroExterno==null && other.getNumeroExterno()==null) || 
             (this.numeroExterno!=null &&
              this.numeroExterno.equals(other.getNumeroExterno()))) &&
            ((this.numeroParcelas==null && other.getNumeroParcelas()==null) || 
             (this.numeroParcelas!=null &&
              this.numeroParcelas.equals(other.getNumeroParcelas()))) &&
            ((this.parceriaComercial==null && other.getParceriaComercial()==null) || 
             (this.parceriaComercial!=null &&
              this.parceriaComercial.equals(other.getParceriaComercial()))) &&
            ((this.permiteSomenteFormaCreditoTED==null && other.getPermiteSomenteFormaCreditoTED()==null) || 
             (this.permiteSomenteFormaCreditoTED!=null &&
              this.permiteSomenteFormaCreditoTED.equals(other.getPermiteSomenteFormaCreditoTED()))) &&
            ((this.script==null && other.getScript()==null) || 
             (this.script!=null &&
              this.script.equals(other.getScript()))) &&
            ((this.tipoDocumentoIdentificacao==null && other.getTipoDocumentoIdentificacao()==null) || 
             (this.tipoDocumentoIdentificacao!=null &&
              this.tipoDocumentoIdentificacao.equals(other.getTipoDocumentoIdentificacao()))) &&
            ((this.tipoEmissaoCartao==null && other.getTipoEmissaoCartao()==null) || 
             (this.tipoEmissaoCartao!=null &&
              this.tipoEmissaoCartao.equals(other.getTipoEmissaoCartao()))) &&
            ((this.tipoSaque==null && other.getTipoSaque()==null) || 
             (this.tipoSaque!=null &&
              this.tipoSaque.equals(other.getTipoSaque()))) &&
            ((this.valorParcela==null && other.getValorParcela()==null) || 
             (this.valorParcela!=null &&
              this.valorParcela.equals(other.getValorParcela()))) &&
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
        if (getCpfImpedidoComissionar() != null) {
            _hashCode += getCpfImpedidoComissionar().hashCode();
        }
        if (getDadosLimiteDeSaqueComplementar() != null) {
            _hashCode += getDadosLimiteDeSaqueComplementar().hashCode();
        }
        if (getLayoutCartao() != null) {
            _hashCode += getLayoutCartao().hashCode();
        }
        if (getNumeroContaInterna() != null) {
            _hashCode += getNumeroContaInterna().hashCode();
        }
        if (getNumeroExterno() != null) {
            _hashCode += getNumeroExterno().hashCode();
        }
        if (getNumeroParcelas() != null) {
            _hashCode += getNumeroParcelas().hashCode();
        }
        if (getParceriaComercial() != null) {
            _hashCode += getParceriaComercial().hashCode();
        }
        if (getPermiteSomenteFormaCreditoTED() != null) {
            _hashCode += getPermiteSomenteFormaCreditoTED().hashCode();
        }
        if (getScript() != null) {
            _hashCode += getScript().hashCode();
        }
        if (getTipoDocumentoIdentificacao() != null) {
            _hashCode += getTipoDocumentoIdentificacao().hashCode();
        }
        if (getTipoEmissaoCartao() != null) {
            _hashCode += getTipoEmissaoCartao().hashCode();
        }
        if (getTipoSaque() != null) {
            _hashCode += getTipoSaque().hashCode();
        }
        if (getValorParcela() != null) {
            _hashCode += getValorParcela().hashCode();
        }
        if (getValorSaque() != null) {
            _hashCode += getValorSaque().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartaoParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "CartaoParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfImpedidoComissionar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpfImpedidoComissionar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosLimiteDeSaqueComplementar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dadosLimiteDeSaqueComplementar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://parameter.cartao.econsig.bmg.com", "DadosLimiteDeSaque"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutCartao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "layoutCartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroContaInterna");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroContaInterna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroExterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroExterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroParcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroParcelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parceriaComercial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parceriaComercial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permiteSomenteFormaCreditoTED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permiteSomenteFormaCreditoTED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("script");
        elemField.setXmlName(new javax.xml.namespace.QName("", "script"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumentoIdentificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumentoIdentificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoEmissaoCartao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoEmissaoCartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSaque");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoSaque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorParcela");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorParcela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorSaque");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorSaque"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
