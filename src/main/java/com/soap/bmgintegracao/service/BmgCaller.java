package com.soap.bmgintegracao.service;

import com.soap.bmgintegracao.br.bmg.econsig.webservice.LimiteSaqueRetorno;
import com.soap.bmgintegracao.com.bmg.econsig.webservice.*;
import com.soap.bmgintegracao.com.bmg.econsig.webservice.ObtemProdutosDeSeguroParameter;
import com.soap.bmgintegracao.com.bmg.econsig.webservice.ObtemProdutosDeSeguroRetorno;
import com.soap.bmgintegracao.com.bmg.econsig.webservice.ValidaSeJaPossuiContaCartaoParameter;
import com.soap.bmgintegracao.com.bmg.econsig.webservice.ValidaSeJaPossuiContaCartaoRetorno;
import com.soap.bmgintegracao.model.CpfBaseBmgModel;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import com.soap.bmgintegracao.br.bmg.econsig.webservice.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Service
public class BmgCaller {

    Logger logger = LoggerFactory.getLogger(BmgCaller.class);

    @Value("${bmg.user}")
    private String login;

    @Value("${bmg.password}")
    private String password;

    @Value("${bmg.ip}")
    private String ip;

    public List<LimiteSaqueRetorno> buscarLimiteSaque(CpfBaseBmgModel cpfBaseBmgModel){

        List<LimiteSaqueRetorno> list = new ArrayList<>();

        try {

            for(int i = 1; 6 > i; i++ ){

                LimiteSaqueRetorno limiteSaqueRetorno = new LimiteSaqueRetorno();
                DadosCartaoParameter dadosCartaoParameter = new DadosCartaoParameter();

                dadosCartaoParameter.setCpf(cpfBaseBmgModel.getNumeroDocumento());
                dadosCartaoParameter.setCodigoEntidade(Integer.parseInt(cpfBaseBmgModel.getCodigoEntidade()));
                dadosCartaoParameter.setMatricula(cpfBaseBmgModel.getMatricula());
                dadosCartaoParameter.setNumeroContaInterna(Long.parseLong(cpfBaseBmgModel.getNumeroContaInterna()));
                dadosCartaoParameter.setTipoSaque(i);
                dadosCartaoParameter.setSenha(password);
                dadosCartaoParameter.setLogin(login);
                dadosCartaoParameter.setIpUsuario(ip);


                String endpoint =  "https://ws1.bmgconsig.com.br/webservices/SaqueComplementar";

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

                Object[] params = new Object[] { dadosCartaoParameter };

                limiteSaqueRetorno = (LimiteSaqueRetorno) call.invoke("http://webservice.econsig.bmg.com", "buscarLimiteSaque", params );

                list.add(limiteSaqueRetorno);
            }


            logger.error("buscarLimiteSaque: '" + cpfBaseBmgModel.getNumeroDocumento() + "'");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
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
