package br.com.holistic.teste;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.holistic.beans.Avaliacao;
import br.com.holistic.dao.AvaliacaoDAO;
import br.com.holistic.dao.UsuarioDAO;

public class ConsultarAvaliacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AvaliacaoDAO dao = null;
		
		try {
			dao = new AvaliacaoDAO();
			
			UsuarioDAO usudao = new UsuarioDAO();
			
			int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da avaliacao"));
			List<Avaliacao> a = dao.getAvaliacao();
			
			System.out.println(((Avaliacao) a).getCodigo());
			System.out.println(((Avaliacao) a).getNota());
			System.out.println(((Avaliacao) a).getDisciplina().getCodigo());
			System.out.println(((Avaliacao) a).getCapitulo().getCodigo());
			System.out.println(((Avaliacao) a).getUsuario().getCodigo());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
