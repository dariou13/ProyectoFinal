<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page language="java" %>
<%@ page import = "ControladorServlets.EquipoControlador"%> 
<%@ page import = "VO.Equipo"%>

<html>
    <head>
           <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <meta http-equiv="X-UA-Compatible" content="IE=edge">
           <meta name="viewport" content="width=device-width, initial-scale=1">
           <meta name="description" content="">
           <meta name="author" content="">

           <title>Almacen</title>

           <!-- Bootstrap Core CSS -->
           <link href="css/bootstrap.min.css" rel="stylesheet">

           <!-- MetisMenu CSS -->
           <link href="css/metisMenu.min.css" rel="stylesheet">

           <!-- Custom CSS -->
           <link href="css/sb-admin-2.css" rel="stylesheet">

           <!-- Custom Fonts -->
           <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">     
           
           <link href="css/dataTables.bootstrap.css" rel="stylesheet">
    </head>
    <body>
         <div id="wrapper">
            <!-- Navigation -->
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp">BIENVENIDO</a>
                </div>
                <!-- /.navbar-header -->

                <ul class="nav navbar-top-links navbar-right">                                                                 
                    
                    <li>
                        <a href="index.jsp"><i class="fa fa-home fa-fw"></i></a>
                    </li>
                    <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="login.jsp"><i class="fa fa-user fa-fw"></i> Iniciar Sesion</a>
                            </li>
                        </ul>
                        <!-- /.dropdown-user -->
                    </li>
                    <!-- /.dropdown -->
                </ul>
                <!-- /.navbar-top-links -->
            </nav>

            
            
           <!-- Page Content -->
           <div id="page-wrapper">
               <div class="container-fluid">
                   <div class="row">
                       <div class="col-lg-12">
                           <h1 class="page-header">Formato Prestamo</h1>
                       </div>
                       <!-- /.col-lg-12 -->
                   </div>                   
                   <!-- /.row -->
                   
                   <div class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    Por favor digilenciar cada uno de los campos
                                </div>
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <form role="form" method="post" action="ReservaControlador">
                                                <input type="hidden" name="accion" value="crearReserva" />    
                                                 <div class="form-group">
                                                    <label>Nombre:</label>
                                                    <input  name="txtNombreEstudianteR" class="form-control">  
                                                </div>
                                                <div class="form-group">
                                                    <label>Programa:</label>
                                                    <input  name="txtProgramaEstudianteR" class="form-control">  
                                                </div>     
                                                <div class="form-group">
                                                    <label>Semestre:</label>
                                                    <input  name="txtSemestreEstudianteR" class="form-control">  
                                                </div>   
                                                <div class="form-group">
                                                    <label>Fecha Salida:</label>
                                                    <input  name="txtFechaSalidaR" class="form-control">  
                                                </div>    
                                                <div class="form-group">
                                                    <label>Fecha Entrada:</label>
                                                    <input  name="txtFechaEntradaR" class="form-control">  
                                                </div>  
                                                <div class="form-group">
                                                    <label>Nombre del equipo, herramienta o material:</label>
                                                    <input  name="txtNombreEquipoR" class="form-control">  
                                                </div>     
                                                <div class="form-group">
                                                    <label>Cantidad:</label>
                                                    <input  name="txtCantidadEquipoR" class="form-control">  
                                                </div>   
                                                <div class="form-group">
                                                    <label>Estado:</label>
                                                    <input  name="txtEstado" class="form-control">  
                                                </div>   
                                                <div class="form-group">
                                                    <label>Observaciones:</label>
                                                    <input  name="txtIDB" class="form-control">  
                                                </div>                                            
                                                
                                                <button type="submit" class="btn btn-primary">Reservar</button>
                                                 
                                            </form>
                                        </div>
                                        <!-- /.col-lg-6 (nested) -->                                                                                                                                                                
                                    </div>
                                    <!-- /.row (nested) -->
                                </div>
                                <!-- /.panel-body -->
                            </div>
                            <!-- /.panel -->
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                   
               </div>
               <!-- /.container-fluid -->
           </div>
           <!-- /#page-wrapper -->
            
            

        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="js/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="js/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="js/sb-admin-2.js"></script>
        
        <script src="js/jquery.dataTables.min.js"></script>
        
        <script src="js/dataTables.bootstrap.min.js"></script>
 
    </body>
</html>