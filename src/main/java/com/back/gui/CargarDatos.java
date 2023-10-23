package com.back.gui;

public class CargarDatos extends javax.swing.JFrame {


    public CargarDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jdcRegistro = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbJornada = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtMostrarNombre = new javax.swing.JTextField();
        txtMostrarRegistro = new javax.swing.JTextField();
        txtMostrarApellido = new javax.swing.JTextField();
        txtMostrarJornada = new javax.swing.JTextField();
        txtMostrarDocumento = new javax.swing.JTextField();
        txtMostrarCargo = new javax.swing.JTextField();
        txtMostrarjornada = new javax.swing.JTextField();
        txtMostrarContraseña = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jdcRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 120, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tere's food");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/theresfoodlogo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cargar Datos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jornada");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(102, 153, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wipe-97583_640.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 130, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registro");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        cmbJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Ingreso", "Salida" }));
        jPanel1.add(cmbJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, -1));

        btnGuardar.setBackground(new java.awt.Color(102, 153, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/disc-2029826_640.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 50));

        btnVolver.setText("Volver");
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));
        jPanel1.add(txtMostrarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 100, 30));
        jPanel1.add(txtMostrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 100, 30));
        jPanel1.add(txtMostrarApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 100, 30));
        jPanel1.add(txtMostrarJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 100, -1));
        jPanel1.add(txtMostrarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 100, 30));
        jPanel1.add(txtMostrarCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 100, 30));
        jPanel1.add(txtMostrarjornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 100, 30));
        jPanel1.add(txtMostrarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 100, 30));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbJornada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdcRegistro;
    private javax.swing.JTextField txtMostrarApellido;
    private javax.swing.JTextField txtMostrarCargo;
    private javax.swing.JTextField txtMostrarContraseña;
    private javax.swing.JTextField txtMostrarDocumento;
    private javax.swing.JTextField txtMostrarJornada;
    private javax.swing.JTextField txtMostrarNombre;
    private javax.swing.JTextField txtMostrarRegistro;
    private javax.swing.JTextField txtMostrarjornada;
    // End of variables declaration//GEN-END:variables
}
