/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import modelo.TextPrompt;

/**
 *
 * @author judag
 */
public class frmIngresarReceta extends javax.swing.JFrame {

    /**
     * Creates new form frmIngresarReceta
     */
    public frmIngresarReceta() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.jgdPaciente.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 14));
        this.jgdIndicacionGeneral.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 14));
        this.jgdIndicacion.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 14));
        
        JTableHeader cabeceraPaciente = this.jgdPaciente.getTableHeader();
        cabeceraPaciente.setOpaque(false);
        cabeceraPaciente.setBackground(new Color(96, 126, 156));
        cabeceraPaciente.setForeground(Color.white);
        cabeceraPaciente.setReorderingAllowed(false);

        JTableHeader cabeceraIndicacionGeneral = this.jgdIndicacionGeneral.getTableHeader();
        cabeceraIndicacionGeneral.setOpaque(false);
        cabeceraIndicacionGeneral.setBackground(new Color(96, 126, 156));
        cabeceraIndicacionGeneral.setForeground(Color.white);
        cabeceraIndicacionGeneral.setReorderingAllowed(false);

        JTableHeader cabeceraIndicacion = this.jgdIndicacion.getTableHeader();
        cabeceraIndicacion.setOpaque(false);
        cabeceraIndicacion.setBackground(new Color(96, 126, 156));
        cabeceraIndicacion.setForeground(Color.white);
        cabeceraIndicacion.setReorderingAllowed(false);

        TextPrompt placeHolderBuscarPaciente = new TextPrompt("Ingrese su busqueda", txtBuscarPaciente);
        TextPrompt placeHolderBuscarIndicacionGeneral = new TextPrompt("Ingrese su busqueda", txtBuscarIndicacionGeneral);
        TextPrompt placeHolderBuscarIndicacion = new TextPrompt("Ingrese su busqueda", txtBuscarIndicacion);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarPaciente = new javax.swing.JTextField();
        jspPaciente = new javax.swing.JScrollPane();
        jgdPaciente = new javax.swing.JTable();
        dtpFechaEmision = new com.toedter.calendar.JDateChooser();
        lblFechaEmision = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtBuscarIndicacionGeneral = new javax.swing.JTextField();
        jspIndicacionGeneral = new javax.swing.JScrollPane();
        jgdIndicacionGeneral = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnIngresarIndicacionGeneral = new javax.swing.JButton();
        btnModificarIndicacionGeneral = new javax.swing.JButton();
        btnEliminarIndicacionGeneral = new javax.swing.JButton();
        pnlIndicacion = new javax.swing.JPanel();
        txtBuscarIndicacion = new javax.swing.JTextField();
        jspIndicacion = new javax.swing.JScrollPane();
        jgdIndicacion = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnIngresarIndicacion = new javax.swing.JButton();
        btnModificarIndicacion = new javax.swing.JButton();
        btnEliminarIndicacion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("frmIngresarReceta");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscarPaciente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBuscarPaciente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jspPaciente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jgdPaciente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jgdPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cedula", "Nombre", "Direccion", "Telefono", "Fecha de Nacimiento", "Nacionalidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jgdPaciente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jgdPaciente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jgdPaciente.setShowGrid(true);
        jspPaciente.setViewportView(jgdPaciente);
        if (jgdPaciente.getColumnModel().getColumnCount() > 0) {
            jgdPaciente.getColumnModel().getColumn(0).setResizable(false);
            jgdPaciente.getColumnModel().getColumn(1).setResizable(false);
            jgdPaciente.getColumnModel().getColumn(2).setResizable(false);
            jgdPaciente.getColumnModel().getColumn(3).setResizable(false);
            jgdPaciente.getColumnModel().getColumn(4).setResizable(false);
            jgdPaciente.getColumnModel().getColumn(5).setResizable(false);
            jgdPaciente.getColumnModel().getColumn(6).setResizable(false);
        }

        dtpFechaEmision.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        lblFechaEmision.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblFechaEmision.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaEmision.setText("Fecha de emision");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jspPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                        .addComponent(txtBuscarPaciente))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtpFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaEmision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dtpFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos Receta", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscarIndicacionGeneral.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBuscarIndicacionGeneral.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jspIndicacionGeneral.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jgdIndicacionGeneral.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jgdIndicacionGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Concepto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jgdIndicacionGeneral.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jgdIndicacionGeneral.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jgdIndicacionGeneral.setShowGrid(true);
        jspIndicacionGeneral.setViewportView(jgdIndicacionGeneral);
        if (jgdIndicacionGeneral.getColumnModel().getColumnCount() > 0) {
            jgdIndicacionGeneral.getColumnModel().getColumn(0).setResizable(false);
            jgdIndicacionGeneral.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btnIngresarIndicacionGeneral.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnIngresarIndicacionGeneral.setText("Ingresar");
        jPanel6.add(btnIngresarIndicacionGeneral);

        btnModificarIndicacionGeneral.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnModificarIndicacionGeneral.setText("Modificar");
        jPanel6.add(btnModificarIndicacionGeneral);

        btnEliminarIndicacionGeneral.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEliminarIndicacionGeneral.setText("Eliminar");
        jPanel6.add(btnEliminarIndicacionGeneral);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarIndicacionGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jspIndicacionGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarIndicacionGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspIndicacionGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Indicaciones Generales", jPanel2);

        pnlIndicacion.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscarIndicacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBuscarIndicacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jspIndicacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jgdIndicacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jgdIndicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Medicamento", "Dosis", "Dias Tratamiento", "Frecuencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jgdIndicacion.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jgdIndicacion.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jgdIndicacion.setShowGrid(true);
        jspIndicacion.setViewportView(jgdIndicacion);
        if (jgdIndicacion.getColumnModel().getColumnCount() > 0) {
            jgdIndicacion.getColumnModel().getColumn(0).setResizable(false);
            jgdIndicacion.getColumnModel().getColumn(1).setResizable(false);
            jgdIndicacion.getColumnModel().getColumn(2).setResizable(false);
            jgdIndicacion.getColumnModel().getColumn(3).setResizable(false);
            jgdIndicacion.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btnIngresarIndicacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnIngresarIndicacion.setText("Ingresar");
        jPanel7.add(btnIngresarIndicacion);

        btnModificarIndicacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnModificarIndicacion.setText("Modificar");
        jPanel7.add(btnModificarIndicacion);

        btnEliminarIndicacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEliminarIndicacion.setText("Eliminar");
        jPanel7.add(btnEliminarIndicacion);

        javax.swing.GroupLayout pnlIndicacionLayout = new javax.swing.GroupLayout(pnlIndicacion);
        pnlIndicacion.setLayout(pnlIndicacionLayout);
        pnlIndicacionLayout.setHorizontalGroup(
            pnlIndicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIndicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIndicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlIndicacionLayout.createSequentialGroup()
                        .addGroup(pnlIndicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarIndicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jspIndicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlIndicacionLayout.setVerticalGroup(
            pnlIndicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIndicacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscarIndicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspIndicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Indicaciones", pnlIndicacion);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnAceptar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        jPanel5.add(btnAceptar);

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        jPanel5.add(btnCancelar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    public javax.swing.JButton btnEliminarIndicacion;
    public javax.swing.JButton btnEliminarIndicacionGeneral;
    public javax.swing.JButton btnIngresarIndicacion;
    public javax.swing.JButton btnIngresarIndicacionGeneral;
    public javax.swing.JButton btnModificarIndicacion;
    public javax.swing.JButton btnModificarIndicacionGeneral;
    public com.toedter.calendar.JDateChooser dtpFechaEmision;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jgdIndicacion;
    public javax.swing.JTable jgdIndicacionGeneral;
    public javax.swing.JTable jgdPaciente;
    public javax.swing.JScrollPane jspIndicacion;
    public javax.swing.JScrollPane jspIndicacionGeneral;
    public javax.swing.JScrollPane jspPaciente;
    private javax.swing.JLabel lblFechaEmision;
    public javax.swing.JPanel pnlIndicacion;
    public javax.swing.JTextField txtBuscarIndicacion;
    public javax.swing.JTextField txtBuscarIndicacionGeneral;
    public javax.swing.JTextField txtBuscarPaciente;
    // End of variables declaration//GEN-END:variables
}
