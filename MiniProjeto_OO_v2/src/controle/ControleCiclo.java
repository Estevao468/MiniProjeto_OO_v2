package controle;
import modelo.*;

public class ControleCiclo {
	private Ciclo[] f;
	private int qtdCiclo;
	
	public ControleCiclo(ControleDados d) {
		f = d.getCiclo();
		qtdCiclo = d.getQtdCiclo();
		
	}
	
	public String[] getNomeCiclo() {
		String[] l = new String[qtdCiclo];
		for(int i = 0; i < qtdCiclo; i++) {
			l[i] = f[i].getNomeCiclo();
		}
		
		return l;
	}
	
	public int getQtd() {
		return qtdCiclo;
	}

	public void setQtd(int qtd) {
		this.qtdCiclo = qtd;
	}
	
	public String getNomeCiclo(int i) {		
		return f[i].getNomeCiclo();
	}

	public void setQtdCiclo(int qtdCiclo) {
		this.qtdCiclo = qtdCiclo;
	}
	
}