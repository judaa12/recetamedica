/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Toolkit;

/**
 *
 * @author judag
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("coronavirus.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jmbMenu = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmiAcercaDe = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jmIngreso = new javax.swing.JMenu();
        jmiReceta = new javax.swing.JMenuItem();
        jmInventario = new javax.swing.JMenu();
        jmiIngreso = new javax.swing.JMenuItem();
        jmiEgreso = new javax.swing.JMenuItem();
        jmiMedicamento = new javax.swing.JMenuItem();
        jmiProveedor = new javax.swing.JMenuItem();
        jmiFabricante = new javax.swing.JMenuItem();
        jmReporte = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receta");
        setPreferredSize(new java.awt.Dimension(800, 600));

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(221, 24, 24));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        jmbMenu.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jmArchivo.setText("Archivo");
        jmArchivo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jmiAcercaDe.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jmiAcercaDe.setText("Acerca de");
        jmArchivo.add(jmiAcercaDe);

        jmiSalir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jmiSalir.setText("Salir");
        jmArchivo.add(jmiSalir);

        jmbMenu.add(jmArchivo);

        jmIngreso.setText("Ingreso");
        jmIngreso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jmiReceta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jmiReceta.setText("Receta");
        jmIngreso.add(jmiReceta);

        jmInventario.setText("Inventario");
        jmInventario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jmiIngreso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jmiIngreso.setText("Ingreso");
        jmiIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIngresoActionPerformed(evt);
            }
        });
        jmInventario.add(jmiIngreso);

        jmiEgreso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jmiEgreso.setText("Egreso");
        jmiEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEgresoActionPerformed(evt);
            }
        });
        jmInventario.add(jmiEgreso);

        jmIngreso.add(jmInventario);

        jmiMedicamento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jmiMedicamento.setText("Medicamento");
        jmIngreso.add(jmiMedicamento);

        jmiProveedor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jmiProveedor.setText("Proveedor");
        jmiProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProveedorActionPerformed(evt);
            }
        });
        jmIngreso.add(jmiProveedor);

        jmiFabricante.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jmiFabricante.setText("Fabricante");
        jmIngreso.add(jmiFabricante);

        jmbMenu.add(jmIngreso);

        jmReporte.setText("Reporte");
        jmReporte.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jmbMenu.add(jmReporte);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiIngresoActionPerformed

    private void jmiEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEgresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiEgresoActionPerformed

    private void jmiProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiProveedorActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmIngreso;
    private javax.swing.JMenu jmInventario;
    private javax.swing.JMenu jmReporte;
    private javax.swing.JMenuBar jmbMenu;
    public javax.swing.JMenuItem jmiAcercaDe;
    public javax.swing.JMenuItem jmiEgreso;
    public javax.swing.JMenuItem jmiFabricante;
    public javax.swing.JMenuItem jmiIngreso;
    public javax.swing.JMenuItem jmiMedicamento;
    public javax.swing.JMenuItem jmiProveedor;
    public javax.swing.JMenuItem jmiReceta;
    public javax.swing.JMenuItem jmiSalir;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
