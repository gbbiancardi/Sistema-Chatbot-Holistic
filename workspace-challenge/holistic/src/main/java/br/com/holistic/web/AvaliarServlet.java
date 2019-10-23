package br.com.holistic.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.holistic.beans.Avaliacao;
import br.com.holistic.beans.Capitulo;
import br.com.holistic.beans.Disciplina;
import br.com.holistic.beans.Usuario;
import br.com.holistic.bo.AvaliacaoBO;
import br.com.holistic.dao.AvaliacaoDAO;

/**
 * Classe Responsavel por realizar a avaliacao da disciplina por meio do Aluno com os parametros recebidos pela jsp
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.web
 */
@WebServlet("/avaliar")
public class AvaliarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * O metodo envia uma requisicao post para o banco de dados afim de cadastrar os atributos da avaliacao
	 * @param objeto HttpServletRequest req, HttpServletResponse resp
	 * @return void
	 * @throws ServletException, IOException
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int nota = Integer.parseInt(req.getParameter("rating"));
		
		Disciplina d = (Disciplina)req.getSession().getAttribute("disciplina");
		Capitulo c = (Capitulo)req.getSession().getAttribute("capitulo");
		Usuario u = (Usuario)req.getSession().getAttribute("usuario");
		
		try {
			
			AvaliacaoBO bo = new AvaliacaoBO();
			Avaliacao a = new Avaliacao();
			
			
			a.setNota(nota);
			a.setDisciplina(d);
			a.setCapitulo(c);
			a.setUsuario(u);
			
			if(bo.addAvaliacao(a)!=null) {
				req.getRequestDispatcher("algoritmo.jsp").forward(req, resp);
			}else {
				System.out.println("Nao cadastrou");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
