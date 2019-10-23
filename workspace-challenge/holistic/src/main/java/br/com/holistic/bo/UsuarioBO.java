package br.com.holistic.bo;

import java.util.List;

import br.com.holistic.beans.Usuario;
import br.com.holistic.dao.AdministradorDAO;
import br.com.holistic.dao.AlunoDAO;
import br.com.holistic.dao.ProfessorDAO;

/**
 * Classe responsavel por definir as Regras de Negocio do Usuario
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.bo
 */
public class UsuarioBO {
	
	/**
	 * Metodo que verifica se os novos Usuarios estão sendo cadastrados de acordo com as Regras de Negocio 
	 * @param New Usuario
	 * @return String
	 * @throws Exception
	 * 	 
	 */
	public String addUsuario(Usuario objUsuario) throws Exception {
		objUsuario.setTipo(objUsuario.getTipo().toUpperCase());
		if (!objUsuario.getTipo().equalsIgnoreCase("ALUNO") && 
				!objUsuario.getTipo().equalsIgnoreCase("PROFESSOR") && 
					!objUsuario.getTipo().equalsIgnoreCase("ADMINISTRADOR"))  {
			return "Tipo de usuario invalido!";
		}
			
		objUsuario.setCodigo(objUsuario.getCodigo().toUpperCase());
		objUsuario.getCodigo().toUpperCase();
		
		if ((objUsuario.getCodigo().indexOf("RM")==0)||(objUsuario.getCodigo().indexOf("P")==0)||(objUsuario.getCodigo().indexOf("A")==0)) {
			return "Codigo invalido";
		}
		
		if(objUsuario.getCpf() == null || objUsuario.getCpf().length() < 11 || objUsuario.getCpf().length() > 14) {
			return "CPF invalido";
		}
		
		objUsuario.setGenero(objUsuario.getGenero().toUpperCase());
		if(!objUsuario.getGenero().equals("M") && !objUsuario.getGenero().equals("F")) {
			return "Genero invalido";
		}
		
		objUsuario.setNome(objUsuario.getNome().toUpperCase());
		if(objUsuario.getNome().length() < 2 || objUsuario.getNome().length() == 0 || objUsuario.getNome().length() > 40) {
			return "Nome invalido";
		} 
		objUsuario.setEmail(objUsuario.getEmail().toUpperCase());
		if(objUsuario.getEmail().indexOf("@")<0) {
			return "Email invalido";
		}
		AlunoDAO adao = new AlunoDAO();
		ProfessorDAO pdao = new ProfessorDAO();
		AdministradorDAO addao = new AdministradorDAO();
		
		if(objUsuario.getTipo().equalsIgnoreCase("aluno")) {
			if(adao.addAluno(objUsuario)==0) {
				adao.fechar();
				pdao.fechar();
				addao.fechar();
				return "Nao cadastrou"; 
			}else {
				adao.fechar();
				pdao.fechar();
				addao.fechar();
				return "Cadastrou";
			}
		}else if(objUsuario.getTipo().equalsIgnoreCase("professor")) {
			if(pdao.addProfessor(objUsuario)==0) {
				adao.fechar();
				pdao.fechar();
				addao.fechar();
				return "Nao cadastrou"; 
			}else {
				adao.fechar();
				pdao.fechar();
				addao.fechar();
				return "Cadastrou";
			}
		}else {
			if(addao.addAdministrador(objUsuario)==0) {
				adao.fechar();
				pdao.fechar();
				addao.fechar();
				return "Nao cadastrou"; 
			}else {
				adao.fechar();
				pdao.fechar();
				addao.fechar();
				return "Cadastrou";
			}
		}
		
	}
	
	/**
	 * Metodo que verifica se os Usuarios já estão cadastrados no Banco de Dados.
	 * CD_USUARIO
	 * CD_USUARIO = PK 
	 * @param Codigo, Senha
	 * @return Usuario
	 * @throws Exception
	 * 	 
	 */
	public Usuario getUsuario(String codigo, String senha)throws Exception{
		
		
		AlunoDAO adao = new AlunoDAO();
		ProfessorDAO pdao = new ProfessorDAO();
		AdministradorDAO addao = new AdministradorDAO();
		codigo = codigo.toUpperCase();
		
		if( codigo.indexOf("RM")==0) {
			Usuario usuario = adao.getAluno(codigo, senha);
			adao.fechar();
			pdao.fechar();
			addao.fechar();
			return usuario;
			
		}else if(codigo.indexOf("P")==0){
			Usuario usuario = pdao.getProfessor(codigo, senha);
			adao.fechar();
			pdao.fechar();
			addao.fechar();
			return usuario;
		}else if(codigo.indexOf("A")==0) {
			Usuario usuario = addao.getAdministrador(codigo, senha);
			adao.fechar();
			pdao.fechar();
			addao.fechar();
			return usuario;
		}else {
			adao.fechar();
			pdao.fechar();
			addao.fechar();
			return null;
		}
		
		
	
	}
	
	/**
	 * Metodo que retorna uma lista de Usuarios cadastrados 
	 * @param 
	 * @return List
	 * @throws Exception
	 * 	 
	 */
	public List<Usuario> getAlunos() throws Exception{
		AlunoDAO dao = new AlunoDAO();
		List<Usuario> usuarios = dao.getAlunos();
		
		
		if(!usuarios.isEmpty()) {
			
			dao.fechar();
			return usuarios;
		}else {
			dao.fechar();
			return null;
		}
	}
	
	
	
}
