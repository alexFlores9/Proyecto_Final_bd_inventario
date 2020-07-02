<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="producto" scope="session" class="Model.Producto"/>

<%
    String id_pro = "";
    String nombre_pro = "";
    String stock_pro = "";
    String precio_pro="";
    String unidad_pro="";
    String estado_pro="";
    String categoria_pro="";
    String des_pro="";
    
    
    if(request.getParameter("senal")!=null){
        id_pro = request.getParameter("id_p");
        nombre_pro = request.getParameter("nombre_p");
        stock_pro = request.getParameter("stock_p");
        precio_pro = request.getParameter("precio_p");
        unidad_pro = request.getParameter("unidad_p");
        estado_pro = request.getParameter("estado_p");
        categoria_pro= request.getParameter("categoria_p");
        des_pro=request.getParameter("des_p");
    }else{
        id_pro = String.valueOf(producto.getId_producto());    //Id predeterminado cero definido en el constructor
        nombre_pro = producto.getNom_producto();
        stock_pro = String.valueOf(producto.getStock());
        precio_pro = String.valueOf(producto.getPrecio());
        unidad_pro = producto.getUnidad_de_medida();
        estado_pro = String.valueOf(producto.getEstado_producto());
        categoria_pro = String.valueOf(producto.getCategoria());
        des_pro = producto.getDes_producto();
        
        
    }
%>

<html>
    <head>
           <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de Inventario</title>
        <%@include file="../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        
        <script type="text/javascript">
            //Función para el botón regresar.
            function regresar(url){
                location.href = url;
            }
        </script>
    </head>
    <body>
        
        <%@include  file="../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        <h1>Crear PRODUCTOS</h1>
        <form class="form-horizontal" id="frmProducto" name="frmProducto" action="<%= request.getContextPath() %>/productos" method="post">
            <input type="hidden" name="id_producto" value="<%= id_pro %>" >
            
            <div class="form-group">
                <label for="txtNomProductos" class="col-sm-2 control-label">Nombre:</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtNomProductos" value="<%= nombre_pro %>" required>
                </div>
            </div>
                
           <div class="form-group">
                <label for="txtStockProducto" class="col-sm-2 control-label">Stock: </label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtStockProducto" value="<%= stock_pro %>" required>
                </div>
            </div>
                
                <!--qwarwefweffwf-->
                <div class="form-group">
                <label for="txtPrecioProducto" class="col-sm-2 control-label">Precio: </label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtPrecioProducto" value="<%= precio_pro %>" required>
                </div>
            </div>
                
                <!--qwarwefweffwf-->
                <div class="form-group">
                <label for="txtUnidadProducto" class="col-sm-2 control-label">Unidad de medida: </label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtUnidadProducto" value="<%= unidad_pro %>" required>
                </div>
            </div>
                
               <!--qwarwefweffwf-->
                <div class="form-group">
                <label for="txtEstadoProducto" class="col-sm-2 control-label">Estado del producto: </label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtEstadoProducto" value="<%= estado_pro %>" required>
                </div>
            </div> 
                
                <!--qwarwefweffwf-->
                <div class="form-group">
                <label for="txtCategoriaProducto" class="col-sm-2 control-label">Categoria: </label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtCategoriaProducto" value="<%= categoria_pro %>" required>
                </div>
            </div> 
                
                
                <!--qwarwefweffwf-->
                <div class="form-group">
                <label for="txtDescripcionProducto" class="col-sm-2 control-label">Descripción de producto: </label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="txtDescripcionProducto" value="<%= des_pro %>" required>
                </div>
            </div> 
                
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <%
                        if(request.getParameter("senal")!=null){
                    %>
                    <input type="submit" class="btn btn-default btn-sm" name="btnModificar" value="Actualizar" />
                    <%
                        }else{   
                    %>    
                    <input type="submit" class="btn btn-success btn-sm"   name="btnGuardar" value="Guardar" />
                    <%
                        }  
                    %> 
                    <input type="button" class="btn btn-info btn-sm" onclick="regresar('<%= request.getContextPath() %>/productos?opcion=listar')" 
                           name="btnRegresar" value="Regresar" />
                </div>
            </div>   
        </form>
        <%@include  file="../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
