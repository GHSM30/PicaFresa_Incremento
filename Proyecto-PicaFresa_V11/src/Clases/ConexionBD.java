package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

    public static String url = "jdbc:mysql://localhost:3306/BD_PicaFresa?serverTimezone=America/Mexico_City"; // URL de la base de datos
    public static String user = "root"; // Usuario de la base de datos



    public static String password = "12345678"; // Contraseña de la base de datos

    public static String clase = "com.mysql.cj.jdbc.Driver";

    public static Connection conectar() {
        Connection conexion = null;

        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println(e);
        }
        return conexion;
    }
}
