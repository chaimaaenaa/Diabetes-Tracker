<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Liste des Conseils</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
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
</body>
</html>
