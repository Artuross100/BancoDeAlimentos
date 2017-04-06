<jsp:useBean id="controlador" scope="session" class="Controller.Controlador"></jsp:useBean>
<%
    String descripcion = request.getParameter("descripcion");
    String mensaje = controlador.registrarEnfermedad(descripcion);
%>
<script>
    window.location.href="../registro.jsp";
</script>
