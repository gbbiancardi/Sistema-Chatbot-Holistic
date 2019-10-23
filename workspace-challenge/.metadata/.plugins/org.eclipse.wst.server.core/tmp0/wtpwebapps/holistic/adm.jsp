<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="shortcut icon" href="img/favicon.png" type="image/x-png"/>
    <link rel="stylesheet" href="css/menu.css">
    <title>Administrador</title>
  </head>
  <body>

   	<c:choose>
	     <c:when test="${not empty usuario}">
        <header>
          <a href="index.jsp">Home</a>
        </header>
        <div class="options">

        	<form action="RelatorioAvaliacaoServlet" method="post">
         	 <button type="submit" name="button">Gerar relatório avaliacao</button>
          </form>

          <form action="RelatorioAlunoServlet" method="post">
         	 <button type="submit" name="button">Gerar relatório alunos</button>
          </form>
        </div>
      </c:when>
    <c:otherwise>
		<p class="subtitle">Você precisa autenticar-se.</p>
		<a href="index.jsp">Voltar para tela de autenticação</a>
	  </c:otherwise>
	</c:choose>

  </body>
</html>
