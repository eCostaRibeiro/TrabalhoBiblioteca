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
public class LivroModel implements Serializable {

    private int id_livro;
    private String titulo;
    private String data_ed;
    private int edicao;
    private String ISBN;
    private AutorModel autorModel;
    private GeneroModel generoModel;
    private EditoraModel editoraModel;

    /**
     * @return the id_livro
     */
    public int getId_livro() {
        return id_livro;
    }

    /**
     * @param id_livro the id_livro to set
     */
    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the data_ed
     */
    public String getData_ed() {
        return data_ed;
    }

    /**
     * @param data_ed the data_ed to set
     */
    public void setData_ed(String data_ed) {
        this.data_ed = data_ed;
    }

    /**
     * @return the edicao
     */
    public int getEdicao() {
        return edicao;
    }

    /**
     * @param edicao the edicao to set
     */
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public AutorModel getAutorModel() {
        return autorModel;
    }

    public void setAutorModel(AutorModel autorModel) {
        this.autorModel = autorModel;
    }

    public GeneroModel getGeneroModel() {
        return generoModel;
    }

    public void setGeneroModel(GeneroModel generoModel) {
        this.generoModel = generoModel;
    }

    public EditoraModel getEditoraModel() {
        return editoraModel;
    }

    public void setEditoraModel(EditoraModel editoraModel) {
        this.editoraModel = editoraModel;
    }
    
    
}
