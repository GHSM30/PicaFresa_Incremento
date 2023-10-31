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


public class Gestionar_Devoluciones extends javax.swing.JFrame {
    String ID = "";
    int idc;
    int ren=0;
    ConexionBD conexion = new ConexionBD();
    Connection conn;
    DefaultTableModel modelo2;
    Statement st;
    ResultSet rs;
    
    private static Connection con;
    Metodos_sql metodos = new Metodos_sql();
    
    public Gestionar_Devoluciones() {
        initComponents();
        this.setLocationRelativeTo(this);
        modelo2 = (DefaultTableModel) tablaDetalle.getModel();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Proveedor = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Corte = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Ventas = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Productos = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        Almacen = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        Eliminar = new javax.swing.JLabel();
        Limpieza = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProductoID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();

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

        jPanel1.setBackground(new java.awt.Color(65, 153, 182));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel7.setText("Gestionar Devoluciones");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/devolver.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 70, 60));

        Proveedor.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/proveedor.png"))); // NOI18N
        Proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedorMouseClicked(evt);
            }
        });
        jPanel1.add(Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 60));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setText("Proveedor");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        Corte.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Corte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/caja-registradora.png"))); // NOI18N
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
        jPanel1.add(Corte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, 60));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel12.setText("Corte");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 50, 20));

        Ventas.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/administracion-del-dinero.png"))); // NOI18N
        Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentasMouseClicked(evt);
            }
        });
        jPanel1.add(Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 70, 60));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setText("Realizar Venta");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 110, 30));

        Productos.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Candy.png"))); // NOI18N
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
        });
        jPanel1.add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 70, 50));

        lblProducto.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblProducto.setText("Producto");
        jPanel1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 70, 20));

        Almacen.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/almacen.png"))); // NOI18N
        Almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlmacenMouseClicked(evt);
            }
        });
        jPanel1.add(Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 70, 60));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel14.setText("Almacen");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 70, 20));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 410, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Buscar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 70, 30));

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

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 680, 220));

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/boton-eliminar.png"))); // NOI18N
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 40, 40));

        Limpieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/limpieza.png"))); // NOI18N
        Limpieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiezaMouseClicked(evt);
            }
        });
        jPanel1.add(Limpieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 40, 40));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        txtID.setEditable(false);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 500, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("ProductoID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));
        jPanel1.add(txtProductoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 500, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Total");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 500, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("Cantidad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, 20));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 500, -1));

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

    private void CorteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorteMouseClicked
        Gestionar_Corte v = new Gestionar_Corte();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CorteMouseClicked

    private void CorteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorteKeyPressed

    private void VentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMouseClicked
        Gestionar_Devoluciones v = new Gestionar_Devoluciones();
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
        filtro(txtBuscar.getText(),tablaDetalle);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tablaDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDetalleMouseClicked
        int fila = tablaDetalle.getSelectedRow();
        if (fila == -1) {
            showMessageDialog(this, "No se seleccionó ningna fila");
        } else {
            ID = (String) tablaDetalle.getValueAt(fila, 0);
            String ProductoID = (String) tablaDetalle.getValueAt(fila, 1);            
            String Cantidad = (String) tablaDetalle.getValueAt(fila, 2);
            String Precio = (String) tablaDetalle.getValueAt(fila, 3);
            ren = fila;
            
            txtID.setText("" + ID);
            txtProductoID.setText("" + ProductoID);
            txtPrecio.setText("" + Precio);
            txtCantidad.setText("" + Cantidad);

        }
    }//GEN-LAST:event_tablaDetalleMouseClicked

    public void limpiar() {
        for (int i = 0; i <= tablaDetalle.getRowCount(); i++) {
            modelo2.removeRow(i);
            i = i - 1;
        }
    }
    
    public void Eliminar() {
        String ID = txtProductoID.getText(); 
        String precio = txtPrecio.getText();
       
        int fila = tablaDetalle.getSelectedRow();
        try{
            if(fila < 0){
                showMessageDialog(this, "Venta no seleccionada");
                limpiartTxt();
            }else{                                             
                String sql = "DELETE FROM DetalleVenta  where Producto_id_producto = '" + ID + "'";
                conn = conexion.conectar();
                st = conn.createStatement();
                st.executeUpdate(sql);
                showMessageDialog(this, "Venta eliminada, su cambio es de: " + precio);
                limpiar();
                limpiartTxt();
                ren = fila;
            }
        }catch(Exception error) {
            System.out.println("Error en eliminar " + error);
        }
    }
    
    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        Eliminar();
        modelo2.setRowCount(0);
        MostrarBDetalle();
        limpiartTxt();
    }//GEN-LAST:event_EliminarMouseClicked

    private void LimpiezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiezaMouseClicked
        limpiartTxt();
    }//GEN-LAST:event_LimpiezaMouseClicked
    private void limpiartTxt(){
        txtProductoID.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
        txtID.setText("");
    }
    public void filtro(String consulta, JTable Tabla){
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        Tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestionar_Devoluciones().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Almacen;
    private javax.swing.JLabel Corte;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Limpieza;
    private javax.swing.JLabel Productos;
    private javax.swing.JLabel Proveedor;
    private javax.swing.JLabel Ventas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProductoID;
    // End of variables declaration//GEN-END:variables
}
