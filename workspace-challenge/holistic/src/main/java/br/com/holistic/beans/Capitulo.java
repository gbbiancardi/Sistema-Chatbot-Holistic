package br.com.holistic.beans;

/**
 * Classe responsavel por armazenar os capitulos.
 * @author Equipe Holistic
 * @version 00.001
 * @see br.com.holistic.beans
 *
 */
public class Capitulo {
	private int codigo;
	private String titulo;
	private String documento;
	private String video;
	private String audio;
	private Disciplina disciplina;
	private Usuario usuario;
	
	public Capitulo() {
		super();
	}
	
	public Capitulo(int codigo) {
		this.codigo = codigo;
	}
	public Capitulo(int codigo, String titulo, String documento, String video, String audio, Disciplina disciplina,
			Usuario usuario) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.documento = documento;
		this.video = video;
		this.audio = audio;
		this.disciplina = disciplina;
		this.usuario = usuario;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getAudio() {
		return audio;
	}
	public void setAudio(String audio) {
		this.audio = audio;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

}
