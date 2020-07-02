/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import clases.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author PC
 */
public class RECUPERAR extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nombre;
            int tipo = 0;
            recup rec = new recup();
            RequestDispatcher rd = null;
            
            if(request.getParameter("btnRecuperar")!= null){
                nombre=request.getParameter("txtusuario");
                
                tipo = rec.validar(nombre);
                
                request.setAttribute("tipo",tipo );
                request.setAttribute("nombre", nombre);
                rd=request.getRequestDispatcher("Recuperar.jsp");
                
            }
            else if (request.getParameter("txtusuario")!=null){
                nombre=request.getParameter("txtusuario");
                
                tipo = rec.validar(nombre);
                
                request.setAttribute("tipo",tipo );
                request.setAttribute("nombre", nombre);
                
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Recuperar1.jsp");
                dispatcher.forward(request, response);
            }
            
            rd.forward(request, response);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
