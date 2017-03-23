<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
        <link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

        <title>Banco Diocesano de Alimentos</title>

        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
        <meta name="viewport" content="width=device-width" />


        <!-- Bootstrap core CSS     -->
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" />

        <!-- Animation library for notifications   -->
        <link href="assets/css/animate.min.css" rel="stylesheet"/>

        <!--  Paper Dashboard core CSS    -->
        <link href="assets/css/paper-dashboard.css" rel="stylesheet"/>

        <!--  CSS for Demo Purpose, don't include it in your project     -->
        <link href="assets/css/demo.css" rel="stylesheet" />

        <!--  Fonts and icons     -->
        <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
        <link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
        <link href="assets/css/themify-icons.css" rel="stylesheet">

    </head>
    <body>

        <div class="wrapper">
            <div class="sidebar" data-background-color="white" data-active-color="danger">

                <!--
                            Tip 1: you can change the color of the sidebar's background using: data-background-color="white | black"
                            Tip 2: you can change the color of the active button using the data-active-color="primary | info | success | warning | danger"
                -->

                <div class="sidebar-wrapper">
                    <div class="logo">
                        <a href="http://www.creative-tim.com" class="simple-text">
                            Banco de Alimentos
                        </a>
                    </div>

                    <ul class="nav">
                        <li>
                            <a href="dashboard.html">
                                <i class="ti-panel"></i>
                                <p>Informes</p>
                            </a>
                        </li>
                        <li>
                            <a href="user.html">
                                <i class="ti-user"></i>
                                <p>Registrar Usuarios</p>
                            </a>
                        </li>
                        <li>
                            <a href="Producto.html">
                                <i class="ti-shopping-cart-full"></i>
                                <p>Registrar Productos</p>
                            </a>
                        </li>
                        <li>
                            <a href="Bodega.html">
                                <i class="ti-home"></i>
                                <p>Gestionar Bodega</p>
                            </a>
                        </li>
                         <li class="active">
                            <a href="Campana.html">
                                <i class="ti-announcement"></i>
                                <p>Gestionar Campañas</p>
                            </a>
                        </li>
                        
                    </ul>
                </div>
            </div>

            <div class="main-panel">
                <nav class="navbar navbar-default">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar bar1"></span>
                                <span class="icon-bar bar2"></span>
                                <span class="icon-bar bar3"></span>
                            </button>
                            <a class="navbar-brand" href="#">Gestionar Campaña</a>
                        </div>
                        <div class="collapse navbar-collapse">
                            <ul class="nav navbar-nav navbar-right">
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                        <i class="ti-panel"></i>
                                        <p>Stats</p>
                                    </a>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                        <i class="ti-bell"></i>
                                        <p class="notification">5</p>
                                        <p>Notificaciones</p>
                                        <b class="caret"></b>
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Notificacion 1</a></li>
                                        <li><a href="#">Notificacion 2</a></li>
                                        <li><a href="#">Notificacion 3</a></li>
                                        <li><a href="#">Notificacion 4</a></li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="ti-settings"></i>
                                        <p>Settings</p>
                                    </a>
                                </li>
                            </ul>

                        </div>
                    </div>
                </nav>


                <div class="content">
                    <div class="container-fluid">
                        <div class="row">

                            <div class="col-lg-8 col-md-7">
                                <div class="card">

                                    <div class="content">
                                        <form>
                                            <div class="row">
                                                <div class="header">
                                                    <h4 class="title">Registrar Campaña</h4>
                                                </div>
                                                <div class="col-md-6">

                                                    <div class="form-group">
                                                        <label>Nombre de la Campaña</label>
                                                        <input type="text" class="form-control border-input" disabled>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Fecha de Inicio</label>
                                                        <input type="text" class="form-control border-input" placeholder="07/04/2017" >
                                                    </div>
                                                </div>

                                            </div>

                                            <div class="row">
                                               
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Fecha de Cierre</label>
                                                        <input type="text" class="form-control border-input"placeholder="09/04/2017">
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label>Lugar de la campaña</label>
                                                        <input type="text" class="form-control border-input">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="text-center">
                                                <button type="submit" class="btn btn-info btn-fill btn-wd">Registrar</button>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <div class="card">
                                                        <div class="header">
                                                            <h4 class="title">Eliminar Campañas</h4>
                                                            <p class="category">En esta seccion puede eliminar campañas</p>
                                                        </div>
                                                        <div class="content table-responsive table-full-width">
                                                            <table class="table table-striped">
                                                                <thead>
                                                                <th>Nombre de la Campaña</th>
                                                                <th>Fecha de Inicio</th>
                                                                <th>Eliminar</th>
                                                                </thead>
                                                                <tbody>
                                                                    <tr>
                                                                        <td>Dakota Rice</td>
                                                                        <td>10/07/2017</td>
                                                                        <td> <i class="ti-close"></i></td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td>Minerva Hooper</td>
                                                                        <td>01/05/2017</td>
                                                                        <td> <i class="ti-close"></i></td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td>Sage Rodriguez</td>
                                                                        <td>11/07/2017</td>
                                                                        <td> <i class="ti-close"></i></td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td>Philip Chaney</td>
                                                                        <td>10/04/2017</td>
                                                                        <td> <i class="ti-close"></i></td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td>Doris Greene</td>
                                                                        <td>20/04/2017</td>
                                                                        <td> <i class="ti-close"></i></td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td>Mason Porter</td>
                                                                        <td>10/06/2017</td>
                                                                        <td> <i class="ti-close"></i></td>
                                                                    </tr>
                                                                </tbody>
                                                            </table>

                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                    </div>




                                    <div class="text-center">
                                        <button type="submit" class="btn btn-info btn-fill btn-wd">Guardar</button>
                                    </div>
                                    <div class="clearfix"></div>
                                    </form>
                                </div>
                            </div>
                        </div>


                    </div>
                </div>
            </div>


            <footer class="footer">
                <div class="container-fluid">
                    <nav class="pull-left">
                        <ul>

                            <li>
                                <a href="#">
                                    Arturo Saavedra
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Blog
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Licencias
                                </a>
                            </li>
                        </ul>
                    </nav>
                    <div class="copyright pull-right">
                        &copy; <script>document.write(new Date().getFullYear())</script>, Hecho con <i class="fa fa-heart heart"></i> por <a href="#">Arturo Saavedra</a>
                    </div>
                </div>
            </footer>

        </div>
    </div>


</body>

<!--   Core JS Files   -->
<script src="assets/js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>

<!--  Checkbox, Radio & Switch Plugins -->
<script src="assets/js/bootstrap-checkbox-radio.js"></script>

<!--  Charts Plugin -->
<script src="assets/js/chartist.min.js"></script>

<!--  Notifications Plugin    -->
<script src="assets/js/bootstrap-notify.js"></script>

<!--  Google Maps Plugin    -->
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js"></script>

<!-- Paper Dashboard Core javascript and methods for Demo purpose -->
<script src="assets/js/paper-dashboard.js"></script>

<!-- Paper Dashboard DEMO methods, don't include it in your project! -->
<script src="assets/js/demo.js"></script>

</html>
