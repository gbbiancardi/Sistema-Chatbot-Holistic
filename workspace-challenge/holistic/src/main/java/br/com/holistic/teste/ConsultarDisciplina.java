package br.com.holistic.teste;

import javax.swing.JOptionPane;

import br.com.holistic.beans.Disciplina;
import br.com.holistic.beans.Usuario;
import br.com.holistic.dao.DisciplinaDAO;
import br.com.holistic.dao.UsuarioDAO;

public class ConsultarDisciplina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisciplinaDAO dao = null;
		try {
			dao = new DisciplinaDAO();
			Disciplina d = new Disciplina();
			
			
			
			int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo"));
			Disciplina dis = dao.consultarDisciplina(cod);
			
			System.out.println(dis.getCodigo());
			System.out.println(dis.getNome());
			System.out.println(dis.getDataInicio());
			System.out.println(dis.getDataTermino());
			System.out.println(dis.getStatusDisciplina());
			System.out.println(dis.getUsuario().getCodigo());
			
			
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
