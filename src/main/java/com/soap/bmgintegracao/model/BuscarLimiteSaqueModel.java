package com.soap.bmgintegracao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BuscarLimiteSaque")
public class BuscarLimiteSaqueModel {

    @Id
    private String numeroDocumento;

    private String excecaoDeRegraDeNegocio;

    private String excecaoGenerica;

    private String limiteCartao;

    private String mensagemDeErro;

    private String permiteAberturaContaPagamento;

    private String valorMargem;

    private String valorSaqueMaximo;

    private String valorSaqueMinimo;

    private String valorSaqueParaMargemComplementarComAgregacaoDeMargem;

    public BuscarLimiteSaqueModel(String numeroDocumento, String excecaoDeRegraDeNegocio, String excecaoGenerica, String limiteCartao, String mensagemDeErro, String permiteAberturaContaPagamento, String valorMargem, String valorSaqueMaximo, String valorSaqueMinimo, String valorSaqueParaMargemComplementarComAgregacaoDeMargem) {
        this.numeroDocumento = numeroDocumento;
        this.excecaoDeRegraDeNegocio = excecaoDeRegraDeNegocio;
        this.excecaoGenerica = excecaoGenerica;
        this.limiteCartao = limiteCartao;
        this.mensagemDeErro = mensagemDeErro;
        this.permiteAberturaContaPagamento = permiteAberturaContaPagamento;
        this.valorMargem = valorMargem;
        this.valorSaqueMaximo = valorSaqueMaximo;
        this.valorSaqueMinimo = valorSaqueMinimo;
        this.valorSaqueParaMargemComplementarComAgregacaoDeMargem = valorSaqueParaMargemComplementarComAgregacaoDeMargem;
    }

    public BuscarLimiteSaqueModel() {
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

    public String getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(String limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public String getMensagemDeErro() {
        return mensagemDeErro;
    }

    public void setMensagemDeErro(String mensagemDeErro) {
        this.mensagemDeErro = mensagemDeErro;
    }

    public String getPermiteAberturaContaPagamento() {
        return permiteAberturaContaPagamento;
    }

    public void setPermiteAberturaContaPagamento(String permiteAberturaContaPagamento) {
        this.permiteAberturaContaPagamento = permiteAberturaContaPagamento;
    }

    public String getValorMargem() {
        return valorMargem;
    }

    public void setValorMargem(String valorMargem) {
        this.valorMargem = valorMargem;
    }

    public String getValorSaqueMaximo() {
        return valorSaqueMaximo;
    }

    public void setValorSaqueMaximo(String valorSaqueMaximo) {
        this.valorSaqueMaximo = valorSaqueMaximo;
    }

    public String getValorSaqueMinimo() {
        return valorSaqueMinimo;
    }

    public void setValorSaqueMinimo(String valorSaqueMinimo) {
        this.valorSaqueMinimo = valorSaqueMinimo;
    }

    public String getValorSaqueParaMargemComplementarComAgregacaoDeMargem() {
        return valorSaqueParaMargemComplementarComAgregacaoDeMargem;
    }

    public void setValorSaqueParaMargemComplementarComAgregacaoDeMargem(String valorSaqueParaMargemComplementarComAgregacaoDeMargem) {
        this.valorSaqueParaMargemComplementarComAgregacaoDeMargem = valorSaqueParaMargemComplementarComAgregacaoDeMargem;
    }
}
