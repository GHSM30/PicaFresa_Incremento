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
import java.awt.List;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Realizar_Venta extends javax.swing.JFrame {
    
    String ID = "";
    String ID2 = "";
    TableRowSorter<TableModel> trs;
    int idc;
    int ren=0;
    ConexionBD conexion = new ConexionBD();
    Connection conn;
    DefaultTableModel modelo;
    DefaultTableModel modelo2;
    Statement st;
    ResultSet rs;
    int cantidad = 0;

    private static Connection con;
    Metodos_sql metodos = new Metodos_sql();
    
    public Realizar_Venta() {
        initComponents();
        this.setLocationRelativeTo(this);
        modelo = (DefaultTableModel) tblRegistroVenta.getModel();
        modelo2 = (DefaultTableModel) tblVenta.getModel();
        MostrarBD();
        tabla();
        fechaSistema();
        

    }
    
    public void ObtenerUltimoRegistro(){
        
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
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Buscar2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRegistroVenta = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtPago = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotalFinal = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtLlegada = new javax.swing.JTextField();
        txtBuscar2 = new javax.swing.JTextField();
        Buscar3 = new javax.swing.JLabel();
        BtnSave = new javax.swing.JButton();
        Ventas = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buscar2.setText("Buscar");
        Buscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buscar2MouseClicked(evt);
            }
        });
        jPanel1.add(Buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 60, 40));

        jLabel8.setText("Regresar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 70, 40));

        tblRegistroVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Unidades", "Precio"
            }
        ));
        tblRegistroVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistroVentaMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblRegistroVenta);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 340, 350));

        jLabel18.setText("Producto");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel19.setText("Precio");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        txtProducto.setEditable(false);
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 190, 20));

        txtPrecio.setEditable(false);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 190, 20));

        jLabel3.setText("Subtotal");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel20.setText("Cantidad");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel21.setText("Pago");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        txtSubtotal.setEditable(false);
        txtSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 190, 20));

        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPagoKeyPressed(evt);
            }
        });
        jPanel1.add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 190, 20));

        jLabel22.setText("Cambio");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        txtCambio.setEditable(false);
        jPanel1.add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 190, 20));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 190, -1));

        jLabel23.setText("Unidades");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtUnidades.setEditable(false);
        jPanel1.add(txtUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 190, 20));

        jLabel24.setText("ID");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtID.setEditable(false);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 190, 20));

        jLabel4.setText("Total");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        txtTotalFinal.setEditable(false);
        txtTotalFinal.setText("0.0");
        txtTotalFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalFinalActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotalFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 190, 20));

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, -1, -1));

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel11.setText("Realizar venta");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 390, -1));

        txtCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        txtCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtCantidadStateChanged(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 190, -1));

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Precio", "Unidades", "Subtotal"
            }
        ));
        tblVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVentaMouseClicked(evt);
            }
        });
        tblVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblVentaKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tblVenta);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 340, 350));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inicio de sesion como");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, 20));

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 172, 16));

        jLabel25.setText("Fecha");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 296, 50, 20));

        txtLlegada.setEditable(false);
        jPanel1.add(txtLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 190, -1));

        txtBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscar2ActionPerformed(evt);
            }
        });
        txtBuscar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscar2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscar2KeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 240, -1));

        Buscar3.setText("Buscar");
        Buscar3.setToolTipText("");
        Buscar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buscar3MouseClicked(evt);
            }
        });
        jPanel1.add(Buscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 40, 40));

        BtnSave.setText("Realizar Corte");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1080, 560));

        Ventas.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/administracion-del-dinero.png"))); // NOI18N
        Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentasMouseClicked(evt);
            }
        });
        getContentPane().add(Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 70, 60));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setText("Venta");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 50, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void pruebas(){  
        ArrayList<String[]> productosInsertados = new ArrayList<String[]>();
        String nombreUsuario = lblNombre.getText();
        String fechaLlegada = txtLlegada.getText();
        String total =txtTotalFinal.getText();
        
        try{
            
            // Insertar un nuevo registro en la primera tabla
            String sql = "INSERT INTO Venta (fecha_venta,total_venta,Usuario_id_Usuario)"
                            + "VALUES('" + fechaLlegada + "','" + total + "', '" + nombreUsuario +"')";            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.executeUpdate();
                           
            // Obtener el último ID insertado en la primera tabla
            sql = "SELECT MAX(id_venta) FROM Venta";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            int ultimoId = 0;
            if (rs.next()) {
                ultimoId = rs.getInt(1);
            }

            // Insertar un nuevo registro en otra tabla utilizando el último ID insertado
            for (int i = 0; i < modelo2.getRowCount(); i++) { 
                String[] productos = new String[5];
                productos[0] = modelo2.getValueAt(i, 0).toString();
                productos[1] = modelo2.getValueAt(i, 1).toString();
                productos[2] = modelo2.getValueAt(i, 2).toString();
                productos[3] = modelo2.getValueAt(i, 3).toString();
                productos[4] = modelo2.getValueAt(i, 4).toString();

                sql = "INSERT INTO DetalleVenta (venta_id_Venta,producto_id_producto,cantidad_producto,precio_producto,SubTotal)"
                            + "VALUES('" + ultimoId + "','" + productos[0] + "', '" + productos[3] + "', '" + productos[2] + "', '" + productos[4] +"')";
                stmt = conn.prepareStatement(sql);
                /*stmt.setInt(1, ultimoId);
                stmt.setString(2, productos[0]);
                stmt.setString(3, productos[1]);
                stmt.setString(4, productos[2]);
                productosInsertados.add(productos);*/
                
                //showMessageDialog(this,productosInsertados);                
                stmt.executeUpdate();                
            }            
            
            // Cerrar la conexión a la base de datos
            conn.close();

        }catch(SQLException error){
            System.out.println("Error en Modificar (SQL)" + error.getMessage());
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Error en Modificar (ARRAY)" + error.getMessage());
        }
    }
    
    public void Insertar(){ 
        String nombre =txtProducto.getText();
        String total =txtTotalFinal.getText();
        int cantidad = Integer.parseInt(txtCantidad.getValue().toString());
        // Conectar a la base de datos MySQL
        conn = conexion.conectar();
        
        
        // Obtener el modelo del JTable temporal
        try{
            
            // Obtener el último ID de la tabla
            String sql = "SELECT MAX(id_venta) FROM Venta";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            int ultimoId = 0;
            if (rs.next()) {
                ultimoId = rs.getInt(1);
            }

            // Sumar 1 al último ID para obtener el siguiente ID disponible
            int siguienteId = ultimoId + 1;
            
            for (int i = 0; i < modelo2.getRowCount(); i++) {
            
            String columna2 = modelo2.getValueAt(i, 1).toString();
            String columna3 = modelo2.getValueAt(i, 2).toString();
            String columna4 = modelo2.getValueAt(i, 3).toString();

            sql = "INSERT INTO DetalleVenta (Venta_id_venta,nombre_producto,precio_producto,cantidad_producto)"
                                        + "VALUES(?,?,?,?)";
            
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, siguienteId);
            stmt.setString(2, columna2);
            stmt.setString(3, columna3);
            stmt.setString(4, columna4);
            stmt.executeUpdate();
            }
            // Cerrar la conexión a la base de datos
            
            conn.close();
            
        }catch(SQLException error){
                    System.out.println("Error en Modificar (SQL)" + error.getMessage());
                }catch(ArrayIndexOutOfBoundsException error){
                    System.out.println("Error en Modificar (ARRAY)" + error.getMessage());
                }
            
    }//Insertar datos
    private void fechaSistema(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaLlegada = (dtf.format(LocalDateTime.now()));
        txtLlegada.setText(fechaLlegada);
    }
    //---------------------------------------------------------------------------------------------
        
        public void InsertarDatosTabla(){
            String nombreUsuario = lblNombre.getText();
            String fechaLlegada = txtLlegada.getText();
            String total =txtTotalFinal.getText();
            try{
                    String sql = "INSERT INTO Venta (fecha_venta,total_venta,Usuario_id_Usuario)"
                            + "VALUES('" + fechaLlegada + "','" + total + "', '" + nombreUsuario +"')";
                    conn = conexion.conectar();
                    st = conn.createStatement();
                    st.executeUpdate(sql);
                    showMessageDialog(this, "Nueva venta registrada");
                    limpiar();

            }catch(Exception error){
                System.out.println("Error en Insetar datos" + error);
            }
            limpiartTxt();
        }//Insertar datos  
        
        public void tabla(){
            tblVenta.setModel(modelo2);
        }
    
        public void MostrarBD() {
        String sql = "SELECT * FROM  Producto";
        conn = conexion.conectar();
        System.out.println(sql);
        String[] datos = new String[5];
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(5);
                datos[3] = rs.getString(6);


                modelo.addRow(datos);

            }
            tblRegistroVenta.setModel(modelo);
        } catch (SQLException error) {
            System.out.println("Error en Mostrar Tabla" + error);
        }
    }//MostrarDatos
    
    public void ModificarUnidades(){
                String unidades =txtUnidades.getText();
                String ID =txtID.getText();
                try{
                    
                    if(unidades.equals("")) {
                        showMessageDialog(this, "Campos Vacios");
                        limpiartTxt();
                    } else {
                        String sql = "UPDATE Producto SET unidades_paquete = '" + unidades + "'" 
                                + "WHERE  id_producto = '" + ID +"'";

                        conn = conexion.conectar();
                        st = conn.createStatement();
                        st.executeUpdate(sql);
                    }
                }catch(SQLException error){
                    System.out.println("Error en Modificar (SQL)" + error.getMessage());
                }catch(ArrayIndexOutOfBoundsException error){
                    System.out.println("Error en Modificar (ARRAY)" + error.getMessage());
                }
        }    
        
    public void limpiar() {
        for (int i = 0; i <= tblRegistroVenta.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    private void limpiartTxt(){
        txtID.setText("");
        txtProducto.setText("");
        txtPrecio.setText("");
        txtSubtotal.setText("");
        txtCantidad.setValue("1");
        txtUnidades.setText("");
        txtPago.setText("");
        txtCambio.setText("");
        
    }
        
    public void Buscar(){ //METODO DE BUSCAR QUE PROXIMAMENTE SERA REEMPLAZADO
        String producto =txtProducto.getText();

        try{
            if(producto.equals("")) {
                showMessageDialog(this, "Campo Vacio");
                limpiartTxt();
            } else {
                String sql = "SELECT * FROM Venta WHERE  fecha_Venta = '" + producto+"'";
                conn = conexion.conectar();
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                
                while (rs.next()) {
                    txtSubtotal.setText(rs.getString(2));
                    txtProducto.setText(rs.getString(3));
                }
                
                tblRegistroVenta.setModel(modelo);
                showMessageDialog(this, "Datos de proveedor encontrados");                
            }
        }catch(SQLException error){
            System.out.println("Error en Buscar (SQL)" + error.getMessage());
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Error en Buscar (ARRAY)" + error.getMessage());
        }
    }
    
    private void Buscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar2MouseClicked
        Buscar();
    }//GEN-LAST:event_Buscar2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Principal v = new Principal();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed
        
    }//GEN-LAST:event_txtSubtotalActionPerformed
    private void Subtotal(){
        float unidades = Float.parseFloat(txtUnidades.getText());
        float precio = Float.parseFloat(txtPrecio.getText());
        float cantidad = Float.parseFloat(txtCantidad.getValue().toString());
        
        if( cantidad > unidades ){
            showMessageDialog(this,"Las unidades exceden la cantidad disponible");
        }else{
          txtSubtotal.setText(String.valueOf(cantidad * precio));
        }
        //SOLO NOS SERVIRIA PARA SACAR EL TOTAL POR MEDIO DE UN BOTON QUE SERA REEMPLAZADO DE MANERA AUTOMATICA 
    }    
    private void pagar(){
        
    float subtotal = Float.parseFloat(txtTotalFinal.getText());
    float pago = Float.parseFloat(txtPago.getText());
    
        if(pago < subtotal){
            showMessageDialog(this,"Dinero insuficiente, le hacen falta: $" + (subtotal - pago));
        }
        else{
            txtCambio.setText(String.valueOf(pago - subtotal));
            showMessageDialog(this,"Que tenga buen dia, su cambio es: $" +(pago - subtotal));         
        }
    }

    private void newBuscar(){
        String buscar =txtBuscar.getText();

        try{
            if(buscar.equals("")) {
                showMessageDialog(this, "Campo Vacio");
                limpiartTxt();
            } else {
                String sql = "SELECT * FROM Producto WHERE nombre_producto LIKE ' % " +  buscar  + "%'";
                conn = conexion.conectar();
                st = conn.createStatement();
                rs = st.executeQuery(sql);

                
                tblRegistroVenta.setModel(modelo);
               
            }
        }catch(SQLException error){
            System.out.println("Error en Buscar (SQL)" + error.getMessage());
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Error en Buscar (ARRAY)" + error.getMessage());
        }            
    }
    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
       // newBuscar();
        filtro(txtBuscar.getText(), tblRegistroVenta);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pagar();

        }
    }//GEN-LAST:event_txtPagoKeyPressed

    private void txtTotalFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalFinalActionPerformed

    private void tblRegistroVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroVentaMouseClicked
        int fila = tblRegistroVenta.getSelectedRow();
        if (fila == -1) {
            showMessageDialog(this, "No se seleccionó ningna fila");
        } else {
            String ID = (String) tblRegistroVenta.getValueAt(fila, 0);
            String producto = (String) tblRegistroVenta.getValueAt(fila, 1);
            String precio = (String) tblRegistroVenta.getValueAt(fila, 3);
            String unidades = (String) tblRegistroVenta.getValueAt(fila, 2);
            String subtotal = (String) tblRegistroVenta.getValueAt(fila, 3);

            ren = fila;

            txtID.setText("" + ID);
            txtProducto.setText("" + producto);
            txtPrecio.setText("" + precio);
            txtUnidades.setText("" + unidades);
            txtSubtotal.setText("" + subtotal);
            txtCantidad.setValue(1);

        }//EVENTO QUE AL DAR CLICK NOS DESPLIEGUE TODA LA INFROMACION DE LAS TABLAS A NUESTROS TEXTFIELD
    }//GEN-LAST:event_tblRegistroVentaMouseClicked
    private void agregarTotal(){
        float unidades = Float.parseFloat(txtUnidades.getText());
        float cantidad = Float.parseFloat(txtCantidad.getValue().toString());
        
        String sub = txtSubtotal.getText();
        String Fsub = txtTotalFinal.getText();
        
        float subTotal = Float.parseFloat(sub);
        float Total = Float.parseFloat(Fsub);
       
        try {
            //txtUnidades.setText(String.valueOf(unidades - cantidad));
            float resultado = subTotal + Total;
            txtTotalFinal.setText(String.valueOf(resultado));
            //ModificarUnidades();
            modelo.setRowCount(0);
            MostrarBD();
            limpiartTxt();

        }catch (NumberFormatException e){

        }
    }
    
     public void filtro(String consulta, JTable Tabla){
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        Tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    
    }
    
    public void addNewTable(){        
        ID =txtID.getText();
        String nombre =txtProducto.getText();
        String total =txtPrecio.getText();
        String Subtotal =txtSubtotal.getText();
        int cantidad = Integer.parseInt(txtCantidad.getValue().toString());

        // -----------------------------------------------------
            Object datos[] = new Object[]{
                ID,
                nombre,
                total,
                cantidad,
                Subtotal
        };            
         modelo2.addRow(datos);             
    }
    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        agregar();               
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void VentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentasMouseClicked
        Gestionar_Venta v = new Gestionar_Venta();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentasMouseClicked

    private void tblVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentaMouseClicked

    }//GEN-LAST:event_tblVentaMouseClicked

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Subtotal();

        }
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void txtCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtCantidadStateChanged
        Subtotal();
    }//GEN-LAST:event_txtCantidadStateChanged
    private void agregar(){
        ID =txtID.getText();        
        int cantidad = Integer.parseInt(txtCantidad.getValue().toString());
        double total = Double.parseDouble(txtTotalFinal.getText());
        double Subtotal = Double.parseDouble(txtSubtotal.getText());
        
        for (int i = 0; i < modelo2.getRowCount(); i++) {
        String idTable = modelo2.getValueAt(i, 0).toString();

            if (ID.equals(idTable)) {
                // Si se encuentra el ID, actualizar la cantidad correspondiente
                int cantidadActual = Integer.parseInt(modelo2.getValueAt(i, 3).toString());
                int cantidadIngresada = cantidadActual + cantidad;
                modelo2.setValueAt(cantidadIngresada, i, 3);
                
                double subtotalActual = Double.parseDouble(modelo2.getValueAt(i, 4).toString());
                double nuevoSubTotal = subtotalActual + Subtotal;
                modelo2.setValueAt(nuevoSubTotal, i, 4);
                
                // Actualizar el total basado en el precio del producto
                double precio = Double.parseDouble(modelo2.getValueAt(i, 2).toString());
                double nuevoCantidad = precio * cantidad;
                double nuevoTotal = nuevoCantidad + total;
                                              
                txtTotalFinal.setText(String.valueOf(nuevoTotal));
                
                return; // salir del método ya que se encontró el ID
            }
        }
        // Si no se encontró el ID, agregar una nueva fila con el ID y la cantidad ingresada
        addNewTable();
        agregarTotal();
    }
    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        pruebas();
        //Insertar();
        //InsertarDatosTabla(); 
        
    }//GEN-LAST:event_btnPagarActionPerformed

    private void tblVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblVentaKeyReleased
       
    }//GEN-LAST:event_tblVentaKeyReleased

    private void txtBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscar2ActionPerformed

    private void txtBuscar2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscar2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscar2KeyPressed

    private void txtBuscar2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscar2KeyReleased
         filtro(txtBuscar2.getText(), tblVenta);
    }//GEN-LAST:event_txtBuscar2KeyReleased

    private void Buscar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buscar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Buscar3MouseClicked

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
       String Save = txtTotalFinal.getText();
               Gestionar_CorteFin Corte = new Gestionar_CorteFin();
                Corte.setCampoSave(Save); 
                Corte.setVisible(true); // Mostrar la otra ventana
         this.dispose();
        
    }//GEN-LAST:event_BtnSaveActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Realizar_Venta().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSave;
    private javax.swing.JLabel Buscar2;
    private javax.swing.JLabel Buscar3;
    private javax.swing.JLabel Ventas;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblRegistroVenta;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscar2;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtLlegada;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotalFinal;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}
