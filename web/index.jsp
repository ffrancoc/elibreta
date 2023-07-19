<%-- 
    Document   : index
    Created on : 16/07/2023, 15:15:56
    Author     : Francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="sql" uri="jakarta.tags.sql" %>
<!DOCTYPE html>
<html>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="titulo" value="ELibreta@pp"></jsp:param>
    </jsp:include>    
    <body>
        <div class="main-container">
            <!-- Incluyendo el formulario html -->
            <jsp:include page="formulario.jsp">
                <jsp:param name="action" value="svContactos"></jsp:param>
                <jsp:param name="action_label" value="Guardar"></jsp:param>                    
            </jsp:include>        
            <!-- Incluyendo tabla con los datos guardados -->
            <div class="table-container">
                <h1>Contactos Guardados</h1>                
                <sql:setDataSource var="conn" driver="org.mariadb.jdbc.Driver" url="jdbc:mariadb://localhost:3306/storage" user="root" password=""></sql:setDataSource>
                <sql:query dataSource="${conn}" var="rs">SELECT * FROM contactos;</sql:query>

                <table>
                    <thead>
                        <tr>
                            <td>Apodo</td>
                            <td>Nombre</td>
                            <td>Apellido</td>
                            <td>Telefono</td>
                            <td>Correo</td>
                            <td>Genero</td>
                            <td>Fecha Nacimiento</td>
                            <td></td>
                            <td></td>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="tabla" items="${rs.rows}">
                        <tr>
                            <td>${tabla.apodo}</td>
                            <td>${tabla.nombre}</td>
                            <td>${tabla.apellido}</td>
                            <td>${tabla.telefono}</td>
                            <td>${tabla.correo}</td>
                            <td>${tabla.genero}</td>
                            <td>${tabla.fecha_nacimiento}</td>
                            <td> <a href="#">${tabla.id}</a></td>
                            <td> <a href="#">${tabla.id}</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>
    </body>
</html>
