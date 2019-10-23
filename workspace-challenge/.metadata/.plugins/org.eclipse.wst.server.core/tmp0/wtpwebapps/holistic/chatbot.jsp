<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/styleead.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto:100" rel="stylesheet">
      <link rel="shortcut icon" href="img/favicon.png" type="image/x-png"/>
      <title>Chatbot - Algoritmo</title>

  </head>
  <body>
  	<c:choose>
	<c:when test="${not empty usuario}">
    <div class="menu">
        <ul>

          <a href="conteudo.jsp"><li>Home</li></a>
        </ul>
    </div>




      <div class="graduacao">
        <br><br><br><br><br>
        <p>GRADUAÇÃO</p>
        <h2>ALGORITMO</h2>
        <ul id="nomes">
          <li>Cap 1 - Princípios da programação</li>
          <li>Cap 2 - Tomada de Decisão</li>
          <li>Cap 3 - Estruturas de Repetição</li>
          <li>Cap 4 - Vetores e Matrizes</li>
          <li>Cap 5 - Análise Algorítima</li>
          <li>Cap 6 - Ordenação de Vetores</li>
          <li>Cap 7 - Busca</li>
        </ul>

        </div>
        <div class="img">

            <ul id="teste">

          <li id="imagens">
			<form action="capitulo" method="post">
              <button>
            <img src="img/play-arrow.png">
              </button>
			</form>
          </li>

          <li id="imagens">


            <a href="https://on.fiap.com.br/local/salavirtual/conteudo-video.php?c=1587&id=38019"><img src="img/play-arrow.png"></a>


          </li>
          <li id="imagens">


            <a href="https://on.fiap.com.br/local/salavirtual/conteudo-video.php?c=1587&id=38020"><img src="img/play-arrow.png"></a>


          </li>
          <li id="imagens">



            <a href="https://on.fiap.com.br/local/salavirtual/conteudo-video.php?c=1587&id=38021"><img src="img/play-arrow.png"></a>


          </li>
          <li id="imagens">



            <a href="https://on.fiap.com.br/local/salavirtual/conteudo-video.php?c=1587&id=38022"><img src="img/play-arrow.png"></a>


          </li>
          <li id="imagens">



            <a href="https://on.fiap.com.br/local/salavirtual/conteudo-video.php?c=1587&id=38023"><img src="img/play-arrow.png"></a>


          </li>
          <li id="imagens">



            <a href="https://on.fiap.com.br/local/salavirtual/conteudo-video.php?c=1587&id=38024"><img src="img/play-arrow.png"></a>


          </li>
        </ul>
        </div>
		<picture class="second-content">
        <img src="img/pink2.png" class="ilustration" alt="Ilustração de um estudante" height="520px" />
      </picture>
      </c:when>
	  <c:otherwise>
		<p class="subtitle">Você precisa autenticar-se.</p>
		<a href="index.jsp">Voltar para tela de autenticação</a>
	  </c:otherwise>
	</c:choose>
	  <script>
        function mostra(id) {
          if (document.getElementById(id).style.display == 'block') {


          document.getElementById(id).style.display = 'none';
        }else{document.getElementById(id).style.display = 'block';}
        }
      </script>
	




  </body>
</html>
