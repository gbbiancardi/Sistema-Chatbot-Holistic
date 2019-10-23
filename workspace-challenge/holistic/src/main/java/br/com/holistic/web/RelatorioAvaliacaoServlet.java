package br.com.holistic.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.holistic.bo.AvaliacaoBO;

/**
 * Classe responsavel por validar as AvaliaÃ§Ãµes
 * 
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.web
 */
@WebServlet("/RelatorioAvaliacaoServlet")
public class RelatorioAvaliacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * O metodo responsavel por fazer a validacao das Avaliacoes e encaminha-las para a pagina JSP
	 * 
	 * @param objeto HttpServletRequest req, HttpServletResponse resp
	 * @return void
	 * @throws ServletException, IOException
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
		
			AvaliacaoBO bo = new AvaliacaoBO();
			
			req.setAttribute("avaliacoes", bo.getAvaliacoes());
			req.getRequestDispatcher("relatorioRating.jsp").forward(req, resp);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
