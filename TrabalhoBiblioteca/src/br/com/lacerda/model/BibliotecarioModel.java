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
public class BibliotecarioModel extends PessoaModel implements Serializable {

    private String data_admissao;
    private String CRB;
    private float salario;

    /**
     * @return the data_admissao
     */
    public String getData_admissao() {
        return data_admissao;
    }

    /**
     * @param data_admissao the data_admissao to set
     */
    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    /**
     * @return the CRB
     */
    public String getCRB() {
        return CRB;
    }

    /**
     * @param CRB the CRB to set
     */
    public void setCRB(String CRB) {
        this.CRB = CRB;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
