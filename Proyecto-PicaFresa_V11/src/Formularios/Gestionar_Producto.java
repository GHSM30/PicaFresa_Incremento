package Formularios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Clases.ConexionBD;
import Clases.Metodos_sql;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Gestionar_Producto extends javax.swing.JFrame {

    int idc;
    int ren = 0;
    ConexionBD conexion = new ConexionBD();
    Connection conn;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;

    private static Connection con;
    Metodos_sql metodos = new Metodos_sql();

    public Gestionar_Producto() {
        initComponents();
        this.setLocationRelativeTo(this);
        modelo = (DefaultTableModel) tablaAlmacen.getModel();
        MostrarBD();
        llenarCmbProducto();
        IdProveedor();
        txtCat.setVisible(false);
        BtnAdd.setVisible(false);
        fechaSistema();
    }

    private void fechaSistema() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaLlegada = (dtf.format(LocalDateTime.now()));
        txtFechaLlegada.setText(fechaLlegada);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtId2 = new javax.swing.JTextField();
        lGJButtonClassicBasic1 = new components.LGJButtonClassicBasic();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAlmacen = new javax.swing.JTable();
        txtExistencias = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFechaCaducidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Agregar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        Modificar = new javax.swing.JLabel();
        Limpieza = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Proveedor = new javax.swing.JLabel();
        Productos = new javax.swing.JLabel();
        Almacen = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        cmbProveedor = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtCat = new javax.swing.JTextField();
        ChCat = new javax.swing.JCheckBox();
        BtnAdd = new javax.swing.JButton();
        txtFechaLlegada = new javax.swing.JLabel();
        Proveedor1 = new javax.swing.JLabel();

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

        lGJButtonClassicBasic1.setText("lGJButtonClassicBasic1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaAlmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Existencias", "FechaLlegada", "FechaCaducidad", "Precio", "Proveedor", "Categoria"
            }
        ));
        tablaAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlmacenMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaAlmacen);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 620, 130));
        jPanel1.add(txtExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 70, 30));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 330, 30));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 70, 20));

        jLabel4.setText("Existencias");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, 20));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel6.setText("GESTIONAR PRODUCTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 510, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 330, 30));

        jLabel7.setText("Precio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, 20));

        jLabel8.setText("Categoria");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 110, 20));
        jPanel1.add(txtFechaCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 330, 30));

        jLabel9.setText("FechaCaducidad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, 20));

        Agregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 70, 40));

        Eliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 70, 40));

        Modificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModificarMouseEntered(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, 70, 40));

        Limpieza.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Limpieza.setText("Limpiar casillas");
        Limpieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiezaMouseClicked(evt);
            }
        });
        jPanel1.add(Limpieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 110, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 10, 550));

        jLabel5.setText("FechaLlegada");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, 20));

        jLabel17.setText("Proveedor");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 90, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Regresar");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 80, 50));

        Proveedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Proveedor.setText("Proveedor");
        Proveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedorMouseClicked(evt);
            }
        });
        jPanel1.add(Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 90, 60));

        Productos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Productos.setText("Producto");
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
        });
        jPanel1.add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 70, 50));

        Almacen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Almacen.setText("Almacen");
        Almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlmacenMouseClicked(evt);
            }
        });
        jPanel1.add(Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, 60));

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONAR-" }));
        cmbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoriaItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 330, 30));

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONAR-", "Otro" }));
        cmbProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProveedorItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 330, 30));

        jLabel10.setText("Buscar:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 70, 30));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 410, -1));

        txtCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCatActionPerformed(evt);
            }
        });
        jPanel1.add(txtCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 220, -1));

        ChCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChCatActionPerformed(evt);
            }
        });
        jPanel1.add(ChCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 20, 30));

        BtnAdd.setText("Nueva");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, -1, -1));

        txtFechaLlegada.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel1.add(txtFechaLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 110, 30));

        Proveedor1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Proveedor1.setText("Gestionar Usuario");
        Proveedor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Proveedor1MouseClicked(evt);
            }
        });
        jPanel1.add(Proveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 120, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Insertar() {
        String Proveedor = cmbProveedor.getSelectedItem().toString();
        String Nombre = txtNombre.getText();
        String Existencias = txtExistencias.getText();
        String FechaLL = txtFechaLlegada.getText();
        String Precio = txtPrecio.getText();
        String Tipo = cmbCategoria.getSelectedItem().toString();
        String FechaCaducidad = txtFechaCaducidad.getText();
        //Si el proveedor se selecciona ocmo Otro entonces se insertan los datos en Almacen
        if (Proveedor.equals("Otro")) {
            try {
                //Sentencia DML para insertar datos
                String sql = "INSERT INTO Almacen (nombre_producto, Existencias, Fecha_llegada, Fecha_caducidad, Precio,Proveedor,categoria_producto_idCategoria_Producto,venta_id_venta,venta_Usuario_id_Usuario, factura_idFactura ,factura_Proveedor_idProveedor)"
                        + "VALUES('" + Nombre + "','" + Existencias + "', '" + FechaLL + "', '" + FechaCaducidad + "','" + Precio + "','" + Proveedor + "','" +1+"','"+0+"','"+0+"','"+0+"','"+0+"')";
                conn = conexion.conectar();                                                                                                 
                st = conn.createStatement();
                st.executeUpdate(sql);
                showMessageDialog(this, "Nuevo producto registrado");
                InsertarEnAlmacen();
                limpiar();
            } catch (Exception error) {
                System.out.println("Error en Insetar datos" + error);
            }
            limpiartTxt();
        } else {
            //si es distinto de Otro Actualizar la cantidad de Producto mostrado en la tabla y la base de datos
            try {
                if (Nombre.equals("") || FechaCaducidad.equals("") || Precio.equals("") || Existencias.equals("") || cmbCategoria.getSelectedIndex() == 0
                        || cmbProveedor.getSelectedIndex() == 0) {
                    showMessageDialog(this, "Campos Vacios o No Llenados. Verificar");
                    limpiartTxt();
                } else {
                    String sql = "UPDATE Almacen SET Nombre_producto ='" + Nombre + "', Existencias = '" + Existencias + "', Fecha_llegada = '"
                            + FechaLL + "', Fecha_caducidad = '" + FechaCaducidad + "', Proveedor = '" + Proveedor + "', categoria_producto_idCategoria_Producto = '" + Tipo
                            + "' WHERE  Nombre_producto = '" + Nombre + "'";
                    conn = conexion.conectar();
                    st = conn.createStatement();
                    st.executeUpdate(sql);
                    showMessageDialog(this, "Datos modificados");
                }
            } catch (SQLException error) {
                System.out.println("Error en Modificar (SQL)" + error.getMessage());
            } catch (ArrayIndexOutOfBoundsException error) {
                System.out.println("Error en Modificar (ARRAY)" + error.getMessage());
            }
        }

    }//Insertar datos

    public void InsertarEnAlmacen() {
        String Producto = txtNombre.getText();
        String Existencias = "0";
        String ID = "";
        try {
            String sql = "SELECT id_producto FROM Almacen WHERE nombre_producto='" + Producto + "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ID = rs.getString(1);
                System.out.println(ID);
            }
            System.out.println("ID encontrado");

        } catch (Exception error) {
            System.out.println("ID NO encontrado" + error);
        }
        try {
            String sql = "INSERT INTO Almacen (existencias,Producto_id_producto)"
                    + "VALUES('" + Existencias + "','" + ID + "')";
            conn = conexion.conectar();
            st = conn.createStatement();
            st.executeUpdate(sql);
            System.out.println("Producto registrado en Almacen");

        } catch (Exception error) {
            System.out.println("ERROR al registrar en Almacén" + error);
        }
        limpiartTxt();
    }//Insertar datos

    public void MostrarBD() {
        String sql = "SELECT * FROM  Almacen";
        conn = conexion.conectar();
        System.out.println(sql);
        String[] datos = new String[7];
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(2);
                datos[1] = rs.getString(3);
                datos[2] = rs.getString(4);
                datos[3] = rs.getString(5);
                datos[4] = rs.getString(6);
                datos[5] = rs.getString(7);
                datos[6] = rs.getString(8);

                modelo.addRow(datos);

            }
            tablaAlmacen.setModel(modelo);
        } catch (SQLException error) {
            System.out.println("Error en Mostrar Tabla" + error);
        }
    }//MostrarDatos


    public void Modificar(){
            String Nombre =txtNombre.getText();       
            String Exi =txtExistencias.getText();
            String Precio =txtPrecio.getText();
            
            try{                    
                if(Nombre.equals("") || Precio.equals("") || cmbProveedor.getSelectedIndex()==0) {
                    showMessageDialog(this, "Campos Vacios o No Llenados. Verificar");
                    limpiartTxt();
                } else {
                    String sql = "UPDATE almacen SET Nombre_producto ='" + Nombre + "', Existencias = '"  + Exi + "', Precio = '" + Precio 
                            +  "WHERE  Nombre_producto = '" + Nombre + "'";
                    conn = conexion.conectar();
                    st = conn.createStatement();
                    st.executeUpdate(sql);
                    showMessageDialog(this, "Datos modificados");
                }
            }catch(SQLException error){
                System.out.println("Error en Modificar (SQL)" + error.getMessage());
            }catch(ArrayIndexOutOfBoundsException error){
                System.out.println("Error en Modificar (ARRAY)" + error.getMessage());
            }
        }

    public void limpiar() {
        modelo.setRowCount(0);
    }

    private void limpiartTxt() {
        cmbProveedor.setSelectedIndex(0);
        txtNombre.setText("");
        txtExistencias.setText("");
        txtPrecio.setText("");
        cmbCategoria.setSelectedIndex(0);
        txtFechaCaducidad.setText("");
    }
    public void sacaridFact(){
        
    }
    public void Eliminar() {
        String Nombre = txtNombre.getText();

        String ID = "";
        try {
            String sql = "SELECT id_producto FROM PRODUCTO WHERE nombre_producto='" + Nombre + "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ID = rs.getString(1);
                System.out.println(ID);
            }
            System.out.println("ID encontrado");
        } catch (Exception error) {
            System.out.println("Producto NO encontrado para su eliminación" + error);
        }

        int fila = tablaAlmacen.getSelectedRow();

        try {
            if (fila < 0) {
                showMessageDialog(this, "Articulo no seleccionado");
                limpiartTxt();
            } else {
                String sql = "DELETE FROM ALMACEN where producto_id_producto = " + ID;
                conn = conexion.conectar();
                st = conn.createStatement();
                st.executeUpdate(sql);
                System.out.println("Producto eliminado de ALMACEN");
            }
        } catch (Exception error) {
            System.out.println("Error en eliminar" + error);
        }
        try {
            if (fila < 0) {
                showMessageDialog(this, "Articulo no seleccionado");
                limpiartTxt();
            } else {
                String sql = "DELETE FROM Producto  where id_producto = " + ID;
                conn = conexion.conectar();
                st = conn.createStatement();
                st.executeUpdate(sql);
                showMessageDialog(this, "Producto eliminado");
                limpiar();
                limpiartTxt();
                ren = fila;
            }
        } catch (Exception error) {
            System.out.println("Error en eliminar" + error);
        }
    }

    public void filtro(String consulta, JTable Tabla) {
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        Tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }
    private void tablaAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlmacenMouseClicked
        int fila = tablaAlmacen.getSelectedRow();
        if (fila == -1) {
            showMessageDialog(this, "No se seleccionó ningna fila");
        } else {
            String Nombre = (String) tablaAlmacen.getValueAt(fila, 0);
            String Peso = (String) tablaAlmacen.getValueAt(fila, 1);
            String FechaLLegadaP = (String) tablaAlmacen.getValueAt(fila, 2);
            String Unidades = (String) tablaAlmacen.getValueAt(fila, 3);
            String Precio = (String) tablaAlmacen.getValueAt(fila, 4);
            String Proveedor = (String) tablaAlmacen.getValueAt(fila, 6);
            cmbCategoria.setSelectedItem(tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 5).toString());

            ren = fila;
            cmbProveedor.setSelectedItem(Proveedor);
            txtNombre.setText("" + Nombre);
            txtExistencias.setText("" + Peso);
            txtFechaLlegada.setText(FechaLLegadaP);
            txtFechaCaducidad.setText("" + Unidades);
            txtPrecio.setText("" + Precio);

        }
    }//GEN-LAST:event_tablaAlmacenMouseClicked
    private void llenarCmbProducto() {
        cmbCategoria.removeAllItems();
        cmbCategoria.addItem("-SELECCIONAR-");
        String sql = "SELECT idcategoria_Producto,Nombre_categoria FROM Categoria_Producto";
        conn = conexion.conectar();
        System.out.println(sql);
        String[] datos = new String[2];
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);

                cmbCategoria.addItem(datos[0] + " - " + datos[1]);
            }
        } catch (SQLException error) {
            System.out.println("Error en Mostrar Tabla Factura" + error);
        }
    }

    public void Buscar() {
        String nombre = txtNombre.getText();

        try {
            if (nombre.equals("")) {
                showMessageDialog(this, "Campo nombre vacio");
                limpiartTxt();
            } else {
                String sql = "SELECT * FROM Almacen WHERE  Nombre_producto = '" + nombre + "'";
                conn = conexion.conectar();
                st = conn.createStatement();
                rs = st.executeQuery(sql);

                while (rs.next()) {
                    txtExistencias.setText(rs.getString(3));
                    txtFechaLlegada.setText(rs.getString(4));
                    txtFechaCaducidad.setText(rs.getString(5));
                    txtPrecio.setText(rs.getString(6));
                    cmbCategoria.setSelectedItem(rs.getString(7));
                    cmbProveedor.setSelectedItem(rs.getString(8));
                }

                tablaAlmacen.setModel(modelo);
            }
        } catch (SQLException error) {
            System.out.println("Error en Buscar (SQL)" + error.getMessage());
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Error en Buscar (ARRAY)" + error.getMessage());
        }
    }
    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
