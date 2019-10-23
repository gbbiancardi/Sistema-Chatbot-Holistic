<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/main.style.css" type="text/css" />
    <link rel="stylesheet" href="css/professor.css">
    <link rel="shortcut icon" href="img/favicon.png" type="image/x-png"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Holistic - Improve your knowledge</title>
  </head>
  <body>
  	<c:choose>
	<c:when test="${not empty usuario}">
    <div class="menu">
  			<ul>

  				<a href="menuProfessor.jsp"><li>Home</li></a>
  			</ul>
  	</div>

    <div class="up">
      <h1>Bem vindo Professor</h1>
      <h2>Registre um novo conteúdo</h2>
  <div class="container">
    <form action="CadastrarDisciplina" method="post">

    <hr>

    <label for="codigo"><b>Código da disciplina</b></label>
    <input type="text" placeholder="Insira o código da disciplina" name="codigo" required>

    <label for="nome"><b>Nome da disciplina</b></label>
    <input type="text" placeholder="Insira o nome da disciplina" name="nome" required>

    <label for="dataInicio"><b>Data de inicio</b></label>
    <input type="text" placeholder="Ex: 00/00/0000" id="dtInicio" name="dataInicio" required>


    <label for="dataTermino"><b>Data de termino</b></label>
    <input type="text" placeholder="Ex: 00/00/0000" id="dtTermino" name="dataTermino" required>

    <label for="statusDisciplina"><b>Status</b></label>
    <select name="statusDisciplina" id="statusDisciplina">
		  <option value="ativo" name="statusDisciplina">Ativo</option>
		  <option value="inativo"  name="statusDisciplina">Inativo</option>
    </select><br><br>


    <button type="submit" class="registerbtn">Começar</button>
  </div>



    </div>
    </c:when>
      <c:otherwise>
		<p class="subtitle">Você precisa autenticar-se.</p>
		<a href="index.jsp">Voltar para tela de autenticação</a>
	  </c:otherwise>
	</c:choose>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.16/jquery.mask.min.js"></script>

    <script type="text/javascript">
      $(document).ready(function(){
      $("#dtInicio").mask("00/00/0000");
      $("#dtTermino").mask("00/00/0000");
      });
    </script>
  </body>
</html>
