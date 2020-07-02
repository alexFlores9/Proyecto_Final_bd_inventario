<%-- 
    Document   : crearUsuario
    Created on : 1/07/2020, 04:20:46 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="usuario" scope="session" class="Model.Usuario" />
<%
    String id_u = "";
    String nombre_u = "";
    String apellido_u = "";
    String correo_u = "";
    String usuario_u = "";
    String clave_u = "";
    String tipo_u = "";
    String estado_u = "";
    String pregunta_u = "";
    String respuesta_u = "";
    if(request.getParameter("senal")!=null){
        /*String id = request.getParameter("id_c");
        String nombre_cat = request.getParameter("nombre_c");
        String estado_cat = request.getParameter("estado_c");*/
        id_u = request.getParameter("id_u");
        nombre_u = request.getParameter("nombre_u");
        apellido_u = request.getParameter("apellido_u");
        correo_u = request.getParameter("correo_u");
        usuario_u = request.getParameter("usuario_u");
        clave_u = request.getParameter("clave_u");
        tipo_u= request.getParameter("tipo_u");
        estado_u = request.getParameter("estado_u");
        pregunta_u = request.getParameter("pregunta_u");
        respuesta_u = request.getParameter("respuesta_u");
    }else{
        id_u = String.valueOf(usuario.getId());    //Id predeterminado cero definido en el constructor
        nombre_u = usuario.getNombre();
        apellido_u= usuario.getApellido();
        correo_u= usuario.getCorreo();
        usuario_u= usuario.getUsuario();
        clave_u = usuario.getClave();
        tipo_u = String.valueOf(usuario.getTipo());
        estado_u= String.valueOf(usuario.getEstado());
        pregunta_u= usuario.getPregunta();
        respuesta_u = usuario.getRespuesta();
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <%@include file="../WEB-INF/Vistas-Parciales/css-js.jspf" %>
            <link href="bootstrap/css/style.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript">
            //Función para el botón regresar.
            function regresar(url){
                location.href = url;
            }
        </script>
     
    </head>
    <body style='background-color: #12c0a3'>
    <center><h3>Datos</h3></center> 
    <hr>
    
    <div class="container"> 
        <div class="box">
        <form class="form-horizontal" id="frmCategoria" name="frmusuario" action="<%= request.getContextPath() %>/Usuarios" method="post">
            <input type="hidden" name="id" value="<%=id_u %>" >
            
            <div class="input-group">
                <label  for="txtNomUsuario" class="col-sm-2 control-label">Nombre:</label>
                <input type="text" class="form-control" name="txtNomUsuario" value="<%= nombre_u %>" required>
            </div>
                
            <div class="input-group">
                <label   for="txtApellidoUsuario" class="col-sm-2 control-label">Apellido:</label>
                <input type="text" class="form-control" name="txtApellidoUsuario" value="<%= apellido_u %>" required>
            </div>
           
            <div class="input-group">
                <label for="txtCorreoUsuario" class="col-sm-2 control-label">Correo:</label>
                <input type="text" class="form-control" name="txtCorreoUsuario" value="<%= correo_u %>" required>
            </div> 
                
            <div class="input-group">
                <label for="txtUsuarioUsuario" class="col-sm-2 control-label">Usuario:</label>
                <input type="text" class="form-control" name="txtUsuarioUsuario" value="<%= usuario_u %>" required> 
            </div> 
                
             <div class="input-group">
                <label for="txtClaveUsuario" class="col-sm-2 control-label">Clave:</label>
                <input type="text" class="form-control" name="txtClaveUsuario" value="<%= clave_u %>" required>
            </div> 
            
            <div class="input-group">
                <label for="txtTipoUsuario" class="col-sm-2 control-label">Tipo:</label>
                <input type="text" class="form-control" name="txtTipoUsuario" value="<%= tipo_u %>" required>
            </div>  
            
            <div class="input-group">
                <label for="txtEstadoUsuario" class="col-sm-2 control-label">Estado:</label>
                <input type="text" class="form-control" name="txtEstadoUsuario" value="<%= estado_u %>" required>
            </div>   
            
            <div  class="input-group">
                <label  for="txtPreguntaUsuario" class="col-sm-2 control-label">Pregunta:</label>
                <input type="text" class="form-control" name="txtPreguntaUsuario" value="<%= pregunta_u %>" required>
            </div>   
                
            <div class="input-group ">
                <label for="txtRespuestaUsuario" class="col-sm-2 control-label">Respuesta:</label>
                <input type="text" class="form-control" name="txtRespuestaUsuario" value="<%= respuesta_u %>" required>
            </div>
            
            <div class="input-group checkbox">
                <input type="checkbox" name="terms" id="terms" value="true" required>
                <label for="terms">Aceptar terminos</label>
            </div>
                
            <div>
                <div>
                    <%
                        if(request.getParameter("senal")!=null){
                    %>
                    <h6>Al modificar un dato, tendras que volver a inicar sesión</h6>
                    <input type="submit" class="btn btn-default btn-sm" name="btnModificar" value="Actualizar" />
                      <center>
                     
                    <input type="button" class="btn btn-info btn-sm" onclick="regresar('<%= request.getContextPath()%>/Usuarios?opcion=listar')" 
                           name="btnRegresar" value="Regresar" /></center>
                    <%
                        }else{   
                    %>    
                  
               <input type="submit"  class="btn btn-success btn-sm" name="btnGuardar" value="Guardar"    />
               
                    <center>
                    <input type="button" class="btn btn-info btn-sm" onclick="regresar('<%= request.getContextPath()%>/index.jsp')" 
                           name="btnRegresar" value="Regresar" /></center>
                    <br>
                    <br>
               
                    <%     
                        }  
                    %> 
                 
                </div>
            </div>   
            <script src="../bootstrap/js/script.js" type="text/javascript"></script>
        </form>                  
    </div>
</div>
<%@include file="../WEB-INF/Vistas-Parciales/pie.jspf" %>
</body>
</html>