//        if (cmbCategoria.getSelectedIndex() != 0  && cmbProveedor.getSelectedIndex() != 0) {
            Insertar();
            MostrarBD();
            limpiartTxt();
//        } else {
//            showMessageDialog(this, "Verifique que todos los elementos sean correctos");
//        }
    }//GEN-LAST:event_AgregarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        Eliminar();
        modelo.setRowCount(0);
        MostrarBD();
        limpiartTxt();
    }//GEN-LAST:event_EliminarMouseClicked

    private void ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseClicked
        Modificar();
        modelo.setRowCount(0);
        MostrarBD();
        limpiartTxt();
    }//GEN-LAST:event_ModificarMouseClicked

    private void LimpiezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiezaMouseClicked
        limpiartTxt();
    }//GEN-LAST:event_LimpiezaMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Principal v = new Principal();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveedorMouseClicked
        Gestionar_Proveedor v = new Gestionar_Proveedor();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProveedorMouseClicked

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

    private void IdProveedor() {
        String sql = "SELECT * FROM Proveedor WHERE id_proveedor ";  //Consulta sql
        conn = conexion.conectar();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String idProveedor = rs.getString(1);
                cmbProveedor.addItem(idProveedor);
            }
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            // Manejar cualquier excepción
            ex.printStackTrace();
            showMessageDialog(null, "Error al cargar los Datos\n" + ex);
        }
    }//IdProveedor
    private void cmbProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProveedorItemStateChanged
        if (cmbProveedor.getSelectedIndex() != 0) {

        }

    }//GEN-LAST:event_cmbProveedorItemStateChanged


    private void cmbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoriaItemStateChanged
        if (cmbCategoria.getSelectedIndex() != 0) {

        }
    }//GEN-LAST:event_cmbCategoriaItemStateChanged

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtro(txtBuscar.getText(), tablaAlmacen);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void ChCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChCatActionPerformed
        if (ChCat.isSelected()) {
            txtCat.setVisible(true); // Mostrar el JTextField si el JCheckBox está seleccionado
            BtnAdd.setVisible(true);
        } else {
            txtCat.setVisible(false);
            BtnAdd.setVisible(false);
        }
    }//GEN-LAST:event_ChCatActionPerformed

    public void categoria(){
        String CatNombre =txtCat.getText();         
        try{               
            String sql = "INSERT INTO Categoria_Producto (nombre_categoria)"
                        + "VALUES('" + CatNombre +"')";
            conn = conexion.conectar();
            st = conn.createStatement();
            st.executeUpdate(sql);
            showMessageDialog(this, "Nueva categoria registrada");
            limpiar();          
            }catch(Exception error){
                System.out.println("Error en Insetar datos" + error);
            }     
    }
    
    
    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed

          String CatNombre =txtCat.getText();       
            
            if (CatNombre.isEmpty()) {
                showMessageDialog(this, "Campo Vacio");
            }else{
            categoria();
            }      
    }//GEN-LAST:event_BtnAddActionPerformed

    private void txtCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCatActionPerformed

    private void Proveedor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proveedor1MouseClicked
        Gestionar_Usuario v = new Gestionar_Usuario();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Proveedor1MouseClicked

    private void ModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestionar_Producto().setVisible(true);
            }
        });
    }
    private java.sql.Statement declarax;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar;
    private javax.swing.JLabel Almacen;
    private javax.swing.JButton BtnAdd;
    private javax.swing.JCheckBox ChCat;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Limpieza;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel Productos;
    private javax.swing.JLabel Proveedor;
    private javax.swing.JLabel Proveedor1;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private components.LGJButtonClassicBasic lGJButtonClassicBasic1;
    private javax.swing.JTable tablaAlmacen;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCat;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtFechaCaducidad;
    private javax.swing.JLabel txtFechaLlegada;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
