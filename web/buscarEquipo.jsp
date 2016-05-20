<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<%@ page language="java" %>
<%@ page import = "ControladorServlets.EquipoControlador"%> 
<%@ page import = "DAO.EquipoDao"%> 
<%@ page import = "VO.Equipo"%> 
<%@ page import = "java.util.ArrayList"%>
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
                            <li><a href="#"><i class="fa fa-user fa-fw"></i> Cuenta</a>
                            </li>
                            <li><a href="#"><i class="fa fa-gear fa-fw"></i> Opciones</a>
                            </li>
                            <li class="divider"></li>
                            <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>Cerrar Sesion</a>
                            </li>
                        </ul>
                        <!-- /.dropdown-user -->
                    </li>
                    <!-- /.dropdown -->
                </ul>
                <!-- /.navbar-top-links -->

                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
                        <ul class="nav" id="side-menu">
                            
                            <li class="active">
                                <a href="#"> Gestion de Equipos<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="crearEquipo.jsp">Crear</a>
                                    </li>
                                    <li>
                                        <a href="modificarEquipo.jsp">Actualizar</a>
                                    </li>
                                    <li>
                                        <a href="eliminarEquipo.jsp">Eliminar</a>
                                    </li>
                                    <li>
                                        <a  href="listarEquipo.jsp">Listar</a>
                                    </li>
                                    <li>
                                        <a class="active" href="#">Buscar</a>
                                    </li>
                                </ul>
                                <!-- /.nav-second-level -->
                            </li>    
                            
                            
                        </ul>
                    </div>
                    <!-- /.sidebar-collapse -->
                </div>
                <!-- /.navbar-static-side -->
            </nav>
            
            
            
            
           <!-- Page Content -->
           <div id="page-wrapper">
               <div class="container-fluid">
                   <div class="row">
                       <div class="col-lg-12">
                           <h1 class="page-header">Buscar Equipo</h1>
                       </div>
                       <!-- /.col-lg-12 -->
                   </div>                   
                   <!-- /.row -->
                   
                   <div class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    Equipo a buscar
                                </div>
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <form role="form" method="post" action="EquipoControlador">
                                                <input type="hidden" name="action" value="buscarEquipos" />    
                                                 <div class="form-group">
                                                    <label>Nombre del Equipo a Buscar</label>
                                                    <input  name="txtIDB" class="form-control">  
                                                </div> 
                                                <button type="submit" class="btn btn-default">Buscar</button>
                                                <button type="reset" class="btn btn-default">Limpiar</button>
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
               
           
           
           
                     <!-- /.col-lg-6 (nested) -->    
                                        <div class="col-lg-6">
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            Equipo:
                                                        </div>                                                        
                                                        <!-- /.panel-heading -->
                                                        <div class="panel-body">
                                                            <div class="table-responsive">
                                                                <table class="table">
                                                                    <thead>
                                                                        <tr>
                                                                            <th>Id</th>
                                                                            <th>Nombre</th>
                                                                            <th>Modelo</th>
                                                                            <th>Referencia</th>
                                                                            <th>Cantidad</th>
                                                                            <th>Programa</th>
                                                                        </tr>
                                                                    </thead>
                                                                    <tbody>
                                                                     <%          
                                                                        String nombre = EquipoControlador.a();
                                                                        List<Equipo> listE = EquipoControlador.listaEquipos();                                                    
                                                                        for (int i=0;i<listE.size();i++)
                                                                        {
                                                                            if(listE.get(i).getNombre_Equipo().equals(nombre))
                                                                            {
                                                                                out.println("<tr>");
                                                                                out.println("<td>" + listE.get(i).getId_Equipo());
                                                                                out.println("<td>" + listE.get(i).getNombre_Equipo());
                                                                                out.println("<td>" + listE.get(i).getModelo_Equipo());
                                                                                out.println("<td>" + listE.get(i).getReferencia_Equipo());
                                                                                out.println("<td>" + listE.get(i).getCantidad_Equipo());
                                                                                out.println("<td>" + listE.get(i).getPrograma_Equipo());
                                                                                out.println("</tr>");  
                                                                            }                                                                            
                                                                        }                                                    
                                                                     %>   
                                                                    </tbody>
                                                                </table>
                                                            </div>
                                                            <!-- /.table-responsive -->
                                                        </div>
                                                        <!-- /.panel-body -->
                                                    </div>
                                                    <!-- /.panel -->
                                                </div>
           
               
           </div>
           <!-- /#page-wrapper -->
           
           
           
    </body>
</html>
