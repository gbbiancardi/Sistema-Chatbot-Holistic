<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/algoritmo.css">
<link rel="stylesheet" href="css/styleead.css">
<link rel="shortcut icon" href="img/favicon.png" type="image/x-png"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="js/funcoes.js"></script>
  <title>Principios da programação</title>
<script>
  function mostra(id) {
    if (document.getElementById(id).style.display == 'block') {


    document.getElementById(id).style.display = 'none';
  }else{document.getElementById(id).style.display = 'block';}
  }
</script>

</head>
<body>
	<c:choose>
	<c:when test="${not empty usuario}">
  	<div class="menu">
      <ul>

        <a href="chatbot.jsp"><li>Voltar</li></a>
      </ul>
  	</div>


<button class="accordion">OS PIONEIROS DA INFORMÁTICA

</button>
<div class="panel">
  <img src="img/content1.jpg" alt="">
  <h1>OS PIONEIROS DA INFORMÁTICA</h1>
  <p>Criado em 1833 pelo inglês Charles Babbage, o “Calculador analítico” é a primeira máquina realmente
  programável, por isso Babbage é conhecido como “Pai da Informática”. Sua máquina dispunha de programa,
  memória, unidade de controle e periféricos de saída. Talvez, o mais correto seria dar o título de pai do
  hardware de TI, pois a parte de software foi criada por outra pessoa</p>

  <p>De fato, os primeiros trabalhos de linguagem de programação, ou programas, foram criados por Ada Augusta
  Byron King (condessa de Lovelace), que eram utilizados na máquina analítica de Charles Babbage.</p>
  <img src="img/content2.jpg" alt="">
  <p>Lady Lovelace, como era conhecida, foi a única filha legítima do poeta britânico Lord Byron, e é
  reconhecida como a primeira programadora de toda a história. Durante um curto período de nove meses,
  entre os anos de 1842 e 1843, em que esteve envolvida com o projeto de Babbage, ela desenvolveu os
  algoritmos que permitiriam à máquina computar os valores de funções matemáticas (como a sequência de
  Bernoulli), além de publicar uma coleção de notas sobre a máquina analítica.</p>

  <p>Ada de Lovelace foi uma das poucas pessoas que realmente entenderam os conceitos envolvidos no projeto
  de Babbage. Durante o processo de tradução de uma publicação científica italiana sobre o projeto de
  Babbage, ela incluiu algumas notas de tradução que constituem o primeiro programa escrito na história da
  humanidade.
  </p>

  <p>Muito justamente, Ada também foi eternizada com o nome de uma linguagem de computador que leva seu
nome.</p>
</div>

<div class="opcoes">
  
  <form action="avaliar" method="get">
  <label>
  <input type="radio" name="rating" id="rating" value="1" onClick="change">
  <img src="img/star1.png" >
  </label>
  <label>
  <input type="radio" name="rating" value="2" onClick="change">
  <img src="img/star1.png" >
  </label>
  <label>
  <input type="radio" name="rating" value="3" onClick="change">
  <img src="img/star1.png" >
  </label>
  <label>
  <input type="radio" name="rating" value="4" onClick="change">
  <img src="img/star1.png" >
  </label>
  <label>
  <input type="radio" name="rating" value="5" onClick="change">
  <img src="img/star1.png" >
</label>
</form>
</div>

<button class="accordion">A CONTRIBUIÇÃO DA MATEMÁTICA
  <a href="video.jsp"></a></button>
<div class="panel">
  <h1>A CONTRIBUIÇÃO DA MATEMÁTICA</h1>
  <img src="img/content3.jpg" alt="">
  <p>A matemática, naturalmente, não poderia ficar à parte dessa evolução, uma vez que esta foi a força motriz da
    TI desde o princípio. Coube ao inglês George Boole, em 1847, a criação de novos raciocínios aplicáveis ao
    estudo da computação, baseados na lógica binária.</p>
    <p>A lógica de programação atual ainda contém seus conceitos baseados nos estudos de Boole.</p>
</div>

<button class="accordion">A INDÚSTRIA DE HARDWARE <a href="#"></a></button>
<div class="panel">
  <h1>A INDÚSTRIA DE HARDWARE</h1>
  <img src="img/contentpc.jpg" alt="">
  <p>Criada em 1885 pelo norte-americano Herman Hollerith, a “Tabuladora do Censo” foi utilizada no
recenseamento, mas tornou-se sinônimo de recibo de pagamento dos trabalhadores. Basicamente, acumulava
e classificava informações, trabalhando com cartões perfurados, sendo uma evolução da máquina de
Jacquard. Foi usada em muitos outros trabalhos, como o processamento de folha de pagamento, sendo aí
considerada um dos primeiros passos na direção de um computador programável.</p>
  <img src="img/content10.jpg" alt="">
<p>Um ponto bastante interessante a observar é que a empresa de Hollerith se fundiu com outras quatro
empresas, dando origem à Computing Tabulating Recording Corporation, que sob a presidência de Thomas
J. Watson foi renomeada para IBM.</p>

