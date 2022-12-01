/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Contratar {
    String cnpj;
    String nomeEmpresa;
    String prestadorServico;
    String tipoServico;
    String quantidadeHoras;
    String observacoes;
    
    public Contratar() {
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        this.prestadorServico = prestadorServico;
        this.tipoServico = tipoServico;
        this.quantidadeHoras = quantidadeHoras;
        this.observacoes = observacoes;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getPrestadorServico() {
        return prestadorServico;
    }

    public void setPrestadorServico(String prestadorServico) {
        this.prestadorServico = prestadorServico;
    }
    
    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }
    
    public String getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(String quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }
    
    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}