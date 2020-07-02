<%-- 
    Document   : prueba
    Created on : 07-02-2020, 01:23:36 PM
    Author     : alex
--%>

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

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         Bienvenido  <%= sesion.getAttribute("nombre")%>
    </body>
</html>
