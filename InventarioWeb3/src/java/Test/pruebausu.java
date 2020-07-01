/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import DAO.UsuarioDAO;
import DAO.UsuarioDAOImplementar;
import Model.Usuario;
import java.util.List;

/**
 *
 * @author PC
 */
public class pruebausu {
    public static void main(String[] args) {
        pruebausu evaluar = new pruebausu();
        evaluar.guardarUsuario();
        evaluar.listarUsuarios();
        //evaluar.eliminarUsuario();
        //evaluar.listarUsuarios();
        //evaluar.editarUsuario();
        //evaluar.listarUsuarios();
    }
    
    public void listarUsuarios(){
        UsuarioDAO usuario = new UsuarioDAOImplementar();
        List<Usuario> listar = usuario.Listar();
        System.out.println("LISTADO DE CATEGORIAS");
        for(Usuario usuarioListar: listar){
            System.out.println("ID: "+ usuarioListar.getId() +
                            "   NOMBRE: " + usuarioListar.getNombre() +
                            "   Apellido: " + usuarioListar.getApellido()+
                            "   Correo: "+ usuarioListar.getCorreo()+
                            "   Usuario:"+ usuarioListar.getUsuario()+
                            "   Clave: "+ usuarioListar.getClave()+
                            "   Tipo: "+ usuarioListar.getTipo()+
                            "   Estado: "+ usuarioListar.getEstado()+"\n"+
                            "   Pregunta: "+ usuarioListar.getPregunta()+
                            "   Respuesta: "+ usuarioListar.getRespuesta()+
                            "   Fecha de registro : "+ usuarioListar.getFecha_registro()
                    
            );
        }
    
}
     public void editarUsuario(){
        UsuarioDAO usuario = new UsuarioDAOImplementar();
        Usuario usu_edit = usuario.editarUsu(1);
        System.out.println("CATEGORIA A MODIFICAR");
        System.out.println("ID: "+ usu_edit.getId() +
                        "   NOMBRE: " + usu_edit.getNombre() +
                        "   Apellido: " + usu_edit.getApellido()+
                        "   Corre: " + usu_edit.getCorreo()+
                        "   Usuario:"+ usu_edit.getUsuario()+
                        "   Clave: " + usu_edit.getClave()+
                        "   Tipo: " + usu_edit.getTipo()+
                        "   Estado: " + usu_edit.getEstado()+"\n"+
                        "   Pregunta: " + usu_edit.getPregunta()+
                        "   Respuesta: " + usu_edit.getRespuesta()+
                        "   fecha de registro: " + usu_edit.getFecha_registro()

        );
    } 
    
     
     public void guardarUsuario(){   
        //java.util.Date utilDate = null;
        //java.sql.Date sqlDate = new java.sql.Date(0);
        //utilDate =sqlDate;
        java.util.Date utilDate = new java.util.Date();
        long InMilisegundos = utilDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(InMilisegundos);
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(InMilisegundos);
         
        UsuarioDAO usuario = new UsuarioDAOImplementar();
        Usuario guardar_usu = new Usuario();
        guardar_usu.setId(18);
        guardar_usu.setNombre("ya edita");               //Modificar la categoria registrada anteriormente.
        guardar_usu.setApellido("so"); 
        guardar_usu.setCorreo("probar@");
        guardar_usu.setUsuario("dale que podes");
        guardar_usu.setClave("4321editar"); 
        guardar_usu.setTipo(1); 
        guardar_usu.setEstado(3); 
        guardar_usu.setPregunta("ojala"); 
        guardar_usu.setRespuesta("que si"); 
        guardar_usu.setFecha_registro(sqlTimestamp);
         
        usuario.guardarUsu(guardar_usu);
    }
    
    public void eliminarUsuario(){
        UsuarioDAO usuario = new UsuarioDAOImplementar();
        usuario.borrarUsu(11);
        
    }
    
    
    
}
    
    
    



