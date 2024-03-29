package GUI;

import com.mycompany.inventario.ProcessProducto;
import com.mycompany.inventario.Connection;

public class Venta extends javax.swing.JFrame {

    /**
     * Creates new form Venta
     */
    java.sql.Connection cn;
    int id, cantidad, existencias;
    double valor, acum = 0;
    String idprev, cantidadprev;
    ProcessProducto prodObj = new ProcessProducto();
    
    public Venta() {
        initComponents();
        Connection con = new Connection();
        cn = con.conexionBD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jlMensaje = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ltId = new javax.swing.JTextField();
        jtCantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ventas");

        btnAgregar.setText("Añadir producto");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar compra");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cantidad:");

        jlPrecio.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jlPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlMensaje.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jlMensaje.setForeground(new java.awt.Color(255, 0, 0));
        jlMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ID Producto:");

        jtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCantidadActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TOtal de la compra:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ltId)
                    .addComponent(jtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFinalizar)
                            .addComponent(btnAgregar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jlMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jLabel7)
                    .addContainerGap(300, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jLabel8)
                    .addContainerGap(225, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addComponent(ltId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar)
                .addGap(31, 31, 31)
                .addComponent(jlPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addComponent(jLabel7)
                    .addContainerGap(252, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(327, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(23, 23, 23)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCantidadActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        idprev = ltId.getText();
        cantidadprev = jtCantidad.getText();
        if (idprev.isEmpty() || cantidadprev.isEmpty()){
            jlMensaje.setText("Complete todos los campos para añadir producto");
        }else{
            try{
                jlMensaje.setText("");
                id = Integer.parseInt(idprev);
                cantidad = Integer.parseInt(cantidadprev);
                if (prodObj.verificarProducto(cn, id)){
                    
                    valor = prodObj.venderProducto(cn, id, cantidad);
                    if (valor > 0){
                        acum = acum + valor;
                        jlPrecio.setText(String.valueOf(acum));
                        ltId.setText("");
                        jtCantidad.setText("");
                    }else{
                        existencias = prodObj.retornarExistencias(cn, id);
                        jlMensaje.setText("No se puede vender esa cantidad. existencias: " + String.valueOf(existencias));
                    }
                    
                }else{
                    jlMensaje.setText("El producto no existe");
                }
            }catch(java.lang.NumberFormatException e){
                jlMensaje.setText("Ingresar solo caracteres numericos");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        Principal jframePrincipal = new Principal();
        jframePrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField ltId;
    // End of variables declaration//GEN-END:variables
}
