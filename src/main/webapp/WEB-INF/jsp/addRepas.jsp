<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter un Repas</title>
</head>
<body>
<h1>Ajouter un Repas</h1>
<form action="add" method="post">
    <label for="date">Date:</label>
    <input type="date" id="date" name="date" required><br>
    <label for="description">Description:</label>
    <textarea id="description" name="description" required></textarea><br>
    <button type="submit">Ajouter</button>
</form>
<a href="..">Retour à la liste</a>
</body>
</html>
