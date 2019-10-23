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
      <h2>Cadastre um novo capitulo</h2>
  <div class="container">
    <form action="CadastrarCapitulo" method="post">

    <hr>

    <label for="codigo"><b>Código do capitulo</b></label>
    <input type="text" placeholder="Insira o código do capitulo" name="codigo" required>

    <label for="titulo"><b>Titulo do capitulo</b></label>
    <input type="text" placeholder="Insira o titulo do capitulo" name="titulo" required>

    <label for="disciplina"><b>disciplina</b></label>
    <input type="text" placeholder="Insira o titulo da disciplina" name="codigoDisc" required>


    <label for="documento"><b>Documento</b></label>
     <select name="documento" id="documento">
       <option value="SIM" id="documento">Sim</option>
       <option value="NAO"  id="tipo">Nao</option>
     </select>
     <label for="video"><b>Video</b></label>
     <select name="video" id="video">
       <option value="SIM" id="video">Sim</option>
       <option value="NAO"  id="video">Nao</option>
     </select>
     <label for="audio"><b>Conteudo</b></label>
     <select name="audio" id="audio">
       <option value="SIM" id="audio">Sim</option>
       <option value="NAO"  id="audio">Nao</option>
     </select>
     <br><br>
  <input type="file" name="documento" value="documento">
  <hr>
  </fieldset>

    <button type="submit" class="registerbtn">Registrar</button>
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
