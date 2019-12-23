package com.soap.bmgintegracao.service;

import com.soap.bmgintegracao.com.bmg.econsig.webservice.*;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.namespace.QName;



@org.springframework.stereotype.Service
public class BmgCaller {

    Logger logger = LoggerFactory.getLogger(BmgCaller.class);

    @Value("${bmg.user}")
    private String login;

    @Value("${bmg.password}")
    private String password;

    public LimiteSaqueRetorno buscarLimiteSaque(String cpf){

        LimiteSaqueRetorno limiteSaqueRetorno = new LimiteSaqueRetorno();

        try {
            LimiteSaqueParameter limiteSaqueParameter = new LimiteSaqueParameter();

            limiteSaqueParameter.setCpf(cpf);
            limiteSaqueParameter.setSenha(password);
            limiteSaqueParameter.setLogin(login);


            String endpoint =  "https://ws1.bmgconsig.com.br/webservices/CartaoMaster";

            Service  service = new Service();

            Call call= (Call) service.createCall();

            call.setUsername(login);
            call.setPassword(password);
            call.setProperty( Call.SOAPACTION_USE_PROPERTY, new Boolean( true ) );

            call.setTargetEndpointAddress( new java.net.URL(endpoint) );
            call.setOperationName(new QName("tns1:LimiteSaqueRetorno","LimiteSaqueRetorno"));

            QName qname = new QName("http://webservice.econsig.bmg.com","LimiteSaqueRetorno");

            call.registerTypeMapping(LimiteSaqueRetorno.class, qname,
                    new org.apache.axis.encoding.ser.BeanSerializerFactory(LimiteSaqueRetorno.class, qname),
                    new org.apache.axis.encoding.ser.BeanDeserializerFactory(LimiteSaqueRetorno.class, qname));

            Object[] params = new Object[] { limiteSaqueParameter };

            limiteSaqueRetorno = (LimiteSaqueRetorno) call.invoke("http://webservice.econsig.bmg.com", "buscarLimiteSaque", params );

            logger.info("buscarLimiteSaque: '" + cpf + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return limiteSaqueRetorno;
    }

    public ValidaSeJaPossuiContaCartaoRetorno validaSeJaPossuiContaCartao(String cpf){

        ValidaSeJaPossuiContaCartaoRetorno validaSeJaPossuiContaCartaoRetorno = new ValidaSeJaPossuiContaCartaoRetorno();

        try {
            ValidaSeJaPossuiContaCartaoParameter validaSeJaPossuiContaCartaoParameter = new ValidaSeJaPossuiContaCartaoParameter();

            validaSeJaPossuiContaCartaoParameter.setCpf(cpf);
            validaSeJaPossuiContaCartaoParameter.setSenha(password);
            validaSeJaPossuiContaCartaoParameter.setLogin(login);


            String endpoint =  "https://ws1.bmgconsig.com.br/webservices/CartaoMaster";

            Service  service = new Service();

            Call call= (Call) service.createCall();

            call.setUsername(login);
            call.setPassword(password);
            call.setProperty( Call.SOAPACTION_USE_PROPERTY, new Boolean( true ) );

            call.setTargetEndpointAddress( new java.net.URL(endpoint) );
            call.setOperationName(new QName("tns1:ValidaSeJaPossuiContaCartaoRetorno","ValidaSeJaPossuiContaCartaoRetorno"));

            QName qname = new QName("http://webservice.econsig.bmg.com","ValidaSeJaPossuiContaCartaoRetorno");

            call.registerTypeMapping(ValidaSeJaPossuiContaCartaoRetorno.class, qname,
                    new org.apache.axis.encoding.ser.BeanSerializerFactory(ValidaSeJaPossuiContaCartaoRetorno.class, qname),
                    new org.apache.axis.encoding.ser.BeanDeserializerFactory(ValidaSeJaPossuiContaCartaoRetorno.class, qname));

            Object[] params = new Object[] { validaSeJaPossuiContaCartaoParameter };

            validaSeJaPossuiContaCartaoRetorno = (ValidaSeJaPossuiContaCartaoRetorno) call.invoke("http://webservice.econsig.bmg.com", "validaSeJaPossuiContaCartao", params );

            logger.info("buscarLimiteSaque: '" + cpf + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return validaSeJaPossuiContaCartaoRetorno;
    }

    public ObtemProdutosDeSeguroRetorno obtemProdutosDeSeguroRetorno(String cpf){

        ObtemProdutosDeSeguroRetorno obtemProdutosDeSeguroRetorno = new ObtemProdutosDeSeguroRetorno();

        try {
            ObtemProdutosDeSeguroParameter obtemProdutosDeSeguroParameter = new ObtemProdutosDeSeguroParameter();

            obtemProdutosDeSeguroParameter.setCpf(cpf);
            obtemProdutosDeSeguroParameter.setSenha(password);
            obtemProdutosDeSeguroParameter.setLogin(login);


            String endpoint =  "https://ws1.bmgconsig.com.br/webservices/CartaoMaster";

            Service  service = new Service();

            Call call= (Call) service.createCall();

            call.setUsername(login);
            call.setPassword(password);
            call.setProperty( Call.SOAPACTION_USE_PROPERTY, new Boolean( true ) );

            call.setTargetEndpointAddress( new java.net.URL(endpoint) );
            call.setOperationName(new QName("tns1:ObtemProdutosDeSeguroRetorno","ObtemProdutosDeSeguroRetorno"));

            QName qname = new QName("http://webservice.econsig.bmg.com","ObtemProdutosDeSeguroRetorno");

            call.registerTypeMapping(ObtemProdutosDeSeguroRetorno.class, qname,
                    new org.apache.axis.encoding.ser.BeanSerializerFactory(ObtemProdutosDeSeguroRetorno.class, qname),
                    new org.apache.axis.encoding.ser.BeanDeserializerFactory(ObtemProdutosDeSeguroRetorno.class, qname));

            Object[] params = new Object[] { obtemProdutosDeSeguroParameter };

            obtemProdutosDeSeguroRetorno = (ObtemProdutosDeSeguroRetorno) call.invoke("http://webservice.econsig.bmg.com", "obtemProdutosDeSeguro", params );

            logger.info("buscarLimiteSaque: '" + cpf + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obtemProdutosDeSeguroRetorno;
    }
}
