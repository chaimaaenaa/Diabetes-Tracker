<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Conseil</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container">
    <h1>Edit Conseil</h1>
    <form action="${pageContext.request.contextPath}/conseils/update/${conseil.idC}" method="post">
        <div class="form-group">
            <label for="titre">Titre:</label>
            <input type="text" id="titre" name="titre" value="${conseil.titre}" required>
        </div>
        <div class="form-group">
            <label for="description">Description:</label>
            <textarea id="description" name="description" required>${conseil.description}</textarea>
        </div>
        <button type="submit" class="btn">Update Conseil</button>
    </form>
</div>
</body>
</html>
