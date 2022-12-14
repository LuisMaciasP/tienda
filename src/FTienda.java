/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drlias
 */
public class FTienda extends javax.swing.JFrame {

    Conexion cnx = new Conexion();
    
    public FTienda() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
        if(cnx.conectar("localhost","store","root","")==1){
            
        }else{
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        BEmpleados = new javax.swing.JToggleButton();
        BProductos = new javax.swing.JToggleButton();
        BClientes = new javax.swing.JToggleButton();
        PFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(188, 161, 220));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("VEKKA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 30, 140, 34);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo1.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 0, 110, 110);

        jLabel3.setText("Sistema de Administraci√≥n");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 70, 350, 16);

        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        buttonGroup1.add(BEmpleados);
        BEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Writer_Male_Light.png"))); // NOI18N
        BEmpleados.setText("Empleados");
        BEmpleados.setFocusable(false);
        BEmpleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BEmpleados.setPreferredSize(new java.awt.Dimension(110, 100));
        BEmpleados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEmpleadosActionPerformed(evt);
            }
        });
        jToolBar1.add(BEmpleados);

        buttonGroup1.add(BProductos);
        BProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/phone_settings_black.png"))); // NOI18N
        BProductos.setText("Productos");
        BProductos.setFocusable(false);
        BProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BProductos.setPreferredSize(new java.awt.Dimension(110, 100));
        BProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProductosActionPerformed(evt);
            }
        });
        jToolBar1.add(BProductos);

        buttonGroup1.add(BClientes);
        BClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clients.png"))); // NOI18N
        BClientes.setText("Clientes");
        BClientes.setFocusable(false);
        BClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BClientes.setPreferredSize(new java.awt.Dimension(110, 100));
        BClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BClientesActionPerformed(evt);
            }
        });
        jToolBar1.add(BClientes);

        PFondo.setBackground(new java.awt.Color(153, 153, 153));
        PFondo.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEmpleadosActionPerformed
        PFondo.removeAll();
        JPEmpleados jpe = new JPEmpleados(cnx);
        PFondo.add(jpe);
        PFondo.updateUI();
    }//GEN-LAST:event_BEmpleadosActionPerformed

    private void BProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BProductosActionPerformed
        PFondo.removeAll();
        JPProductos jpp = new JPProductos(cnx);
        PFondo.add(jpp);
        PFondo.updateUI();
        
    }//GEN-LAST:event_BProductosActionPerformed

    private void BClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BClientesActionPerformed
        PFondo.removeAll();
        JPClientes jpc = new JPClientes(cnx);
        PFondo.add(jpc);
        PFondo.updateUI();
    }//GEN-LAST:event_BClientesActionPerformed

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
            java.util.logging.Logger.getLogger(FTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BClientes;
    private javax.swing.JToggleButton BEmpleados;
    private javax.swing.JToggleButton BProductos;
    private javax.swing.JPanel PFondo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