<p>Muito pouco tempo depois, em 1905, foram criadas as válvulas, pelo norte-americano Lee De Forest. Essas
seriam os principais componentes da primeira geração de computadores, algum tempo mais tarde.</p>
</div>


<button class="accordion">COMPUTADORES DE 1ª GERAÇÃO <a href="#"></a></button>
<div class="panel">
  <h1>COMPUTADORES DE 1ª GERAÇÃO</h1>
  <img src="img/content12.jpg" alt="">
  <p>Os computadores da chamada primeira geração foram criados prioritariamente para uso bélico,
governamental, de grandes indústrias e de centros de pesquisa. Seus “usuários” possuíam formação muito
especializada e eram muito mais cientistas e pesquisadores do que qualquer outra função. O próprio termo
usuário soa algo estranho, pois esses pioneiros se comunicavam em linguagem de máquina com esses
equipamentos, ou seja, algo muito anterior aos assemblers, que são mneumônicos da língua inglesa que
funcionam como instruções de computador. A linguagem de máquinas usada era um conjunto de “zeros e
uns”, praticamente indecifrável atualmente.</p>

  <p>Em 1937, o norte-americano Howard Aiken cria o primeiro computador eletromecânico denominado Mark I.</p>

  <img src="img/content15.jpg" alt="">
  <p>Em 1945, os primeiros computadores e suas salas lembravam mais ambientes de filmes de terror – com suas
válvulas, programação como os fios e outros apetrechos – do que a moderna computação.</p>
<p>O Mark I e seus sucedâneos II, III e IV foram os primeiros passos na direção do mainframe, que tomou sua
primeira forma com o computador Colossus, criado em 1943, a partir das ideias do inglês Alan Turing.</p>
<p>Trata-se do primeiro computador eletrônico mecânico programável. O Colossus trabalhava com símbolos
perfurados em fita de papel, que eram lidos por célula fotoelétrica. Comparava a mensagem cifrada com os
códigos conhecidos até encontrar uma coincidência. Ele processava 25.000 caracteres por segundo.</p>
<img src="img/content13.jpg" alt="">
<p>Muito pouco tempo depois, em 1946, foi criado pelos americanos John Mauchly e J. Presper Eckert
o primeiro computador eletrônico digital de grande porte, utilizando-se de válvulas. Seu nome? Eniac</p>

<p>Suas principais caracteristicas eram:</p>
<ul>
  <li>Operava na base dez, não binário.</li>
  <li>18.000 válvulas – 175 Kw de potência – ocupava 270 m².</li>
  <li>5.000 operações por segundo.</li>
  <li>Pesava 30 toneladas.</li>
  <li>Aplicação principal: cálculo balístico.</li>
</ul>
  <img src="img/content14.png" alt="">
<p>Em 1947, pelo húngaro John von Neumann, com base em seus estudos feitos sobre o ENIAC, surge a
definição do esquema básico de funcionamento dos computadores atuais. A chamada Arquitetura de von
Neumann, é a seguinte.</p>
<p>Ainda em 1947, surge o EDVAC – Eletronic Discrete Variable Computer, que se utilizava da notação binária
pura, o que simplificou enormemente a construção das ULA (Unidade Aritmética e Lógica).</p>
<p>A memória era construída com lâmpadas de mercúrio que excitadas por impulso elétrico enviavam sinais
para frente e para trás, possibilitando leituras de 0 ou 1 (ligado/desligado).</p>
<p>Marca-se aqui a separação das funções de operador e programador, cabendo ao Operador a inserção dos
comandos no painel e ao programador a resolução problemas e criação de novos programas. O uso do
computador é otimizado a partir de então</p>
</div>

<button class="accordion">COMPUTADORES DE 2ª GERAÇÃO <a href="#"></a></button>
<div class="panel">
  <h1>COMPUTADORES DE 2ª GERAÇÃO</h1>
  <img src="img/content16.jpg" alt="">
  <p>É criado em 1947, na Universidade de Stanford (EUA), o transistor, usado somente a partir da década
