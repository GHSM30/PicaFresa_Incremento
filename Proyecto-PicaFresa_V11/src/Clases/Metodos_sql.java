
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Metodos_sql {
    
    public static ConexionBD conexion = new ConexionBD();
    
    public static PreparedStatement st;
    public static ResultSet Rs;
    public static String sql;
    public static int resultado;
    
    public int guardar(String usuario, String contraseña){
          
        int resultado = 0;
        Connection conexion = null;
        
        String guardar = ("INSERT INTO usuarios (nombre,contraseña) VALUES (?,?)");
        
        try{
            conexion = ConexionBD.conectar();
            st = conexion.prepareStatement(guardar);
            st.setString(1, usuario);
            st.setString(2, contraseña);
            
            resultado = st.executeUpdate();
            st.close();
            
            conexion.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return resultado;        
    }
    public int guardarProveedor(String nombre, String telefono, String RFC){
          
        int resultado = 0;
        Connection conexion = null;
        
        String guardar = ("INSERT INTO proveedor (nombre_proveedor,telefono_proveedor,RFC_proveedor) VALUES (?,?,?)");
        
        try{
            conexion = ConexionBD.conectar();
            st = conexion.prepareStatement(guardar);
            st.setString(1, nombre);
            st.setString(2, telefono);
            st.setString(2, RFC);
            
            resultado = st.executeUpdate();
            st.close();
            
            conexion.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return resultado;        
    }
    
    public static String buscarNombre(String nombre){
        
        String busqueda_nombre = null;
        Connection conexion = null;
        
        try{
            conexion = ConexionBD.conectar();
            String buscar = ("SELECT nombre FROM Usuarios WHERE nombre = '" + nombre + "'");
            st = conexion.prepareStatement(buscar);
            Rs = st.executeQuery();
            if(Rs.next()){
                String name = Rs.getString("nombre");
                busqueda_nombre = name;
            }
            conexion.close();
                    
        }catch(Exception e){        
            System.out.println(e);
        }
        return busqueda_nombre;
    }
    
    public static String buscarUsuario(String usaurio, String contraseña){
        String buscar_usuario = null;
        Connection conexion = null;
        
        try{
            conexion = ConexionBD.conectar();
            String sentencia_buscar_usuario = ("SELECT nombre FROM usuarios WHERE nombre = '" + usaurio + "' && contraseña = '" + contraseña + "'" );
            st = conexion.prepareStatement(buscar_usuario);
            Rs = st.executeQuery();
            if(Rs.next()){
                buscar_usuario = "usuario encontrado";
            }else{
                buscar_usuario = "usuario no encontrado";
            }
            conexion.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        return buscar_usuario;
        
    }
    
    
}
