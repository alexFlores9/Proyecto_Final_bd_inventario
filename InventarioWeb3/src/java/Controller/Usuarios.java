/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UsuarioDAO;
import DAO.UsuarioDAOImplementar;
import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC
 */
public class Usuarios extends HttpServlet {
 
    protected void listaUsuarios(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        UsuarioDAO usuario = new UsuarioDAOImplementar();
       
       HttpSession sesion= request.getSession(true);
       sesion.setAttribute("listaa", usuario.Listar());
       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Usuarios/listarUsuarios.jsp");
       dispatcher.forward(request, response);
      
    }
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        //processRequest(request, response);
        //Se captura el parámetro que se esta enviando.
        String parametro = request.getParameter("opcion");
        //System.out.println(parametro);
        
        //Evaluar si el parámetro es crear o listar o cualquier otro.
        if(parametro.equals("crear")){
           //Vista o formulario para registrar nueva categoria.
            String pagina = "/Vistas-Usuarios/crearUsuario.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            
        }else if(parametro.equals("listar")){
            this.listaUsuarios(request, response);
            
        }else if(parametro.equals("modificar")){
            //Se efectua el casting o conversión de datos porque lo ingresado en el formulario es texto.
            int id = Integer.parseInt(request.getParameter("id_u"));
            String nombre = request.getParameter("nombre_u");
            String apellido = request.getParameter("apellido_u");
            String correo = request.getParameter("correo_u");
            String usuario = request.getParameter("usuario_u");
            String clave= request.getParameter("clave_u");
            int tipo= Integer.parseInt(request.getParameter("tipo_u"));
            int estado = Integer.parseInt(request.getParameter("estado_u"));
            String pregunta= request.getParameter("pregunta_u");
            String respuesta = request.getParameter("respuesta_u");
                
            String pagina = "/Vistas-Usuarios/crearUsuario.jsp?id_u="+id+"&&nombre_u="+nombre+"&&apellido_u="+apellido+"&&correo_u="+correo+"&&usuario_u="+usuario+"&&clave_u="+clave+"&&tipo_u="+tipo+"&&estado_u="+estado+"&&pregunta_u="+pregunta+"&&respuesta_u="+respuesta+"&&senal=1";
          
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            
        }else if(parametro.equals("eliminar")){
            int del_id = Integer.parseInt(request.getParameter("id"));
            UsuarioDAO usuario = new UsuarioDAOImplementar();
            usuario.borrarUsu(del_id);
       this.listaUsuarios(request, response);
        }
        
    }
    //this.listaUsuarios(request, response);
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Usuario usuarioo = new Usuario();
             
            //Se efectua el casting o conversión de datos porque lo ingresado en el formulario es texto.
            int id = Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("txtNomUsuario");
            String apellido = request.getParameter("txtApellidoUsuario");
            String correo = request.getParameter("txtCorreoUsuario");
            String usuario = request.getParameter("txtUsuarioUsuario");
            String clave = request.getParameter("txtClaveUsuario");
            int tipo = Integer.parseInt(request.getParameter("txtTipoUsuario"));
            int estado = Integer.parseInt(request.getParameter("txtEstadoUsuario"));
            String pregunta = request.getParameter("txtPreguntaUsuario");
            String respuesta = request.getParameter("txtRespuestaUsuario");
        
            usuarioo.setId(id);
            usuarioo.setNombre(nombre);
            usuarioo.setApellido(apellido);
            usuarioo.setCorreo(correo);
            usuarioo.setUsuario(usuario);
            usuarioo.setClave(clave);
            usuarioo.setTipo(tipo);
            usuarioo.setEstado(estado);
            usuarioo.setPregunta(pregunta);
            usuarioo.setRespuesta(respuesta);        
            UsuarioDAO guardarUsuario = new UsuarioDAOImplementar();
            guardarUsuario.guardarUsu(usuarioo);
            response.sendRedirect(request.getContextPath()+"/index.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
