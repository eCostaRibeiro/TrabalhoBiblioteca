/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lacerda.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class Biblioteca extends javax.swing.JFrame {

    /**
     * Creates new form Biblioteca
     */
    public Biblioteca() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        consultasMenu = new javax.swing.JMenu();
        consLivro = new javax.swing.JMenuItem();
        consAutor = new javax.swing.JMenuItem();
        consGenero = new javax.swing.JMenuItem();
        consEditora = new javax.swing.JMenuItem();
        movimentaMenu = new javax.swing.JMenu();
        fazerEmprestimo = new javax.swing.JMenuItem();
        consEmprestimo = new javax.swing.JMenuItem();
        fazerReserva = new javax.swing.JMenuItem();
        consReserva = new javax.swing.JMenuItem();
        cadastrosMenu = new javax.swing.JMenu();
        cadLivro = new javax.swing.JMenuItem();
        cadAutor = new javax.swing.JMenuItem();
        cadGenero = new javax.swing.JMenuItem();
        cadEditora = new javax.swing.JMenuItem();
        gerenciaMenu = new javax.swing.JMenu();
        menuUsuarios = new javax.swing.JMenu();
        cadUsuario = new javax.swing.JMenuItem();
        consUsuario = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenu();
        cadBibliotecario = new javax.swing.JMenuItem();
        consBibliotecario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        consultasMenu.setMnemonic('e');
        consultasMenu.setText("Consultas");

        consLivro.setMnemonic('t');
        consLivro.setText("Livro");
        consultasMenu.add(consLivro);

        consAutor.setMnemonic('y');
        consAutor.setText("Autor");
        consultasMenu.add(consAutor);

        consGenero.setMnemonic('p');
        consGenero.setText("Gênero");
        consultasMenu.add(consGenero);

        consEditora.setMnemonic('d');
        consEditora.setText("Editora");
        consultasMenu.add(consEditora);

        menuBar.add(consultasMenu);

        movimentaMenu.setMnemonic('h');
        movimentaMenu.setText("Movimentações");

        fazerEmprestimo.setText("Fazer Empréstimo");
        movimentaMenu.add(fazerEmprestimo);

        consEmprestimo.setText("Consultar Empréstimos");
        movimentaMenu.add(consEmprestimo);

        fazerReserva.setMnemonic('c');
        fazerReserva.setText("Fazer Reserva");
        movimentaMenu.add(fazerReserva);

        consReserva.setMnemonic('a');
        consReserva.setText("Cosultar Reserva");
        movimentaMenu.add(consReserva);

        menuBar.add(movimentaMenu);

        cadastrosMenu.setMnemonic('f');
        cadastrosMenu.setText("+ Adicionar");

        cadLivro.setMnemonic('o');
        cadLivro.setText("Livro");
        cadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadLivroActionPerformed(evt);
            }
        });
        cadastrosMenu.add(cadLivro);

        cadAutor.setMnemonic('s');
        cadAutor.setText("Autor");
        cadastrosMenu.add(cadAutor);

        cadGenero.setMnemonic('a');
        cadGenero.setText("Genero");
        cadastrosMenu.add(cadGenero);

        cadEditora.setMnemonic('x');
        cadEditora.setText("Editora");
        cadEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadEditoraActionPerformed(evt);
            }
        });
        cadastrosMenu.add(cadEditora);

        menuBar.add(cadastrosMenu);

        gerenciaMenu.setText("Gerência");

        menuUsuarios.setText("Usuários");

        cadUsuario.setText("Cadastrar");
        menuUsuarios.add(cadUsuario);

        consUsuario.setText("Consultar");
        menuUsuarios.add(consUsuario);

        gerenciaMenu.add(menuUsuarios);

        menuFuncionarios.setText("Funcionários");

        cadBibliotecario.setText("Cadastrar");
        menuFuncionarios.add(cadBibliotecario);

        consBibliotecario.setText("Consultar");
        menuFuncionarios.add(consBibliotecario);

        gerenciaMenu.add(menuFuncionarios);

        menuBar.add(gerenciaMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadEditoraActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cadEditoraActionPerformed

    private void cadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadLivroActionPerformed
        cadLivro tela;
        
        try{
            tela = new cadLivro(this.desktopPane);
            this.desktopPane.add(tela);
            tela.show();
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_cadLivroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadAutor;
    private javax.swing.JMenuItem cadBibliotecario;
    private javax.swing.JMenuItem cadEditora;
    private javax.swing.JMenuItem cadGenero;
    private javax.swing.JMenuItem cadLivro;
    private javax.swing.JMenuItem cadUsuario;
    private javax.swing.JMenu cadastrosMenu;
    private javax.swing.JMenuItem consAutor;
    private javax.swing.JMenuItem consBibliotecario;
    private javax.swing.JMenuItem consEditora;
    private javax.swing.JMenuItem consEmprestimo;
    private javax.swing.JMenuItem consGenero;
    private javax.swing.JMenuItem consLivro;
    private javax.swing.JMenuItem consReserva;
    private javax.swing.JMenuItem consUsuario;
    private javax.swing.JMenu consultasMenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem fazerEmprestimo;
    private javax.swing.JMenuItem fazerReserva;
    private javax.swing.JMenu gerenciaMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFuncionarios;
    private javax.swing.JMenu menuUsuarios;
    private javax.swing.JMenu movimentaMenu;
    // End of variables declaration//GEN-END:variables
}
