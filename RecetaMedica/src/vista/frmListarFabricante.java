package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import modelo.TextPrompt;

public class frmListarFabricante extends javax.swing.JFrame {

    public frmListarFabricante() {
        initComponents();
        this.jgdFabricante.getTableHeader().setFont(new Font("Century Gothic", Font.PLAIN, 14));
        JTableHeader cabecera = this.jgdFabricante.getTableHeader();
        cabecera.setOpaque(false);
        cabecera.setBackground(new Color(96, 126, 156));
        cabecera.setForeground(Color.white);
        cabecera.setReorderingAllowed(false);
        this.setLocationRelativeTo(null);
        TextPrompt placeHolderBuscar = new TextPrompt("Ingrese su busqueda", txtBuscar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jspFabricante = new javax.swing.JScrollPane();
        jgdFabricante = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnSeleccionar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ListarFabricante");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jspFabricante.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jgdFabricante.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jgdFabricante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Razon Social", "Correo", "Pais", "Ciudad", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jgdFabricante.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jgdFabricante.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jspFabricante.setViewportView(jgdFabricante);

        jPanel4.add(jspFabricante);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnSeleccionar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        jPanel3.add(btnSeleccionar);

        btnIngresar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        jPanel3.add(btnIngresar);

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        jPanel3.add(btnCancelar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnIngresar;
    public javax.swing.JButton btnSeleccionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTable jgdFabricante;
    public javax.swing.JScrollPane jspFabricante;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}