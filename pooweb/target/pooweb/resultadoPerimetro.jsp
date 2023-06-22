<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Figuras</title>
    <link rel="stylesheet" href="Style.css">
    <link rel="icon" href="Imagenes/Icono.png">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto+Condensed:ital,wght@1,300&display=swap');
    </style>
</head>
<body>
    <div class="espacio">
        <h1>Resultado</h1>
        <div class="registro">
            <br>
            <label>El resultado del perimetro es: <%=request.getAttribute("perimetro")%></label>
            <br>
            <button>
                <a href="index.jsp" class="boton" style="text-decoration: none; border: none; outline: none;">Volver</a>
            </button>
            <br><br>
        </div>
    </body>
</html>