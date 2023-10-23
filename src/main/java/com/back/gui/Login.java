package com.back.gui;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    
    /*
        VARIABLES PUBLICAS PARA ACCEDER DENTRO DE TODO EL PROYECTO
        1.Declaracion de las variables tipo publicas y estaticas (Para su uso en todo el proyecto)
    */
    public static String documentoIngreso;
    public static String password;

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDocumentoIngreso = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnNuevoIngreso = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tere's food");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theresfoodlogo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Documento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        txtDocumentoIngreso.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtDocumentoIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 130, 30));

        txtContraseña.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 120, 30));

        btnNuevoIngreso.setBackground(new java.awt.Color(102, 153, 255));
        btnNuevoIngreso.setText("Nuevo Ingreso");
        btnNuevoIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoIngresoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevoIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 140, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("¿Eres Nuevo?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(102, 153, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*
        METODO PARA SETEAR LOS VALORES A LAS VARIABLES GLOBALES.
        SEGUN LA ACCION DEL BOTON INGRESAR
        1.Guardar datos de los componenetes dentro de las variables locales
        2.Instanciacion del proximo jFrame.
        3.Habilitamos la visibilidad de la interfaz NuevoIngreso,Desabilitamos la visibilidad de esta inferfaz.
        4.Centramos la posicion de la ventana
    */
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        documentoIngreso = txtDocumentoIngreso.getText();
        password = txtContraseña.getText();
        Principal ventana2 =  new Principal();
        ventana2.setVisible(true);
        this.setVisible(false);
        ventana2.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnIngresarActionPerformed

    /*
        METODO PARA SETEAR LOS VALORES A LAS VARIABLES GLOBALES.
        SEGUN LA ACCION DEL BOTON NUEVO INGRESO
        1.Guardar datos de los componenetes dentro de las variables locales
        2.Instanciacion del proximo jFrame.
        3.Habilitamos la visibilidad de la interfaz NuevoIngreso,Desabilitamos la visibilidad de esta inferfaz.
        4.Centramos la posicion de la ventana
    */
    private void btnNuevoIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoIngresoActionPerformed
        documentoIngreso = txtDocumentoIngreso.getText();
        password = txtContraseña.getText();
        NuevoIngreso nuevoIngreso = new NuevoIngreso();
        JOptionPane optionPane = new JOptionPane("Ha iniciado Sesion Correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Inicio de Sesion");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        nuevoIngreso.setVisible(true);
        this.setVisible(false);
        nuevoIngreso.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNuevoIngresoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnNuevoIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDocumentoIngreso;
    // End of variables declaration//GEN-END:variables
}
