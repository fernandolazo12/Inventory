<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Free Bootstrap Admin Template : Binary Admin</title>
	<!-- BOOTSTRAP STYLES-->
 
    <link href="css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="css/font-awesome.css" rel="stylesheet" />
     <!-- MORRIS CHART STYLES-->
    <link href="js/morris/morris-0.4.3.min.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="Principal.jsp">Inventario</a> 
            </div>
  <div style="color: white;
padding: 15px 50px 5px 50px;
float: right;
font-size: 16px;"> user : 30 setiembre 2014 &nbsp; <a href="#" class="btn btn-danger square-btn-adjust">Usuario</a> </div>
        </nav>   
           <!-- /. NAV TOP  -->
                <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="img/fia.jpg" class="user-image img-responsive"/>
					</li>
				
					
                    <li>
                        <a class="active-menu"  href="Principal.jsp"><i class="fa fa-dashboard fa-3x"></i> Principal</a>
                    </li>
                     <li>
                         <a  href="vista/ui.html"><i class="fa fa-desktop fa-3x"></i> Elementos</a>
                    </li>
                    <li>
                        <a  href="vista/tab-panel.html"><i class="fa fa-qrcode fa-3x"></i> Tabs & Panels</a>
                    </li>
						   <li  >
                                                       <a   href="vista/chart.html"><i class="fa fa-bar-chart-o fa-3x"></i> Graficos</a>
                    </li>	
                      <li  >
                          <a  href="vista/table.html"><i class="fa fa-table fa-3x"></i> Tablas</a>
                    </li>
                    <li  >
                        <a  href="vista/form.html"><i class="fa fa-edit fa-3x"></i> Formularios </a>
                    </li>				
		  <li  >
                      <a  href="../modulos/IngresarCategoria.jsp"><i class="fa fa-edit fa-3x"></i> IngresarCaregoria</a>
                    </li>	
					                   
                    <li>
                        <a href="#"><i class="fa fa-sitemap fa-3x"></i> Escuelas<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Ing Sistemas</a>
                            </li>
                            <li>
                                <a href="#">Ing Civil</a>
                            </li>
                            <li>
                                <a href="#">Ing Alimentos<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="#">Ingenieria Ambiental</a>
                                    </li>
                                    <
                                    <li>
                                        <a href="#">Arquitectura</a>
                                    </li>

                                </ul>
                               
                            </li>
                        </ul>
                      </li> 
                  <li  >
                        <a  href="blank.html"><i class="fa fa-square-o fa-3x"></i> Blank Page</a>
                    </li>	
                </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                     <%@include file="WEB-INF/jspf/top.jspf" %>
                       
                    </div>
                </div>              
                                
               
          
        </div>
        </div>
     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="js/bootstrap.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="js/jquery.metisMenu.js"></script>
     <!-- MORRIS CHART SCRIPTS -->
     <script src="js/morris/raphael-2.1.0.min.js"></script>
    <script src="js/morris/morris.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="js/custom.js"></script>
    
   
</body>
</html>
