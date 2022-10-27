<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<html>
<head>
<title>index</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<h2 class="jumbotron">Seja Bem-vindo ao nosso Minimundo Struts</h2>
	<h3>Selecione uma turma:</h3>
	<s:form action="listaTurma1">
		<s:submit value="Turma 1" class="btn btn-warning"></s:submit>
	</s:form>
	
	<s:form action="listaTurma2">
		<s:submit value="Turma 2" class="btn btn-secondary"></s:submit>
	</s:form>
	
	<s:form action="listaTurma3">
		<s:submit value="Turma 3" class="btn btn-info"></s:submit>
	</s:form>
	
	<s:form action="listarMelhores">
		<s:submit action="listarMelhores" value="Melhores Alunos" class="btn btn-danger"></s:submit>
	</s:form>
	
</body>
</html>