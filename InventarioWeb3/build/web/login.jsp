<%-- 
    Document   : login
    Created on : 06-22-2020, 11:14:35 PM
    Author     : alex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
           
       
  <!-- Aquí van todos los estilos CSS -->
  <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/propio.css" rel="stylesheet" type="text/css"/>

          <link href="bootstrap/css/bootstrap-theme.css" type="text/css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-theme.min.css" type="text/css" rel="stylesheet">

<link href="bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet">
<link href="bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet">

<!-- Script js de bootstrap -->
<script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>
<script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>

<!-- Script librería de jquery -->
<script src="bootstrap/js/jquery-3.2.1.js" type="text/javascript"></script>
<script src="bootstrap/js/jquery-3.2.1.min.js" type="text/javascript"></script>

     

    </head>
    
   
    
    
    
    
    
    
    <body  style="background-color: powderblue" >
       
    
        
        <div   class="container col-md-3 col-md-offset-1 text-center ">
             
            <form action="Controlador">
                 <div class="form-group text-center">
                     <img src="bootstrap/img/iconfinder_Technology_Mix_-_Final-40_998693.png" width="80" height="80" alt=""/>
                 <p>Welcome </p> 
                 </div>
                 <div class="form-group">
                     <label>Usuario:      <img src="bootstrap/img/iconfinder_user_male2_172626.png" width="30" height="30" alt=""/>  </label>
                
                     
                     <input class="form-control" type="text" name="txtnom" placeholder="username">
                 </div>
                
                 <div class="form-group">
                     <label>Password:<img src="bootstrap/img/iconfinder_key_1055040.png" width="30" height="30" alt=""/></label>
                     <input class="form-control" type="password" name="txtCorreo" placeholder="*****">
                 </div>
                
                
                
                
                  
                
                 <input  class="btn btn-lg btn-danger"  type="submit" name="accion"  value="Ingresar">
                 
             </form>
        
    </div>
    
    </body>
</html>
