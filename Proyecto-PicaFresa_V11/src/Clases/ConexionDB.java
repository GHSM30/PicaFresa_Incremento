package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDB {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost/BD_PicaFresa"; // URL de la base de datos
            String user = "root"; // Usuario de la base de datos
            String password = "123Guillermillo2001"; // Contraseña de la base de datos
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión establecida.");
        } catch (SQLException e) {
            System.out.println("No se pudo establecer la conexión: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }
    
}
