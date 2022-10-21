<%@ page language="java" contentType="text/html;charset= UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Adding a new person</title>
</head>
<body>
	<h2>Adding a new person</h2>
	<form action="addPerson" method="post"><br>
		Nom : <input type="text" name="nom"><br>
		Prenom : <input type="text" name="prenom">
		<button type="submit">Envoyer</button>
	</form>
</body>
</html>