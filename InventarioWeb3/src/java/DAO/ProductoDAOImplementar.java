package DAO;    

import Model.*;
import java.util.List;
import Factory.ConexionBD;
import Factory.FactoryConexionBD;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ProductoDAOImplementar implements ProductoDAO{
    ConexionBD conn;//La variable conexion
    public ProductoDAOImplementar() {
        //la conexionpara la definicion de la bd que s econectara por defecto
        //this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        
    }

    @Override
    public List<Producto> Listar() {
        java.util.Date utilDate = new java.util.Date();
        long InMilisegundos = utilDate.getTime();
       // java.sql.Date sqlDate = new java.sql.Date(InMilisegundos);
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(InMilisegundos);
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("SELECT * FROM tb_producto; ");
        List<Producto> lista = new ArrayList<Producto>();
        try{
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                Producto producto = new Producto();
               
                producto.setId_producto(resultadoSQL.getInt("id_producto"));
                producto.setNom_producto(resultadoSQL.getString("nom_producto"));
                producto.setStock(resultadoSQL.getDouble("stock"));
                producto.setPrecio(resultadoSQL.getDouble("precio"));
                producto.setUnidad_de_medida(resultadoSQL.getString("unidad_de_medida"));
                producto.setEstado_producto(resultadoSQL.getInt("estado_producto"));
                producto.setCategoria(resultadoSQL.getInt("categoria"));
                producto.setDes_producto(resultadoSQL.getString("des_producto"));
                producto.setFecha_entrada(sqlTimestamp);
           
                lista.add(producto);
                
            }
        }catch(Exception ex){
        }finally{
            this.conn.cerrarConexion();
        }
        return lista;
    }

    @Override
    public List<Producto> Listar2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto editarPro(int id_pro_edit) {
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        Producto producto = new Producto();
        Categoria c = new Categoria();
        StringBuilder miSQL = new StringBuilder();
        
        miSQL.append("SELECT * FROM tb_producto WHERE id_producto = ").append(id_pro_edit);
        try{
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                 producto.setId_producto(resultadoSQL.getInt("id_producto"));
                 producto.setNom_producto(resultadoSQL.getString("nom_producto"));
                 producto.setStock(resultadoSQL.getDouble("stock"));
                 producto.setPrecio(resultadoSQL.getDouble("precio"));
                 producto.setUnidad_de_medida(resultadoSQL.getString("unidad_de_medida"));
                 producto.setEstado_producto(resultadoSQL.getInt("estado_producto"));
                 producto.setCategoria(resultadoSQL.getInt("categoria"));
                 producto.setDes_producto(resultadoSQL.getString("des_producto"));
                 producto.setFecha_entrada(resultadoSQL.getDate("fecha_entrada"));
                 
            }
        }catch(Exception e){
        }finally{
            this.conn.cerrarConexion();
        }
        return producto;
    }

    @Override
    public boolean guardarPro(Producto producto) {
        this.conn  = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        boolean guarda = false;
        
        try{
            if (producto.getId_producto()==0) {
                StringBuilder miSQL = new StringBuilder();
                
                miSQL.append("SELECT INTO tb_producto(nom_producto, stock, precio, unidad_de_medida, estado_producto, categoria, des_producto, fecha_entrada)");
                miSQL.append(producto.getNom_producto()+ "', ").append(producto.getStock()+"', ").append(producto.getPrecio()+"', ")
                     .append(producto.getUnidad_de_medida()+"', ").append(producto.getEstado_producto()+"', ").append(producto.getCategoria()+"', ")
                     .append(producto.getDes_producto()+"', ").append(producto.getFecha_entrada());
                miSQL.append(");");
                this.conn.ejecutarSQL(miSQL.toString());
            }else if (producto.getId_producto()>0){
                
                  // Comprobación para actualizar...
               System.out.println("Entramos...");
               StringBuilder miSQL = new StringBuilder();
               miSQL.append("UPDATE tb_producto SET id = ").append(producto.getId_producto());
                miSQL.append(", nom_producto =  '").append(producto.getNom_producto());
               miSQL.append("', stock = ' ").append(producto.getStock());
               miSQL.append("', precio = ' ").append(producto.getPrecio());
               miSQL.append("', unidad_de_mediad ='  ").append(producto.getUnidad_de_medida());
               miSQL.append(" ', estado_producto = ' ").append(producto.getEstado_producto());
               miSQL.append("', categoria =  ").append(producto.getCategoria());
               miSQL.append(", des_producto =  ").append(producto.getDes_producto());
               miSQL.append(", fecha_entrada = ' ").append(producto.getFecha_entrada());
              miSQL.append("'WHERE id = ").append(producto.getId_producto()).append(";");
             //  Invocar método para ejecutar la consulta.
              this.conn.ejecutarSQL(miSQL.toString());
            System.out.println("Registro modificado correctamente!");
                //    System.out.println("este es mi erro
                
                
                
                
            }
        }catch(Exception e){
        }finally{
            this.conn.cerrarConexion();
        }
        return guarda;
    }

    @Override
    public boolean borrarPro(int id_pro_borrar) {
        this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
        boolean borrar = false;
        try{
            StringBuilder miSQL = new StringBuilder();
            miSQL.append("DELETE FROM tb_producto WHERE id_producto = ").append(id_pro_borrar);
            this.conn.ejecutarSQL(miSQL.toString());
            borrar = true;
        }catch(Exception e){
            
        }finally{
            this.conn.cerrarConexion();
        }
        return borrar;
    }
    
}

