<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Professor - Gerenciamento de cursos</title>
    <link rel="stylesheet" href="css/menu.css">
  </head>
  <body>
	<c:choose>
	<c:when test="${not empty usuario}">
    <header>
      <a href="index.jsp">Home</a>
    </header>
    <div class="options">
      <button><a href="professor.jsp">Adicionar Disciplina</a></button>
      <button><a href="capitulo.jsp">Adicionar Capitulo</a></button>
     </div>
	</c:when>
      <c:otherwise>
		<p class="subtitle">Você precisa autenticar-se.</p>
		<a href="index.jsp">Voltar para tela de autenticação</a>
	  </c:otherwise>
	</c:choose>
  </body>
</html>
