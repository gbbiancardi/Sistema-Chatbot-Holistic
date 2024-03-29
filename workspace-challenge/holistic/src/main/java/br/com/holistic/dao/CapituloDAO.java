package br.com.holistic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.holistic.beans.Capitulo;
import br.com.holistic.conexao.Conexao;

/**
 * Classe responsavel por Estabeler a Conexao com o Banco de Dados entre CapituloDAO e Conexao
 * CD_CAPITULO, DS_TITULO,DS_DOCUMENTO,DS_VIDEO,DS_AUDIO, CD_DISCIPLINA, CD_PROFESSOR
 * CD_CAPITULO = PK
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.dao
 */
public class CapituloDAO {
	
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	/**
	 * Metodo que estabelece conexao entre o CapituloDAO e Conexao.
	 * @param 
	 * @return 
	 * @throws Exception
	 * 	 
	 */
	public CapituloDAO() throws Exception{
		con =Conexao.getConnectar();
		
	}
	
	/**
	 * Metodo que Cadastra um novo Capitulo no Banco de Dados
	 * @param new Capitulo
	 * @return int
	 * @throws Exception
	 * 	 
	 */
	public int cadastrarCapitulo(Capitulo c) throws Exception{
		stmt=con.prepareStatement("INSERT INTO T_SCB_CAPITULO(CD_CAPITULO, DS_TITULO,DS_DOCUMENTO,DS_VIDEO,DS_AUDIO, CD_DISCIPLINA, CD_PROFESSOR)VALUES(?,?,?,?,?,?,?)");
		stmt.setInt(1, c.getCodigo());
		stmt.setString(2, c.getTitulo());
		stmt.setString(3, c.getDocumento());
		stmt.setString(4, c.getVideo());
		stmt.setString(5, c.getAudio());
		stmt.setInt(6, c.getDisciplina().getCodigo());
		stmt.setString(7, c.getUsuario().getCodigo());
		
		return stmt.executeUpdate();
	}
	
	/**
	 * Metodo que vizualiza um Capitulo em especifico cadastrado
	 * @param codigo
	 * @return Capitulo
	 * @throws Exception
	 * 	 
	 */
	public Capitulo consultarCapitulo(int codigo) throws Exception{
		stmt=con.prepareStatement("SELECT * FROM T_SCB_CAPITULO WHERE CD_CAPITULO=?");
		stmt.setInt(1, codigo);
		
		rs=stmt.executeQuery();
		
		if(rs.next()) {
			Capitulo c = new Capitulo();
			c.setCodigo(rs.getInt("CD_CAPITULO"));
			c.setTitulo(rs.getString("DS_TITULO"));
			c.setDocumento(rs.getString("DS_DOCUMENTO"));
			c.setVideo(rs.getString("DS_VIDEO"));
			c.setAudio(rs.getString("DS_AUDIO"));
			c.setDisciplina(new DisciplinaDAO().consultarDisciplina(rs.getInt("CD_DISCIPLINA")));
			c.setUsuario(new ProfessorDAO().getProfessors(rs.getString("CD_PROFESSOR")));
			con.close();
			return c;
		}else {
			con.close();
			return null;
		}
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
