<%@page import="Entidades.Enfermedad"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include flush="true" page="headAdmin.jsp"></jsp:include>
        </head>
        <body>
            <%ArrayList<Enfermedad> enf = controlador.listarEnfermedad();%>
            <div class="wrapper">
            <jsp:include flush="true" page="menuLateral.jsp"></jsp:include>
                <div class="main-panel">
                <jsp:include flush="true" page="menuSuperior.jsp"></jsp:include>
                    <div class="content">
                        <div class="container-fluid">
                            <div class="card">
                                <div class="row">
                                    <div class="col-md-8 col-md-offset-2 header">
                                        <h4><ins>Registrar Enfermedad</ins></h4>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6 col-md-offset-3">
                                        <form action="Registro/registrarEnfermedad.jsp" method="post" >
                                            <div class="form-group">
                                                <label>Descripción</label>
                                                <input type="text" class="form-control border-input" placeholder="Enfermdad" name="descripcion">
                                            </div>
                                            <button type="input" class="btn btn-info btn-fill btn-wd">REGISTRAR</button>
                                        </form>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 col-md-offset-2">
                                        <h4><ins>Registros Disponibles</ins></h4>
                                        <div class="content table-responsive table-full-width">
                                            <table class="table table-striped">
                                                <thead>
                                                    <tr>
                                                        <th>Enfermedad</th>
                                                        <th>Fecha de registro</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <%if(enf!=null && !enf.isEmpty()){
                                                        for(Enfermedad e:enf){%>
                                                        <tr>
                                                            <td><%=e.getDescripcion()%></td>
                                                            <td><%=e.getFecha()%></td>
                                                        </tr>
                                                        <%}
                                                    }%>
                                                    
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                <jsp:include flush="true" page="footerAdmin.jsp"></jsp:include>
                </div>
            </div>
        <jsp:include flush="true" page="scriptsMenu.jsp"></jsp:include>
    </body>
</html>
