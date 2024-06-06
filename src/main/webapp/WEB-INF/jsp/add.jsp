<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modifier Glycémie</title>
</head>
<body>
<h1>Modifier Glycémie</h1>
<form action="edit/${glycemie.id}" method="post">
    <label for="date">Date:</label>
    <input type="date" id="date" name="date" value="${glycemie.date}" required><br>
    <label for="heure">Heure:</label>
    <input type="time" id="heure" name="heure" value="${glycemie.heure}" required><br>
    <label for="niveauGlycemie">Niveau de Glycémie:</label>
    <input type="number" step="0.01" id="niveauGlycemie" name="niveauGlycemie" value="${glycemie.niveauGlycemie}" required><br>
    <button type="submit">Modifier</button>
</form>
<a href="..">Retour à la liste</a>
</body>
</html>
