
package vista;

import javax.swing.WindowConstants;


public class Cambiacontraseña extends javax.swing.JFrame {

    public Cambiacontraseña() {
        initComponents();
         setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCambiarContraseña = new javax.swing.JPanel();
        lbCambiarContra = new javax.swing.JLabel();
        lbContraseñaActual = new javax.swing.JLabel();
        lbContraNueva = new javax.swing.JLabel();
        lbContraNueva2 = new javax.swing.JLabel();
        passContraseñaActual = new javax.swing.JPasswordField();
        passContraseñaNueva2 = new javax.swing.JPasswordField();
        passContraseñaNueva = new javax.swing.JPasswordField();
        btnCancelar = new java.awt.Button();
        btnGuardarCambio = new java.awt.Button();
        lbImgCambiarContraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnCambiarContraseña.setBackground(new java.awt.Color(255, 255, 255));

        lbCambiarContra.setBackground(new java.awt.Color(102, 204, 255));
        lbCambiarContra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbCambiarContra.setForeground(new java.awt.Color(0, 0, 0));
        lbCambiarContra.setText("Cambiar Contraseña");

        lbContraseñaActual.setBackground(new java.awt.Color(102, 204, 255));
        lbContraseñaActual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbContraseñaActual.setForeground(new java.awt.Color(0, 0, 0));
        lbContraseñaActual.setText("Contraseña Actual");

        lbContraNueva.setBackground(new java.awt.Color(102, 204, 255));
        lbContraNueva.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbContraNueva.setForeground(new java.awt.Color(0, 0, 0));
        lbContraNueva.setText("Contraseña Nueva");

        lbContraNueva2.setBackground(new java.awt.Color(102, 204, 255));
        lbContraNueva2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbContraNueva2.setForeground(new java.awt.Color(0, 0, 0));
        lbContraNueva2.setText("Contraseña Nueva");

        passContraseñaActual.setText("100876763w");

        passContraseñaNueva2.setText("asewfeg");
        passContraseñaNueva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passContraseñaNueva2ActionPerformed(evt);
            }
        });

        passContraseñaNueva.setText("1344555");

        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCancelar.setLabel("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardarCambio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnGuardarCambio.setLabel("Guardar Cambio");
        btnGuardarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambioActionPerformed(evt);
            }
        });

        lbImgCambiarContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cambiar Contraseña.png"))); // NOI18N

        javax.swing.GroupLayout pnCambiarContraseñaLayout = new javax.swing.GroupLayout(pnCambiarContraseña);
        pnCambiarContraseña.setLayout(pnCambiarContraseñaLayout);
        pnCambiarContraseñaLayout.setHorizontalGroup(
            pnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCambiarContraseñaLayout.createSequentialGroup()
                .addGroup(pnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCambiarContraseñaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbContraNueva2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passContraseñaNueva2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCambiarContraseñaLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnGuardarCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCambiarContraseñaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbContraNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passContraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passContraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnCambiarContraseñaLayout.createSequentialGroup()
                        .addGroup(pnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCambiarContraseñaLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lbImgCambiarContraseña))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCambiarContraseñaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbContraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCambiarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        pnCambiarContraseñaLayout.setVerticalGroup(
            pnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCambiarContraseñaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnCambiarContraseñaLayout.createSequentialGroup()
                        .addComponent(lbImgCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passContraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnCambiarContraseñaLayout.createSequentialGroup()
                        .addComponent(lbCambiarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)))
                .addGap(25, 25, 25)
                .addGroup(pnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passContraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbContraNueva))
                .addGap(31, 31, 31)
                .addGroup(pnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passContraseñaNueva2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbContraNueva2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCambiarContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnCambiarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCambiarContraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passContraseñaNueva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passContraseñaNueva2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passContraseñaNueva2ActionPerformed

    private void btnGuardarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambioActionPerformed
       
    }//GEN-LAST:event_btnGuardarCambioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

   
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cambiacontraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCancelar;
    private java.awt.Button btnGuardarCambio;
    private javax.swing.JLabel lbCambiarContra;
    private javax.swing.JLabel lbContraNueva;
    private javax.swing.JLabel lbContraNueva2;
    private javax.swing.JLabel lbContraseñaActual;
    private javax.swing.JLabel lbImgCambiarContraseña;
    private javax.swing.JPasswordField passContraseñaActual;
    private javax.swing.JPasswordField passContraseñaNueva;
    private javax.swing.JPasswordField passContraseñaNueva2;
    private javax.swing.JPanel pnCambiarContraseña;
    // End of variables declaration//GEN-END:variables
}
