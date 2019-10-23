package br.com.holistic.teste;

import javax.swing.JOptionPane;

import br.com.holistic.beans.Usuario;
import br.com.holistic.bo.UsuarioBO;

public class ConsultarUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
						
			String codigo = JOptionPane.showInputDialog("Codigo do usuario, Aluno comeca com RM, Professor com P e Adm com A");
			String senha = JOptionPane.showInputDialog("Digite a senha do usuario");
			Usuario usuario = new Usuario();
			UsuarioBO bo = new UsuarioBO();
			usuario = bo.getUsuario(codigo,senha);
				if(usuario != null) {
					System.out.println(usuario.getCodigo());
					System.out.println(usuario.getSenha());
					System.out.println(usuario.getNome());
					System.out.println(usuario.getDataNascimento());
					System.out.println(usuario.getGenero()); 
					System.out.println(usuario.getEmail());
					System.out.println(usuario.getCpf());
				}else {
					System.out.println("Usuario ou senha invalido");
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
