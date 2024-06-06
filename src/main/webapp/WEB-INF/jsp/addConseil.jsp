<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Conseil</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container">
    <h1>Add Conseil</h1>
    <form action="${pageContext.request.contextPath}/conseils/add" method="post">
        <div class="form-group">
            <label for="titre">Titre:</label>
            <input type="text" id="titre" name="titre" required>
        </div>
        <div class="form-group">
            <label for="description">Description:</label>
            <textarea id="description" name="description" required></textarea>
        </div>
        <button type="submit" class="btn">Add Conseil</button>
    </form>
</div>
</body>
</html>
