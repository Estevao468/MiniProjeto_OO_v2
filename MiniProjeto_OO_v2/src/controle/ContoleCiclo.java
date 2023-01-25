package controle;

import modelo.*;

public class ContoleCiclo {
	private Ciclo[] p;
	private int qtdCiclo;

	public ContoleCiclo(ControleDados d) {
		this.p = d.getCiclo();
		this.qtdCiclo = d.getQtdCiclo();
	}

	public String[] getNomeCiclo() {
		String[] c = new String[qtdCiclo];
		for(int i = 0; i < qtdCiclo; i++) {
			c[i] = p[i].getNome();
		}

		return c;
	}
	public int getQtd() {
		return qtdCiclo;
	}

	public void setQtd(int qtd) {
		this.qtdCiclo = qtd;
	}

	public String getNome(int i) {		
		return p[i].getNome();
	}

	public void setQtdUsuario(int qtdCiclo) {
		this.qtdCiclo = qtdCiclo;
	}
	
}