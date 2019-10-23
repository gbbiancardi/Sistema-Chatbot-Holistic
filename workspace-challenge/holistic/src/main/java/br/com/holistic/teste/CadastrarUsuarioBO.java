package br.com.holistic.teste;

import javax.swing.JOptionPane;

import br.com.holistic.beans.Usuario;
import br.com.holistic.bo.UsuarioBO;

public class CadastrarUsuarioBO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsuarioBO bo = null;
		
		Usuario u = new Usuario();
		
		u.setTipo(JOptionPane.showInputDialog("Digite o tipo de usuario(Aluno, Professor ou Administrador)"));
						
		try {
			bo = new UsuarioBO();
			
			u.setCodigo(JOptionPane.showInputDialog("Digite o codigo"));
			u.setSenha(JOptionPane.showInputDialog("Digite a senha do usuario"));
			u.setNome(JOptionPane.showInputDialog("Digite o nome"));
			u.setDataNascimento(JOptionPane.showInputDialog("Digite a data de nascimento"));
			u.setGenero(JOptionPane.showInputDialog("Digite o genero M ou F"));
			u.setEmail(JOptionPane.showInputDialog("Digite o email"));
			u.setCpf(JOptionPane.showInputDialog("Digite o cpf"));
	
					
			System.out.println(bo.addUsuario(u));
			

		}catch(Exception e) {
				e.printStackTrace();
		}
		
		
	}

}
