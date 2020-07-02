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
             response.sendRedirect("index.jsp");
        }
       
    }

    
    
    
    
%>





<!DOCTYPE html>
<html>
    <head>
        <title>Control de Inventario</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Incluimos la vista parcial la cual contiene las url de las librerias 
             correspondientes a estilos y js
        -->
        <%@include file="WEB-INF/Vistas-Parciales/css-js.jspf" %>
        
    </head>
    <body style="background-color: #12c0a3">
        <!-- Vistar parciales de la parte superior de nuestra aplicación -->
        <%@include file="WEB-INF/Vistas-Parciales/encabezado.jspf" %>
    
        <!-- Todo el contenido de la aplicación -->
       <div>
            Usuario: <%= sesion.getAttribute("nombre")%>
           
            
        </div>
            <link href="bootstrap/css/ps.css" rel="stylesheet" type="text/css"/>
            
        <div class="bg-3">

    <h1 class="t-stroke t-shadow-halftone"> BIENVENIDO <%= sesion.getAttribute("nombre")%>       </h1>

</div>

    
    
    <img  src="bootstrap/img/50-Aniversario-01.png"  alt=""/>
        
        
      
        
      
        <!-- Vistar parciales de la parte inferior de nuestra aplicación -->
        <%@include file="WEB-INF/Vistas-Parciales/pie.jspf" %>
      
        <link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
    </body>
</html>