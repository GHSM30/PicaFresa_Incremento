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


public class Gestionar_Usuario extends javax.swing.JFrame {
    
    int idc;
    int ren=0;
    ConexionBD conexion = new ConexionBD();
    Connection conn;
    DefaultTableModel modelo2;
    Statement st;
    ResultSet rs;
    
    private static Connection con;
    Metodos_sql metodos = new Metodos_sql();
    
    public Gestionar_Usuario() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        modelo2 = (DefaultTableModel) tablaUsuario.getModel();
        
        MostrarBDetalle();
    }
String[] datos = new String[5];
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtId2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lGJPanelGradient1 = new components.LGJPanelGradient();
        lGJPanelGradientBassic3 = new components.LGJPanelGradientBassic();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        Agregar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JLabel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lGJPanelGradient1.setBackground(new java.awt.Color(153, 0, 204));
        lGJPanelGradient1.setForeground(new java.awt.Color(153, 0, 204));
        lGJPanelGradient1.setBGColorGradientDos(new java.awt.Color(240, 240, 240));
        lGJPanelGradient1.setBGColorGradientUno(new java.awt.Color(240, 240, 240));

        lGJPanelGradientBassic3.setLGBackgroundColor(new java.awt.Color(240, 240, 240));
        lGJPanelGradientBassic3.setLGGradientColorOne(new java.awt.Color(240, 240, 240));
        lGJPanelGradientBassic3.setLGGradientColorTwo(new java.awt.Color(240, 240, 240));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel15.setText("Gestionar Usuario");

        javax.swing.GroupLayout lGJPanelGradientBassic3Layout = new javax.swing.GroupLayout(lGJPanelGradientBassic3);
        lGJPanelGradientBassic3.setLayout(lGJPanelGradientBassic3Layout);
        lGJPanelGradientBassic3Layout.setHorizontalGroup(
            lGJPanelGradientBassic3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
            .addGroup(lGJPanelGradientBassic3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lGJPanelGradientBassic3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        lGJPanelGradientBassic3Layout.setVerticalGroup(
            lGJPanelGradientBassic3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
            .addGroup(lGJPanelGradientBassic3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lGJPanelGradientBassic3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel16.setText("Buscar:");

        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Usuario", "Usuario", "Tipo Usuario", "RFC", "Nombre_Usuario"
            }
        ));
        tablaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaUsuario);

        Agregar.setText("Registrar / Modificar");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Regresar ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout lGJPanelGradient1Layout = new javax.swing.GroupLayout(lGJPanelGradient1);
        lGJPanelGradient1.setLayout(lGJPanelGradient1Layout);
        lGJPanelGradient1Layout.setHorizontalGroup(
            lGJPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lGJPanelGradient1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel16)
                .addGap(41, 41, 41)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 238, Short.MAX_VALUE))
            .addGroup(lGJPanelGradient1Layout.createSequentialGroup()
                .addGroup(lGJPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lGJPanelGradient1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lGJPanelGradientBassic3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lGJPanelGradient1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lGJPanelGradient1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        lGJPanelGradient1Layout.setVerticalGroup(
            lGJPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lGJPanelGradient1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lGJPanelGradientBassic3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(lGJPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(lGJPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lGJPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(229, 229, 229))
        );

        jPanel1.add(lGJPanelGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 830, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void MostrarBDetalle() {
            String sql = "SELECT * FROM  Usuario";
            conn = conexion.conectar();
            System.out.println(sql);
            
            try {
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(4);
                    datos[3] = rs.getString(5);
                    datos[4] = rs.getString(6);
                    
                    modelo2.addRow(datos);

                }
                tablaUsuario.setModel(modelo2);
            } catch (SQLException error) {
                System.out.println("Error en Mostrar Tabla" + error);
            }
        }//MostrarDatos
        

      public void Eliminar() {
        String ID = "";
        try{
            String sql = "SELECT id_Usuario FROM Usuario WHERE Usuario='" + datos[1]+"'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ID = rs.getString(1);
                System.out.println(ID);
            }
            System.out.println("ID encontrado");
        }catch(Exception error){
            System.out.println("Usuario NO encontrado para su eliminación" + error);
        }
        
        int fila = tablaUsuario.getSelectedRow();
        String valor =  tablaUsuario.getValueAt(fila, 0).toString();
        try {
            if (fila < 0) {
                showMessageDialog(this, "usuario no seleccionado");
                
            } else {
                int idS=Integer.parseInt(ID);
                String sql = "DELETE FROM Usuario where id_Usuario ="+valor;
                conn = conexion.conectar();
                st = conn.createStatement();
                st.executeUpdate(sql);
                showMessageDialog(this, "Usuario eliminado");
        
                ren = fila-1;
            }
        } catch (Exception error) {
            System.out.println("Error en eliminar" + error);
        }
        
    }
      
    
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtro(txtBuscar.getText(), tablaUsuario);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        Eliminar();
        modelo2.setRowCount(0);
        MostrarBDetalle();
    }//GEN-LAST:event_EliminarMouseClicked

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        Registro_Usuarios u = new Registro_Usuarios();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarMouseClicked

    private void tablaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuarioMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tablaUsuarioMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Principal v = new Principal();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked
    
    public void filtro(String consulta, JTable Tabla){
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
        Tabla.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestionar_Usuario().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agregar;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private components.LGJPanelGradient lGJPanelGradient1;
    private components.LGJPanelGradientBassic lGJPanelGradientBassic3;
    private javax.swing.JTable tablaUsuario;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtId2;
    // End of variables declaration//GEN-END:variables
}
