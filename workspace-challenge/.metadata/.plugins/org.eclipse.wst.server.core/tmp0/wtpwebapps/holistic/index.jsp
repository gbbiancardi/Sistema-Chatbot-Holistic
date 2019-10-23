<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8" />
    <link rel="stylesheet" href="css/main.style.css" type="text/css" />
    <link rel="shortcut icon" href="img/favicon.png" type="image/x-png"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Holistic - Improve your knowledge</title>
  </head>
  <body>
    <section class="container">

      <header class="header">

        <a href="index.jsp" class="brand">
          <h1>Holistic</h1>
        </a>

        <nav class="navigation">

        </nav>

        <button class="btn-blue" onclick="openNav()">Entrar</button>

      </header>

      <!-- Side nav para login -->
      <form id ="frm-login" action="login" method = "post">
      <div id="mySidenav" class="sidenav">

      <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>

      <input type="text" name="codigo" id="login" placeholder="  Digite seu login">
      <br>
      <input type="password" name="senha" id="senha" placeholder="  Digite sua senha">
      <br><br>
      <button>Entrar</button>
      <br><br>
      <a id="acessa-cadastro" href="cadastro.jsp">
      <p style="font-size: 17px;">Não possui uma conta ?</p>
      <p style="font-size: 17px;">Clique aqui</p>
      </a>
      </form>
      </div>

     <!-- Side nav para login -->


      <article class="content">
        <h1>Você está pronto para elevar seu aprendizado?</h1>
        <h2>Um sistema desenvolvido para para as disciplinas EAD FIAP. Consulte nosso ChatBot para tirar quaisquer dúvida. Acompanhe nossas dicas semanalmente.</h2>

        <form method="post">
          <div class="subscribe">
            <div class="field">
              <i><img src="img/email.png" alt="Icone de um envelope"></i>
              <input type="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" placeholder="Digite seu e-mail..." required/>
            </div>
            <button class="btn-blue">Inscrever</button>
          </div>
      </form>
      </article>

      <picture class="second-content">
        <img src="img/pink2.png" class="ilustration" alt="Ilustração de um estudante" height="520px" />
      </picture>

      <footer class="footer">
        <section class="cards-container">
          <div class="card">
            <div class="icon"><img src="img/open-book.png" alt="Icone de um livro"></div>
            <h1>Material</h1>
            <p>Em diversos formatos, para que possa adequar a sua preferência.</p>
          </div>
          <div class="card">
            <div class="icon"><img src="img/chat.png" alt="Icone de um computador"></div>
            <h1>Chatbot</h1>
            <p>Utilize nosso ChatBot para falicitar seu entendimento.</p>
          </div>
          <div class="card">
            <div class="icon"><img src="img/review.png" alt="Icone de uma anotação"></div>
            <h1>Avaliações</h1>
            <p>Avalie os conteudo fornecidos para seguirmos nos aperfeiçoando.</p>
          </div>
        </section>
        <p>&copy; 2019 - Desenvolvido por Holistic</p>
      </footer>
    </section>

    <script>

      function openNav() {
        document.getElementById("mySidenav").style.width = "250px";
      }

      function closeNav() {
        document.getElementById("mySidenav").style.width = "0";
      }
      </script>

  </body>
</html>
