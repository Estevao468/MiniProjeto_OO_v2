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
	
	public int getQtdSintomas() {
		return this.d.getQtdSintomas();
	}
	
	public Sintomas[] getSintomas() {
		return this.d.getSintomas();
	}
	


	public boolean inserirEditarSintomas(String[] dadosCiclo) {
		if(!dadosCiclo[3].matches("[0-9]+") || !dadosCiclo[4].matches("[0-9]+") || 
				!dadosCiclo[5].matches("[0-9]+") || !dadosCiclo[6].matches("[0-9]+")) {
			return false;
		} else {
				Ciclo p = new Ciclo();
				d.inserirEditaCiclo(p, Integer.parseInt(dadosCiclo[0]));
				return true;
		}
	}
	public boolean inserirEditarUsuario(String[] dadosUsuario) {
		if(!dadosUsuario[3].matches("[0-9]+") || !dadosUsuario[4].matches("[0-9]+") || 
				!dadosUsuario[5].matches("[0-9]+") || !dadosUsuario[6].matches("[0-9]+")) {
			return false;
		} else {
				Usuario a = new Usuario();
				d.inserirEditarUsuario(a, Integer.parseInt(dadosUsuario[0]));
				return true;
		}
	}

	public boolean removerUsuario(int i) {
		int qtdCiclo = d.getQtdCiclo();
		String usuarioRemovido = d.getUsuario()[i].getNomeUsuario();
		String aux;
		
		if(i == (d.getQtdUsuario() - 1)) { // O aluno a ser removido está no final do array
			d.setQtdUsuario(d.getQtdUsuario() - 1);
			d.getUsuario()[d.getQtdUsuario()] = null;
			return true;
		} else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(d.getUsuario()[cont].getNomeUsuario().compareTo(usuarioRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getQtdUsuario() - 1; j++) {
				d.getUsuario()[j] = null;
				d.getUsuario()[j] = d.getUsuario()[j+1];
			}
			d.getUsuario()[d.getQtdUsuario()] = null;
			d.setQtdUsuario(d.getQtdUsuario() - 1);
			return true;
		}
	}
	
	public boolean removerSintoma(int i) {
		int qtdSintomas = d.getQtdSintomas();
		String sintomaRemovido = d.getSintomas()[i].getNomeSintomas();
		String aux;
		for (int j = 0; j < qtdSintomas; j++) {
			aux = d.getSintomas()[j].getNomeSintomas();
			if(sintomaRemovido.compareTo(aux) == 0) 
				return false;
			//não é possível remover professor pois ele é responsável por um curso
		}
		if(i == (d.getQtdSintomas() - 1)) { // O prof a ser removido está no final do array
			d.setQtdSintomas(d.getQtdSintomas() - 1);
			d.getSintomas()[d.getQtdSintomas()] = null;
			return true;
		} else { // o prof a ser removido está no meio do array
			int cont = 0;
			while(d.getSintomas()[cont].getNomeSintomas().compareTo(sintomaRemovido) != 0)
				cont++;
			//Rotina swap
			for(int j = cont; j < d.getQtdSintomas() - 1; j++) {
				d.getSintomas()[j] = null;
				d.getSintomas()[j] = d.getSintomas()[j+1];
			}
			d.getSintomas()[d.getQtdSintomas()] = null;
			d.setQtdSintomas(d.getQtdSintomas() - 1);
			return true;
		}
	}
}