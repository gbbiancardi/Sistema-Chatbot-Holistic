/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.26
 * Generated at: 2019-10-23 16:06:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class algoritmo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1570038696266L));
    _jspx_dependants.put("jar:file:/C:/Users/gabrielbertocco/Desktop/ChallengeIBM_Holistic/workspace-challenge/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/holistic/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153395882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/algoritmo.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styleead.css\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"img/favicon.png\" type=\"image/x-png\"/>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<script src=\"js/funcoes.js\"></script>\r\n");
      out.write("  <title>Principios da programação</title>\r\n");
      out.write("<script>\r\n");
      out.write("  function mostra(id) {\r\n");
      out.write("    if (document.getElementById(id).style.display == 'block') {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    document.getElementById(id).style.display = 'none';\r\n");
      out.write("  }else{document.getElementById(id).style.display = 'block';}\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.rawgit.com/mattdiamond/Recorderjs/08e7abd9/dist/recorder.js\"></script>\r\n");
      out.write("\t<!-- Para a versão dois utilizar o script main.js -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"scripts/assistant.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"scripts/tts.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"scripts/stt.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var acc = document.getElementsByClassName(\"accordion\");\r\n");
      out.write("var i;\r\n");
      out.write("\r\n");
      out.write("for (i = 0; i < acc.length; i++) {\r\n");
      out.write("  acc[i].addEventListener(\"click\", function() {\r\n");
      out.write("    this.classList.toggle(\"active\");\r\n");
      out.write("    var panel = this.nextElementSibling;\r\n");
      out.write("    if (panel.style.display === \"block\") {\r\n");
      out.write("      panel.style.display = \"none\";\r\n");
      out.write("    } else {\r\n");
      out.write("      panel.style.display = \"block\";\r\n");
      out.write("    }\r\n");
      out.write("  });\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("var radios = document.querySelectorAll('input[type=\"radio\"]');\r\n");
      out.write("[].forEach.call(radios, function (radio) {\r\n");
      out.write("    radio.addEventListener('change', function () {\r\n");
      out.write("        document.querySelector('form').submit();\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("      ");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /algoritmo.jsp(27,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty usuario}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("  \t<div class=\"menu\">\r\n");
          out.write("      <ul>\r\n");
          out.write("\r\n");
          out.write("        <a href=\"chatbot.jsp\"><li>Voltar</li></a>\r\n");
          out.write("      </ul>\r\n");
          out.write("  \t</div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<button class=\"accordion\">OS PIONEIROS DA INFORMÁTICA\r\n");
          out.write("\r\n");
          out.write("</button>\r\n");
          out.write("<div class=\"panel\">\r\n");
          out.write("  <img src=\"img/content1.jpg\" alt=\"\">\r\n");
          out.write("  <h1>OS PIONEIROS DA INFORMÁTICA</h1>\r\n");
          out.write("  <p>Criado em 1833 pelo inglês Charles Babbage, o “Calculador analítico” é a primeira máquina realmente\r\n");
          out.write("  programável, por isso Babbage é conhecido como “Pai da Informática”. Sua máquina dispunha de programa,\r\n");
          out.write("  memória, unidade de controle e periféricos de saída. Talvez, o mais correto seria dar o título de pai do\r\n");
          out.write("  hardware de TI, pois a parte de software foi criada por outra pessoa</p>\r\n");
          out.write("\r\n");
          out.write("  <p>De fato, os primeiros trabalhos de linguagem de programação, ou programas, foram criados por Ada Augusta\r\n");
          out.write("  Byron King (condessa de Lovelace), que eram utilizados na máquina analítica de Charles Babbage.</p>\r\n");
          out.write("  <img src=\"img/content2.jpg\" alt=\"\">\r\n");
          out.write("  <p>Lady Lovelace, como era conhecida, foi a única filha legítima do poeta britânico Lord Byron, e é\r\n");
          out.write("  reconhecida como a primeira programadora de toda a história. Durante um curto período de nove meses,\r\n");
          out.write("  entre os anos de 1842 e 1843, em que esteve envolvida com o projeto de Babbage, ela desenvolveu os\r\n");
          out.write("  algoritmos que permitiriam à máquina computar os valores de funções matemáticas (como a sequência de\r\n");
          out.write("  Bernoulli), além de publicar uma coleção de notas sobre a máquina analítica.</p>\r\n");
          out.write("\r\n");
          out.write("  <p>Ada de Lovelace foi uma das poucas pessoas que realmente entenderam os conceitos envolvidos no projeto\r\n");
          out.write("  de Babbage. Durante o processo de tradução de uma publicação científica italiana sobre o projeto de\r\n");
          out.write("  Babbage, ela incluiu algumas notas de tradução que constituem o primeiro programa escrito na história da\r\n");
          out.write("  humanidade.\r\n");
          out.write("  </p>\r\n");
          out.write("\r\n");
          out.write("  <p>Muito justamente, Ada também foi eternizada com o nome de uma linguagem de computador que leva seu\r\n");
          out.write("nome.</p>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("<div class=\"opcoes\">\r\n");
          out.write("  \r\n");
          out.write("  <form action=\"avaliar\" method=\"get\">\r\n");
          out.write("  <label>\r\n");
          out.write("  <input type=\"radio\" name=\"rating\" id=\"rating\" value=\"1\" onClick=\"change\">\r\n");
          out.write("  <img src=\"img/star1.png\" >\r\n");
          out.write("  </label>\r\n");
          out.write("  <label>\r\n");
          out.write("  <input type=\"radio\" name=\"rating\" value=\"2\" onClick=\"change\">\r\n");
          out.write("  <img src=\"img/star1.png\" >\r\n");
          out.write("  </label>\r\n");
          out.write("  <label>\r\n");
          out.write("  <input type=\"radio\" name=\"rating\" value=\"3\" onClick=\"change\">\r\n");
          out.write("  <img src=\"img/star1.png\" >\r\n");
          out.write("  </label>\r\n");
          out.write("  <label>\r\n");
          out.write("  <input type=\"radio\" name=\"rating\" value=\"4\" onClick=\"change\">\r\n");
          out.write("  <img src=\"img/star1.png\" >\r\n");
          out.write("  </label>\r\n");
          out.write("  <label>\r\n");
          out.write("  <input type=\"radio\" name=\"rating\" value=\"5\" onClick=\"change\">\r\n");
          out.write("  <img src=\"img/star1.png\" >\r\n");
          out.write("</label>\r\n");
          out.write("</form>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("<button class=\"accordion\">A CONTRIBUIÇÃO DA MATEMÁTICA\r\n");
          out.write("  <a href=\"video.jsp\"></a></button>\r\n");
          out.write("<div class=\"panel\">\r\n");
          out.write("  <h1>A CONTRIBUIÇÃO DA MATEMÁTICA</h1>\r\n");
          out.write("  <img src=\"img/content3.jpg\" alt=\"\">\r\n");
          out.write("  <p>A matemática, naturalmente, não poderia ficar à parte dessa evolução, uma vez que esta foi a força motriz da\r\n");
          out.write("    TI desde o princípio. Coube ao inglês George Boole, em 1847, a criação de novos raciocínios aplicáveis ao\r\n");
          out.write("    estudo da computação, baseados na lógica binária.</p>\r\n");
          out.write("    <p>A lógica de programação atual ainda contém seus conceitos baseados nos estudos de Boole.</p>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("<button class=\"accordion\">A INDÚSTRIA DE HARDWARE <a href=\"#\"></a></button>\r\n");
          out.write("<div class=\"panel\">\r\n");
          out.write("  <h1>A INDÚSTRIA DE HARDWARE</h1>\r\n");
          out.write("  <img src=\"img/contentpc.jpg\" alt=\"\">\r\n");
          out.write("  <p>Criada em 1885 pelo norte-americano Herman Hollerith, a “Tabuladora do Censo” foi utilizada no\r\n");
          out.write("recenseamento, mas tornou-se sinônimo de recibo de pagamento dos trabalhadores. Basicamente, acumulava\r\n");
          out.write("e classificava informações, trabalhando com cartões perfurados, sendo uma evolução da máquina de\r\n");
          out.write("Jacquard. Foi usada em muitos outros trabalhos, como o processamento de folha de pagamento, sendo aí\r\n");
          out.write("considerada um dos primeiros passos na direção de um computador programável.</p>\r\n");
          out.write("  <img src=\"img/content10.jpg\" alt=\"\">\r\n");
          out.write("<p>Um ponto bastante interessante a observar é que a empresa de Hollerith se fundiu com outras quatro\r\n");
          out.write("empresas, dando origem à Computing Tabulating Recording Corporation, que sob a presidência de Thomas\r\n");
          out.write("J. Watson foi renomeada para IBM.</p>\r\n");
          out.write("\r\n");
          out.write("<p>Muito pouco tempo depois, em 1905, foram criadas as válvulas, pelo norte-americano Lee De Forest. Essas\r\n");
          out.write("seriam os principais componentes da primeira geração de computadores, algum tempo mais tarde.</p>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<button class=\"accordion\">COMPUTADORES DE 1ª GERAÇÃO <a href=\"#\"></a></button>\r\n");
          out.write("<div class=\"panel\">\r\n");
          out.write("  <h1>COMPUTADORES DE 1ª GERAÇÃO</h1>\r\n");
          out.write("  <img src=\"img/content12.jpg\" alt=\"\">\r\n");
          out.write("  <p>Os computadores da chamada primeira geração foram criados prioritariamente para uso bélico,\r\n");
          out.write("governamental, de grandes indústrias e de centros de pesquisa. Seus “usuários” possuíam formação muito\r\n");
          out.write("especializada e eram muito mais cientistas e pesquisadores do que qualquer outra função. O próprio termo\r\n");
          out.write("usuário soa algo estranho, pois esses pioneiros se comunicavam em linguagem de máquina com esses\r\n");
          out.write("equipamentos, ou seja, algo muito anterior aos assemblers, que são mneumônicos da língua inglesa que\r\n");
          out.write("funcionam como instruções de computador. A linguagem de máquinas usada era um conjunto de “zeros e\r\n");
          out.write("uns”, praticamente indecifrável atualmente.</p>\r\n");
          out.write("\r\n");
          out.write("  <p>Em 1937, o norte-americano Howard Aiken cria o primeiro computador eletromecânico denominado Mark I.</p>\r\n");
          out.write("\r\n");
          out.write("  <img src=\"img/content15.jpg\" alt=\"\">\r\n");
          out.write("  <p>Em 1945, os primeiros computadores e suas salas lembravam mais ambientes de filmes de terror – com suas\r\n");
          out.write("válvulas, programação como os fios e outros apetrechos – do que a moderna computação.</p>\r\n");
          out.write("<p>O Mark I e seus sucedâneos II, III e IV foram os primeiros passos na direção do mainframe, que tomou sua\r\n");
          out.write("primeira forma com o computador Colossus, criado em 1943, a partir das ideias do inglês Alan Turing.</p>\r\n");
          out.write("<p>Trata-se do primeiro computador eletrônico mecânico programável. O Colossus trabalhava com símbolos\r\n");
          out.write("perfurados em fita de papel, que eram lidos por célula fotoelétrica. Comparava a mensagem cifrada com os\r\n");
          out.write("códigos conhecidos até encontrar uma coincidência. Ele processava 25.000 caracteres por segundo.</p>\r\n");
          out.write("<img src=\"img/content13.jpg\" alt=\"\">\r\n");
          out.write("<p>Muito pouco tempo depois, em 1946, foi criado pelos americanos John Mauchly e J. Presper Eckert\r\n");
          out.write("o primeiro computador eletrônico digital de grande porte, utilizando-se de válvulas. Seu nome? Eniac</p>\r\n");
          out.write("\r\n");
          out.write("<p>Suas principais caracteristicas eram:</p>\r\n");
          out.write("<ul>\r\n");
          out.write("  <li>Operava na base dez, não binário.</li>\r\n");
          out.write("  <li>18.000 válvulas – 175 Kw de potência – ocupava 270 m².</li>\r\n");
          out.write("  <li>5.000 operações por segundo.</li>\r\n");
          out.write("  <li>Pesava 30 toneladas.</li>\r\n");
          out.write("  <li>Aplicação principal: cálculo balístico.</li>\r\n");
          out.write("</ul>\r\n");
          out.write("  <img src=\"img/content14.png\" alt=\"\">\r\n");
          out.write("<p>Em 1947, pelo húngaro John von Neumann, com base em seus estudos feitos sobre o ENIAC, surge a\r\n");
          out.write("definição do esquema básico de funcionamento dos computadores atuais. A chamada Arquitetura de von\r\n");
          out.write("Neumann, é a seguinte.</p>\r\n");
          out.write("<p>Ainda em 1947, surge o EDVAC – Eletronic Discrete Variable Computer, que se utilizava da notação binária\r\n");
          out.write("pura, o que simplificou enormemente a construção das ULA (Unidade Aritmética e Lógica).</p>\r\n");
          out.write("<p>A memória era construída com lâmpadas de mercúrio que excitadas por impulso elétrico enviavam sinais\r\n");
          out.write("para frente e para trás, possibilitando leituras de 0 ou 1 (ligado/desligado).</p>\r\n");
          out.write("<p>Marca-se aqui a separação das funções de operador e programador, cabendo ao Operador a inserção dos\r\n");
          out.write("comandos no painel e ao programador a resolução problemas e criação de novos programas. O uso do\r\n");
          out.write("computador é otimizado a partir de então</p>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("<button class=\"accordion\">COMPUTADORES DE 2ª GERAÇÃO <a href=\"#\"></a></button>\r\n");
          out.write("<div class=\"panel\">\r\n");
          out.write("  <h1>COMPUTADORES DE 2ª GERAÇÃO</h1>\r\n");
          out.write("  <img src=\"img/content16.jpg\" alt=\"\">\r\n");
          out.write("  <p>É criado em 1947, na Universidade de Stanford (EUA), o transistor, usado somente a partir da década\r\n");
          out.write("posterior. O uso comercial em grande escala, todavia, só ocorreria no final da década de 1950. É o principal\r\n");
          out.write("componente dos computadores de 2ª Geração. A Raytheon lança, ainda em 1948, o Transistor comercial.</p>\r\n");
          out.write("<p>Surge em 1952, no Bell Laboratories (EUA), o computador usando transistor (válvula em miniatura), que\r\n");
          out.write("solucionou muitos problemas técnicos, tais como a queima de válvulas, aquecimento – foi aumentada a\r\n");
          out.write("velocidade e diminuído o tamanho dos computadores. Nota-se que a substituição de uma simples válvula\r\n");
          out.write("queimada era um processo trabalhoso e lento.</p>\r\n");
          out.write("<p>Nessa geração de computadores, os usuários ainda necessitavam de formação específica e o uso dos\r\n");
          out.write("computadores era muito restrito, exclusivo para grandes empresas, organismos do governo e centros de\r\n");
          out.write("pesquisa. É o tempo do “terminal burro”.</p>\r\n");
          out.write("<img src=\"img/content17.png\" alt=\"\">\r\n");
          out.write("<p>Criado em 1949, por Mauchly Computer Corporation, o UNIVAC é o primeiro computador eletrônico\r\n");
          out.write("disponível comercialmente. Sua primeira aplicação: processamento das eleições. Trata-se também do\r\n");
          out.write("primeiro computador adquirido no Brasil, pelo IBGE para apoio em estatísticas.</p>\r\n");
          out.write("<p>O UNIVAC - Universal Automatic Computer era uma máquina eletrônica capaz de armazenar programas de\r\n");
          out.write("computadores através de uma fita magnética de alta velocidade, ao invés dos cartões perfurados. Usava o\r\n");
          out.write("código BCD de 6 Bits com 1 de paridade.</p>\r\n");
          out.write("<p>Algum tempo depois, surgem as unidades de disco rígido que representaram uma revolução no\r\n");
          out.write("armazenamento de dados, que antes eram armazenados em fitas. Eram caríssimas, portanto incentivaram o\r\n");
          out.write("uso da compactação dos dados. O famoso “bug do milênio” em grande parte ocorreu por isso, pois era\r\n");
          out.write("“vantajoso” armazenar “56” e não “1956”.</p>\r\n");
          out.write("</p>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<button class=\"accordion\">COMPUTADORES DE 3ª GERAÇÃO <a href=\"#\"></a></button>\r\n");
          out.write("<div class=\"panel\">\r\n");
          out.write("  <h1>COMPUTADORES DE 3ª GERAÇÃO</h1>\r\n");
          out.write("  <img src=\"img/content18.jpg\" alt=\"\">\r\n");
          out.write("  <p>No ano de 1964, a IBM lança a série 360, permitindo o uso desta tecnologia em empresas de grande e médio\r\n");
          out.write("portes. A base tecnológica passou a ser o Chip ou circuito integrado (compactação dos transistores em placas\r\n");
          out.write("de silício).</p>\r\n");
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("<button class=\"accordion\">NOVAS GERAÇÕES DE COMPUTADORES <a href=\"#\"></a></button>\r\n");
          out.write("<div class=\"panel\">\r\n");
          out.write("  <h1>NOVAS GERAÇÕES DE COMPUTADORES</h1>\r\n");
          out.write("  <img src=\"img/content19.jpg\" alt=\"\">\r\n");
          out.write("  <p>Muito antes da fundação da Intel, Gordon Moore vaticinou o que viria a ser uma das mais\r\n");
          out.write("interessantes “leis” da TI.</P>\r\n");
          out.write("\r\n");
          out.write("<p>Lei de Moore: “O número de transistores dos chips terá um aumento de 100%, pelo mesmo custo, a cada\r\n");
          out.write("período de 18 meses.” (Gordon Moore, presidente da Intel, escreveu esse artigo em 1965).</p>\r\n");
          out.write("\r\n");
          out.write("<P>Criado em 1975, baseado na CPU da Intel 8080, surge o ALTAIR 8800, que é o primeiro computador pessoal\r\n");
          out.write("portátil, produzido industrialmente para venda em massa, criado pelos norte-americanos Ed Roberts, Forest\r\n");
          out.write("M. Mims III, Stan Cagle e Robert Zaller.</P>\r\n");
          out.write("<P>Se não chegou a ser um grande sucesso comercial, motivou a criação de inúmeros outros microcomputadores,\r\n");
          out.write("entre os quais se destaca o Apple II.</P>\r\n");
          out.write("  <img src=\"img/content20.jpg\" alt=\"\">\r\n");
          out.write("<p>Lançado em 1976, por Steve Jobs e Steve Wozniak (fundadores da Apple Corp.), foi o primeiro\r\n");
          out.write("microcomputador pessoal a ter sucesso comercial.</P>\r\n");
          out.write("<P>Em sequência, surgem os minicomputadores e derivados, até chegarmos aos microcomputadores e seus\r\n");
          out.write("derivados, como o notebook. Trata-se de uma indústria em evolução constante, sendo impossível prever\r\n");
          out.write("aonde chegará</p>\r\n");
          out.write("</div>\r\n");
          out.write(" <div class=\"botaobot\">\r\n");
          out.write("          <img src=\"img/chat.png\" id=\"mic\" value=\"Mostrar/Ocular\" onClick=\"mostra('ma')\">\r\n");
          out.write("        </div>\r\n");
          out.write(" <div id=\"ma\" class=\"hidden\">\r\n");
          out.write("        <div class=\"topo\" value=\"Mostrar/Ocular\" onClick=\"mostra('ma')\">\r\n");
          out.write("          <p><b>Chatbot</b></p>\r\n");
          out.write("        </div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("        <section class=\"container\">\r\n");
          out.write("        <h2 class=\"title\" style=\"color: #e91c5d\">Insira sua dúvida</h2>\r\n");
          out.write("        <div class=\"chat-container\"></div>\r\n");
          out.write("        <input type=\"text\" id=\"question\" name=\"question\" class=\"field\"\r\n");
          out.write("         />\r\n");
          out.write("        <div class=\"controls\">\r\n");
          out.write("          <button id=\"sendQuestion\">Send</button>\r\n");
          out.write("          <button id=\"getVoiceButton\">Get Voice</button>\r\n");
          out.write("          <button id=\"recordButton\">Record</button>\r\n");
          out.write("          <button id=\"pauseButton\" disabled>Pause</button>\r\n");
          out.write("          <button id=\"stopButton\" disabled>Stop</button>\r\n");
          out.write("        </div>\r\n");
          out.write("      </section>\r\n");
          out.write("\r\n");
          out.write("      </div>\r\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<p class=\"subtitle\">Você precisa autenticar-se.</p>\r\n");
          out.write("\t\t<a href=\"index.jsp\">Voltar para tela de autenticação</a>\r\n");
          out.write("\t  ");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}
