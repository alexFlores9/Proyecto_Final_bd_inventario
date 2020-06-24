package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/css/propio.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("           \n");
      out.write("          <link href=\"bootstrap/css/bootstrap-theme.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"bootstrap/css/bootstrap-theme.min.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link href=\"bootstrap/css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"bootstrap/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Script js de bootstrap -->\n");
      out.write("<script src=\"bootstrap/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- Script librería de jquery -->\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div style=\"justify-content: center; align-items: center;\" class=\"container col-lg-3\">\n");
      out.write("             \n");
      out.write("            <form action=\"Controlador\">\n");
      out.write("                 <div class=\"form-group text-center\">\n");
      out.write("                     <img src=\"bootstrap/img/iconfinder_Technology_Mix_-_Final-40_998693.png\" width=\"80\" height=\"80\" alt=\"\"/>\n");
      out.write("                 <p>Welcome </p> \n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                     <label>Usuario:      <img src=\"bootstrap/img/iconfinder_user_male2_172626.png\" width=\"30\" height=\"30\" alt=\"\"/>  </label>\n");
      out.write("                \n");
      out.write("                     \n");
      out.write("                     <input class=\"form-control\" type=\"text\" name=\"txtnom\" placeholder=\"username\">\n");
      out.write("                 </div>\n");
      out.write("                \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                     <label>Password:<img src=\"bootstrap/img/iconfinder_key_1055040.png\" width=\"30\" height=\"30\" alt=\"\"/></label>\n");
      out.write("                     <input class=\"form-control\" type=\"password\" name=\"txtCorreo\" placeholder=\"porejemplo@hotmail.com\">\n");
      out.write("                 </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                  \n");
      out.write("                \n");
      out.write("                 <input class=\"btn-danger btn-block\" type=\"submit\" name=\"accion\"  value=\"Ingresar\">\n");
      out.write("                 \n");
      out.write("             </form>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
