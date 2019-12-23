package com.soap.bmgintegracao.service;

import com.soap.bmgintegracao.com.bmg.econsig.webservice.*;
import com.soap.bmgintegracao.model.CpfBaseBmgModel;
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

    public LimiteSaqueRetorno buscarLimiteSaque(CpfBaseBmgModel cpfBaseBmgModel){

        LimiteSaqueRetorno limiteSaqueRetorno = new LimiteSaqueRetorno();

        try {
            LimiteSaqueParameter limiteSaqueParameter = new LimiteSaqueParameter();

            limiteSaqueParameter.setCpf(cpfBaseBmgModel.getNumeroDocumento());
            limiteSaqueParameter.setCodigoEntidade(Integer.parseInt(cpfBaseBmgModel.getCodigoEntidade()));
            limiteSaqueParameter.setMatricula(cpfBaseBmgModel.getMatricula());
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

            logger.error("buscarLimiteSaque: '" + cpfBaseBmgModel.getNumeroDocumento() + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return limiteSaqueRetorno;
    }

    public ValidaSeJaPossuiContaCartaoRetorno validaSeJaPossuiContaCartao(CpfBaseBmgModel cpfBaseBmgModel){

        ValidaSeJaPossuiContaCartaoRetorno validaSeJaPossuiContaCartaoRetorno = new ValidaSeJaPossuiContaCartaoRetorno();

        try {
            ValidaSeJaPossuiContaCartaoParameter validaSeJaPossuiContaCartaoParameter = new ValidaSeJaPossuiContaCartaoParameter();

            validaSeJaPossuiContaCartaoParameter.setCpf(cpfBaseBmgModel.getNumeroDocumento());
            validaSeJaPossuiContaCartaoParameter.setCodigoEntidade(Integer.parseInt(cpfBaseBmgModel.getCodigoEntidade()));
            validaSeJaPossuiContaCartaoParameter.setMatricula(cpfBaseBmgModel.getMatricula());
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

            logger.error("validaSeJaPossuiContaCartao: '" + cpfBaseBmgModel.getNumeroDocumento() + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return validaSeJaPossuiContaCartaoRetorno;
    }

    public ObtemProdutosDeSeguroRetorno obtemProdutosDeSeguroRetorno(CpfBaseBmgModel cpfBaseBmgModel){

        ObtemProdutosDeSeguroRetorno obtemProdutosDeSeguroRetorno = new ObtemProdutosDeSeguroRetorno();

        try {
            ObtemProdutosDeSeguroParameter obtemProdutosDeSeguroParameter = new ObtemProdutosDeSeguroParameter();

            obtemProdutosDeSeguroParameter.setCpf(cpfBaseBmgModel.getNumeroDocumento());
            obtemProdutosDeSeguroParameter.setCodigoEntidade(Integer.parseInt(cpfBaseBmgModel.getCodigoEntidade()));
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

            logger.info("obtemProdutosDeSeguroRetorno: '" + cpfBaseBmgModel.getNumeroDocumento() + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obtemProdutosDeSeguroRetorno;
    }
}
