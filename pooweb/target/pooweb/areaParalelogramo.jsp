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
    <title>Paralelogramo</title>
</head>
<body>
    <div class="espacio">
        <h1>Paralelogramo</h1>
        <div class="registro">
            <br>
            <form action="servlet" method="post">
                <label>Ingrese por favor la base del paralelogramo:</label>
                <input class="input-ancho" type="text" name="base">
                <br><br>
                <label>Ingrese por favor la altura del paralelogramo:</label>
                <br>
                <input class="input-ancho" type="text" name="altura">
                <br><br>
                <button type="submit" name="control" value="areaPa" class="boton">Calcular</button>
                <br>
                <button>
                    <a href="index.jsp" class="boton" style="text-decoration: none; border: none;">Volver</a>
                </button>
                <br><br>
            </div>
        </form>
    </div>
    </body>
</html>