<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Liste des Conseils</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
  <style>
    /* Navbar styles */
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
    /* Footer styles */
    footer {
      background-color: #f8f9fa;
      padding: 20px 0;
      text-align: center;
    }
  </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
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
  <h1>Liste des Conseils</h1>
  <table class="table">
    <thead class="thead-dark">
    <tr>
      <th>ID</th>
      <th>Titre</th>
      <th>Description</th>
      <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="conseil" items="${conseils}">
      <tr>
        <td>${conseil.idC}</td>
        <td>${conseil.titre}</td>
        <td>${conseil.description}</td>
        <td>
          <a href="${pageContext.request.contextPath}/conseils/edit/${conseil.idC}" class="btn btn-primary">Edit</a>
          <a href="${pageContext.request.contextPath}/conseils/delete/${conseil.idC}" class="btn btn-danger">Delete</a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <a href="${pageContext.request.contextPath}/conseils/add" class="btn btn-success">Add New Conseil</a>
</div>
<footer class="footer mt-auto py-3 bg-light">
  <div class="container">
    <span class="text-muted">&copy; 2024 Diabetes Tracker. All rights reserved.</span>
  </div>
</footer>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
