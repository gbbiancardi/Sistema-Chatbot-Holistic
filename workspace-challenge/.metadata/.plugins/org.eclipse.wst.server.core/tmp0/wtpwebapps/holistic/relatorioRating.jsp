<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="css/relatorio2.css">
<meta charset="utf-8">
<title>Relatorio Avaliacao</title>
</head>
<body>
	<c:choose>
	<c:when test="${not empty usuario}">
    <header>
      <a href="adm.jsp">Home</a>
    </header>
	<div class="tabela">
			<h1 class="subtitle">Avaliações</h1>
			<table>
				<thead>
					<tr>
						<th>Codigo Avaliacao</th>
						<th>Codigo Disciplina</th>
						<th>Codigo Capitulo</th>
						<th>Codigo Usuario</th>
						<th>Nota</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="avaliacao" items="${avaliacoes}">
						<tr>
							<td>${avaliacao.codigo}</td>
							<td>${avaliacao.disciplina.codigo}</td>
							<td>${avaliacao.capitulo.codigo}</td>
							<td>${avaliacao.usuario.codigo}</td>
							<td>${avaliacao.nota}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</c:when>
      <c:otherwise>
		<p class="subtitle">Voc� precisa autenticar-se.</p>
		<a href="index.jsp">Voltar para tela de autentica��o</a>
	  </c:otherwise>
	</c:choose>
</body>
</html>
