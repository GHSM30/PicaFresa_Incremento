
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
            String sql = "SELECT id_Usuario,Usuario FROM Usuario";
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
        cmbUsuario = new javax.swing.JComboBox<>();
        InicioSesio1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(65, 153, 182));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 20));

        InicioSesio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InicioSesio.setText("Iniciar sesión");
        InicioSesio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioSesioMouseClicked(evt);
            }
        });
        jPanel1.add(InicioSesio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

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
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 180, 30));

        cbPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPassActionPerformed(evt);
            }
        });
        jPanel1.add(cbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, 30));

        cmbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONAR-" }));
        cmbUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUsuarioItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 180, 30));

        InicioSesio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        InicioSesio1.setText("Restablecer contraseña");
        InicioSesio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioSesio1MouseClicked(evt);
            }
        });
        jPanel1.add(InicioSesio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Bienvenido a PikaFresa");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void IniciarSesion2(){
        conn = null;
        rs = null;
        stmt = null;
           
        String pass = txtContra.getText();
        String usuarioSeleccionado = cmbUsuario.getSelectedItem().toString().split(" ")[0];
    
        if (cmbUsuario.getSelectedIndex()==0 || pass.equals("") ) {
            JOptionPane.showMessageDialog(this, "Un campo está vacio");
        }else{
            try {
            
            String sql = "SELECT * FROM Usuario WHERE Id_usuario = ? AND contraseña = ?";
            
            conn = conexion.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuarioSeleccionado);
            stmt.setString(2, pass);
            
            rs = stmt.executeQuery();
            
            
           
            
            if (rs.next()) {
                String ContraAsignada = rs.getString("contraseña");
               if("123456789".equals(ContraAsignada)){
                showMessageDialog(this, "Restablece tu contraseña, por favor"); 
                }else{ 
                
                String tipoUsuario = rs.getString("tipo_usuario");
                showMessageDialog(this, "Sesión iniciada como " + tipoUsuario);
                
                // Lógica para abrir la ventana correspondiente según el tipo de usuario
                if ("Gerente".equals(tipoUsuario)) {
                    Principal ventana = new Principal();
                    ventana.lblNombre.setText("Gerente");
                    ventana.setVisible(true);
                } else {
                    Realizar_Venta nueva = new Realizar_Venta();
                    nueva.lblNombre.setText(usuarioSeleccionado);
                    nueva.setVisible(true);
                }
                
                this.dispose();
               }
            } else {
                JOptionPane.showMessageDialog(this, "Datos incorrectos");
            }
            
            } catch (SQLException e) {
            System.err.println(e.toString());
            JOptionPane.showMessageDialog(this, "Ocurrió un problema en el servidor, espere nuevamente mientras un servidor lo soluciona.");
        }
         //String user = txtUser.getText();
        //String pass = txtContra.getText();
        //String[] idUsuario = cmbUsuario.getSelectedItem().toString().split(" ");
                /*
                String sql = "SELECT FROM Usuario (contraseña) values(?,?,?,?,?)";
        
                
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
            */
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

    private void InicioSesio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioSesio1MouseClicked
        // TODO add your handling code here:
        Restablecer_Password v = new Restablecer_Password();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InicioSesio1MouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InicioSesio;
    private javax.swing.JLabel InicioSesio1;
    private javax.swing.JCheckBox cbPass;
    private javax.swing.JComboBox<String> cmbUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContra;
    // End of variables declaration//GEN-END:variables
}
