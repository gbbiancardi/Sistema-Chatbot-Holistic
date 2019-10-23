package br.com.holistic.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.holistic.beans.Capitulo;
import br.com.holistic.bo.CapituloBO;

/**
 * Classe responsavel por receber a requisicao da jsp, valida o codigo do capitulo com o BO e devolve para a JSP, caso seja valido
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.web
 */
@WebServlet(urlPatterns = "/capitulo")
public class CapituloServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * O metodo responsavel por fazer a validacao do codigo do Capitulo, enviando como request para o JSP
	 * 
	 * @param objeto HttpServletRequest req, HttpServletResponse resp
	 * @return void
	 * @throws ServletException, IOException
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			int codigo = 1;
			
			CapituloBO bo = new CapituloBO();
			Capitulo capitulo = bo.getCapitulo(codigo);
			
				if(capitulo!=null) {
				HttpSession session = req.getSession();
				session.setAttribute("capitulo", capitulo);
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("algoritmo.jsp");
				dispatcher.forward(req, resp);
				}else {
					req.setAttribute("erro", "capitulo invalido");
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
