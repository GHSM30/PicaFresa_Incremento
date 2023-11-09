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
import javax.swing.JTextField;
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
        llenarCmbProducto();
        fechaSistema();
        cmbFactura.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtId2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAlmacen = new javax.swing.JTable();
        txtProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Agregar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
        Modificar = new javax.swing.JLabel();
        Limpieza = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmbFactura = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Almacen = new javax.swing.JLabel();
        Productos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jdchCaducidad = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txtLlegada = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtExistencias = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();

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

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inicio de sesion como");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, 150, -1));

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 700, 172, 16));

        tablaAlmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Existencias", "Fecha Llegada", "Fecha Caducidad", "Precio", "Proveedor", "Categoria", "Factura"
            }
        ));
        tablaAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlmacenMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaAlmacen);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 680, 210));

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 540, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Factura");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 50, 20));

        Agregar.setText("Agregar");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, 60, 40));

        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, 50, 40));

        Modificar.setText("Modificar");
        Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarMouseClicked(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 70, 40));

        Limpieza.setText("Limpiar casillas");
        Limpieza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiezaMouseClicked(evt);
            }
        });
        jPanel1.add(Limpieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 670, 110, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 10, 690));

        jPanel1.add(cmbFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 497, 550, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Existencias");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 384, 80, -1));

        jLabel11.setFont(new java.awt.Font("Mshtakan", 0, 48)); // NOI18N
        jLabel11.setText("Gestionar Almacen");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 0, 440, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Producto");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 160, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Proveedor");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 80, 20));

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONAR-" }));
        cmbProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProveedorItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 540, -1));

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

        Almacen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Almacen.setText("Factura");
        Almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlmacenMouseClicked(evt);
            }
        });
        jPanel1.add(Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 60));

        Productos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Productos.setText("Producto");
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
        });
        jPanel1.add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Regresar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 80, 50));

        jdchCaducidad.setDateFormatString("dd-MM-YYYY");
        jdchCaducidad.setFocusable(false);
        jPanel1.add(jdchCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 540, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fecha Caducidad");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 110, -1));

        txtLlegada.setEditable(false);
        jPanel1.add(txtLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 540, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fecha Llegada");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 100, 20));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 540, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 80, -1));
        jPanel1.add(txtExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 540, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Categoria");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 110, 20));

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONAR-" }));
        cmbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoriaItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 540, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Insertar(){
        String Nombre = txtProducto.getText();
        String Existencias = txtExistencias.getText();  
        String fechaLlegada = txtLlegada.getText();
        String[] idFactura = cmbFactura.getSelectedItem().toString().split(" "); 
        String fechaCaducidad = ((JTextField) jdchCaducidad.getDateEditor().getUiComponent()).getText();
        String Precio = txtPrecio.getText();     
        
        // Obtener la cadena completa del JComboBox PROVEEDOR
        String selectProv = cmbProveedor.getSelectedItem().toString();
        // Dividir la cadena usando el carácter '-' como delimitador
        String[] partsProv = selectProv.split("-");
        // Obtener el ID (asumiendo que el ID está en la primera parte)
        Object id_provedor = partsProv[0].trim();
        
         // Obtener la cadena completa del JComboBox CATEGORIA
        String selectCat = cmbCategoria.getSelectedItem().toString();
        // Dividir la cadena usando el carácter '-' como delimitador
        String[] partsCat = selectCat.split("-");
        // Obtener el ID (asumiendo que el ID está en la primera parte)
        Object id_categoroa = partsCat[0].trim();
        
         // Obtener la cadena completa del JComboBox FACTURA
        String selectFac = cmbFactura.getSelectedItem().toString();
        // Dividir la cadena usando el carácter '-' como delimitador
        String[] partsFac = selectFac.split("-");
        // Obtener el ID (asumiendo que el ID está en la primera parte)
        Object id_factura = partsFac[0].trim();
        
        
        try{
            String sql = "INSERT INTO Almacen (Nombre_producto,Existencias,Fecha_llegada,Fecha_caducidad,Precio,Proveedor,categoria_producto_idCategoria_Producto,factura_idFactura)"
                    + "VALUES('" + Nombre + "','" + Existencias + "','" + fechaLlegada + "','" + fechaCaducidad + "','" + Precio + "','" + id_provedor + "','" + id_categoroa + "','" + id_factura +"')";
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
        String sql = "SELECT Nombre_producto, Existencias, almacen.Fecha_llegada, almacen.Fecha_Caducidad, Precio, Proveedor, categoria_producto_idCategoria_Producto, factura_idFactura \n" +
            "FROM Almacen, Factura, Proveedor\n" +
            "WHERE factura_idFactura = idFactura\n" +
            "AND id_proveedor = Proveedor_idProveedor\n";
        conn = conexion.conectar();
        System.out.println(sql);
        String[] datos = new String[8];
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);

                modelo.addRow(datos);

            }
            tablaAlmacen.setModel(modelo);
        } catch (SQLException error) {
            System.out.println("Error en Mostrar Tabla" + error);
        }
    }
    private boolean caducidadValida(String llegada, String caducidad) {
        String[] f_llegada = llegada.split("-");
        String[] f_caducidad = caducidad.split("-");
        int[] fechaLlegada = new int[3];
        int[] fechaCaducidad = new int[3];

        for (int i = 0; i < 3; i++) {
            fechaLlegada[i] = Integer.parseInt(f_llegada[i]);
            fechaCaducidad[i] = Integer.parseInt(f_caducidad[i]);
        }

        if (fechaCaducidad[2] > fechaLlegada[2]) {
            return true;
        }
        if (fechaCaducidad[2] == fechaLlegada[2] && (fechaCaducidad[1] > fechaLlegada[1]) || fechaCaducidad[0] > fechaLlegada[0]) {
            return true;
        }
        if (fechaCaducidad[1] == fechaLlegada[1] && (fechaCaducidad[2] > fechaLlegada[2]) || fechaCaducidad[0] > fechaLlegada[0]) {
            return true;
        }
        if (fechaCaducidad[0] == fechaLlegada[0] && (fechaCaducidad[1] > fechaLlegada[1]) || fechaCaducidad[2] > fechaLlegada[2]) {
            return true;
        }
        if (fechaCaducidad[0] > fechaLlegada[0] && (fechaCaducidad[1] > fechaLlegada[1]) && fechaCaducidad[2] > fechaLlegada[2]) {
            return true;
        }

        return false;
    }
    //-------------------------------------------------------------------------------------------    
    public void Modificar(){
  
        String idFactura = tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 4).toString();              
        String Existencias = txtProducto.getText();                
        try{
            if(cmbProveedor.getSelectedIndex()==0 || Existencias.equals("")) {
                showMessageDialog(this, "Campos Vacios o No seleccionados");                
            } else {
                String sql = "UPDATE Almacen SET Existencias ='" + Existencias + "'" 
                        + "WHERE  Producto_id_producto = '" + 0 +"' AND Factura_idFactura='"+idFactura+"'";
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
        cmbFactura.setSelectedIndex(0);
        txtProducto.setText("");
        cmbProveedor.setSelectedIndex(0);
        ((JTextField) jdchCaducidad.getDateEditor().getUiComponent()).setText("");
    }
    private void fechaSistema() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaLlegada = (dtf.format(LocalDateTime.now()));
        txtLlegada.setText(fechaLlegada);
    }
    //-------------------------------------------------------------------------------------------
    public void Eliminar() {  
        String idFactura = tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 4).toString();
        String Existencias = txtProducto.getText();         
        try {
            String sql = "DELETE FROM Almacen WHERE Existencias ='"+Existencias+"' AND Producto_id_producto = '" + 0 +"'"
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
                System.out.println("Error en Mostrar Tabla Proveedor" + error);
            }
    }
    
    
    //-------------------------------------------------------------------------------------------    
 /*   private void llenarCmbProducto(){
        cmbProducto.removeAllItems();
        cmbProducto.addItem("-SELECCIONAR-");
        String sql = "SELECT id_producto,Nombre_producto FROM Almacen WHERE PROVEEDOR_ID_PROVEEDOR="+cmbProveedor.getSelectedItem().toString().substring(0,1);
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
            System.out.println("Error en Mostrar Tabla Producto" + error);
        }
    }
    //-------------------------------------------------------------------------------------------
 /*   private void llenarCmbFactura2(){
        cmbFactura.removeAllItems();
        cmbFactura.addItem("-SELECCIONAR-");
        String sql = "SELECT idFactura,Estado FROM FACTURA WHERE PROVEEDOR_IDPROVEEDOR="+cmbProveedor.getSelectedItem().toString().substring(0,1)+" AND ESTADO='Pendiente'";
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
   */ 
     //-------------------------------------------------------------------------------------------
    private void llenarCmbFactura(){
        cmbFactura.removeAllItems();
        cmbFactura.addItem("-SELECCIONAR-");
        String sql = "SELECT idFactura,Estado FROM Factura WHERE Proveedor_idProveedor="+ 13/*cmbProveedor.getSelectedItem().toString().substring(0,1)*/ +" AND ESTADO='Pendiente' ";
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
    
    
    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        if (cmbProveedor.getSelectedIndex() != 0 || cmbFactura.getSelectedIndex() != 0 || cmbCategoria.getSelectedIndex() != 0){
            Insertar();
        }else
            showMessageDialog(this, "Seleccione a un Proveedor");    
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

    private void cmbProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProveedorItemStateChanged
        if(cmbProveedor.getSelectedIndex()!=0){
            llenarCmbFactura();
 //           llenarCmbProducto();            
            cmbFactura.setEnabled(true);
        }else{
            cmbFactura.setEnabled(false);           
        }          
    }//GEN-LAST:event_cmbProveedorItemStateChanged

    private void tablaAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlmacenMouseClicked
        int fila = tablaAlmacen.getSelectedRow();
        if (fila == -1) {
            showMessageDialog(this, "No se seleccionó ninguna fila");
        } else {
            String producto = (String) tablaAlmacen.getValueAt(fila, 0);
            String existencia = (String) tablaAlmacen.getValueAt(fila, 1);
            //String fechaLlegada = tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 2).toString();
            String fechaCaducidad = tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 3).toString();
            String precio = (String) tablaAlmacen.getValueAt(fila, 4); // Corregido el índice
            cmbProveedor.setSelectedItem(tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 5).toString());
            String categoria = (String) tablaAlmacen.getValueAt(fila, 6); // Corregido el índice
            cmbFactura.setSelectedItem(tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 7).toString());

            ren = fila;

            txtProducto.setText("" + producto);
            txtExistencias.setText("" + existencia);

            txtPrecio.setText("" + precio);
        }
    }//GEN-LAST:event_tablaAlmacenMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtro(txtBuscar.getText(), tablaAlmacen);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void AlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlmacenMouseClicked
        Gestionar_Factura v = new Gestionar_Factura();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AlmacenMouseClicked

    private void ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseClicked
        Gestionar_Producto v = new Gestionar_Producto();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductosMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Principal v = new Principal();
        v.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jLabel3MouseClicked

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void cmbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoriaItemStateChanged
        if (cmbCategoria.getSelectedIndex() != 0) {

        }
    }//GEN-LAST:event_cmbCategoriaItemStateChanged

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
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Limpieza;
    private javax.swing.JLabel Modificar;
    private javax.swing.JLabel Productos;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbFactura;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private com.toedter.calendar.JDateChooser jdchCaducidad;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JTable tablaAlmacen;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtLlegada;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}