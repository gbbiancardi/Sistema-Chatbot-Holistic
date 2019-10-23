package br.com.holistic.bo;

import br.com.holistic.beans.Matricula;
import br.com.holistic.dao.MatriculaDAO;

/**
 * Classe responsavel por definir as Regras de Negocio da Matricula
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.bo
 */
public class MatriculaBO {
	
	/**
	 * Metodo que verifica se a nova Matricula foi realizada em data permitida. 
	 * @param New Matricula
	 * @return String
	 * @throws Exception
	 * 	 
	 */
	public String novaMatricula(Matricula m) throws Exception{
		
		if(m.getDataInicio()==null) {
			return "Data invalida";
		}
		MatriculaDAO dao = new MatriculaDAO();
		if(dao.addMatricula(m)==-1) {
			dao.fechar();
			return "Nao cadastrou";
		}else {
			dao.fechar();
			return "Cadastrou";
		}
	}
}
