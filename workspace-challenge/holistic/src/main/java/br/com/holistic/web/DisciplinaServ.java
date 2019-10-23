package br.com.holistic.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.holistic.beans.Disciplina;
import br.com.holistic.bo.DisciplinaBO;

/**
 * Classe responsavel por receber a requisicao da jsp, faz a validacao da Disciplina com o BO e devolve para a JSP, caso seja valido
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.web
 */
@WebServlet(urlPatterns = "/disciplinaServ")
public class DisciplinaServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * O metodo responsavel por fazer a validacao do codigo da Disciplina, enviando como request para o JSP
	 * 
	 * @param objeto HttpServletRequest req, HttpServletResponse resp
	 * @return void
	 * @throws ServletException, IOException
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		try {
			int codigo = 1;
			
			DisciplinaBO bo = new DisciplinaBO();
			Disciplina disciplina = bo.getDisciplina(codigo);
			if(disciplina!=null) {
				
				HttpSession session = req.getSession();
				session.setAttribute("disciplina", disciplina);
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("chatbot.jsp");
				dispatcher.forward(req, resp);
			}else {
				req.setAttribute("erro", "disciplina invalida");
				req.getRequestDispatcher("erro.jsp").forward(req, resp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
