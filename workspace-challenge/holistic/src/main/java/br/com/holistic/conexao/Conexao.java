package br.com.holistic.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsavel por Estabeler a Conexão com o Banco de Dados
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.conexao
 */
public class Conexao {
	
	/**
	 * Metodo que cria uma nova conexão.
	 * @param 
	 * @return Caminho de acesso ao Banco de Dados, Usuario e Senha.
	 * @throws ClassNotFoundException, SQLException
	 * 	 
	 */
	public static Connection getConnectar() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm83085", "280988");
	}
}
