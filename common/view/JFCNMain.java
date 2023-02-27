/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CoffeeNET.common.view;

import CoffeeNET.arcade.model.IRepoArcade;
import CoffeeNET.arcade.model.RepoArcadeFile;
import CoffeeNET.camarero.model.IRepoCamarero;
import CoffeeNET.camarero.model.RepoCamareroFile;
import CoffeeNET.camarero.view.JFLoginCamarero;
import CoffeeNET.cliente.model.IRepoCliente;
import CoffeeNET.cliente.model.RepoClienteFile;
import CoffeeNET.cliente.view.JFLoginCliente;
import CoffeeNET.local.model.IRepoLocal;
import CoffeeNET.local.model.RepoLocal;
import CoffeeNET.personal.model.IRepoPersonal;
import CoffeeNET.personal.model.RepoPersonal;
import CoffeeNET.product.model.IRepoProduct;
import CoffeeNET.product.model.RepoProductFile;

/**
 *
 * @author Javier
 */
public class JFCNMain extends javax.swing.JFrame {
    private IRepoArcade repoArcade;
    private IRepoCamarero repoCamarero;
    private IRepoCliente repoCliente;
    private IRepoLocal repoLocal;
    private IRepoPersonal repoPersonal;
    private IRepoProduct repoCarta;
    /**
     * Creates new form JFCNMain
     */
    public JFCNMain() {
        repoArcade = new RepoArcadeFile();
        repoCamarero = new RepoCamareroFile();
        repoCliente = new RepoClienteFile();
        repoLocal = new RepoLocal();
        repoPersonal = new RepoPersonal();
        repoCarta = new RepoProductFile();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCliente = new javax.swing.JButton();
        imageLogo = new javax.swing.JLabel();
        textoBienvenida = new javax.swing.JLabel();
        textoPregunta = new javax.swing.JLabel();
        botonCamarero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonCliente.setText("Cliente");
        botonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClienteActionPerformed(evt);
            }
        });

        imageLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CoffeeNET/common/view/logo.png"))); // NOI18N

        textoBienvenida.setText("¡Bienvenido a CoffeeNET!");

        textoPregunta.setText("¿Quién eres?");

        botonCamarero.setText("Camarero");
        botonCamarero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCamareroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(textoBienvenida)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imageLogo)
                    .addComponent(botonCamarero))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(textoPregunta))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCliente)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoBienvenida)
                .addGap(18, 18, 18)
                .addComponent(textoPregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCamarero)
                    .addComponent(botonCliente))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClienteActionPerformed
        JFLoginCliente jfLogCl = new JFLoginCliente(repoCliente, repoLocal, repoArcade, repoCarta);
        jfLogCl.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonClienteActionPerformed

    private void botonCamareroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCamareroActionPerformed
        JFLoginCamarero jfLogCam = new JFLoginCamarero(repoCamarero, repoCliente);
        jfLogCam.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonCamareroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFCNMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCNMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCNMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCNMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCNMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCamarero;
    private javax.swing.JButton botonCliente;
    private javax.swing.JLabel imageLogo;
    private javax.swing.JLabel textoBienvenida;
    private javax.swing.JLabel textoPregunta;
    // End of variables declaration//GEN-END:variables
}
