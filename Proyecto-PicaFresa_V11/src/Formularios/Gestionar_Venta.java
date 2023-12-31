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


public class Gestionar_Venta extends javax.swing.JFrame {
    
    int idc;
    int ren=0;
    ConexionBD conexion = new ConexionBD();
    Connection conn;
    DefaultTableModel modelo;
    DefaultTableModel modelo2;
    Statement st;
    ResultSet rs;
    
    private static Connection con;
    Metodos_sql metodos = new Metodos_sql();
    
    public Gestionar_Venta() {
        initComponents();
        this.setLocationRelativeTo(this);
        modelo = (DefaultTableModel) tablaVenta.getModel();
        modelo2 = (DefaultTableModel) tablaDetalle.getModel();
        MostrarBD();
        MostrarBDetalle();
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
        tablaVenta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Proveedor = new javax.swing.JLabel();
        Devoluciones = new javax.swing.JLabel();
        Corte = new javax.swing.JLabel();
        Ventas = new javax.swing.JLabel();
        Productos = new javax.swing.JLabel();
        Almacen = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fecha", "Total", "Usuario_Id"
            }
        ));
        tablaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaVenta);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 620, 180));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 10, 600));

        jLabel7.setFont(new java.awt.Font("Mshtakan", 0, 48)); // NOI18N
        jLabel7.setText("Gestionar Venta");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel8.setText("Regresar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 70, 60));

        Proveedor.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Proveedor.setText("Proveedor");
        Proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedorMouseClicked(evt);
            }
        });
        jPanel1.add(Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 60));

        Devoluciones.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Devoluciones.setText("Devoluciones");
        Devoluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DevolucionesMouseClicked(evt);
            }
        });
        jPanel1.add(Devoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 50));

        Corte.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Corte.setText("Corte");
        Corte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorteMouseClicked(evt);
            }
        });
        Corte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CorteKeyPressed(evt);
            }
        });
        jPanel1.add(Corte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, 60));

        Ventas.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Ventas.setText("Realizar Venta");
        Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentasMouseClicked(evt);
            }
        });
        jPanel1.add(Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, 60));

        Productos.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Productos.setText("Producto");
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
        });
        jPanel1.add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 70, 50));

        Almacen.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        Almacen.setText("Almacen");
        Almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlmacenMouseClicked(evt);
            }
        });
        jPanel1.add(Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 70, 60));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 410, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Buscar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 70, 30));

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Venta", "Producto_Id", "Cantidad", "Precio"
            }
        ));
        tablaDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDetalleMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaDetalle);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 620, 150));

        jLabel3.setText("Realizar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 870, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void MostrarBDetalle() {
            String sql = "SELECT * FROM  DetalleVenta";
            conn = conexion.conectar();
            System.out.println(sql);
            String[] datos = new String[5];
            try {
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);

                    modelo2.addRow(datos);

                }
                tablaDetalle.setModel(modelo2);
            } catch (SQLException error) {
                System.out.println("Error en Mostrar Tabla" + error);
            }
        }//MostrarDatos
        public void MostrarBD() {
        String sql = "SELECT * FROM  Venta";
        conn = conexion.conectar();
        System.out.println(sql);
        String[] datos = new String[5];
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);

                modelo.addRow(datos);

            }
            tablaVenta.setModel(modelo);
        } catch (SQLException error) {
            System.out.println("Error en Mostrar Tabla" + error);
        }
    }//MostrarDatos

    private void tablaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentaMouseClicked
        int fila = tablaVenta.getSelectedRow();
        if (fila == -1) {
            showMessageDialog(this, "No se seleccionó ningna fila");
        } else {
            String venta = (String) tablaVenta.getValueAt(fila, 1);
            String fecha = (String) tablaVenta.getValueAt(fila, 2);
            ren = fila;

        }
    }//GEN-LAST:event_tablaVentaMouseClicked

    
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Principal v = new Principal();
        v.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_jLabel8MouseClicked

    private void ProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveedorMouseClicked
        Gestionar_Proveedor v = new Gestionar_Proveedor();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProveedorMouseClicked

    private void DevolucionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevolucionesMouseClicked
        Gestionar_Devoluciones v = new Gestionar_Devoluciones();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DevolucionesMouseClicked

    private void CorteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorteMouseClicked
        Gestionar_Corte v = new Gestionar_Corte();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CorteMouseClicked

    private void CorteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorteKeyPressed

    private void VentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMouseClicked
        Gestionar_Venta v = new Gestionar_Venta();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentasMouseClicked

    private void ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseClicked
        Gestionar_Producto v = new Gestionar_Producto();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductosMouseClicked

    private void AlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlmacenMouseClicked
        Gestionar_Almacen v = new Gestionar_Almacen();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AlmacenMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtro(txtBuscar.getText(), tablaVenta);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tablaDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDetalleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaDetalleMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Realizar_Venta v = new Realizar_Venta();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked
    
    public void filtro(String consulta, JTable Tabla){
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        Tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestionar_Venta().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Almacen;
    private javax.swing.JLabel Corte;
    private javax.swing.JLabel Devoluciones;
    private javax.swing.JLabel Productos;
    private javax.swing.JLabel Proveedor;
    private javax.swing.JLabel Ventas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtId2;
    // End of variables declaration//GEN-END:variables
}
