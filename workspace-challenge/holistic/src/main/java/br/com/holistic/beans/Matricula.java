package br.com.holistic.beans;

/**
 * Classe responsavel por armazenar o Capitulo
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.beans
 *
 */
public class Matricula {
	
	private String dataInicio;
	private String dataTermino;
	private String statusMatricula;
	private Usuario usuario;
	
	
	public Matricula() {
		super();
	}
	public Matricula(String dataInicio, String dataTermino, String statusMatricula, Usuario usuario) {
		super();
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.statusMatricula = statusMatricula;
		this.usuario = usuario;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	public String getStatusMatricula() {
		return statusMatricula;
	}
	public void setStatusMatricula(String statusMatricula) {
		this.statusMatricula = statusMatricula;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
}
