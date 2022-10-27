<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
	<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
<html>
<head>
<title>turma3</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<h3 class="jumbotron">Turma 3</h3>
	<table class="table">
		<tr class="thead-dark">
			<th>Aluno</th>
			<th>Prova 1</th>
			<th>Prova 2</th>
			<th>Prova 3</th>
			<th>Prova Final</th>
			<th>Media</th>
			<th>Situação</th>
		</tr>
		<tbody>
			<s:iterator value="alunosDTO" var="alunoDTO">
				<tr>
					<td><s:property value="nome" /></td>
					<td><s:property value="nota1" /></td>
					<td><s:property value="nota2" /></td>
					<td><s:property value="nota3" /></td>
					<td><s:property value="provaFinal" /></td>
					<td><s:property value="media" /></td>
					<td><s:property value="situacao" /></td>
				</tr>
			</s:iterator>
		</tbody>


	</table>

</body>
</html>