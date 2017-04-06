<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    
    out.print(controlador.registrarEnfermedad(descripcion));
%>
