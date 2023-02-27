/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CoffeeNET.cliente.view;

import CoffeeNET.cliente.model.Cliente;
import CoffeeNET.cliente.model.IRepoCliente;
import static CoffeeNET.cliente.view.VClienteCrear.pedirDatosSinPunto;
import CoffeeNET.common.view.JFRealizado;

/**
 *
 * @author Javier
 */
public class JFCreateCliente extends javax.swing.JFrame {
    private IRepoCliente repoCliente;

    /**
     * Creates new form JFLoginCliente
     */
    public JFCreateCliente(IRepoCliente repoCliente) {
        this.repoCliente = repoCliente;
        initComponents();
    }

    /**
     * Metodo para crear el cliente para el cliente.
     * @return boolean Devuelve que se haya hecho correctamente.
     */
    public boolean crearForCliente() {
        boolean bRet = false;
        Cliente c = new Cliente(campoId.getText(), campoUsuario.getText(), campoSexo.getText(), Integer.parseInt(campoEdad.getText()), campoPassword.getText());
        if (c == null) {
            System.out.println("No se ha creado el cliente");
        } else {
            repoCliente.create(c);
            System.out.println("Se ha creado el cliente");
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

        textoCreate = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        textoUsuario = new javax.swing.JLabel();
        textoContraseña = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        botonIniciar = new javax.swing.JButton();
        campoId = new javax.swing.JTextField();
        textoIntroduceID = new javax.swing.JLabel();
        jlResult = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoSexo = new javax.swing.JTextField();
        jLabelEdad = new javax.swing.JLabel();
        campoEdad = new javax.swing.JTextField();
        campoPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        textoCreate.setText("Creando cliente...");

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

        textoIntroduceID.setText("Nombre:");

        jLabel1.setText("Sexo (M o F):");

        jLabelEdad.setText("Edad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoCreate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                                .addComponent(botonIniciar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlResult)
                                    .addComponent(textoIntroduceID))
                                .addGap(18, 18, 18)
                                .addComponent(campoId)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoSexo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelEdad)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoEdad))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoContraseña))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoPassword))))
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(textoCreate)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoIntroduceID)
                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(campoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUsuario)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEdad)
                    .addComponent(campoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoContraseña)
                    .addComponent(campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jlResult)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonIniciar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
    if(crearForCliente()){
        jlResult.setText("Datos almacenados correctamente");
    } else jlResult.setText("Ha habido un error");
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_botonVolverActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoEdad;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoPassword;
    private javax.swing.JTextField campoSexo;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jlResult;
    private javax.swing.JLabel textoContraseña;
    private javax.swing.JLabel textoCreate;
    private javax.swing.JLabel textoIntroduceID;
    private javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables
}
