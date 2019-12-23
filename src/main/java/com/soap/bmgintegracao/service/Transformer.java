package com.soap.bmgintegracao.service;

import com.soap.bmgintegracao.com.bmg.econsig.webservice.LimiteSaqueRetorno;
import com.soap.bmgintegracao.com.bmg.econsig.webservice.ObtemProdutosDeSeguroRetorno;
import com.soap.bmgintegracao.com.bmg.econsig.webservice.ValidaSeJaPossuiContaCartaoRetorno;
import com.soap.bmgintegracao.model.BuscarLimiteSaqueModel;
import com.soap.bmgintegracao.model.ObtemProdutosDeSeguroModel;
import com.soap.bmgintegracao.model.ValidaSeJaPossuiContaCartaoModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Transformer {
    public List<ObtemProdutosDeSeguroModel> obtemProdutosDeSeguroRetorno2Model(ObtemProdutosDeSeguroRetorno obtemProdutosDeSeguroRetorno, String cpf){
        List<ObtemProdutosDeSeguroModel> list = new ArrayList<>();

        if(obtemProdutosDeSeguroRetorno.getTiposDeSeguro() != null){
            for (int i = 0; obtemProdutosDeSeguroRetorno.getTiposDeSeguro().length < i; i++){
                ObtemProdutosDeSeguroModel obtemProdutosDeSeguroModel = new ObtemProdutosDeSeguroModel();

                obtemProdutosDeSeguroModel.setId(cpf + Integer.toString(obtemProdutosDeSeguroRetorno.getTiposDeSeguro()[i].getCodigoTipoSeguro()));
                obtemProdutosDeSeguroModel.setNumeroDocumento(cpf);
                obtemProdutosDeSeguroModel.setExcecaoDeRegraDeNegocio("false");
                obtemProdutosDeSeguroModel.setExcecaoGenerica("false");
                obtemProdutosDeSeguroModel.setMensagemDeErro(obtemProdutosDeSeguroRetorno.getMensagemDeErro());
                obtemProdutosDeSeguroModel.setTipoDeSeguroCodigo(Integer.toString(obtemProdutosDeSeguroRetorno.getTiposDeSeguro()[i].getCodigoTipoSeguro()));
                obtemProdutosDeSeguroModel.setTipoDeSeguroDescricao(obtemProdutosDeSeguroRetorno.getTiposDeSeguro()[i].getDescricaoProdutoSeguro());

                list.add(obtemProdutosDeSeguroModel);
            }
        }else{
            ObtemProdutosDeSeguroModel obtemProdutosDeSeguroModel = new ObtemProdutosDeSeguroModel();

            obtemProdutosDeSeguroModel.setId(cpf);
            obtemProdutosDeSeguroModel.setNumeroDocumento(cpf);
            obtemProdutosDeSeguroModel.setExcecaoDeRegraDeNegocio("false");
            obtemProdutosDeSeguroModel.setExcecaoGenerica("false");
            obtemProdutosDeSeguroModel.setMensagemDeErro(obtemProdutosDeSeguroRetorno.getMensagemDeErro());
            obtemProdutosDeSeguroModel.setTipoDeSeguroDescricao("Não existente");
            obtemProdutosDeSeguroModel.setTipoDeSeguroCodigo("Não existente");

            list.add(obtemProdutosDeSeguroModel);
        }
        return list;
    }

    public BuscarLimiteSaqueModel buscarLimiteSaqueRetorno2Model(LimiteSaqueRetorno limiteSaqueRetorno, String cpf){

        BuscarLimiteSaqueModel buscarLimiteSaqueModel = new BuscarLimiteSaqueModel();

        buscarLimiteSaqueModel.setNumeroDocumento(cpf);
        buscarLimiteSaqueModel.setMensagemDeErro(limiteSaqueRetorno.getMensagemDeErro());
        buscarLimiteSaqueModel.setExcecaoDeRegraDeNegocio("false");
        buscarLimiteSaqueModel.setExcecaoGenerica("false");
        buscarLimiteSaqueModel.setLimiteCartao(String.valueOf(limiteSaqueRetorno.getLimiteCartao()));
        buscarLimiteSaqueModel.setPermiteAberturaContaPagamento("false");
        buscarLimiteSaqueModel.setValorMargem(String.valueOf(limiteSaqueRetorno.getValorMargem()));
        buscarLimiteSaqueModel.setValorSaqueMaximo(String.valueOf(limiteSaqueRetorno.getValorSaqueMaximo()));
        buscarLimiteSaqueModel.setValorSaqueMinimo(String.valueOf(limiteSaqueRetorno.getValorSaqueMinimo()));
        buscarLimiteSaqueModel.setValorSaqueParaMargemComplementarComAgregacaoDeMargem(String.valueOf(limiteSaqueRetorno.getValorSaqueParaMargemComplementarComAgregacaoDeMargem()));


        return buscarLimiteSaqueModel;
    }

    public ValidaSeJaPossuiContaCartaoModel validaSeJaPossuiContaCartaoRetorno2Model(ValidaSeJaPossuiContaCartaoRetorno validaSeJaPossuiContaCartaoRetorno, String cpf){

        ValidaSeJaPossuiContaCartaoModel validaSeJaPossuiContaCartaoModel = new ValidaSeJaPossuiContaCartaoModel();

        validaSeJaPossuiContaCartaoModel.setNumeroDocumento(cpf);
        validaSeJaPossuiContaCartaoModel.setMensagemDeErro(validaSeJaPossuiContaCartaoRetorno.getMensagemDeErro());
        validaSeJaPossuiContaCartaoModel.setNumeroCartao(validaSeJaPossuiContaCartaoRetorno.getNumeroCartao());
        validaSeJaPossuiContaCartaoModel.setPermiteAssociarContaPagamentoCartao("");
        validaSeJaPossuiContaCartaoModel.setExcecaoGenerica("false");
        validaSeJaPossuiContaCartaoModel.setExcecaoDeRegraDeNegocio("false");
        validaSeJaPossuiContaCartaoModel.setNumeroInternoConta(String.valueOf(validaSeJaPossuiContaCartaoRetorno.getNumeroInternoConta()));


        return validaSeJaPossuiContaCartaoModel;
    }
}
