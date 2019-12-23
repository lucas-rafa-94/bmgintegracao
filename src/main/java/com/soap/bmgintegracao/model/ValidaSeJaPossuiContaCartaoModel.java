package com.soap.bmgintegracao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ValidaSeJaPossuiContaCartao")
public class ValidaSeJaPossuiContaCartaoModel {
    @Id
    private String numeroDocumento;

    private String excecaoDeRegraDeNegocio;

    private String excecaoGenerica;

    private String mensagemDeErro;

    private String numeroCartao;

    private String numeroInternoConta;

    private String permiteAssociarContaPagamentoCartao;

    public ValidaSeJaPossuiContaCartaoModel() {
    }

    public ValidaSeJaPossuiContaCartaoModel(String numeroDocumento, String excecaoDeRegraDeNegocio, String excecaoGenerica, String numeroCartao, String mensagemDeErro, String numeroInternoConta, String permiteAssociarContaPagamentoCartao) {
        this.numeroDocumento = numeroDocumento;
        this.excecaoDeRegraDeNegocio = excecaoDeRegraDeNegocio;
        this.excecaoGenerica = excecaoGenerica;
        this.numeroCartao = numeroCartao;
        this.mensagemDeErro = mensagemDeErro;
        this.numeroInternoConta = numeroInternoConta;
        this.permiteAssociarContaPagamentoCartao = permiteAssociarContaPagamentoCartao;

    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getExcecaoDeRegraDeNegocio() {
        return excecaoDeRegraDeNegocio;
    }

    public void setExcecaoDeRegraDeNegocio(String excecaoDeRegraDeNegocio) {
        this.excecaoDeRegraDeNegocio = excecaoDeRegraDeNegocio;
    }

    public String getExcecaoGenerica() {
        return excecaoGenerica;
    }

    public void setExcecaoGenerica(String excecaoGenerica) {
        this.excecaoGenerica = excecaoGenerica;
    }

    public String getMensagemDeErro() {
        return mensagemDeErro;
    }

    public void setMensagemDeErro(String mensagemDeErro) {
        this.mensagemDeErro = mensagemDeErro;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroInternoConta() {
        return numeroInternoConta;
    }

    public void setNumeroInternoConta(String numeroInternoConta) {
        this.numeroInternoConta = numeroInternoConta;
    }

    public String getPermiteAssociarContaPagamentoCartao() {
        return permiteAssociarContaPagamentoCartao;
    }

    public void setPermiteAssociarContaPagamentoCartao(String permiteAssociarContaPagamentoCartao) {
        this.permiteAssociarContaPagamentoCartao = permiteAssociarContaPagamentoCartao;
    }
}
