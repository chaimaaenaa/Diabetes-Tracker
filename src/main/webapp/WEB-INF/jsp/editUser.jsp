<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modifier Utilisateur</title>
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
        input[type="text"],
        input[type="email"],
        input[type="password"] {
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
    <h1>Modifier Utilisateur</h1>
    <form action="${pageContext.request.contextPath}/user/edit" method="post"> <!-- Correction du chemin d'action -->
        <input type="hidden" name="idU" value="${user.idU}">
        <label for="nom">Nom:</label>
        <input type="text" id="nom" name="nom" value="${user.nom}" required><br>
        <label for="prenom">Prénom:</label>
        <input type="text" id="prenom" name="prenom" value="${user.prenom}" required><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="${user.email}" required><br>
        <label for="motDePasse">Mot de passe:</label>
        <input type="password" id="motDePasse" name="motDePasse" value="${user.motDePasse}" required><br>
        <button type="submit">Modifier</button>
    </form>
    <a href="../list">Retour à la liste</a>
</div>
<div class="footer">
    <p>Copyright &copy; 2024 - Diabetes Tracker</p>
</div>
</body>
</html>
