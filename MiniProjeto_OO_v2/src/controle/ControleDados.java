package controle;

import modelo.*;

public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.fillWithSomeData();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public Usuario[] getAlunos() {
		return this.d.getAlunos();
	}
	
	public int getQtdAlunos() {
		return this.d.getQtdAlunos();
	}
	
	public int getQtdProfs() {
		return this.d.getQtdProfs();
	}
	
	public Ciclo[] getProfessores() {
		return this.d.getProfs();
	}
	


	public boolean inserirEditarProf(String[] dadosProfs) {
		if(!dadosProfs[3].matches("[0-9]+") || !dadosProfs[4].matches("[0-9]+") || 
				!dadosProfs[5].matches("[0-9]+") || !dadosProfs[6].matches("[0-9]+")) {
			return false;
		} else {
				Ciclo p = new Ciclo();
				d.inserirEditaProf(p, Integer.parseInt(dadosProfs[0]));
				return true;
		}
	}
	// a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
	public boolean inserirEditarAluno(String[] dadosAlunos) {
		if(!dadosAlunos[3].matches("[0-9]+") || !dadosAlunos[4].matches("[0-9]+") || 
				!dadosAlunos[5].matches("[0-9]+") || !dadosAlunos[6].matches("[0-9]+")) {
			return false;
		} else {
				Usuario a = new Usuario();
				d.inserirEditarAluno(a, Integer.parseInt(dadosAlunos[0]));
				return true;
		}
	}

	public boolean removerAluno(int posicao) {
		
		return false;
	}

	public boolean removerProfessor(int posicao) {
		
		return false;
	}
}