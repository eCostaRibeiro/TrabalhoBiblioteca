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
public class UsuarioModel extends PessoaModel implements Serializable {

    private String preferencias;
    private String data_cadastro;

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
}
