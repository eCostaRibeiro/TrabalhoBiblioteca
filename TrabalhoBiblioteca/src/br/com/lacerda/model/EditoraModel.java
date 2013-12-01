/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lacerda.model;

import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class EditoraModel implements Serializable{
    
    private int id_editora;
    private String nome_editora;
    private String CNPJ;
    private String endereco;
    private String site;
    private String eMail;
    private String fone;
    private String observacoes;

    /**
     * @return the id_editora
     */
    public int getId_editora() {
        return id_editora;
    }

    /**
     * @param id_editora the id_editora to set
     */
    public void setId_editora(int id_editora) {
        this.id_editora = id_editora;
    }

    /**
     * @return the nome_editora
     */
    public String getNome_editora() {
        return nome_editora;
    }

    /**
     * @param nome_editora the nome_editora to set
     */
    public void setNome_editora(String nome_editora) {
        this.nome_editora = nome_editora;
    }

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the site
     */
    public String getSite() {
        return site;
    }

    /**
     * @param site the site to set
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    
    
}
