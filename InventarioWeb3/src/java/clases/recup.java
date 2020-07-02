/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.*;
import javax.ws.rs.NotFoundException;

/**
 *
 * @author PC
 */
public class recup {
    Database db=new Database();
    String sql="";
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public recup() {
    }

    public int validar(String usuario) {
        int tipo=0;
        try{
            Class.forName(db.getDiver());
            con=DriverManager.getConnection(db.getUrl(),db.getUser(), db.getContra());
            sql= "SELECT tipo FROM tb_usuario WHERE usuario='"+usuario+"";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
               
            while(rs.next()){
                tipo=rs.getInt(1);
                
            }
            con.close();
            rs.close();
            return tipo;
        }catch(SQLException | ClassNotFoundException e){
            return tipo; 
        }   
    }
}
