package Formularios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import Clases.ConexionBD;
import Clases.Metodos_sql;
import static Clases.Metodos_sql.Rs;
import static Clases.Metodos_sql.st;
import java.sql.Connection;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Gestionar_Corte extends javax.swing.JFrame {
    
    int idc;
    int ren=0;
    ConexionBD conexion = new ConexionBD();
    Connection conn;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    private static Connection con;
    Metodos_sql metodos = new Metodos_sql();
    
    public Gestionar_Corte() {
        initComponents();
        this.setLocationRelativeTo(this);
        modelo = (DefaultTableModel) tablaCorte.getModel();
        MostrarBD();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtId2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCorte = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCorte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Total", "No_Corte"
            }
        ));
        tablaCorte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCorteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaCorte);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 620, 141));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 440, -1));

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 440, -1));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 440, -1));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Fecha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Saldo Inicial");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("id Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, 20));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/anadir.png"))); // NOI18N
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 40, 40));

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/limpieza.png"))); // NOI18N
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 40, -1));

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("CORTE INICIAL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/devolver.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 70, 60));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 560));

        txtBuscar.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(51, 51, 255));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 410, -1));

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Buscar:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Insertar(){
            String Fecha =txtFecha.getText();       
            String Total =txtTotal.getText();
            String Usuario =txtUser.getText();
            try{
                    String sql = "INSERT INTO corte (fecha_corte,total_corte,Usuario_id_Usuario)"
                            + "VALUES('" + Fecha + "','" + Total + "', '" + Usuario  + "')";
                    conn = conexion.conectar();
                    st = conn.createStatement();
                    st.executeUpdate(sql);
                    showMessageDialog(this, "Nuevo Corte registrado");
                    limpiar();

            }catch(Exception error){
                System.out.println("Error en Insetar datos" + error);
            }
            limpiartTxt();
        }//Insertar datos
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Insertar();
        MostrarBD();
        limpiartTxt();
        
    }//GEN-LAST:event_btnAgregarActionPerformed
    public void MostrarBD() {
        String sql = "SELECT * FROM  Corte";
        conn = conexion.conectar();
        System.out.println(sql);
        String[] datos = new String[5];
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[2] = rs.getString(1);
                datos[0] = rs.getString(2);
                datos[1] = rs.getString(3);

                modelo.addRow(datos);

            }
            tablaCorte.setModel(modelo);
        } catch (SQLException error) {
            System.out.println("Error en Mostrar Tabla" + error);
        }
    }//MostrarDatos
    public void Modificar(){
                String Fecha = txtFecha.getText();          
                String Total = txtTotal.getText();
                String Usuario = txtUser.getText();

                try{
                    
                    if(Fecha.equals("") || Total.equals("") || Usuario.equals("")) {
                        showMessageDialog(this, "Campos Vacios");
                        limpiartTxt();
                    } else {
                        String sql = "UPDATE Corte SET total_corte ='" + Total + "',Usuario_id_Usuario ='" + Usuario + "'" 
                                + "WHERE  fecha_corte = '" + Fecha +"'";

                        conn = conexion.conectar();
                        st = conn.createStatement();
                        st.executeUpdate(sql);
                        showMessageDialog(this, "Datos de Corte modificados");
                    }
                }catch(SQLException error){
                    System.out.println("Error en Modificar (SQL)" + error.getMessage());
                }catch(ArrayIndexOutOfBoundsException error){
                    System.out.println("Error en Modificar (ARRAY)" + error.getMessage());
                }
        }
    public void limpiar() {
        for (int i = 0; i <= tablaCorte.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    public void filtro(String consulta, JTable Tabla){
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        Tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }
    
    private void limpiartTxt(){
        txtFecha.setText("");
        txtTotal.setText("");
        txtUser.setText("");
    }
    public void Eliminar() {
        String Fecha = txtFecha.getText();
        int fila = tablaCorte.getSelectedRow();
        try {
            if (fila < 0) {
                showMessageDialog(this, "Articulo no seleccionado");
                limpiartTxt();
            } else {
                String sql = "DELETE FROM Corte  where fecha_corte = " + Fecha;
                conn = conexion.conectar();
                st = conn.createStatement();
                st.executeUpdate(sql);
                showMessageDialog(this, "Proveedor eliminado");
                limpiar();
                limpiartTxt();
                ren = fila;
            }
        } catch (Exception error) {
            System.out.println("Error en eliminar" + error);
        }
    }
    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        limpiartTxt();
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void tablaCorteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCorteMouseClicked
        int fila = tablaCorte.getSelectedRow();
        if (fila == -1) {
            showMessageDialog(this, "No se seleccionó ningna fila");
        } else {
            String Fecha = (String) tablaCorte.getValueAt(fila, 0);
            String Total = (String) tablaCorte.getValueAt(fila, 1);
            String Usuario = (String) tablaCorte.getValueAt(fila, 2);
            ren = fila;
            
            txtFecha.setText("" + Fecha);
            txtTotal.setText("" + Total);
            txtUser.setText("" + Usuario);

        }
    }//GEN-LAST:event_tablaCorteMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Principal v = new Principal();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
            Insertar();
            MostrarBD();
            limpiartTxt();        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtro(txtBuscar.getText(), tablaCorte);
    }//GEN-LAST:event_txtBuscarKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestionar_Corte().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tablaCorte;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
