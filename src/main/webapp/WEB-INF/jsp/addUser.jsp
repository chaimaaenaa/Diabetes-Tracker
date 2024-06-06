<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter un Utilisateur</title>
</head>
<body>
<h1>Ajouter un Utilisateur</h1>
<form action="add" method="post">
    <label for="nom">Nom:</label>
    <input type="text" id="nom" name="nom" required><br>
    <label for="prenom">Prénom:</label>
    <input type="text" id="prenom" name="prenom" required><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required><br>
    <label for="motDePasse">Mot de passe:</label>
    <input type="password" id="motDePasse" name="motDePasse" required><br>
    <button type="submit">Ajouter</button>
</form>
<a href="list">Retour à la liste</a>
</body>
</html>
