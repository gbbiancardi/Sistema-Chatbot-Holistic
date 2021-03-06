package br.com.holistic.bo;

import br.com.holistic.beans.Capitulo;
import br.com.holistic.dao.CapituloDAO;
import br.com.holistic.dao.DisciplinaDAO;

/**
 * Classe responsavel por definir as Regras de Negocio do Capitulo
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.bo
 */
public class CapituloBO {
	
	/**
	 * Metodo que verifica se o novo Capitulo foi cadastrado de maneira correta. 
	 * @param New Capitulo
	 * @return String
	 * @throws Exception
	 * 	 
	 */
	public String novoCapitulo(Capitulo c) throws Exception{
		
		if(c.getCodigo()<=0) {
			return "Codigo invalido";
		}
		if(c.getTitulo()==null) {
			return "Titulo invalido";
			
		}
		
		
		if(c.getDisciplina().getCodigo()<=0) {
			return "Codigo invalido";
		}
		DisciplinaDAO ddao = new DisciplinaDAO();
		if(ddao.consultarDisciplina(c.getDisciplina().getCodigo())==null) {
			return "Disciplina nao existe";
		}
		CapituloDAO dao = new CapituloDAO();
		if(dao.cadastrarCapitulo(c)==0) {
			dao.fechar();
			return "Nao cadastrou";
		}else {
			dao.fechar();
			return "Cadastrou";
		}
		
	}
	
	/**
	 * Metodo que verifica se o Codigo ja é existente no banco de dados.
	 * CD_CAPITULO
	 * @param codigo
	 * @return Capitulo
	 * @throws Exception
	 * 	 
	 */
	public Capitulo getCapitulo(int codigo) throws Exception{
		CapituloDAO dao = new CapituloDAO();
		Capitulo capitulo = dao.consultarCapitulo(codigo);
		if(capitulo!=null) {
			
			dao.fechar();
			return capitulo;
		}else {
			dao.fechar();
			return null;
		}
	}

}
