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
    <div class="encabezado">
        <h1 style="color: white">Por favor de click sobre una figura para calcular su area</h1>
    </div>
    <div class="contenedor">
    <button>
        <a href="servlet?acc=Trapecio">
            <img src="Imagenes/Trapecio.png" class="trapecio">
        </a>
    </button>

    <button >
        <a href="servlet?acc=Triangulo">
            <img src="Imagenes/Triangulo.png" class="triangulo">
        </a>
    </button>

    <button >
        <a href="servlet?acc=Paralelogramo">
            <img src="Imagenes/Paralelogramo.png" class="paralelogramo">
        </a>
    </button>

    <button >
        <a href="servlet?acc=Rombo">
            <img src="Imagenes/Rombo.png" class="rombo">
        </a>
    </button>
</div>
</body>
</html>