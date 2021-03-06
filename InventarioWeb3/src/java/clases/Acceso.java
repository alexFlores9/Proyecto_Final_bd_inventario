
package clases;
import java.sql.*;
import javax.ws.rs.NotFoundException;

/**
 *
 * @author PC
 */
public class Acceso {
    Database db=new Database();
    String sql="";
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Acceso() {
    }

    public int validar(String usuario, String contra) {
        int tipo=0;
        try{
            Class.forName(db.getDiver());
            con=DriverManager.getConnection(db.getUrl(),db.getUser(), db.getContra());
            sql= "SELECT tipo FROM tb_usuario WHERE usuario='"+usuario+"' AND clave='"+contra+"'";
            
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
    //public int validarREC(String usuario, String pregunta) {
       public int validarREC(String usuario) {
        int tipo=0;
        try{
            Class.forName(db.getDiver());
            con=DriverManager.getConnection(db.getUrl(),db.getUser(), db.getPregunta());
            //sql= "SELECT tipo FROM tb_usuario WHERE usuario='"+usuario+"' AND pregunta='"+pregunta+"' AND clave ";
            sql = "SELECT tipo FROM tb_usuario WHERE usuario='"+usuario+"'";
            
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
    
       public int preguntaUsuario(String pregunta) {
        int tipo=0;
        try{
            Class.forName(db.getDiver());
            con=DriverManager.getConnection(db.getUrl(),db.getUser(), db.getPregunta());
            sql = "SELECT tipo FROM tb_usuario WHERE pregunta='"+pregunta+"'";
            
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
