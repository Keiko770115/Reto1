
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    //1. Crear la instancia de la clase Connection del JAR JDBC
    Connection connection;
    
    //2. Añadimos el constructor de la clase sin argumentos
    
    public Conexion () {
        // Intentar hacer conexion con la base de datos desde el constructor de la clase
        // Intentar hacer algo.....
        try  {
            //4. Buscamos la clase dentro JAR que coincide con este nombre
            Class.forName("com.mysql.cj.jdbc.Driver");
            //5. Llamamos la instancia connection a la cual le enviamos los parametros 
            //de conexion con la base de datos (cadena de conexion, usuario,contraseña)
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reto1_g56_db", "root","");
            if(connection != null){
                System.out.println("Conexion exitosa");         
            }
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println("Conexion fallida");
            
        }
    }
    
    //6. Creamos una funcion que retorne la connection de la clase
    public Connection getConnection(){
        return connection;        
    }
    
}
