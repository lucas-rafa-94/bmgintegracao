package com.soap.bmgintegracao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CpfBaseBmg")
public class CpfBaseBmgModel {

    @Id
    private String numeroDocumento;

    private String codigoEntidade;

    private String matricula;

    public CpfBaseBmgModel() {
    }

    public CpfBaseBmgModel(String numeroDocumento, String codigoEntidade, String matricula) {
        this.numeroDocumento = numeroDocumento;
        this.codigoEntidade = codigoEntidade;
        this.matricula = matricula;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCodigoEntidade() {
        return codigoEntidade;
    }

    public void setCodigoEntidade(String codigoEntidade) {
        this.codigoEntidade = codigoEntidade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
