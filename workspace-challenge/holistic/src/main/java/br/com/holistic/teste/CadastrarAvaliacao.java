package br.com.holistic.teste;

import javax.swing.JOptionPane;

import br.com.holistic.beans.Avaliacao;
import br.com.holistic.beans.Capitulo;
import br.com.holistic.beans.Disciplina;
import br.com.holistic.beans.Usuario;
import br.com.holistic.dao.AvaliacaoDAO;

public class CadastrarAvaliacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AvaliacaoDAO dao = null;
		
		try {
			dao = new AvaliacaoDAO();
			
			if(dao.addAvaliacao(new Avaliacao(Integer.parseInt(JOptionPane.showInputDialog("Codigo avaliacao")),
										Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da avaliacao")),
										new Disciplina(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da disciplina")
												)),
										new Capitulo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do capitulo")
												)),
										new Usuario(JOptionPane.showInputDialog("Digite o codigo do aluno")
												)
										))==0) {
				System.out.println("Nao cadastrou");
			}else {
				System.out.println("Cadastrou");
			}
			
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
