<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Liste des Glycémies</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            margin-top: 50px;
        }
        .navbar {
            background-color: #17a2b8;
        }
        .navbar-brand {
            color: white;
            font-weight: bold;
        }
        .navbar-nav .nav-link {
            color: white;
        }

        table {
            width: 80%; /* Définir la largeur du tableau à 80% */
            margin: 20px auto; /* Centrer le tableau */
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
        footer {
            background-color: #17a2b8;
            color: #fff;
            text-align: center;
            padding: 10px;
            width: 100%;
            position: fixed;
            bottom: 0;
            left: 0;
        }
        footer p {
            margin: 0;
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
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
