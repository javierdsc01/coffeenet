/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CoffeeNET.cliente.view;

import CoffeeNET.arcade.model.IRepoArcade;
import CoffeeNET.cliente.model.Cliente;
import CoffeeNET.cliente.model.IRepoCliente;
import CoffeeNET.common.view.JFCNMain;
import CoffeeNET.local.model.IRepoLocal;
import CoffeeNET.product.model.IRepoProduct;

/**
 *
 * @author Javier
 */
public class JFLoginCliente extends javax.swing.JFrame {
    private IRepoCliente repoCliente;
    private IRepoLocal repoLocal;
    private IRepoArcade repoArcade;
    private IRepoProduct repoCarta;
    private int clienteSelected;

    /**
     * Creates new form JFLoginCliente
     */
    public JFLoginCliente(IRepoCliente repoCliente, IRepoLocal repoLocal, IRepoArcade repoArcade, IRepoProduct repoCarta) {
        this.repoCliente = repoCliente;
        this.repoLocal = repoLocal;
        this.repoArcade = repoArcade;
        this.repoCarta = repoCarta;
        clienteSelected = -1;
        initComponents();
    }

    /**
     * Comprueba que existe un cliente con esas credenciales
     * @return Boolean si es verdadero o no
     */
    public boolean coincidirPassword() {
    	Boolean bRet = false;
    	Cliente intento = new Cliente(campoUsuario.getText(), campoPassword.getText());
        int clientePosible = repoCliente.passwordCheckCliente(intento);
    	if (clientePosible == -1) {
    		System.out.println("Credenciales incorrectas.");
    	} else {
    		System.out.println("Acceso concedido."); 
                clienteSelected = clientePosible;
    		bRet = true;
    	}
    	return bRet;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        textoUsuario = new javax.swing.JLabel();
        textoContraseña = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        botonIniciar = new javax.swing.JButton();
        botonRegistrarUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlResult = new javax.swing.JLabel();
        campoPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Inicia sesión...");

        textoUsuario.setText("Usuario");

        textoContraseña.setText("Contraseña:");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonIniciar.setText("Confirmar");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });

        botonRegistrarUsuario.setText("Crear usuario");
        botonRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("¿Eres nuevo?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(campoPassword)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonIniciar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlResult)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(botonRegistrarUsuario)))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoUsuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoContraseña)
                    .addComponent(campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonIniciar))
                .addGap(18, 18, 18)
                .addComponent(jlResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrarUsuario)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        if (coincidirPassword()){
            jlResult.setText("correcto");
            JFMenuCliente jfMenuCliente = new JFMenuCliente(repoCliente, repoLocal, repoArcade, repoCarta);
            jfMenuCliente.setClienteSelected(clienteSelected);
            jfMenuCliente.setVisible(true);
            dispose();
        } else {
            jlResult.setText("incorrecto");
        }
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        JFCNMain jfMain = new JFCNMain();
        jfMain.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarUsuarioActionPerformed
        JFCreateCliente jfCrear = new JFCreateCliente(repoCliente);
        jfCrear.setVisible(true);
    }//GEN-LAST:event_botonRegistrarUsuarioActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonRegistrarUsuario;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoPassword;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlResult;
    private javax.swing.JLabel textoContraseña;
    private javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables
}