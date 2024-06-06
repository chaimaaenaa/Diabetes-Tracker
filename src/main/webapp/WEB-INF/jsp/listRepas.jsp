<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Liste des Repas</title>
</head>
<body>
<h1>Liste des Repas</h1>
<a href="repas/add">Ajouter un nouveau repas</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Date</th>
        <th>Description</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${repas}" var="repas">
        <tr>
            <td>${repas.id}</td>
            <td>${repas.date}</td>
            <td>${repas.description}</td>
            <td>
                <a href="repas/edit/${repas.id}">Modifier</a>
                <a href="repas/delete/${repas.id}">Supprimer</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
