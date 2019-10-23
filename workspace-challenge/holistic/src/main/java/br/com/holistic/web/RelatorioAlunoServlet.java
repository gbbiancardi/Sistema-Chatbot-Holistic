package br.com.holistic.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.holistic.bo.UsuarioBO;

/**
 * Classe responsavel por validar o Cadastro do aluno
 * 
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.web
 */
@WebServlet(urlPatterns = "/RelatorioAlunoServlet")
public class RelatorioAlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * O metodo responsavel por fazer a validacao do cadastro do Aluno dentro da camada BO
	 * 
	 * @param objeto HttpServletRequest req, HttpServletResponse resp
	 * @return void
	 * @throws ServletException, IOException
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		try {
			
			UsuarioBO bo = new UsuarioBO();
			
			req.setAttribute("usuarios",bo.getAlunos());
			req.getRequestDispatcher("relatorioAluno.jsp").forward(req, resp);
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}

}
