<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modifier Repas</title>
</head>
<body>
<h1>Modifier Repas</h1>
<form action="edit/${repas.id}" method="post">
    <label for="date">Date:</label>
    <input type="date" id="date" name="date" value="${repas.date}" required><br>
    <label for="description">Description:</label>
    <textarea id="description" name="description" required>${repas.description}</textarea><br>
    <button type="submit">Modifier</button>
</form>
<a href="..">Retour à la liste</a>
</body>
</html>
