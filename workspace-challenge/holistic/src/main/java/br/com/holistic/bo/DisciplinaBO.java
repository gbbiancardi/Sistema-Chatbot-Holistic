package br.com.holistic.bo;

import br.com.holistic.beans.Disciplina;
import br.com.holistic.dao.DisciplinaDAO;

/**
 * Classe responsavel por definir as Regras de Negocio da Disciplina
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.bo
 */
public class DisciplinaBO {
	
	/**
	 * Metodo que verifica se a nova Disciplina foi cadastrada de maneira correta. 
	 * @param New Disciplina
	 * @return String
	 * @throws Exception
	 * 	 
	 */
	public String novaDisciplina(Disciplina d) throws Exception{
		
		if(d.getUsuario().getCodigo().indexOf("P")==-1) {
			return "Usuario nao permitido";
		}
	
		
		DisciplinaDAO dao = new DisciplinaDAO();
		
		if(dao.cadastrarDisciplina(d)==1) {
			dao.fechar();
			return "Cadastrou";
		}else {
			dao.fechar();
			return "Nao cadastrou";
		}
		
		
	}
	
	/**
	 * Metodo que verifica se o Codigo da Disciplina ja é existente no banco de dados.
	 * CD_DISCIPLINA
	 * @param codigo
	 * @return Disciplina
	 * @throws Exception
	 * 	 
	 */
	public Disciplina getDisciplina(int codigo) throws Exception{
		DisciplinaDAO dao = new DisciplinaDAO();
		Disciplina disciplina = dao.consultarDisciplina(codigo);
		if(disciplina!=null) {
			
			dao.fechar();
			return disciplina;
		}else {
			dao.fechar();
			return null;
		}
	}

}
