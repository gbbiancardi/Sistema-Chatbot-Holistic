package br.com.holistic.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.holistic.beans.Capitulo;
import br.com.holistic.beans.Usuario;
import br.com.holistic.bo.CapituloBO;
import br.com.holistic.dao.DisciplinaDAO;

/**
 * Classe responsavel por coletar os parametros jsp e enviar para a classe CapituloDAO
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.web
 */
@WebServlet(urlPatterns = "/CadastrarCapitulo")
public class CadastrarCapitulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * O metodo envia uma requisicao do tipo POST para o banco de dados afim de 
	 * cadastrar um novo capitulo com os parametros recebidos pela jsp
	 * e com as validacoes feitas pela camada BO.
	 * 
	 * @param objeto HttpServletRequest req, HttpServletResponse resp
	 * @return void
	 * @throws ServletException, IOException
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		String titulo = req.getParameter("titulo");
		String documento = req.getParameter("documento");
		String video = req.getParameter("video");
		String audio = req.getParameter("audio");
		int codigoDisc = Integer.parseInt(req.getParameter("codigoDisc"));
		
		Usuario u = (Usuario)req.getSession().getAttribute("usuario");
		try {
			CapituloBO bo = new CapituloBO();
			Capitulo c = new Capitulo();
			
			c.setCodigo(codigo);
			c.setTitulo(titulo);
			c.setDocumento(documento);
			c.setVideo(video);
			c.setAudio(audio);
			c.setDisciplina(new DisciplinaDAO().consultarDisciplina(codigoDisc));
			c.setUsuario(u);
			
			if(bo.novoCapitulo(c)!= null) {
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("menuProfessor.jsp");
				dispatcher.forward(req, resp);
				
			}else {
				req.setAttribute("erro", bo.novoCapitulo(c));
				req.getRequestDispatcher("erro.jsp");
			}
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
	}

}
