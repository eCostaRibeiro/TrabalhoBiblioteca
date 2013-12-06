/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lacerda.model;

import java.io.Serializable;

/**
 *
 * @author Home
 */
public class ReservaLivroModel implements Serializable {
    private int id_reserva;
    private String data_reserva;
    private String data_cancelamento_reserva;
    private UsuarioModel usuarioModel;
    private VolumeLivroModel volumeModel;

    public String getData_cancelamento_reserva() {
        return data_cancelamento_reserva;
    }

    public void setData_cancelamento_reserva(String data_cancelamento_reserva) {
        this.data_cancelamento_reserva = data_cancelamento_reserva;
    }

    public String getData_reserva() {
        return data_reserva;
    }

    public void setData_reserva(String data_reserva) {
        this.data_reserva = data_reserva;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public UsuarioModel getUsuarioModel() {
        return usuarioModel;
    }

    public void setUsuarioModel(UsuarioModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }

    public VolumeLivroModel getVolumeModel() {
        return volumeModel;
    }

    public void setVolumeModel(VolumeLivroModel volumeModel) {
        this.volumeModel = volumeModel;
    }
    
    
    
    
}
