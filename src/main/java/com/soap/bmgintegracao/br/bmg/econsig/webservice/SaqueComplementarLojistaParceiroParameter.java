/**
 * SaqueComplementarLojistaParceiroParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.soap.bmgintegracao.br.bmg.econsig.webservice;

public class SaqueComplementarLojistaParceiroParameter  extends com.soap.bmgintegracao.br.bmg.econsig.webservice.SaqueComplementarParameter  implements java.io.Serializable {
    public SaqueComplementarLojistaParceiroParameter() {
    }

    public SaqueComplementarLojistaParceiroParameter(
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
            vinculoMatricula,
            aberturaContaPagamento,
            agencia,
            banco,
            bancoOrdemPagamento,
            celular1,
            codigoFormaEnvioTermo,
            codigoLoja,
            codigoSituacaoServidor,
            conta,
            cpfAgente,
            email,
            finalidadeCredito,
            formaCredito,
            listaEletro,
            numeroExterno,
            protocoloMultiProdutos,
            seguros,
            telefoneFixoOuCelular,
            valorSaque);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaqueComplementarLojistaParceiroParameter)) return false;
        SaqueComplementarLojistaParceiroParameter other = (SaqueComplementarLojistaParceiroParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaqueComplementarLojistaParceiroParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.econsig.bmg.com", "SaqueComplementarLojistaParceiroParameter"));
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
