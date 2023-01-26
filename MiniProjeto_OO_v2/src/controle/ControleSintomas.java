package controle;

import modelo.*;

public class ControleSintomas {
	private Sintomas[] s;
	private int qtdSintomas;

	public ControleSintomas(ControleDados d) {
		this.s = d.getSintomas();
		this.qtdSintomas = d.getQtdSintomas();
	}

	public String[] getNomeSintomas() {
		String[] e = new String[qtdSintomas];
		for(int i = 0; i < qtdSintomas; i++) {
			e[i] = s[i].getNomeSintomas();
		}
		return e;
	}
	public int getQtd() {
		return qtdSintomas;
	}

	public void setQtd(int qtd) {
		this.qtdSintomas = qtd;
	}

	public String getNomeSintomas(int i) {		
		return s[i].getNomeSintomas();
	}

	public void setQtdSintomas(int qtdSintomas) {
		this.qtdSintomas = qtdSintomas;
	}
	
	
}