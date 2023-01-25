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

	public Usuario[] getUsuario() {
		return this.d.getUsuario();
	}
	
	public int getQtdUsuario() {
		return this.d.getQtdUsuario();
	}
	
	public int getQtdCiclo() {
		return this.d.getQtdCiclo();
	}
	
	public Ciclo[] getCiclo() {
		return this.d.getCiclo();
	}
	


	public boolean inserirEditarProf(String[] dadosCiclo) {
		if(!dadosCiclo[3].matches("[0-9]+") || !dadosCiclo[4].matches("[0-9]+") || 
				!dadosCiclo[5].matches("[0-9]+") || !dadosCiclo[6].matches("[0-9]+")) {
			return false;
		} else {
				Ciclo p = new Ciclo();
				d.inserirEditaCiclo(p, Integer.parseInt(dadosCiclo[0]));
				return true;
		}
	}
	// a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
	public boolean inserirEditarAluno(String[] dadosUsuario) {
		if(!dadosUsuario[3].matches("[0-9]+") || !dadosUsuario[4].matches("[0-9]+") || 
				!dadosUsuario[5].matches("[0-9]+") || !dadosUsuario[6].matches("[0-9]+")) {
			return false;
		} else {
				Usuario a = new Usuario();
				d.inserirEditarUsuario(a, Integer.parseInt(dadosUsuario[0]));
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