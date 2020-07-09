/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.TextPrompt;

/**
 *
 * @author judag
 */
public class frmIngresarProveedor extends javax.swing.JFrame {

    /**
     * Creates new form frmIngresarProveedor
     */
    public frmIngresarProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt placeHolderBuscar = new TextPrompt("Razon Social", txtRazonSocial);        
        TextPrompt placeHolderCorreo = new TextPrompt("Correo", txtCorreo); 
        TextPrompt placeHolderTelefono = new TextPrompt("Telefono", txtTelefono); 
        TextPrompt placeHolderDireccion = new TextPrompt("Direccion", txtDireccion); 
        TextPrompt placeHolderCiudad = new TextPrompt("Representante Legal", txtRepresentanteLegal); 
        TextPrompt placeHolderPais = new TextPrompt("Permiso de Operacion", txtPermisoOperacion);         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtRazonSocial = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtRepresentanteLegal = new javax.swing.JTextField();
        txtPermisoOperacion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IngresarProveedor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(6, 1, 0, 5));

        txtRazonSocial.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRazonSocial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtRazonSocial);

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtCorreo);

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtTelefono);

        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtDireccion);

        txtRepresentanteLegal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRepresentanteLegal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtRepresentanteLegal);

        txtPermisoOperacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPermisoOperacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtPermisoOperacion);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnAceptar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        jPanel3.add(btnAceptar);

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        jPanel3.add(btnCancelar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtPermisoOperacion;
    public javax.swing.JTextField txtRazonSocial;
    public javax.swing.JTextField txtRepresentanteLegal;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
