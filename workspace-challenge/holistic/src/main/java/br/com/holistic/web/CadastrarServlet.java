package br.com.holistic.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.holistic.beans.Usuario;
import br.com.holistic.bo.UsuarioBO;

/**
 * Classe responsavel por coletar os parametros jsp e enviar para a classe UsuarioDAO
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.web
 */
@WebServlet(urlPatterns = "/cadastrar")
public class CadastrarServlet extends HttpServlet{

	private static final long serialVersionUID = 7191884501731400602L;
	
	/**
	 * O metodo envia uma requisicao do tipo POST para o banco de dados afim de 
	 * cadastrar uma novo Usuario com os parametros recebidos pela jsp
	 * e com as validacoes feitas pela camada BO.
	 * 
	 * @param objeto HttpServletRequest req, HttpServletResponse resp
	 * @return void
	 * @throws ServletException, IOException
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String tipo = req.getParameter("tipo");
		String codigo = req.getParameter("codigo");
		String senha = req.getParameter("senha");
		String nome = req.getParameter("nome");
		String dataNascimento = req.getParameter("dataNascimento");
		String genero = req.getParameter("genero");
		String email = req.getParameter("email");
		String cpf = req.getParameter("cpf");
		
		try {
			Usuario u = new Usuario();
			UsuarioBO bo = new UsuarioBO();
			u.setTipo(tipo);
			u.setCodigo(codigo);
			u.setSenha(senha);
			u.setNome(nome);
			u.setDataNascimento(dataNascimento);
			u.setGenero(genero);
			u.setEmail(email);
			u.setCpf(cpf);
			
			
			if(bo.addUsuario(u).equals("Cadastrou")) {
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
				dispatcher.forward(req, resp);
				
			}else {
				req.setAttribute("erro", bo.addUsuario(u));
				req.getRequestDispatcher("erro.jsp").forward(req, resp);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
