<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include flush="true" page="head.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include flush="true" page="menu.jsp"></jsp:include>
        <jsp:include flush="true" page="slider.jsp"></jsp:include>
            <div class="container">
            <jsp:include flush="true" page="acerca.jsp"></jsp:include>
            <jsp:include flush="true" page="aliados.jsp"></jsp:include>
            <jsp:include flush="true" page="contacto.jsp"></jsp:include>
                <hr>
            <jsp:include flush="true" page="seccion.jsp"></jsp:include>
                <hr>
            <jsp:include flush="true" page="footer.jsp"></jsp:include>
        </div>
        <script>
            $('.carousel').carousel({
                interval: 5000 //changes the speed
            })
        </script>

    </body>

</html>
