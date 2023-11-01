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
import javax.swing.table.DefaultTableModel;


public class Gestionar_Proveedor extends javax.swing.JFrame {
    String ID = "";
    int idc;
    int ren=0;
    ConexionBD conexion = new ConexionBD();
    Connection conn;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    
    private static Connection con;
    Metodos_sql metodos = new Metodos_sql();
    
    public Gestionar_Proveedor() {
        initComponents();
        this.setLocationRelativeTo(this);
        modelo = (DefaultTableModel) tablaProveedores.getModel();
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
        tablaProveedores = new javax.swing.JTable();
        txtTelefono = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Modificar = new javax.swing.JLabel();
        Limpieza = new javax.swing.JLabel();
        Agregar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        Buscar2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Proveedor = new javax.swing.JLabel();
        Productos = new javax.swing.JLabel();
        Almacen = new javax.swing.JLabel();
        Almacen1 = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nombre", "Telefono", "RFC"
            }
        ));
        tablaProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaProveedores);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 600, 190));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 500, -1));
        jPanel1.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 500, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 500, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("RFC");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, 20));

        Modificar.setText("Editar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 60, 40));

        Limpieza.setText("Limpiar casillas");
        Limpieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiezaMouseClicked(evt);
            }
        });
        jPanel1.add(Limpieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 90, 40));

        Agregar.setText("Agregar");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 50, 40));

        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 60, 40));

        Buscar2.setText("Buscar");
        Buscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buscar2MouseClicked(evt);
            }
        });
        jPanel1.add(Buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 40, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 10, 540));

        jLabel9.setFont(new java.awt.Font("Mshtakan", 0, 36)); // NOI18N
        jLabel9.setText("Gestionar Proveedor");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        txtID.setEditable(false);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 500, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Regresar");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 80, 50));

        Proveedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Proveedor.setText("Gestionar Usuario");
        Proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedorMouseClicked(evt);
            }
        });
        jPanel1.add(Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 60));

        Productos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Productos.setText("Producto");
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
        });
        jPanel1.add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 70, 50));

        Almacen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Almacen.setText("Factura");
        Almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlmacenMouseClicked(evt);
            }
        });
        jPanel1.add(Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, 60));

        Almacen1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Almacen1.setText("Almacen");
        Almacen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Almacen1MouseClicked(evt);
            }
        });
        jPanel1.add(Almacen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Insertar(){
            String Nombre =txtNombre.getText();       
            String Telefono =txtTelefono.getText();
            String RFC =txtRFC.getText();
            try{
                    String sql = "INSERT INTO proveedor (nombre_proveedor,telefono_proveedor,RFC_proveedor)"
                            + "VALUES('" + Nombre + "','" + Telefono + "', '" + RFC  + "')";
                    conn = conexion.conectar();
                    st = conn.createStatement();
                    st.executeUpdate(sql);
                    showMessageDialog(this, "Nueva proveedor registrado");
                    limpiar();

            }catch(Exception error){
                System.out.println("Error en Insetar datos" + error);
            }
            limpiartTxt();
        }//Insertar datos    
        public void MostrarBD() {
            String sql = "SELECT * FROM  Proveedor";
            conn = conexion.conectar();
            System.out.println(sql);
            String[] datos = new String[7];
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
                tablaProveedores.setModel(modelo);
            } catch (SQLException error) {
                System.out.println("Error en Mostrar Tabla" + error);
            }
        }//MostrarDatos
    public void Modificar(){
                String Nombre = txtNombre.getText();          
                String Telefono = txtTelefono.getText();
                String RFC = txtRFC.getText();

                try{
                    
                    if(Nombre.equals("") || Telefono.equals("") || RFC.equals("")) {
                        showMessageDialog(this, "Campos Vacios");
                        limpiartTxt();
                    } else {
                        String sql = "UPDATE Proveedor SET nombre_proveedor = '" + Nombre + "' , RFC_proveedor = '" + RFC + "' , telefono_proveedor = '" + Telefono + "'"
                                + "WHERE  id_proveedor = '" + ID + "'";

                        conn = conexion.conectar();
                        st = conn.createStatement();
                        st.executeUpdate(sql);
                        showMessageDialog(this, "Datos de proveedor modificados");
                    }
                }catch(SQLException error){
                    System.out.println("Error en Modificar (SQL)" + error.getMessage());
                }catch(ArrayIndexOutOfBoundsException error){
                    System.out.println("Error en Modificar (ARRAY)" + error.getMessage());
                }
        }
    public void limpiar() {
        for (int i = 0; i <= tablaProveedores.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    private void limpiartTxt(){
        txtNombre.setText("");
        txtTelefono.setText("");
        txtRFC.setText("");
        txtID.setText("");
    }
public void Eliminar() {
    String ID = txtID.getText();          


    int fila = tablaProveedores.getSelectedRow();
    try {
        if (fila < 0) {
            showMessageDialog(this, "Articulo no seleccionado");
            limpiartTxt();
        } else {
            String sql = "DELETE FROM Proveedor  where id_proveedor = '" + ID + "'";
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
    
    public void Buscar(){
        String nombre = txtNombre.getText();

        try{
            if(nombre.equals("")) {
                showMessageDialog(this, "Campo Vacio");
                limpiartTxt();
            } else {
                String sql = "SELECT * FROM Proveedor WHERE  nombre_proveedor = '" + nombre + "'";
                conn = conexion.conectar();
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                
                while (rs.next()) {
                    txtNombre.setText(rs.getString(2));
                    txtTelefono.setText(rs.getString(3));
                    txtRFC.setText(rs.getString(4));
                }
                
                tablaProveedores.setModel(modelo);
                showMessageDialog(this, "Datos de proveedor encontrados");                
            }
        }catch(SQLException error){
            System.out.println("Error en Buscar (SQL)" + error.getMessage());
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Error en Buscar (ARRAY)" + error.getMessage());
        }
    }
    private void tablaProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresMouseClicked
        int fila = tablaProveedores.getSelectedRow();
        if (fila == -1) {
            showMessageDialog(this, "No se seleccionó ningna fila");
        } else {
            ID = (String) tablaProveedores.getValueAt(fila, 0);
            String Nombre = (String) tablaProveedores.getValueAt(fila, 1);
            String Telefono = (String) tablaProveedores.getValueAt(fila, 2);
            String RFC = (String) tablaProveedores.getValueAt(fila, 3);
            ren = fila;
            
            txtID.setText("" + ID);
            txtNombre.setText("" + Nombre);
            txtTelefono.setText("" + Telefono);
            txtRFC.setText("" + RFC);

        }
    }//GEN-LAST:event_tablaProveedoresMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        Modificar();
        modelo.setRowCount(0);
        MostrarBD();
        limpiartTxt(); 
    }//GEN-LAST:event_ModificarMouseClicked

    private void LimpiezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiezaMouseClicked
        limpiartTxt();
    }//GEN-LAST:event_LimpiezaMouseClicked

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        Insertar();
        MostrarBD();
        limpiartTxt();
    }//GEN-LAST:event_AgregarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        Eliminar();
        modelo.setRowCount(0);
        MostrarBD();
        limpiartTxt();
    }//GEN-LAST:event_EliminarMouseClicked

    private void Buscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar2MouseClicked
        Buscar();
    }//GEN-LAST:event_Buscar2MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Principal v = new Principal();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveedorMouseClicked
        Gestionar_Usuario v = new Gestionar_Usuario();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProveedorMouseClicked

    private void ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseClicked
        Gestionar_Producto v = new Gestionar_Producto();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductosMouseClicked

    private void AlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlmacenMouseClicked
        Gestionar_Factura v = new Gestionar_Factura();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AlmacenMouseClicked

    private void Almacen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Almacen1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Almacen1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestionar_Proveedor().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar;
    private javax.swing.JLabel Almacen;
    private javax.swing.JLabel Almacen1;
    private javax.swing.JLabel Buscar2;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Limpieza;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel Productos;
    private javax.swing.JLabel Proveedor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
