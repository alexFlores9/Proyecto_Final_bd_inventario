<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
   
        <hr><br>
        <h3 align='center'>ESTUDIANTES <br> Técnico en Ingeniería en Sistemas Informáticos     <br> SIS22A</h3>
        
        <hr>
        <h3 align='center'>Marlon Alexis Flores Navarrete<br>N.Carnet:189719 <br>  <img align='center' width="100" height="100" src="bootstrap/img/marlon.jpg" alt=""/></h3>
        <h3 align='center'>Marina de Jesus Coras <br>N.Carnet: -----  <br>   <img align='center' width="100" height="100" src="bootstrap/img/marina.jpg" alt=""/></h3>
        <h3 align='center'>Oscar Noé López Cerón <br>N.Carnet: 189019  <br>  <img align='center' width="100" height="100" src="bootstrap/img/oscar.jpg" alt=""/></h3>
        
        <h3 align='center'>Ruben Natividad Ramos Cubias<br>N.Carnet:190119 <br>  <img align='center' width="100" height="100" src="bootstrap/img/ruben.jpg" alt=""/></h3>
        
        
        
   
      
        
      
        
        <!-- Vistar parciales de la parte inferior de nuestra aplicación -->
        <%@include file="WEB-INF/Vistas-Parciales/pie.jspf" %>
      
        <link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
    </body>
</html>