<%-- 
    Document   : listarUsuarios
    Created on : 1/07/2020, 04:06:12 PM
    Author     : PC
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  session="true" %>




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
<%@page import="Model.Usuario"%>
<!-- El id debe ser el mismo que se le colocó de nombre a la sesión en el controlador -->
<jsp:useBean id="listaa" scope="session" class="java.util.List" />
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
            <!--<a href="<%--<%= request.getContextPath() %>--%>/Usuarios?opcion=crear" class="btn btn-success btn-sm glyphicon glyphicon-pencil" role="button">Registrate es gratis</a>-->
            <h3>Informacion de registros</h3>
            <table class="table table-striped">
                <tr>
                    <th>ID</th><th>NOMBRE</th><th>APELLIDO</th><th>CORREO</th><th>Usuario</th> <!--<th>CLAVE</th>--> <th>TIPO</th><th>ESTADO</th><!--<th>PREGUNTA</th><th>RESPUESTA</th>--><th>FECHA</th><th>     OPCIONES       .</th>
                </tr>
                <%
                    for(int i=0;i < listaa.size(); i++){
                        Usuario usu = new Usuario();
                        usu = (Usuario)listaa.get(i);
                    //}
                %>
                
                <tr>
                    <td><%= usu.getId() %></td>
                    <td><%= usu.getNombre()%></td>
                    <td><%= usu.getApellido() %></td>
                    <td><%= usu.getCorreo()%></td>
                    <td><%= usu.getUsuario()%></td>
                    <!--<td><%--<%= usu.getClave() %>--%></td>-->
                    <td><%= usu.getTipo() %></td>
                    <td><%= usu.getEstado() %></td>
                    <!--<td><%--<%= usu.getPregunta() %>--%></td>-->
                    <!--<td><%--<%= usu.getRespuesta() %>--%></td>-->
                    <td><%= usu.getFecha_registro() %></td>
                    
                    <td>
                   
                       <a href="<%= request.getContextPath() %>/Usuarios?opcion=modificar&&id_u=<%= usu.getId()%>&&nombre_u=<%= usu.getNombre() %>&&apellido_u=<%= usu.getApellido() %>
                          &&correo_u=<%= usu.getCorreo()%>&&usuario_u=<%= usu.getUsuario()%>&&clave_u=<%= usu.getClave() %>&&tipo_u=<%= usu.getTipo() %>&&estado_u=<%= usu.getEstado() %>&&pregunta_u=<%= usu.getPregunta() %>&&respuesta_u=<%= usu.getRespuesta() %> " class="btn btn-info btn-sm glyphicon glyphicon-edit" role="button" name="btnModificar">Editar</a>
                        <!-- borre una a....acorreo_u -->
                        <a href="<%= request.getContextPath() %>/Usuarios?opcion=eliminar&&id=<%= usu.getId() %>" class="btn btn-danger btn-sm glyphicon glyphicon-remove" role="button">Eliminar</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
        <!-- End content -->
        <!--Boton para imprimir-->
        <form name="reporte" action="/PROYECTOFINAL23062020/pdfUsuario" method="POST">
            <input type="submit" value="IMPRIMIR PDF" name="btnver" />
        </form>
        
        <%@include file="../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
