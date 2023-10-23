package com.back.gui;

import com.back.model.Controladora;
import com.back.model.Usuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

    //Instanciacion de la controladora de la logica
    Controladora control = null;
    
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ver Datos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Datos Usuario");

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash-97586_640 pequeña.png"))); // NOI18N
        btnBorrar.setText("Eliminar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-1103599_640-pequeña.png"))); // NOI18N
        jButton2.setText("Editar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(btnBorrar)
                .addGap(68, 68, 68)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBorrar)
                        .addComponent(jButton2)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 820, 490));

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
        Metodo por evento al momento de cargar el jframe
    */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    //Buscar el elemento de la tabla 
    /*
        1.Control de la tabla no este vacia,control que se halla seleccionada un registro
        2.Obtener el id
            2.1 Trae y asigna al id_usuario el valor en la tabla mascota de la fila seleccionada
            2.2 Conviertelo a string y luego a int
            3.3 Uso del metodo para borrar el campo
        3. Aviso
    */
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if(tablaUsuarios.getRowCount() > 0) {
            if(tablaUsuarios.getSelectedRow()!=-1){
                
                int id_usuario = Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(),0)));
                control.borrarUsuario(id_usuario);
                
                mostratMensaje("Usuario Eliminado Correctamente", "Info" , "Borrar Usuario");
            }
            else {
                mostratMensaje("No selecciono ningun Usuario", "error", "Error al eliminar");
            }
        }
        else{
            mostratMensaje("No hay registros en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    /*
        Metodo para mostrar un mensaje
    */
    public void mostratMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if (tipo.equals("error")) {
            optionPane.setMessage(JOptionPane.ERROR);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables

    /*
        Metodo para cargar la modeloTabla
        1.Intancias clase para definir la visualizacion de la modeloTabla
        2.No permitir que las filas y columnas sean editables por el usuario
        3.Creacion de columnas personalizadas
        4.Cargar los datos de la DB a la interfaz
            4.1 Creacion de un vector que guardar los datos
            4.2 Uso de metodo para traer estos datos de la base de datos. 
        5. Recorre el vector y obtener los datos
            5.1 Con el condiciona if verificamos que la lista no este vacia
            5.2 Con una sentencia ForEach creamos un nuevo objeto que almacene los valores
            5.3Agregamos los valores al objeto
    
    */
    private void cargarTabla() {
        
        //Definir el modelo que queremos que tenga la modeloTabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            //Filas y columnas no editables
            @Override
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };
        
        //Establecer la columnas (Titulos) por medio de vector
        String titulos[] = {"id", "Nombre", "Apellido", "Documento", "Cargo","Jornada", "Horario" };
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Cargar datos de la base de datos
        List <Usuario> listaUsuarios = control.traerUsuarios();
        
        
        //Recorrer la lista y mostrar los elementos en la modeloTabla
        if(listaUsuarios!=null){
            for (Usuario user : listaUsuarios) {
                Object[] objeto = {user.getId_usuario(),user.getNombre(),user.getApellido(),
                user.getDocumento(),user.getCargo(), user.getHorario().getJornada(), user.getHorario().getHorario()};
                
                modeloTabla.addRow(objeto);
            }
        }
        //Asignacion de los resultados a la modeloTabla de la interfaz
        tablaUsuarios.setModel(modeloTabla);
    }
}
