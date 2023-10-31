package Formularios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Clases.ConexionBD;
import Clases.Metodos_sql;
import java.sql.Connection;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Gestionar_Almacen extends javax.swing.JFrame {
    
    int idc;
    int ren=0;
    ConexionBD conexion = new ConexionBD();
    Connection conn;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int id = 0;
    
    private static Connection con;
    Metodos_sql metodos = new Metodos_sql();
    
    public Gestionar_Almacen() {
        initComponents();
        this.setLocationRelativeTo(this);
        modelo = (DefaultTableModel) tablaAlmacen.getModel();
        MostrarBD();
        llenarCmbProveedor();
        cmbFactura.setEnabled(false);
        cmbProducto.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAlmacen = new javax.swing.JTable();
        txtExistencias = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Agregar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        Modificar = new javax.swing.JLabel();
        Limpieza = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Proveedor = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Devoluciones = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Corte = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Ventas = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Productos = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        Almacen = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbProducto = new javax.swing.JComboBox<>();
        cmbFactura = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox<>();
        lblFacturas = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(65, 153, 182));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inicio de sesion como");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 150, -1));

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 172, 16));

        tablaAlmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Existencias", "Fecha Llegada", "Fecha Caducidad", "Factura", "Proveedor"
            }
        ));
        tablaAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlmacenMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaAlmacen);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 600, 240));
        jPanel1.add(txtExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 380, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Factura");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 70, 20));

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregar-usuario.png"))); // NOI18N
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, -1, 40));

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/boton-eliminar.png"))); // NOI18N
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 40, 40));

        Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editar.png"))); // NOI18N
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 40, 40));

        Limpieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/limpieza.png"))); // NOI18N
        Limpieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiezaMouseClicked(evt);
            }
        });
        jPanel1.add(Limpieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, 40, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 10, 620));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/devolver.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 70, 60));

        Proveedor.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/proveedor.png"))); // NOI18N
        Proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedorMouseClicked(evt);
            }
        });
        jPanel1.add(Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Proveedor");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        Devoluciones.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Devoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reemplazo.png"))); // NOI18N
        Devoluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DevolucionesMouseClicked(evt);
            }
        });
        jPanel1.add(Devoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 50));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Devoluciones");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 20));

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
        jPanel1.add(Corte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, 60));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel12.setText("Corte");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 50, 20));

        Ventas.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/administracion-del-dinero.png"))); // NOI18N
        Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentasMouseClicked(evt);
            }
        });
        jPanel1.add(Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, 60));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setText("Venta");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 50, 20));

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
        jPanel1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 60, 20));

        Almacen.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Almacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/almacen.png"))); // NOI18N
        Almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlmacenMouseClicked(evt);
            }
        });
        jPanel1.add(Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 70, 60));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("Almacen");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 70, 20));

        jPanel1.add(cmbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 380, -1));

        jPanel1.add(cmbFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 380, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Existencias");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Mshtakan", 0, 48)); // NOI18N
        jLabel11.setText("Gestionar Almacen");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 0, 440, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Producto");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 70, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Proveedor");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 100, -1));

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONAR-" }));
        cmbProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProveedorItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 380, -1));

        lblFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Factura.png"))); // NOI18N
        lblFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFacturasMouseClicked(evt);
            }
        });
        jPanel1.add(lblFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 60, 50));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel19.setText("Facturas");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 70, 20));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 410, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Insertar(){
        String[] idProducto = cmbProducto.getSelectedItem().toString().split(" ");   
        String[] idFactura = cmbFactura.getSelectedItem().toString().split(" ");     
        String Existencias = txtExistencias.getText();
        try{
            String sql = "INSERT INTO Almacen (existencias,Producto_id_producto,Factura_idFactura)"
                    + "VALUES('" + Existencias + "','" + idProducto[0] + "', '" + idFactura[0] +"')";
            conn = conexion.conectar();
            st = conn.createStatement();
            st.executeUpdate(sql);
            MostrarBD();
            limpiartTxt();
            showMessageDialog(this, "Producto registrado en Almacen");
        }catch(Exception error){
            System.out.println("ERROR al registrar en Almacén" + error);
        }
        limpiartTxt();
    }
    //-------------------------------------------------------------------------------------------
    public void MostrarBD() {
        modelo.setRowCount(0);
        String sql = "SELECT id_producto,Nombre_producto,Existencias,Fecha_llegada,Fecha_caducidad,idFactura,id_proveedor,Nombre_proveedor FROM Producto,Almacen,Factura,Proveedor "
                + "WHERE idFactura=Factura_idFactura  and id_proveedor=Proveedor_id_proveedor and id_proveedor=Proveedor_idProveedor and id_producto=Producto_id_producto "
                + "ORDER BY idFactura";
        conn = conexion.conectar();
        System.out.println(sql);
        String[] datos = new String[8];
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[0] = datos[0] + " - " + rs.getString(2);
                datos[1] = rs.getString(3);
                datos[2] = rs.getString(4);
                datos[3] = rs.getString(5);
                datos[4] = rs.getString(6);
                datos[5] = rs.getString(7);
                datos[5] = datos[5] + " - " + rs.getString(8);

                modelo.addRow(datos);

            }
            tablaAlmacen.setModel(modelo);
        } catch (SQLException error) {
            System.out.println("Error en Mostrar Tabla" + error);
        }
    }
    //-------------------------------------------------------------------------------------------    
    public void Modificar(){
        String[] idProducto = cmbProducto.getSelectedItem().toString().split(" ");   
        String idFactura = tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 4).toString();              
        String Existencias = txtExistencias.getText();                
        try{
            if(cmbProducto.getSelectedIndex()==0 || cmbProveedor.getSelectedIndex()==0 || Existencias.equals("")) {
                showMessageDialog(this, "Campos Vacios o No seleccionados");                
            } else {
                String sql = "UPDATE Almacen SET Existencias ='" + Existencias + "'" 
                        + "WHERE  Producto_id_producto = '" + idProducto[0] +"' AND Factura_idFactura='"+idFactura+"'";
                conn = conexion.conectar();
                st = conn.createStatement();
                st.executeUpdate(sql);
                MostrarBD();
                limpiartTxt();
                showMessageDialog(this, "Datos de Producto modificados");
            }
        }catch(SQLException error){
            System.out.println("Error en Modificar (SQL)" + error.getMessage());
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Error en Modificar (ARRAY)" + error.getMessage());
        }
    }
    //-------------------------------------------------------------------------------------------
    private void limpiartTxt(){
        cmbProveedor.setSelectedIndex(0);
        cmbProducto.setSelectedIndex(0);
        cmbFactura.setSelectedIndex(0);
        txtExistencias.setText("");
    }
    //-------------------------------------------------------------------------------------------
    public void Eliminar() {
        String[] idProducto = cmbProducto.getSelectedItem().toString().split(" ");   
        String idFactura = tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 4).toString();
        String Existencias = txtExistencias.getText();         
        try {
            String sql = "DELETE FROM Almacen WHERE Existencias ='"+Existencias+"' AND Producto_id_producto = '" + idProducto[0] +"'"
                    + " AND Factura_idFactura='"+idFactura+"'";

            conn = conexion.conectar();
            st = conn.createStatement();
            st.executeUpdate(sql);
            MostrarBD();
            limpiartTxt();            
            showMessageDialog(this, "Existencias de Producto Eliminadas");
        } catch (Exception error) {
            System.out.println("Error en eliminar" + error);
        }
    }    
    //-------------------------------------------------------------------------------------------
    private void llenarCmbProveedor(){
        String sql = "SELECT id_proveedor,Nombre_proveedor FROM PROVEEDOR";
            conn = conexion.conectar();
            System.out.println(sql);
            String[] datos = new String[2];
            try {
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);

                    cmbProveedor.addItem(datos[0]+" - "+datos[1]);
                }
            } catch (SQLException error) {
                System.out.println("Error en Mostrar Tabla Factura" + error);
            }
    }
    //-------------------------------------------------------------------------------------------    
    private void llenarCmbProducto(){
        cmbProducto.removeAllItems();
        cmbProducto.addItem("-SELECCIONAR-");
        String sql = "SELECT id_producto,Nombre_producto FROM PRODUCTO WHERE PROVEEDOR_ID_PROVEEDOR="+cmbProveedor.getSelectedItem().toString().substring(0,1);
        conn = conexion.conectar();
        System.out.println(sql);
        String[] datos = new String[2];
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);

                cmbProducto.addItem(datos[0]+" - "+datos[1]);
            }
        } catch (SQLException error) {
            System.out.println("Error en Mostrar Tabla Factura" + error);
        }
    }
    //-------------------------------------------------------------------------------------------
    private void llenarCmbFactura(){
        cmbFactura.removeAllItems();
        cmbFactura.addItem("-SELECCIONAR-");
        String sql = "SELECT idFactura,Estado FROM FACTURA WHERE PROVEEDOR_IDPROVEEDOR="+cmbProveedor.getSelectedItem().toString().substring(0,1)+" AND ESTADO='pendiente'";
        conn = conexion.conectar();
        System.out.println(sql);
        String[] datos = new String[2];
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);

                cmbFactura.addItem(datos[0]+" - "+datos[1]);
            }
        } catch (SQLException error) {
            System.out.println("Error en Mostrar Tabla Factura" + error);
        }
    }
    //-------------------------------------------------------------------------------------------
    public void filtro(String consulta, JTable Tabla){
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        Tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }
    
    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        if(cmbProveedor.getSelectedIndex()!=0)
            if(cmbFactura.getSelectedIndex()!=0)
                if(cmbProducto.getSelectedIndex()!=0){
                    Insertar();
                }else
                    showMessageDialog(this, "Producto no seleccionado");                
            else
                showMessageDialog(this, "Factura no seleccionada");
        else
            showMessageDialog(this, "Proveedor no seleccionado");    
    }//GEN-LAST:event_AgregarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        Eliminar();
        MostrarBD();
        limpiartTxt();
    }//GEN-LAST:event_EliminarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        Modificar();
        MostrarBD();
        limpiartTxt();
    }//GEN-LAST:event_ModificarMouseClicked

    private void LimpiezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiezaMouseClicked
        limpiartTxt();
    }//GEN-LAST:event_LimpiezaMouseClicked

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

    private void cmbProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProveedorItemStateChanged
        if(cmbProveedor.getSelectedIndex()!=0){
            llenarCmbFactura();
            llenarCmbProducto();            
            cmbFactura.setEnabled(true);
            cmbProducto.setEnabled(true);
        }else{
            cmbFactura.setEnabled(false);
            cmbProducto.setEnabled(false);            
        }          
    }//GEN-LAST:event_cmbProveedorItemStateChanged

    private void lblFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFacturasMouseClicked
        Gestionar_Factura v = new Gestionar_Factura();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblFacturasMouseClicked

    private void tablaAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlmacenMouseClicked
        txtExistencias.setText(tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 1).toString());
        cmbProveedor.setSelectedItem(tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 5).toString());
        cmbProducto.setSelectedItem(tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tablaAlmacenMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtro(txtBuscar.getText(), tablaAlmacen);
    }//GEN-LAST:event_txtBuscarKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestionar_Almacen().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar;
    private javax.swing.JLabel Almacen;
    private javax.swing.JLabel Corte;
    private javax.swing.JLabel Devoluciones;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Limpieza;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel Productos;
    private javax.swing.JLabel Proveedor;
    private javax.swing.JLabel Ventas;
    private javax.swing.JComboBox<String> cmbFactura;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblFacturas;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTable tablaAlmacen;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtId2;
    // End of variables declaration//GEN-END:variables
}