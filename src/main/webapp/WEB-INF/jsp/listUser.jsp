<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Liste des Utilisateurs</title>
</head>
<body>
<h1>Liste des Utilisateurs</h1>
<a href="add">Ajouter un nouveau utilisateur</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Prénom</th>
        <th>Email</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.idU}</td>
            <td>${user.nom}</td>
            <td>${user.prenom}</td>
            <td>${user.email}</td>
            <td>
                <a href="edit/${user.idU}">Modifier</a>
                <a href="delete/${user.idU}">Supprimer</a>
                <a href="details/${user.idU}">Détails</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
