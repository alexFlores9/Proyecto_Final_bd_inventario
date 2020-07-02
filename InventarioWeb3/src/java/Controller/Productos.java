
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.*;
import DAO.*;

public class Productos extends HttpServlet {

   /* protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Productos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Productos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }*/
    
    protected void listaProductos(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        response.setContentType("text/html;charset-UTF-8");
        ProductoDAO producto = new ProductoDAOImplementar();
        
       HttpSession sesion= request.getSession(true);
       sesion.setAttribute("listaaa", producto.Listar());
       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Productos/listarProductos.jsp");
       dispatcher.forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
        String parametro = request.getParameter("opcion");

        if(parametro.equals("crear")){
            String pagina = "/Vistas-Productos/crearProducto.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            
        }else if(parametro.equals("listar")){
            this.listaProductos(request, response);
            
        }else if(parametro.equals("modificar")){
            int id_pro = Integer.parseInt(request.getParameter("id_p"));
            String nombre_pro = request.getParameter("nombre_p");
            double stock_pro = Double.parseDouble("stock_p");
            double precio_pro = Double.parseDouble("precio_p");
            String unidad_pro = request.getParameter("unidad_p");
            int estado_pro = Integer.parseInt(request.getParameter("estado_p"));
           int categoria_pro = Integer.parseInt(request.getParameter("categoria_p"));
            String des_pro = request.getParameter("des_p");
                
        
            
            String pagina = "/Vistas-Productos/crearProducto.jsp?id_p="+id_pro+"&&nombre_p="+nombre_pro+"&&stock_p="+stock_pro+"&&precio_p="+precio_pro+"&&unidad_p="+unidad_pro+"&&estado_p="+estado_pro+"&&categoria_p="+categoria_pro+"&&des_p="+des_pro+"&&senal=1";
          
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            
        }else if(parametro.equals("eliminar")){
           int del_id_pro = Integer.parseInt(request.getParameter("id"));
           ProductoDAO producto = new ProductoDAOImplementar();
           producto.borrarPro(del_id_pro);
       this.listaProductos(request, response);
        }
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Producto producto = new Producto();
   
            String nombre_pro  = request.getParameter("txtNomProductos");
            double stock_pro = Double.parseDouble("txtStockProducto");
            double precio_pro  = Double.parseDouble("txtPrecioProducto");
            String unidad_pro  = request.getParameter("txtUnidadProducto");
            int estado_pro  = Integer.parseInt(request.getParameter("txtEstadoProducto"));
            int categoria_pro  = Integer.parseInt(request.getParameter("txtCategoriaProducto"));
            String des_pro  = request.getParameter("txtDescripcionProducto");

            producto.setNom_producto(nombre_pro);
            producto.setStock(stock_pro);
            producto.setPrecio(precio_pro);
            producto.setUnidad_de_medida(unidad_pro);
            producto.setEstado_producto(estado_pro);
            producto.setCategoria(categoria_pro);
        
            producto.setDes_producto(des_pro);
      
            ProductoDAO guardarProducto = new ProductoDAOImplementar();
            guardarProducto.guardarPro(producto);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}