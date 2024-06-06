<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modifier Utilisateur</title>
</head>
<body>
<h1>Modifier Utilisateur</h1>
<form action="edit/${user.idU}" method="post">
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
</body>
</html>
