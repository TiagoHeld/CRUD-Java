<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<c:url value="/alteraContato" var="linkServletNovaEmpresa"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
	
	<h2 style="text-align:center">Alterar Contato</h2>
	<form class="form-inline" action="${linkServletNovaEmpresa}" method="post" style="width:980px;margin:30px auto;text-align:center">
	  <div class="form-group">
	    <label for="nome">Nome</label>
	    <input type="text" class="form-control" id="nome" name="nome" placeholder="Digite o nome" value="${contato.nome}">
	  </div>
	  <div class="form-group">
	    <label for="telefone">Telefone</label>
	    <input type="text" class="form-control" id="telefone" name="telefone" placeholder="Digite o telefone" value="${contato.telefone}">
	    <input type="hidden" name="id" value="${contato.id}">
	  </div>
  	  <button type="submit" class="btn btn-default">Enviar</button>
</form>
</body>