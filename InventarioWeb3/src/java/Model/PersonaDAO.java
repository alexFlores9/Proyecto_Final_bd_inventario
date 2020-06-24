/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author alex
 */
public class PersonaDAO  implements Validar {
Connection cnn;
Conexion cn = new Conexion();
PreparedStatement ps;
ResultSet rs;
int r=0;

    @Override
    public int Validar(Persona per) {
        int r=0;
       String sql= "Select * from tb_usuario where usuario=? and clave=?";
       try{
           cnn= cn.getConnection();
           ps=cnn.prepareStatement(sql);
           ps.setString(1, per.getNom());
           ps.setString(2, per.getCorreo());
           rs=ps.executeQuery();
           while (rs.next()){
               r=r+1;
           per.setNom(rs.getString("Nombre"));
           per.setCorreo(rs.getString("Correo"));
           }
           if(r==1){
           return 1;
           }else{
           return 0;
           }
       }catch (Exception e){
         return 0;
       }
       
    }
    
    
}
