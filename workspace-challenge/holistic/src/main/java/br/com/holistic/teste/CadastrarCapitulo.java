package br.com.holistic.teste;

import javax.swing.JOptionPane;

import br.com.holistic.beans.Capitulo;
import br.com.holistic.beans.Disciplina;
import br.com.holistic.beans.Usuario;
import br.com.holistic.dao.CapituloDAO;

public class CadastrarCapitulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CapituloDAO dao = null;
		
		try {
			dao = new CapituloDAO();
			
			if(dao.cadastrarCapitulo(new Capitulo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do capitulo")),
												JOptionPane.showInputDialog("Digite o titulo"), 
												JOptionPane.showInputDialog("Documento"), 
												JOptionPane.showInputDialog("Video"), 
												JOptionPane.showInputDialog("Audio"), 
													new Disciplina(Integer.parseInt(JOptionPane.showInputDialog("Codigo")
															)),
														new Usuario(JOptionPane.showInputDialog("Codigo Professor")
																)
														))==0) {
				System.out.println("Nao cadastrado");
				
			}else {
				System.out.println("Cadastrou");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				dao.fechar();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
