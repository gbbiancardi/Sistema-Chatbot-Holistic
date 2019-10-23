<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
  	<meta charset="utf-8" />
    <link rel="stylesheet" href="css/main.style.css" type="text/css" />
    <link rel="stylesheet" href="css/sobre.css" type="text/css" />
    <link rel="shortcut icon" href="img/favicon.png" type="image/x-png"/>

   	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>iLearn - Holistic Materias</title>
  </head>
  <body>
    <section class="container">

      <header class="header">

        <a href="index.jsp" class="brand">
          <h1>Holistic</h1>
        </a>
        <c:choose>
		<c:when test="${not empty usuario}">

        <nav class="navigation">
          <ul>
            <li><a >${usuarioo}</a></li>

          </ul>
        </nav>



      </header>

      <article class="content">
        <h1>Qual sua próxima habilidade?</h1>
        <h2>Aqui você poderá desvendar os mistérios por trás de cada habilidade adquirida pelos superheróis da vida real. Descubra um novo mundo de aprendizado.</h2>
      </article>

      <div class="second-content">
        <section class="vcards-container">
          <div class="vcard">
            <h1>x&sup2;</h1>
            <div class="description">
              <h2>Matemática</h2>
              <p>Desde os gregos, você nunca imaginou ter tanta diversão com os números. Descubra como criar arte apenas com equações e dê vida a sua imaginação.</p>
            </div>
          </div>
          <div class="vcard">
            <h1>&lt;&frasl;&gt;</h1>
              <form action="disciplinaServ" method="get">
                  <button>
            <div class="description">
              <h2>Lógica de Programação</h2>
              <p>Assim como o Neo em Matrix, aprenda a ver o mundo através dos modelos binários. Você irá descobrir que pode trazer vida até a objetos inanimados.</p>
            </div>
                </button>
            </form>

          </div>
          <div class="vcard">
            <h1>!?</h1>
            <div class="description">
              <h2>Português</h2>
              <p>Venha aprender a ser um romântico e impressione a todos com poesias retiradas do fundo do coração. Grandes truques para você atingir o coração de todos da maneira que deseja. </p>
            </div>
          </div>
          </c:when>
          <c:otherwise>
			<p class="subtitle">Você precisa autenticar-se.</p>
			<a href="index.jsp">Voltar para tela de autenticação</a>
		</c:otherwise>
		</c:choose>
        </section>
      </div>
      

      <footer class="footer">
        <p>&copy; 2019 - Desenvolvido por Holistic</p>
      </footer>
    </section>
  </body>
</html>
