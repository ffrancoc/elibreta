<%-- 
    Document   : index
    Created on : 16/07/2023, 15:15:56
    Author     : Francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="titulo" value="ELibreta@pp"></jsp:param>
    </jsp:include>
    <body>
        <!-- Incluyendo el formulario html -->
        <jsp:include page="formulario.jsp">
            <jsp:param name="action" value="svContactos"></jsp:param>
            <jsp:param name="action_label" value="Guardar"></jsp:param>                    
        </jsp:include>
    </body>
</html>
