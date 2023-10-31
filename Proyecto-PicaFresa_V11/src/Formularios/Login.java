
package Formularios;


import Clases.ConexionBD;
import Clases.ConexionDB;
import Clases.Metodos_sql;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login extends javax.swing.JFrame {
    
    ConexionDB cx;
    private static Connection con;
    Metodos_sql metodos = new Metodos_sql();
    ConexionBD conexion = new ConexionBD();

    Connection conn;
    Statement st;
    PreparedStatement stmt;
    ResultSet rs;
    
    public Login() {
        initComponents();
        cx = new ConexionDB();  
        this.setLocationRelativeTo(this);
        llenarCmbUsuario();
    }
    private void llenarCmbUsuario(){
            String sql = "SELECT id_Usuario, Usuario FROM Usuario";
                conn = conexion.conectar();
                System.out.println(sql);
                String[] datos = new String[2];
                try {
                    st = conn.createStatement();
                    rs = st.executeQuery(sql);
                    while (rs.next()) {
                        datos[0] = rs.getString(1);
                        datos[1] = rs.getString(2);

                        cmbUsuario.addItem(datos[0]+" - "+datos[1]);
                    }
                } catch (SQLException error) {
                    System.out.println("Error en Mostrar Tabla Factura" + error);
                }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        InicioSesio = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        cbPass = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lGJLabelIcon1 = new components.LGJLabelIcon();
        cmbUsuario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, 20));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 20));

        InicioSesio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clave.png"))); // NOI18N
        InicioSesio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioSesioMouseClicked(evt);
            }
        });
        jPanel1.add(InicioSesio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        txtContra.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        txtContra.setForeground(new java.awt.Color(204, 204, 204));
        txtContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContra.setText("Contraseña");
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 210, 30));

        cbPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPassActionPerformed(evt);
            }
        });
        jPanel1.add(cbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, 30));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Iniciar Sesion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 400));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setForeground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 605, -1));

        lGJLabelIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inicio.png"))); // NOI18N
        jPanel1.add(lGJLabelIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 170, 150));

        cmbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONAR-" }));
        cmbUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUsuarioItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 227, 210, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 610, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void IniciarSesion2(){
        String ID = "";
        conn = null;
        rs = null;
        stmt = null;
        //String user = txtUser.getText();
        String pass = txtContra.getText();
        String[] idUsuario = cmbUsuario.getSelectedItem().toString().split(" ");   
        
        if (cmbUsuario.getSelectedIndex()==0 || pass.equals("")) {
            JOptionPane.showMessageDialog(this, "Un campo está vacio");
        }else{
            try {
                
                conn = conexion.conectar();
                stmt =conn.prepareStatement("SELECT * FROM Usuario WHERE Id_usuario ='" + cmbUsuario.getSelectedItem().toString().substring(0,1) + "' and contraseña = '" + pass + "'");
                rs = stmt.executeQuery();
                
                
                if(txtContra.getText().equals("123456789")){
                showMessageDialog(this,"Sesion iniciada como Gerente");
                Principal ventana = new Principal();
                ventana.lblNombre.setText("Gerente");          
                ventana.setVisible(true);
                this.dispose();
                }
                else if (rs.next()) {
                    Realizar_Venta nueva = new Realizar_Venta();
                    Principal v = new Principal(); 
                    nueva.lblNombre.setText(cmbUsuario.getSelectedItem().toString().substring(0,1));
                    nueva.setVisible(true);
                    //this.dispose();
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Datos incorrectos");
                }
            } catch (SQLException e) {
                System.err.println(e.toString());
                JOptionPane.showMessageDialog(this, "Ocurrio un problema en el servidor, espere nuevamente en lo que un servidor lo arregla");
            }
        }
    }
    
    private void InicioSesioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioSesioMouseClicked
        IniciarSesion2();
    }//GEN-LAST:event_InicioSesioMouseClicked

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        txtContra.setText("");
        txtContra.setForeground(Color.black);
        txtContra.setFont(new java.awt.Font("Century", 1, 14));
    }//GEN-LAST:event_txtContraMousePressed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void cbPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPassActionPerformed
        if(cbPass.isSelected()==true)
        txtContra.setEchoChar((char)0);
        else
        txtContra.setEchoChar('*');
    }//GEN-LAST:event_cbPassActionPerformed

    private void cmbUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUsuarioItemStateChanged

    }//GEN-LAST:event_cmbUsuarioItemStateChanged

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InicioSesio;
    private javax.swing.JCheckBox cbPass;
    private javax.swing.JComboBox<String> cmbUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private components.LGJLabelIcon lGJLabelIcon1;
    private javax.swing.JPasswordField txtContra;
    // End of variables declaration//GEN-END:variables
}
