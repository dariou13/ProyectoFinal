<%-- 
    Document   : login
    Created on : 12-may-2016, 19:06:37
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
       <meta name="viewport" content="width=device-width, initial-scale=1">
       <meta name="description" content="">
       <meta name="author" content="">

       <title>BIENVENIDO</title>

       <!-- Bootstrap Core CSS -->
       <link href="css/bootstrap.min.css" rel="stylesheet">

       <!-- MetisMenu CSS -->
       <link href="css/metisMenu.min.css" rel="stylesheet">

       <!-- Custom CSS -->
       <link href="css/sb-admin-2.css" rel="stylesheet">

       <!-- Custom Fonts -->
       <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
       
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
               <div class="navbar-header">
                   <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                       <span class="sr-only">Toggle navigation</span>
                       <span class="icon-bar"></span>
                       <span class="icon-bar"></span>
                       <span class="icon-bar"></span>
                   </button>
                   <a class="navbar-brand" href="index.jsp"></a>
               </div>
               <!-- /.navbar-header -->
            </nav>
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="login-panel panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Iniciar Sesion</h3>
                        </div>
                        <div class="panel-body">
                            <form role="form" method="post" action="LoginControlador">
                                <input type="hidden" name="action" value="login" />
                                <fieldset>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Nombre" name="txtNombreT" type="text" autofocus>
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" placeholder="Password" name="txtPassT" type="password" value="">
                                    </div>
                                    <!-- Change this to a button or input when using this as a form -->
                                    
                                    <button type="submit" class="btn btn-primary">Ingresar</button>
                                    </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
