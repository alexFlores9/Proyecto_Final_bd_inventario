<%-- 
    Document   : prueba
    Created on : 07-02-2020, 01:23:36 PM
    Author     : alex
--%>

<%@page import="clases.Acceso"%>
<%@page import="Model.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("tipo")== null){
    response.sendRedirect("index.jsp");
    }
    else{
        String tipo = session.getAttribute("tipo").toString();
        if(!tipo.equals("1")){
             response.sendRedirect("Recuperar.jsp");
        }
       
    }
%>
<%  Acceso es= new Acceso();    %>
<!DOCTYPE html>
<%@page import="Model.Usuario"%>

<!-- El id debe ser el mismo que se le colocó de nombre a la sesión en el controlador -->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="acercade.jsp"></a>
        <h1>Hello World!</h1>
         Bienvenido  <%= sesion.getAttribute("nombre")%>
  
         
        <h3>Respone correctamente la pregunta</h3>
            
          <p>¿  ?</p>
         <div class="input-group">
         <input type="password" name="txtRespuesta" placeholder="RESPUESTA"><br><br>
         </div>
            
           
    </body>
</html>
