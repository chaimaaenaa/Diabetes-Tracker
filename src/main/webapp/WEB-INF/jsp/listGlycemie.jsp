<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des Glycémies</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .navbar {
            background-color: #17a2b8;
            color: #fff;
            padding: 10px;
        }
        .navbar .navbar-brand,
        .navbar .nav-link {
            color: #fff;
        }
        .navbar .nav-link:hover {
            color: #ddd;
        }
        .container {
            margin: 20px auto;
            padding: 20px;
            width: 80%;
            background-color: #f9f9f9;
            border-radius: 5px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #17a2b8;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        a {
            color: #17a2b8;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
        footer {
            background-color: #17a2b8;
            color: #fff;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
        footer p {
            margin: 0;
        }
        .navbar-brand {
            font-weight: bold;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark">
    <div class="container">
        <a class="navbar-brand" href="#">Diabetes Tracker</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <h1>Liste des Glycémies</h1>
    <a href="add">Ajouter une nouvelle glycémie</a>
    <table>
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
</div>
<footer>
    <p>&copy; 2024 Diabetes Tracker. All rights reserved.</p>
    <p>For any queries, contact us at <a href="mailto:support@diabetestracker.com">support@diabetestracker.com</a></p>
</footer>
</body>
</html>
