
package vista;

import javax.swing.WindowConstants;

public class CerrarSecion extends javax.swing.JFrame {

    VistaLogin menu = new VistaLogin();
    public CerrarSecion() {
        initComponents();
         setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCerarSecion = new javax.swing.JPanel();
        lbSeguroquieresalir = new javax.swing.JLabel();
        lbcerrasecion = new javax.swing.JLabel();
        btnNoCerarSecion = new javax.swing.JButton();
        btnSiCerrarsecion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnCerarSecion.setBackground(new java.awt.Color(255, 255, 255));
        pnCerarSecion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnCerarSecion.setForeground(new java.awt.Color(0, 0, 0));
        pnCerarSecion.setFocusCycleRoot(true);

        lbSeguroquieresalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbSeguroquieresalir.setForeground(new java.awt.Color(0, 0, 0));
        lbSeguroquieresalir.setText("¿Seguro quiere Cerrar Secion?");
        lbSeguroquieresalir.setFocusCycleRoot(true);

        lbcerrasecion.setBackground(new java.awt.Color(255, 255, 255));
        lbcerrasecion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbcerrasecion.setForeground(new java.awt.Color(0, 0, 0));
        lbcerrasecion.setText("Cerrar Secion");
        lbcerrasecion.setFocusCycleRoot(true);

        btnNoCerarSecion.setBackground(new java.awt.Color(255, 255, 255));
        btnNoCerarSecion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnNoCerarSecion.setForeground(new java.awt.Color(0, 0, 0));
        btnNoCerarSecion.setText("No");
        btnNoCerarSecion.setFocusCycleRoot(true);
        btnNoCerarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoCerarSecionActionPerformed(evt);
            }
        });

        btnSiCerrarsecion.setBackground(new java.awt.Color(255, 255, 255));
        btnSiCerrarsecion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSiCerrarsecion.setForeground(new java.awt.Color(0, 0, 0));
        btnSiCerrarsecion.setText("Si");
        btnSiCerrarsecion.setFocusCycleRoot(true);
        btnSiCerrarsecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiCerrarsecionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCerarSecionLayout = new javax.swing.GroupLayout(pnCerarSecion);
        pnCerarSecion.setLayout(pnCerarSecionLayout);
        pnCerarSecionLayout.setHorizontalGroup(
            pnCerarSecionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCerarSecionLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(lbcerrasecion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnCerarSecionLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lbSeguroquieresalir, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCerarSecionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNoCerarSecion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(pnCerarSecionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnCerarSecionLayout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(btnSiCerrarsecion, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(249, Short.MAX_VALUE)))
        );
        pnCerarSecionLayout.setVerticalGroup(
            pnCerarSecionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCerarSecionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbcerrasecion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lbSeguroquieresalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btnNoCerarSecion)
                .addGap(73, 73, 73))
            .addGroup(pnCerarSecionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCerarSecionLayout.createSequentialGroup()
                    .addContainerGap(180, Short.MAX_VALUE)
                    .addComponent(btnSiCerrarsecion)
                    .addGap(74, 74, 74)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCerarSecion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCerarSecion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoCerarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoCerarSecionActionPerformed
    
    }//GEN-LAST:event_btnNoCerarSecionActionPerformed

    private void btnSiCerrarsecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiCerrarsecionActionPerformed
      
            System.exit(0);
     
    }//GEN-LAST:event_btnSiCerrarsecionActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CerrarSecion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnNoCerarSecion;
    public javax.swing.JButton btnSiCerrarsecion;
    public javax.swing.JLabel lbSeguroquieresalir;
    public javax.swing.JLabel lbcerrasecion;
    private javax.swing.JPanel pnCerarSecion;
    // End of variables declaration//GEN-END:variables
}
