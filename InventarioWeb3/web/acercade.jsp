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
         <style>
            table, th, td {
            // border: 10px solid #23fc76;
             border-collapse: collapse;
            }
            #s{
                width: 30%;
                height:40%
            }
            #f{
                width: 20%;
                height:10%
            }
            </style>
    </head>
    <body>
        <!-- Vistar parciales de la parte superior de nuestra aplicación -->
        <%@include file="WEB-INF/Vistas-Parciales/encabezado.jspf" %>
    
        <h3>¡BIENVENID@S!</h3>
          <table style="width:100%">
                <tr>
                    <th id="s"> Alumnos</th>
                    <th id="f">Edad</th>
                <th>Informacion</th>
                </tr>

                <tr>
                    <th> Oscar Noe Lopez Ceron <br> <img width="80" src="bootstrap/img/iconfinder_user_male2_172626.png" alt=""/>  <hr> 
                
                    </th>
              
                    <th>18</th>
                    <th>ve anime</th>
                </tr>
               
                <tr>
                    <th> Marlon Alexis Flores Navarrete <br> <img width="80" src="bootstrap/img/iconfinder_user_male2_172626.png" alt=""/>  </th>
                    <th> 20 </th>
                    <th> Juega free </th>
                </tr>

                <tr>
                    <th> Ruben Natividad Ramos Cubias <br> <img width="80" src="bootstrap/img/iconfinder_user_male2_172626.png" alt=""/>  </th>
                    <th> 20 </th>
                    <th> .....) </th>
                </tr>

                <tr>
                    <th> Marina de Jesus Coreas Pascual <br> <img width="80" src="bootstrap/img/iconfinder_user_male2_172626.png" alt=""/> </th>
                    <th> 20 </th>
                    <th> ..... </th>
                </tr>

                
                
           
                
        </table>    
      
        
      
        
        <!-- Vistar parciales de la parte inferior de nuestra aplicación -->
        <%@include file="WEB-INF/Vistas-Parciales/pie.jspf" %>
      
        <link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
    </body>
</html>