<%-- 
    Document   : formulario
    Created on : 17/07/2023, 19:30:33
    Author     : Francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<form action="${param.action}" method="post">
    <div>
        <label for="apodo">Apodo</label>
        <input type="text" name="apodo">
    </div>
    <div>
        <label for="nombre">Nombre</label>
        <input type="text" name="nombre" required>
    </div>
    <div>
        <label for="apellido">Apellido</label>
        <input type="text" name="apellido" required>
    </div>
    <div>
        <label for="telefono">Telefono</label>
        <input type="tel" name="telefono" required>
    </div>
    <div>
        <label for="correo">Correo</label>
        <input type="email" name="correo">
    </div>
    <div>
        <label for="genero">Genero</label>
        <select name="genero">
            <option value="M" selected>Masculino</option>
            <option value="F">Femenino</option>
            <option value="O">Otro</option>
        </select>

    </div>
    <div>
        <label for="fnacimiento">Fecha de Nacimiento</label>
        <input type="date" name="fnacimiento" required>
    </div>
    <div>        
        <input type="submit" value="${param.action_label}" name="action_label">
    </div>
</form>