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
public class frmModificarIndicacion extends javax.swing.JFrame {

    /**
     * Creates new form frmModificarIndicacion
     */
    public frmModificarIndicacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt placeHolderDosis = new TextPrompt("Dosis", txtDosis);        
        TextPrompt placeHolderDiasTratamiento = new TextPrompt("Dias de Tratamiento", txtDiasTratamiento); 
        TextPrompt placeHolderFrecuencia = new TextPrompt("Frecuencia", txtFrecuencia);          
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
        txtDosis = new javax.swing.JTextField();
        txtDiasTratamiento = new javax.swing.JTextField();
        txtFrecuencia = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jspMedicamento = new javax.swing.JScrollPane();
        jgdMedicamento = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ModificarIndicacion");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        txtDosis.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDosis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtDosis);

        txtDiasTratamiento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtDiasTratamiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtDiasTratamiento);

        txtFrecuencia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFrecuencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtFrecuencia);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout());

        jspMedicamento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jgdMedicamento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jgdMedicamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre Comercial", "Precio Venta", "Activo", "Fecha Creacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jgdMedicamento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jgdMedicamento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jspMedicamento.setViewportView(jgdMedicamento);

        jPanel4.add(jspMedicamento);

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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTable jgdMedicamento;
    public javax.swing.JScrollPane jspMedicamento;
    public javax.swing.JTextField txtDiasTratamiento;
    public javax.swing.JTextField txtDosis;
    public javax.swing.JTextField txtFrecuencia;
    // End of variables declaration//GEN-END:variables
}
