package controle;

import modelo.*;

public class ControleProfessor {
	private Ciclo[] p;
	private int qtdProfs;

	public ControleProfessor(ControleDados d) {
		this.p = d.getProfessores();
		this.qtdProfs = d.getQtdProfs();
	}

	public String[] getNomeProf() {
		String[] s = new String[qtdProfs];
		for(int i = 0; i < qtdProfs; i++) {
			s[i] = p[i].getNome();
		}

		return s;
	}
	public int getQtd() {
		return qtdProfs;
	}

	public void setQtd(int qtd) {
		this.qtdProfs = qtd;
	}

	public String getNome(int i) {		
		return p[i].getNome();
	}

	public void setQtdAlunos(int qtdProfs) {
		this.qtdProfs = qtdProfs;
	}
	
}