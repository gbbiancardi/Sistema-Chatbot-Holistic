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
import br.com.holistic.beans.Usuario;
import br.com.holistic.bo.DisciplinaBO;

/**
 * Classe responsavel por coletar os parametros jsp e enviar para a classe DisciplinaDAO
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.web
 */
@WebServlet(urlPatterns = "/CadastrarDisciplina")
public class CadastrarDisciplinaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * O metodo envia uma requisicao do tipo POST para o banco de dados afim de 
	 * cadastrar uma nova Disciplina com os parametros recebidos pela jsp
	 * e com as validacoes feitas pela camada BO.
	 * 
	 * @param objeto HttpServletRequest req, HttpServletResponse resp
	 * @return void
	 * @throws ServletException, IOException
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		String nome = req.getParameter("nome");
		String dataInicio = req.getParameter("dataInicio");
		String dataTermino = req.getParameter("dataTermino");
		String statusDisciplina = req.getParameter("statusDisciplina");
		
		Usuario u = (Usuario)req.getSession().getAttribute("usuario");
		
		
		try{
			DisciplinaBO bo = new DisciplinaBO();
			Disciplina d = new Disciplina();
			d.setCodigo(codigo);
			d.setNome(nome);
			d.setDataInicio(dataInicio);
			d.setDataTermino(dataTermino);
			d.setStatusDisciplina(statusDisciplina);
			d.setUsuario(u);
			
			
			if(bo.novaDisciplina(d)!=null) {
				
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("menuProfessor.jsp");
				dispatcher.forward(req, resp);
			}else {
				req.setAttribute("erro", bo.novaDisciplina(d));
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
