<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, principal.agenda_pessoal.Contato" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
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
	<c:if test="${not empty contato}">
		<p>Empresa ${ contato } cadastrada com sucesso!!</p>
	</c:if>
	<h2 style="text-align: center">Lista de Contatos</h2>
	
	<ul>
		<table class="table table-bordered" style="width:96%">
				<tr>
					<th  style="text-align: center">Nome</th>
					<th  style="text-align: center">Telefone</th>
					<th  style="text-align: center">Ações</th>
				<tr>
		<c:forEach items="${contatos}" var="contato">
				<tr>
					<td>
						${contato.nome}
					</td>
					<td>
						${contato.telefone}
					</td>
					<td style="text-align: center">
						<a class="btn btn-info" href="/agenda_pessoal/mostraContato?id=${contato.id}">edita</a>
						<a class="btn btn-danger" href="/agenda_pessoal/removeContato?id=${contato.id}">remove</a>
					</td>
				</tr>
		</c:forEach>
		</table>
	</ul>
	<a class="btn btn-primary" href="/agenda_pessoal/formNovoContato.jsp" style="margin-left:38px">Novo Contato</a>
	
		
</body>
</html>