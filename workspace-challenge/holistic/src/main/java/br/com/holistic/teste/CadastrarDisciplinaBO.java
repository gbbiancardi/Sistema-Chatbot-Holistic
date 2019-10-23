package br.com.holistic.teste;

import javax.swing.JOptionPane;

import br.com.holistic.beans.Disciplina;
import br.com.holistic.beans.Usuario;
import br.com.holistic.bo.DisciplinaBO;

public class CadastrarDisciplinaBO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DisciplinaBO bo = new DisciplinaBO();
			Disciplina d = new Disciplina();
			Usuario u = new Usuario();
			
			u.setCodigo(JOptionPane.showInputDialog("Codigo do usuario"));
			d.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da disciplina")));
			d.setNome(JOptionPane.showInputDialog("Digite o nome da disciplina"));
			d.setDataInicio(JOptionPane.showInputDialog("Digite a data de inicio"));
			d.setDataTermino(JOptionPane.showInputDialog("Digite a data de termino"));
			d.setStatusDisciplina(JOptionPane.showInputDialog("Digite o status da disciplina"));
			
			System.out.println(bo.novaDisciplina(d));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
