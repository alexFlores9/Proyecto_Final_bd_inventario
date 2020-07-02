<%-- 
    Document   : Recuperar
    Created on : 2/07/2020, 10:31:36 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="RECUPERAR" method="Post">
            <div class="input-group">
                <label>    <img src="bootstrap/img/iconfinder_user_male2_172626.png" width="30" height="30" alt=""/> Usuario:   </label>
                <input type="text" name="txtusuario" placeholder="NOMBRE USUARIO"><br>
                </div>
            <div class="input-group">
                <label>    <img src="bootstrap/img/iconfinder_user_male2_172626.png" width="30" height="30" alt=""/> pregunta:   </label>
                <input type="text" name="txtpregunta" placeholder="NOMBRE USUARIO"><br>
                </div>
<!--            <div class="input-group">
                <label>    <img src="bootstrap/img/iconfinder_user_male2_172626.png" width="30" height="30" alt=""/> respuesta:   </label>
                <input type="text" name="txtrespuesta" placeholder="NOMBRE USUARIO"><br>
                </div>-->
            <div class="input-group">
                <input class="btn btn-lg btn-danger" type="submit" name="btnRecuperar" value="Continuar">
            </div>
        </form>
             <%
            HttpSession sesion1 = request.getSession();
            int tipo = 0;
            if(request.getAttribute("tipo")!=null){
                tipo = (Integer)request.getAttribute("tipo");
                if(tipo==1){
                    sesion1.setAttribute("nombre",request.getAttribute("nombre"));
                    sesion1.setAttribute("tipo", tipo);
                    response.sendRedirect("prueba.jsp");
                }
                
            }
            if(request.getParameter("cerrar")!=null){
               session.invalidate();
            }
        %>
    </body>
</html>
