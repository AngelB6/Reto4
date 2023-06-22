<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="icon" href="Imagenes/Icono.png">
    <link rel="stylesheet" href="Style.css">
    <link rel="icon" href="Imagenes/Icono.png">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Tilt+Prism&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Crimson+Text:ital@1&display=swap');
    </style>
    <title>Triangulo</title>
</head>
<body>
    <div class="espacio">
        <h1>Triangulo</h1>
        <div class="registro">
        <br>
            <form action="servlet" method="POST">
                <label>Ingrese por favor la base del triangulo:</label>
                <br>
                <input class="input-ancho" type="text" name="base3">
                <br><br>
                <label>Ingrese por favor la altura del triangulo:</label>
                <br>
                <input class="input-ancho" type="text" name="altura2">
                <br><br>
                <button type="submit" value="areaTria" name="control" class="boton">Calcular</button>
                <br>
                <button value="areaTri">
                    <a href="index.jsp" class="boton" style="text-decoration: none; border: none; outline: none;">Volver</a>
                </button>
                <br><br>
            </form>
        </div>
    </div>
</body>
</html>