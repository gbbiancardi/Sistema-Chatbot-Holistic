package br.com.holistic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.holistic.beans.Usuario;
import br.com.holistic.conexao.Conexao;

/**
 * Classe responsavel por Estabeler a Conexao com o Banco de Dados entre AlunoDAO e Conexao
 * CD_ALUNO ,NR_SENHA,NM_ALUNO,DT_NASCIMENTO,DS_GENERO,DS_EMAIL,NR_CPF
 * CD_ALUNO = PK
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.dao
 */
public class AlunoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	/**
	 * Metodo que estabelece conexao entre o AlunoDAO e Conexao.
	 * @param 
	 * @return 
	 * @throws Exception
	 * 	 
	 */
	public AlunoDAO() throws Exception{
		con = Conexao.getConnectar();
	}
	
	/**
	 * Metodo que Cadastra um novo Aluno no Banco de Dados
	 * @param new Usuario
	 * @return int
	 * @throws Exception
	 * 	 
	 */
	public int addAluno(Usuario u) throws Exception{
		
			stmt = con.prepareStatement("INSERT INTO T_SCB_ALUNO(CD_ALUNO ,NR_SENHA,NM_ALUNO,DT_NASCIMENTO,DS_GENERO,DS_EMAIL,NR_CPF)VALUES(?,?,?,?,?,?,?)");
			
			stmt.setString(1, "RM" + u.getCodigo());
			stmt.setString(2, u.getSenha());
			stmt.setString(3, u.getNome());	
			stmt.setString(4, u.getDataNascimento());
			stmt.setString(5, u.getGenero());
			stmt.setString(6, u.getEmail());
			stmt.setString(7, u.getCpf());
			
			return stmt.executeUpdate();
	}	
	
	/**
	 * Metodo que vizualiza um aluno em especifico que esteja logado
	 * @param codigo, senha
	 * @return new Usuario
	 * @throws Exception
	 * 	 
	 */
	public Usuario getAluno(String codigo, String senha) throws Exception{
		
		stmt = con.prepareStatement("SELECT * FROM T_SCB_ALUNO where CD_ALUNO=? and NR_SENHA=?");
		stmt.setString(1, codigo);
		stmt.setString(2, senha);
		rs =stmt.executeQuery();
					
		if(rs.next()) {		
			return 
					new Usuario(
					rs.getString("CD_ALUNO"),
					rs.getString("NR_SENHA"),
					rs.getString("NM_ALUNO"), 
					rs.getString("DT_NASCIMENTO"),
					rs.getString("DS_GENERO"), 
					rs.getString("DS_EMAIL"),
					rs.getString("NR_CPF"));
				
		}else {
			return null;
		}
		
	}
	
	/**
	 * Metodo que vizualiza um aluno em especifico cadastrado
	 * @param codigo
	 * @return new Usuario
	 * @throws Exception
	 * 	 
	 */
	public Usuario getAluno(String codigo) throws Exception{
		
		stmt = con.prepareStatement("SELECT * FROM T_SCB_ALUNO where CD_ALUNO=?");
		stmt.setString(1, codigo);
		
		rs =stmt.executeQuery();
					
		if(rs.next()) {		
			Usuario u = new Usuario();
			u.setCodigo(rs.getString("CD_ALUNO"));
			u.setSenha(rs.getString("NR_SENHA"));
			u.setNome(rs.getString("NM_ALUNO"));
			u.setDataNascimento(rs.getString("DT_NASCIMENTO"));
			u.setGenero(rs.getString("DS_GENERO"));
			u.setEmail(rs.getString("DS_EMAIL"));
			u.setCpf(rs.getString("NR_CPF"));
			con.close();
			return u; 
				
		}else {
			con.close();
			return null;
		}
	
	}	
	
	/**
	 * Metodo que vizualiza todos os alunos cadastrados
	 * @param 
	 * @return List
	 * @throws Exception
	 * 	 
	 */
	public List<Usuario> getAlunos() throws Exception{
		List<Usuario> usuarios = new ArrayList<Usuario>();
		stmt = con.prepareStatement("SELECT * FROM T_SCB_ALUNO");
		
		
		rs =stmt.executeQuery();
					
		while(rs.next()) {		
			Usuario u = new Usuario();
			u.setCodigo(rs.getString("CD_ALUNO"));
			u.setSenha(rs.getString("NR_SENHA"));
			u.setNome(rs.getString("NM_ALUNO"));
			u.setDataNascimento(rs.getString("DT_NASCIMENTO"));
			u.setGenero(rs.getString("DS_GENERO"));
			u.setEmail(rs.getString("DS_EMAIL"));
			u.setCpf(rs.getString("NR_CPF"));
			
			usuarios.add(u);
		}
			return usuarios; 
		
	
	}
	
	/**
	 * Metodo responsavel por Fechar a conexao com o Banco de Dados
	 * @param 
	 * @return void
	 * @throws Exception
	 * 	 
	 */
	public void fechar() throws Exception{
		con.close();
	}
}
