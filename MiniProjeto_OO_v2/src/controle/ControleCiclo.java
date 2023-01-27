package controle;
import modelo.*;

public class ControleCiclo {
	private Ciclo[] c;
	private int qtdCiclo;
	
	public ControleCiclo(ControleDados d) {
		c = d.getCiclo();
		qtdCiclo = d.getQtdCiclo();
		
	}
	
	public String[] getNomeCiclo() {
		String[] l = new String[qtdCiclo];
		for(int i = 0; i < qtdCiclo; i++) {
			l[i] = c[i].getDetalhedoCiclo();
		}
		
		return l;
	}
	
	public int getQtd() {
		return qtdCiclo;
	}

	public void setQtd(int qtd) {
		this.qtdCiclo = qtd;
	}
	
	public String getDetalhedoCiclo(int i) {		
		return c[i].getDetalhedoCiclo();
	}

	public void setQtdCiclo(int qtdCiclo) {
		this.qtdCiclo = qtdCiclo;
	}
	
}