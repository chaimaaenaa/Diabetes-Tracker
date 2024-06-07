<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des Glycémies</title>
</head>
<body>
<h1>Liste des Glycémies</h1>
<a href="add">Ajouter une nouvelle glycémie</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Date</th>
        <th>Heure</th>
        <th>Niveau de Glycémie</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${glycemies}" var="glycemie">
        <tr>
            <td>${glycemie.id}</td>
            <td>${glycemie.date}</td>
            <td>${glycemie.heure}</td>
            <td>${glycemie.niveauGlycemie}</td>
            <td>
                <a href="edit/${glycemie.id}">Modifier</a>
                <a href="delete/${glycemie.id}">Supprimer</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
