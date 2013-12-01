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
public class MovimentaLivroModel implements Serializable {

    private int id_movimento;
    private String data_retirada;
    private String estado_conservacao;
    private UsuarioModel usuarioModel;
    private VolumeLivroModel volumeLivroModel;

    /**
     * @return the id_movimento
     */
    public int getId_movimento() {
        return id_movimento;
    }

    /**
     * @param id_movimento the id_movimento to set
     */
    public void setId_movimento(int id_movimento) {
        this.id_movimento = id_movimento;
    }

    /**
     * @return the data_retirada
     */
    public String getData_retirada() {
        return data_retirada;
    }

    /**
     * @param data_retirada the data_retirada to set
     */
    public void setData_retirada(String data_retirada) {
        this.data_retirada = data_retirada;
    }

    /**
     * @return the estado_conservacao
     */
    public String getEstado_conservacao() {
        return estado_conservacao;
    }

    /**
     * @param estado_conservacao the estado_conservacao to set
     */
    public void setEstado_conservacao(String estado_conservacao) {
        this.estado_conservacao = estado_conservacao;
    }

    /**
     * @return the usuarioModel
     */
    public UsuarioModel getUsuarioModel() {
        return usuarioModel;
    }

    /**
     * @param usuarioModel the usuarioModel to set
     */
    public void setUsuarioModel(UsuarioModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }

    /**
     * @return the volumeLivroModel
     */
    public VolumeLivroModel getVolumeLivroModel() {
        return volumeLivroModel;
    }

    /**
     * @param volumeLivroModel the volumeLivroModel to set
     */
    public void setVolumeLivroModel(VolumeLivroModel volumeLivroModel) {
        this.volumeLivroModel = volumeLivroModel;
    }
}
