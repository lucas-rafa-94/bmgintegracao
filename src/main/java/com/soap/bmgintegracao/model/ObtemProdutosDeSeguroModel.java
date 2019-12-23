package com.soap.bmgintegracao.model;


import com.soap.bmgintegracao.com.bmg.econsig.webservice.TipoProdutoSeguro;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ObtemProdutosDeSeguro")
public class ObtemProdutosDeSeguroModel implements Serializable {
    @Id
    private String id;

    private String numeroDocumento;

    private String excecaoDeRegraDeNegocio;

    private String excecaoGenerica;

    private String mensagemDeErro;

    private String tipoDeSeguroCodigo;

    private String tipoDeSeguroDescricao;

    public ObtemProdutosDeSeguroModel() {
    }

    public ObtemProdutosDeSeguroModel(String id, String numeroDocumento, String excecaoDeRegraDeNegocio, String excecaoGenerica, String  mensagemDeErro, String tipoDeSeguroCodigo, String tipoDeSeguroDescricao){
        this.numeroDocumento = numeroDocumento;
        this.excecaoDeRegraDeNegocio = excecaoDeRegraDeNegocio;
        this.excecaoGenerica = excecaoGenerica;
        this.mensagemDeErro = mensagemDeErro;
        this.tipoDeSeguroCodigo = tipoDeSeguroCodigo;
        this.tipoDeSeguroDescricao = tipoDeSeguroDescricao;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTipoDeSeguroCodigo() {
        return tipoDeSeguroCodigo;
    }

    public void setTipoDeSeguroCodigo(String tipoDeSeguroCodigo) {
        this.tipoDeSeguroCodigo = tipoDeSeguroCodigo;
    }

    public String getTipoDeSeguroDescricao() {
        return tipoDeSeguroDescricao;
    }

    public void setTipoDeSeguroDescricao(String tipoDeSeguroDescricao) {
        this.tipoDeSeguroDescricao = tipoDeSeguroDescricao;
    }
}
