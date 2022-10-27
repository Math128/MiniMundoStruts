<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
	<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<html>
<head>
<title>melhoresAlunos</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<h3 class="jumbotron" >Classificados para competição</h3>
	<table class="table">
		<tr class="thead-dark">
			<th>Aluno</th>
			<th>Prova 1</th>
			<th>Prova 2</th>
			<th>Prova 3</th>
			<th>Prova Especial</th>
			<th>Media</th>
		</tr>
		<tbody>
			<s:iterator value="alunosSelecionados" var="selecionados">
				<tr>
					<td><s:property value="nome" /></td>
					<td><s:property value="nota1" /></td>
					<td><s:property value="nota2" /></td>
					<td><s:property value="nota3" /></td>
					<td><s:property value="provaEspecial" /></td>
					<td><s:property value="notaVencedor" /></td>
				</tr>
			</s:iterator>
		</tbody>


	</table>
	<s:form action="vencedor">
		<s:submit value="Verificar vencedor" class="btn btn-danger"></s:submit>
	</s:form>

</body>
</html>