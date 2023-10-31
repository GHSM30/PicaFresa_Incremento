package Formularios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Clases.ConexionBD;
import Clases.Metodos_sql;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Gestionar_Factura extends javax.swing.JFrame {
    
    int idc;
    int ren=0;
    ConexionBD conexion = new ConexionBD();
    Connection conn;
    DefaultTableModel factura;
    Statement st;
    ResultSet rs;
    int id = 0;
    
    private static Connection con;
    Metodos_sql metodos = new Metodos_sql();
    
    public Gestionar_Factura() {
        initComponents();
        this.setLocationRelativeTo(this);
        factura = (DefaultTableModel) tblFacturas.getModel();
        llenarTablaF();
        txtLlegada.setEditable(false);
        fechaSistema();
        llenarCmbProveedor();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFacturas = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jdchCaducidad = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        btnAgregarF = new javax.swing.JLabel();
        btnModificarF = new javax.swing.JLabel();
        Limpieza1 = new javax.swing.JLabel();
        txtLlegada = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        lblFacturas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

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
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 172, 16));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 100, 20));

        jLabel7.setFont(new java.awt.Font("Mshtakan", 0, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Facturas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 560, -1));

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
        jPanel1.add(Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 70, 50));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("Facturas");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 70, 20));

        tblFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Fecha Llegada", "Fecha Caducidad", "Estado", "Proveedor"
            }
        ));
        tblFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFacturasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblFacturas);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 560, 200));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Proveedor");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 100, -1));

        jdchCaducidad.setDateFormatString("dd-MM-YYYY");
        jdchCaducidad.setFocusable(false);
        jPanel1.add(jdchCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 270, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fecha Caducidad");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 100, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONAR-", "Pendiente", "Completada" }));
        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 270, -1));

        btnAgregarF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregar-usuario.png"))); // NOI18N
        btnAgregarF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarFMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 40, 40));

        btnModificarF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editar.png"))); // NOI18N
        btnModificarF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarFMouseClicked(evt);
            }
        });
        jPanel1.add(btnModificarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 40, 40));

        Limpieza1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/limpieza.png"))); // NOI18N
        Limpieza1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Limpieza1MouseClicked(evt);
            }
        });
        jPanel1.add(Limpieza1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 40, 40));
        jPanel1.add(txtLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 270, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fecha Llegada");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 100, -1));

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONAR-" }));
        jPanel1.add(cmbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 270, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setText("Almacen");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 70, 20));

        lblFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Factura.png"))); // NOI18N
        lblFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFacturasMouseClicked(evt);
            }
        });
        jPanel1.add(lblFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 60, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/devolver.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 70, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 93, 70, 30));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 410, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void agregarFactura(){
        String fechaLlegada = txtLlegada.getText();
        String fechaCaducidad = ((JTextField)jdchCaducidad.getDateEditor().getUiComponent()).getText();
        String Estado = cmbEstado.getSelectedItem().toString();
        
        if(caducidadValida(fechaLlegada,fechaCaducidad)){            
            try{
                String sql = "INSERT INTO Factura (Fecha_llegada,Fecha_caducidad,Estado,Proveedor_idProveedor)"
                        + "VALUES('" + fechaLlegada + "','" + fechaCaducidad + "', '" + Estado +"','"+cmbProveedor.getSelectedItem().toString().substring(0,1)+"')";
                conn = conexion.conectar();
                st = conn.createStatement();
                st.executeUpdate(sql);
                System.out.println("Factura Registrada");
            
                showMessageDialog(this, "Factura Registrada");
                llenarTablaF();
                cmbProveedor.setSelectedIndex(0);
                cmbEstado.setSelectedIndex(0);
                jdchCaducidad.setDate(null);

            }catch(Exception error){
                System.out.println("ERROR al registrar Factura\n" + error);
            }
        }else{
            showMessageDialog(this, "Fecha de caducidad inválida, verifique que la fecha de caducidad no esté vencida");
        } 
    }
    //-------------------------------------------------------------------------------------------
    private void modificarFactura(){
        try{
            String sql = "UPDATE Factura SET Estado='Completada' WHERE idFactura="+id+"";
            conn = conexion.conectar();
            st = conn.createStatement();
            st.executeUpdate(sql);
            
            llenarTablaF();
            limpiarcasillasFactura();
            showMessageDialog(this, "Estado de Factura Modificado");

        }catch(Exception error){
            System.out.println("ERROR al modificar Factura\n" + error);
        }
    }
    //-------------------------------------------------------------------------------------------
    public void llenarTablaF(){
            factura.setRowCount(0);
            String sql = "SELECT idFactura,Fecha_llegada,Fecha_caducidad,Estado,Nombre_proveedor FROM FACTURA,PROVEEDOR WHERE id_proveedor=Proveedor_idProveedor";
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
                    datos[4] = rs.getString(5);

                    factura.addRow(datos);
                }
                tblFacturas.setModel(factura);
            } catch (SQLException error) {
                System.out.println("Error en Mostrar Tabla Factura" + error);
            }
        }//MostrarDatos
    //-------------------------------------------------------------------------------------------
    private void fechaSistema(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaLlegada = (dtf.format(LocalDateTime.now()));
        txtLlegada.setText(fechaLlegada);
    }
    //-------------------------------------------------------------------------------------------
    private boolean caducidadValida(String llegada, String caducidad){
        String[] f_llegada = llegada.split("-");
        String[] f_caducidad = caducidad.split("-");
        int[] fechaLlegada = new int[3];
        int[] fechaCaducidad = new int[3];
        
        for(int i=0; i<3; i++){
           fechaLlegada[i] = Integer.parseInt(f_llegada[i]);
           fechaCaducidad[i] = Integer.parseInt(f_caducidad[i]);
        }
        
        if(fechaCaducidad[2]>fechaLlegada[2]) return true;
        if(fechaCaducidad[2]==fechaLlegada[2] && (fechaCaducidad[1]>fechaLlegada[1]) || fechaCaducidad[0]>fechaLlegada[0]) return true;
        if(fechaCaducidad[1]==fechaLlegada[1] && (fechaCaducidad[2]>fechaLlegada[2]) || fechaCaducidad[0]>fechaLlegada[0]) return true;
        if(fechaCaducidad[0]==fechaLlegada[0] && (fechaCaducidad[1]>fechaLlegada[1]) || fechaCaducidad[2]>fechaLlegada[2]) return true;
        if(fechaCaducidad[0]>fechaLlegada[0] && (fechaCaducidad[1]>fechaLlegada[1]) && fechaCaducidad[2]>fechaLlegada[2]) return true;
            
        return false;
    }
    //-------------------------------------------------------------------------------------------
    private void limpiarcasillasFactura(){
        fechaSistema();
        cmbEstado.setSelectedIndex(0);
        cmbProveedor.setSelectedIndex(0);
        ((JTextField)jdchCaducidad.getDateEditor().getUiComponent()).setText("");
        id = 0;
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
                tblFacturas.setModel(factura);
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

    private void btnAgregarFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarFMouseClicked
        if(cmbProveedor.getSelectedIndex()!=0)
            if(!((JTextField)jdchCaducidad.getDateEditor().getUiComponent()).getText().equals(""))
                if(cmbEstado.getSelectedIndex()!=0)
                    agregarFactura();
                else
                    showMessageDialog(this, "Estado no seleccionado");                
            else
                showMessageDialog(this, "Fecha de caducidad no establecida");
        else
            showMessageDialog(this, "Seleccione a un Proveedor");
    }//GEN-LAST:event_btnAgregarFMouseClicked

    private void btnModificarFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarFMouseClicked
        if(id!=0){
            if(cmbEstado.getSelectedIndex()==2){
                int resp = JOptionPane.showConfirmDialog(this,"¿Está seguro de cambiar el estado de la Factura?\n"
                        + "Una vez cambie el estado a 'Completada' no podrá registrar más productos con esta Factura","",YES_NO_OPTION);
                if(resp==0) 
                    modificarFactura();
                else 
                    showMessageDialog(this, "Estado de Factura no modificado");
                
                limpiarcasillasFactura();
                jdchCaducidad.setEnabled(true); 
            }
            else showMessageDialog(this, "Seleccionar una opción valida para el Estado de la factura");
        }
        else showMessageDialog(this, "Selecciona una factura en la tabla para poder editar su Estado");                
    }//GEN-LAST:event_btnModificarFMouseClicked

    private void Limpieza1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Limpieza1MouseClicked
        limpiarcasillasFactura();
    }//GEN-LAST:event_Limpieza1MouseClicked

    private void tblFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFacturasMouseClicked
        String fechaLlegada = tblFacturas.getValueAt(tblFacturas.getSelectedRow(), 1).toString();
        String fechaCaducidad = tblFacturas.getValueAt(tblFacturas.getSelectedRow(), 2).toString();
        String Estado = tblFacturas.getValueAt(tblFacturas.getSelectedRow(), 3).toString();
        id = Integer.parseInt(tblFacturas.getValueAt(tblFacturas.getSelectedRow(), 0).toString());
        
        txtLlegada.setText(fechaLlegada);
        ((JTextField)jdchCaducidad.getDateEditor().getUiComponent()).setText(fechaCaducidad);
        cmbEstado.setSelectedItem(Estado);
        
        jdchCaducidad.setEnabled(false);
    }//GEN-LAST:event_tblFacturasMouseClicked

    private void lblFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFacturasMouseClicked
        Gestionar_Factura v = new Gestionar_Factura();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblFacturasMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Principal v = new Principal();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtro(txtBuscar.getText(), tblFacturas);
    }//GEN-LAST:event_txtBuscarKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestionar_Almacen().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Almacen;
    private javax.swing.JLabel Corte;
    private javax.swing.JLabel Devoluciones;
    private javax.swing.JLabel Limpieza1;
    private javax.swing.JLabel Productos;
    private javax.swing.JLabel Proveedor;
    private javax.swing.JLabel Ventas;
    private javax.swing.JLabel btnAgregarF;
    private javax.swing.JLabel btnModificarF;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private com.toedter.calendar.JDateChooser jdchCaducidad;
    private javax.swing.JLabel lblFacturas;
    public javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTable tblFacturas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtLlegada;
    // End of variables declaration//GEN-END:variables
}