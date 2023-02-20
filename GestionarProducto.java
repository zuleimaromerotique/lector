
package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.WindowConstants;

public class GestionarProducto extends javax.swing.JFrame {
    
    
        Connection Conexion = null;

    public static final String URL = "jdbc:mysql://localhost:3306/bd";
    public static final String usuario = "root";
    public static final String contraseña = "";

    public static Connection getConnection() {
        Connection Conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection(URL, usuario, contraseña);
            

        } catch (Exception e) {
            System.err.println("e");
        }
        return Conexion;

    }
    //contructor
    public GestionarProducto() {
        initComponents();
     setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnGestionaProducto = new javax.swing.JPanel();
        pnTablaGestionarProducto = new javax.swing.JPanel();
        txtCantidadProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbCantiProducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnEliminarVentas = new javax.swing.JButton();
        lbDerechoAutor = new javax.swing.JLabel();
        lbPrecioProduct = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        btnActualizarVentas = new javax.swing.JButton();
        txtNombProducto = new javax.swing.JTextField();
        lbNombreProducto = new javax.swing.JLabel();
        lbIdProducto = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        lbEstadoProducto = new javax.swing.JLabel();
        txtPrecioProduc = new javax.swing.JTextField();
        lbCategoriapRODUCTO = new javax.swing.JLabel();
        comboCategoProducto = new javax.swing.JComboBox<>();
        chekbEstado = new javax.swing.JCheckBox();
        pnEncabezadoGestionar = new javax.swing.JPanel();
        lbGestioProducto = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnGestionaProducto.setBackground(new java.awt.Color(255, 255, 255));

        pnTablaGestionarProducto.setBackground(new java.awt.Color(255, 255, 255));
        pnTablaGestionarProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnTablaGestionarProducto.setForeground(new java.awt.Color(0, 0, 0));

        txtCantidadProducto.setMinimumSize(new java.awt.Dimension(20, 32));

        lbCantiProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCantiProducto.setText("Cantidad");

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Categoria", "Cantidad", "Precio", "ivan", "Descuento 19%", "Subtotal", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProducto);
        if (tblProducto.getColumnModel().getColumnCount() > 0) {
            tblProducto.getColumnModel().getColumn(1).setResizable(false);
        }

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminarVentas.setText("Eliminar");
        btnEliminarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentasActionPerformed(evt);
            }
        });

        lbDerechoAutor.setText("© Todos los Derechos Reservados 2022");

        lbPrecioProduct.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbPrecioProduct.setText("Precio");

        btnCancelar1.setText("Modificar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnActualizarVentas.setText("Actualizar");
        btnActualizarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarVentasActionPerformed(evt);
            }
        });

        txtNombProducto.setMinimumSize(new java.awt.Dimension(20, 32));
        txtNombProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTablaGestionarProductoLayout = new javax.swing.GroupLayout(pnTablaGestionarProducto);
        pnTablaGestionarProducto.setLayout(pnTablaGestionarProductoLayout);
        pnTablaGestionarProductoLayout.setHorizontalGroup(
            pnTablaGestionarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTablaGestionarProductoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnTablaGestionarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTablaGestionarProductoLayout.createSequentialGroup()
                        .addComponent(lbCantiProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(lbPrecioProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnTablaGestionarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTablaGestionarProductoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(pnTablaGestionarProductoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnTablaGestionarProductoLayout.createSequentialGroup()
                        .addGroup(pnTablaGestionarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDerechoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnTablaGestionarProductoLayout.createSequentialGroup()
                                .addComponent(btnActualizarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(btnEliminarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149)
                                .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(183, 183, 183)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(144, Short.MAX_VALUE))))
            .addGroup(pnTablaGestionarProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnTablaGestionarProductoLayout.setVerticalGroup(
            pnTablaGestionarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTablaGestionarProductoLayout.createSequentialGroup()
                .addGroup(pnTablaGestionarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTablaGestionarProductoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(pnTablaGestionarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPrecioProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnTablaGestionarProductoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbCantiProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnTablaGestionarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTablaGestionarProductoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnTablaGestionarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(lbDerechoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnTablaGestionarProductoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        lbNombreProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbNombreProducto.setText("Nombre");

        lbIdProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbIdProducto.setText("id");

        txtCodigoProducto.setMinimumSize(new java.awt.Dimension(20, 32));

        lbEstadoProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbEstadoProducto.setText("Estado");

        txtPrecioProduc.setMinimumSize(new java.awt.Dimension(20, 32));
        txtPrecioProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProducActionPerformed(evt);
            }
        });

        lbCategoriapRODUCTO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbCategoriapRODUCTO.setText("Categoria");

        chekbEstado.setText("Activo");
        chekbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chekbEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnGestionaProductoLayout = new javax.swing.GroupLayout(pnGestionaProducto);
        pnGestionaProducto.setLayout(pnGestionaProductoLayout);
        pnGestionaProductoLayout.setHorizontalGroup(
            pnGestionaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGestionaProductoLayout.createSequentialGroup()
                .addGroup(pnGestionaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGestionaProductoLayout.createSequentialGroup()
                        .addGroup(pnGestionaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnGestionaProductoLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lbCategoriapRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnGestionaProductoLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lbIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnGestionaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboCategoProducto, 0, 178, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(pnGestionaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEstadoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnGestionaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chekbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnTablaGestionarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnGestionaProductoLayout.setVerticalGroup(
            pnGestionaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGestionaProductoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnGestionaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGestionaProductoLayout.createSequentialGroup()
                        .addGroup(pnGestionaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCategoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnGestionaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnGestionaProductoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lbEstadoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnGestionaProductoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chekbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnGestionaProductoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pnGestionaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCategoriapRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(pnTablaGestionarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnEncabezadoGestionar.setBackground(new java.awt.Color(102, 204, 255));
        pnEncabezadoGestionar.setForeground(new java.awt.Color(0, 0, 0));

        lbGestioProducto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbGestioProducto.setText("Gestionar Productos");

        javax.swing.GroupLayout pnEncabezadoGestionarLayout = new javax.swing.GroupLayout(pnEncabezadoGestionar);
        pnEncabezadoGestionar.setLayout(pnEncabezadoGestionarLayout);
        pnEncabezadoGestionarLayout.setHorizontalGroup(
            pnEncabezadoGestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEncabezadoGestionarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbGestioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(682, Short.MAX_VALUE))
        );
        pnEncabezadoGestionarLayout.setVerticalGroup(
            pnEncabezadoGestionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEncabezadoGestionarLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lbGestioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnGestionaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnEncabezadoGestionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnEncabezadoGestionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(pnGestionaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProducActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProducActionPerformed

    private void txtNombProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombProductoActionPerformed

    private void btnEliminarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarVentasActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void chekbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chekbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chekbEstadoActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnActualizarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarVentasActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarVentas;
    public javax.swing.JButton btnCancelar1;
    public javax.swing.JButton btnEliminarVentas;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JCheckBox chekbEstado;
    public javax.swing.JComboBox<String> comboCategoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbCantiProducto;
    public javax.swing.JLabel lbCategoriapRODUCTO;
    public javax.swing.JLabel lbDerechoAutor;
    public javax.swing.JLabel lbEstadoProducto;
    public javax.swing.JLabel lbGestioProducto;
    public javax.swing.JLabel lbIdProducto;
    public javax.swing.JLabel lbNombreProducto;
    public javax.swing.JLabel lbPrecioProduct;
    public javax.swing.JPanel pnEncabezadoGestionar;
    public javax.swing.JPanel pnGestionaProducto;
    private javax.swing.JPanel pnTablaGestionarProducto;
    public javax.swing.JTable tblProducto;
    public javax.swing.JTextField txtCantidadProducto;
    public javax.swing.JTextField txtCodigoProducto;
    public javax.swing.JTextField txtNombProducto;
    public javax.swing.JTextField txtPrecioProduc;
    // End of variables declaration//GEN-END:variables
}
