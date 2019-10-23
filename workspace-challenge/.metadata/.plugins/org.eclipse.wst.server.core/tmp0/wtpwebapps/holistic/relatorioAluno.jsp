<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/relatorio.css">
<meta charset="UTF-8">

<title>Relatorio Alunos</title>
</head>
<body>
	<c:choose>
	<c:when test="${not empty usuario}">
    <header>
      <a href="adm.jsp">Home</a>
    </header>
	<div class="tabela">
			<h1 class="subtitle">Alunos Cadastrados</h1>
			<table>
				<thead>
					<tr>
						<th>Codigo Aluno</th>
						<th>Senha</th>
						<th>Nome</th>
						<th>Data Nascimento</th>
						<th>Genero</th>
						<th>Email</th>
						<th>CPF</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="usuario" items="${usuarios}">
						<tr>
							<td>${usuario.codigo}</td>
							<td>${usuario.senha}</td>
							<td>${usuario.nome}</td>
							<td>${usuario.dataNascimento}</td>
							<td>${usuario.genero}</td>
							<td>${usuario.email}</td>
							<td>${usuario.cpf}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		</c:when>
      <c:otherwise>
		<p class="subtitle">Você precisa autenticar-se.</p>
		<a href="index.jsp">Voltar para tela de autenticação</a>
	  </c:otherwise>
	</c:choose>
</body>
</html>
