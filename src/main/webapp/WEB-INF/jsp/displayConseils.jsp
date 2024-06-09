<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Conseil Details</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container">
    <h1>Conseil Details</h1>
    <div>
        <strong>ID:</strong> ${conseil.idC}<br>
        <strong>Titre:</strong> ${conseil.titre}<br>
        <strong>Description:</strong> ${conseil.description}<br>
    </div>
</div>
</body>
</html>
