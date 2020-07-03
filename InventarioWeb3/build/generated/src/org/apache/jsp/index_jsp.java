package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"bootstrap/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>INICIO DE SESSION</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-color: #12c0a3\">\r\n");
      out.write("    <center> <div  class=\"container\">\r\n");
      out.write("             <div class=\"box\">\r\n");
      out.write("                     <img src=\"bootstrap/img/iconfinder_Technology_Mix_-_Final-40_998693.png\" width=\"80\" height=\"80\" alt=\"\"/>\r\n");
      out.write("                 <p>Bienvenido</p> \r\n");
      out.write("                \r\n");
      out.write("             \r\n");
      out.write("            <form action=\"SERVLOGIN\" method=\"POST\">\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                <label>    <img src=\"bootstrap/img/iconfinder_user_male2_172626.png\" width=\"30\" height=\"30\" alt=\"\"/> Usuario:   </label>\r\n");
      out.write("                <input type=\"text\" name=\"txtusuario\" placeholder=\"NOMBRE USUARIO\"><br>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                  <div class=\"input-group\">\r\n");
      out.write("                 <label><img src=\"bootstrap/img/iconfinder_key_1055040.png\" width=\"30\" height=\"30\" alt=\"\"/> Contraseña:</label>\r\n");
      out.write("                <input type=\"password\" name=\"txtcontra\" placeholder=\"CONTRASEÑA\"><br><br>\r\n");
      out.write("                  </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                <input class=\"btn btn-lg btn-danger\" type=\"submit\" name=\"btnIniciar\" value=\"INICIAR SESION\">\r\n");
      out.write("                <center><a href=\"");
      out.print( request.getContextPath() );
      out.write("/Usuarios?opcion=crear\"  role=\"button\">Registrate es gratis  </a> <a>||</a> <a href=\"Recuperar.jsp\">¿Has olvidado tu contraseña?</a></center> \r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("            </div></center> \r\n");
      out.write("                <script src=\"bootstrap/js/script.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        ");

            HttpSession sesion = request.getSession();
            int tipo = 0;
            if(request.getAttribute("tipo")!=null){
                tipo = (Integer)request.getAttribute("tipo");
                if(tipo==1){
                    sesion.setAttribute("nombre",request.getAttribute("nombre"));
                    sesion.setAttribute("tipo", tipo);
                    response.sendRedirect("index1.jsp");
                }
                
            }
            if(request.getParameter("cerrar")!=null){
               session.invalidate();
            }
        
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
