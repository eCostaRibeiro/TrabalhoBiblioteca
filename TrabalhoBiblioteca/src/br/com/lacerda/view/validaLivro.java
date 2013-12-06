/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lacerda.view;

/**
 *
 * @author Home
 */
class validaLivro {
    private boolean valida;
    
    protected validaLivro(cadLivro janela){
        this.valida = (
                    janela.jCodAutor.getText().isEmpty() &
                    janela.jCodEditora.getText().isEmpty() &
                    janela.jCodLivro.getText().isEmpty() &
                    janela.jCodLivro.getText().isEmpty() &
                    janela.jDataEdicao.getText().isEmpty() &
                    janela.jISBN.getText().isEmpty() &
                    janela.jNumEdicao.getText().isEmpty() &
                    janela.jTitulo.getText().isEmpty() &
                    !janela.jNomeAutor.getText().isEmpty() &
                    !janela.jNomeEditora.getText().isEmpty()
                ) ? false : true;
    }

    public boolean isValida() {
        return valida;
    }
    
    
    
}
