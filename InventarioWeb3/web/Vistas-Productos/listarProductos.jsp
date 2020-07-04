<%-- 
    Document   : listarProductos
    Created on : 25/06/2020, 06:31:41 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<%@page import="Model.Producto"%>
<!-- El id debe ser el mismo que se le colocó de nombre a la sesión en el controlador -->
<jsp:useBean id="listaaa" scope="session" class="java.util.List" />
<html>
    <head>
        <title>Control de Inventario</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
       
        <%@include file="../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        
    </head>
    <body>
       
        <%@include file="../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        
        <!-- Todo el contenido de la aplicación -->
        
        <div style="width: 600px;">
            <a href="<%= request.getContextPath() %>/productos?opcion=crear" class="btn btn-success btn-sm glyphicon glyphicon-pencil" role="button">Registrar producto</a>
        
            <h3>Informacion de registros</h3>
            <table class="table table-striped">
                <tr>
                    <th>ID</th><th>NOMBRE</th><th>STOCK</th><th>PRECIO</th><th>UNIDAD DE MEDIDA</th> <th>ESTADO</th> <th>CATEGORIA</th><th>DESCRIPCION</th><th>OPCIONES            .</th>
                </tr>
                <%
                    for(int i=0;i < listaaa.size(); i++){
                        Producto pro = new Producto();
                        pro = (Producto)listaaa.get(i);
                    //}
                %>
                
                <tr>
                    <td><%= pro.getId_producto()%></td>
                    <td><%= pro.getNom_producto()%></td>
                    <td><%= pro.getStock()%></td>
                    <td><%= pro.getPrecio()%></td>
                    <td><%= pro.getUnidad_de_medida()%></td>
                    <td><%= pro.getEstado_producto()%></td>
                    <td><%= pro.getCategoria()%></td>
                    <td><%= pro.getDes_producto()%></td>
                    <td>
                   
                       <a href="<%= request.getContextPath() %>/productos?opcion=modificar&&id_p=<%= pro.getId_producto()%>&&stock_p=<%= pro.getStock()%>&&precio_p=<%= pro.getPrecio()%>
                          &&unidad_p=<%= pro.getUnidad_de_medida()%>&&estado_p=<%= pro.getEstado_producto()%>&&categoria_p=<%= pro.getCategoria()%>&&des_p=<%= pro.getDes_producto()%>" class="btn btn-info btn-sm glyphicon glyphicon-edit" role="button" name="btnModificar">Editar</a>
                        <!-- borre una a....acorreo_u -->
                        <a href="<%= request.getContextPath() %>/productos?opcion=eliminar&&id=<%= pro.getId_producto()%>" class="btn btn-danger btn-sm glyphicon glyphicon-remove" role="button">Eliminar</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
        <!-- End content -->
        <!--Boton para imprimir-->
        <form name="reporte" action="/InventarioWeb3/pdfProducto" method="POST">
            <input type="submit" value="IMPRIMIR PDF" name="btnver" />
        </form>
        
        <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
