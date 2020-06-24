/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author alex
 */
public class Conexion {
    
    Connection cnn;
    
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cnn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_inventario?zeroDateTimeBehavior=convertToNull","root","");
        }catch(Exception e){
            
        }
        return cnn;
    }
    
}
