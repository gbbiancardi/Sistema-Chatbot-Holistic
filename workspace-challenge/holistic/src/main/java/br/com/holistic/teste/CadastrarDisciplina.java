package br.com.holistic.teste;

import javax.swing.JOptionPane;

import br.com.holistic.beans.Disciplina;
import br.com.holistic.beans.Usuario;
import br.com.holistic.dao.DisciplinaDAO;

public class CadastrarDisciplina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DisciplinaDAO dao = null;
		
		try {
			dao = new DisciplinaDAO();
			Disciplina d = new Disciplina();
			Usuario u = new Usuario();
			
			u.setCodigo(JOptionPane.showInputDialog("Digite o codigo do professor"));
			d.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da disciplina")));
			d.setNome(JOptionPane.showInputDialog("Digite o nome da disciplina"));
			d.setDataInicio(JOptionPane.showInputDialog("Digite a data de inicio"));
			d.setDataTermino(JOptionPane.showInputDialog("Digite a data de termino"));
			d.setStatusDisciplina(JOptionPane.showInputDialog("Digite o status da disciplina"));
			
			if(dao.cadastrarDisciplina(d)==0) {
				System.out.println("Nao cadastrou");
			}else {
				System.out.println("Cadastrado com sucesso");
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
