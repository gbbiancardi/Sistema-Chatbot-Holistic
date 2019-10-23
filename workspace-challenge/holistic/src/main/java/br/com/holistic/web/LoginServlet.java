package br.com.holistic.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.holistic.beans.Usuario;
import br.com.holistic.bo.UsuarioBO;

/**
 * Classe responsavel por receber a requisicao da jsp, e fazer a validacao do Usuario
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.web
 */
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet{

	/**
	 * O metodo responsavel por fazer a validacao do codigo do Usuario, enviando o mesmo para a JSP correspondente
	 * Seja a JSP do Aluno, Professor ou Administrador
	 * 
	 * @param objeto HttpServletRequest req, HttpServletResponse resp
	 * @return void
	 * @throws ServletException, IOException
	 */
	private static final long serialVersionUID = -1130495669845289264L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			String codigo = req.getParameter("codigo");
			String senha = req.getParameter("senha");
			Usuario usuario = new UsuarioBO().getUsuario(codigo, senha);
			codigo = codigo.toUpperCase();
			
				if(codigo.indexOf("RM")==0) {
					if(usuario != null) {
					HttpSession session = req.getSession();
					session.setAttribute("usuario", usuario);
					
					req.setAttribute("usuarioo", usuario.getNome());
					RequestDispatcher dispatcher = req.getRequestDispatcher("conteudo.jsp");
					dispatcher.forward(req, resp);
					
					
					}else {
						
						req.setAttribute("erro", "Usuario ou senha invalido");
						req.getRequestDispatcher("erro.jsp").forward(req, resp);
						
					}
				}else if(codigo.indexOf("P")==0) {	
					if(usuario != null) {
					HttpSession session = req.getSession();
					session.setAttribute("usuario", usuario);
					
					RequestDispatcher dispatcher = req.getRequestDispatcher("menuProfessor.jsp");
					dispatcher.forward(req, resp);
					}else {
						
						req.setAttribute("erro", "Usuario ou senha invalido");
						req.getRequestDispatcher("erro.jsp").forward(req, resp);
						
					}
				}else {	
					if(usuario != null) {
					HttpSession session = req.getSession();
					session.setAttribute("usuario", usuario);
					
					RequestDispatcher dispatcher = req.getRequestDispatcher("adm.jsp");
					dispatcher.forward(req, resp);
					}else {
						
						req.setAttribute("erro", "Usuario ou senha invalido");
						req.getRequestDispatcher("erro.jsp").forward(req, resp);
						
					}
				}
		}catch(Exception e)	{
			e.printStackTrace();
		}finally {
			try {
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
				
			
		


		
		
	}
}
