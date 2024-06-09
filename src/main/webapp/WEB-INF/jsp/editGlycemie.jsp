<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Modifier Glycémie</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .navbar {
            background-color: #333;
            color: #fff;
            padding: 10px;
            text-align: center;
        }
        .navbar a {
            color: #fff;
            text-decoration: none;
            margin-right: 20px;
        }
        .container {
            margin: 20px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            width: 60%;
            background-color: #f9f9f9;
        }
        label {
            font-weight: bold;
        }
        input[type="date"],
        input[type="time"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            box-sizing: border-box;
        }
        button[type="submit"] {
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button[type="submit"]:hover {
            background-color: #555;
        }
        a {
            text-decoration: none;
            color: #333;
            margin-top: 10px;
            display: inline-block;
        }
        .footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>
<div class="navbar">
    <a href="#">Accueil</a>
    <a href="#">Utilisateurs</a>
    <a href="#">À propos</a>
</div>
<div class="container">
    <h1>Modifier Glycémie</h1>
    <form action="edit/${glycemie.id}" method="post">
        <label for="date">Date:</label>
        <input type="date" id="date" name="date" value="${glycemie.date}" required><br>
        <label for="heure">Heure:</label>
        <input type="time" id="heure" name="heure" value="${glycemie.heure}" required><br>
        <label for="niveauGlycemie">Niveau de Glycémie:</label>
        <input type="number" step="0.01" id="niveauGlycemie" name="niveauGlycemie" value="${glycemie.niveauGlycemie}" required><br>
        <label for="idU">ID Utilisateur:</label>
        <input type="number" id="idU" name="idU" value="${glycemie.idU}" required><br>
        <button type="submit">Modifier</button>
    </form>
    <a href="../list">Retour à la liste</a>
</div>
<div class="footer">
    <p>Copyright &copy; 2024 - Diabetes Tracker</p>
</div>
</body>
</html>