posterior. O uso comercial em grande escala, todavia, só ocorreria no final da década de 1950. É o principal
componente dos computadores de 2ª Geração. A Raytheon lança, ainda em 1948, o Transistor comercial.</p>
<p>Surge em 1952, no Bell Laboratories (EUA), o computador usando transistor (válvula em miniatura), que
solucionou muitos problemas técnicos, tais como a queima de válvulas, aquecimento – foi aumentada a
velocidade e diminuído o tamanho dos computadores. Nota-se que a substituição de uma simples válvula
queimada era um processo trabalhoso e lento.</p>
<p>Nessa geração de computadores, os usuários ainda necessitavam de formação específica e o uso dos
computadores era muito restrito, exclusivo para grandes empresas, organismos do governo e centros de
pesquisa. É o tempo do “terminal burro”.</p>
<img src="img/content17.png" alt="">
<p>Criado em 1949, por Mauchly Computer Corporation, o UNIVAC é o primeiro computador eletrônico
disponível comercialmente. Sua primeira aplicação: processamento das eleições. Trata-se também do
primeiro computador adquirido no Brasil, pelo IBGE para apoio em estatísticas.</p>
<p>O UNIVAC - Universal Automatic Computer era uma máquina eletrônica capaz de armazenar programas de
computadores através de uma fita magnética de alta velocidade, ao invés dos cartões perfurados. Usava o
código BCD de 6 Bits com 1 de paridade.</p>
<p>Algum tempo depois, surgem as unidades de disco rígido que representaram uma revolução no
armazenamento de dados, que antes eram armazenados em fitas. Eram caríssimas, portanto incentivaram o
uso da compactação dos dados. O famoso “bug do milênio” em grande parte ocorreu por isso, pois era
“vantajoso” armazenar “56” e não “1956”.</p>
</p>
</div>


<button class="accordion">COMPUTADORES DE 3ª GERAÇÃO <a href="#"></a></button>
<div class="panel">
  <h1>COMPUTADORES DE 3ª GERAÇÃO</h1>
  <img src="img/content18.jpg" alt="">
  <p>No ano de 1964, a IBM lança a série 360, permitindo o uso desta tecnologia em empresas de grande e médio
portes. A base tecnológica passou a ser o Chip ou circuito integrado (compactação dos transistores em placas
de silício).</p>
</div>


<button class="accordion">NOVAS GERAÇÕES DE COMPUTADORES <a href="#"></a></button>
<div class="panel">
  <h1>NOVAS GERAÇÕES DE COMPUTADORES</h1>
  <img src="img/content19.jpg" alt="">
  <p>Muito antes da fundação da Intel, Gordon Moore vaticinou o que viria a ser uma das mais
interessantes “leis” da TI.</P>

<p>Lei de Moore: “O número de transistores dos chips terá um aumento de 100%, pelo mesmo custo, a cada
período de 18 meses.” (Gordon Moore, presidente da Intel, escreveu esse artigo em 1965).</p>

<P>Criado em 1975, baseado na CPU da Intel 8080, surge o ALTAIR 8800, que é o primeiro computador pessoal
portátil, produzido industrialmente para venda em massa, criado pelos norte-americanos Ed Roberts, Forest
M. Mims III, Stan Cagle e Robert Zaller.</P>
<P>Se não chegou a ser um grande sucesso comercial, motivou a criação de inúmeros outros microcomputadores,
entre os quais se destaca o Apple II.</P>
  <img src="img/content20.jpg" alt="">
<p>Lançado em 1976, por Steve Jobs e Steve Wozniak (fundadores da Apple Corp.), foi o primeiro
microcomputador pessoal a ter sucesso comercial.</P>
<P>Em sequência, surgem os minicomputadores e derivados, até chegarmos aos microcomputadores e seus
derivados, como o notebook. Trata-se de uma indústria em evolução constante, sendo impossível prever
aonde chegará</p>
</div>
 <div class="botaobot">
          <img src="img/chat.png" id="mic" value="Mostrar/Ocular" onClick="mostra('ma')">
        </div>
 <div id="ma" class="hidden">
        <div class="topo" value="Mostrar/Ocular" onClick="mostra('ma')">
          <p><b>Chatbot</b></p>
        </div>



        <section class="container">
        <h2 class="title" style="color: #e91c5d">Insira sua dúvida</h2>
        <div class="chat-container"></div>
        <input type="text" id="question" name="question" class="field"
         />
        <div class="controls">
          <button id="sendQuestion">Send</button>
          <button id="getVoiceButton">Get Voice</button>
          <button id="recordButton">Record</button>
          <button id="pauseButton" disabled>Pause</button>
          <button id="stopButton" disabled>Stop</button>
        </div>
      </section>

      </div>
      </c:when>
      <c:otherwise>
		<p class="subtitle">Você precisa autenticar-se.</p>
		<a href="index.jsp">Voltar para tela de autenticação</a>
	  </c:otherwise>
	</c:choose>
    <script src="https://cdn.rawgit.com/mattdiamond/Recorderjs/08e7abd9/dist/recorder.js"></script>
	<!-- Para a versão dois utilizar o script main.js -->
	<script type="text/javascript" src="scripts/assistant.js"></script>
	<script type="text/javascript" src="scripts/tts.js"></script>
	<script type="text/javascript" src="scripts/stt.js"></script>

<script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.display === "block") {
      panel.style.display = "none";
    } else {
      panel.style.display = "block";
    }
  });
}
</script>
<script>
var radios = document.querySelectorAll('input[type="radio"]');
[].forEach.call(radios, function (radio) {
    radio.addEventListener('change', function () {
        document.querySelector('form').submit();
    });
});
</script>
</body>
</html>
