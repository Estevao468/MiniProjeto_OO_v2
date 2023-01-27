package controle;
import modelo.*;

public class ControleUsuario {
	private Usuario[] u;
	private int qtdUsuario;
	
	public ControleUsuario(ControleDados d) {
		u = d.getUsuario();
		qtdUsuario = d.getQtdUsuario();
		
	}
	
	public String[] getNomeUsuario() {
		String[] r = new String[qtdUsuario];
		for(int i = 0; i < qtdUsuario; i++) {
			r[i] = u[i].getNome();
		}
		
		return r;
	}
	
	public int getQtd() {
		return qtdUsuario;
	}

	public void setQtd(int qtd) {
		this.qtdUsuario = qtd;
	}
	
	public String getNomeUsuario(int i) {		
		return u[i].getNome();
	}

	public void setQtdUsuario(int qtdUsuario) {
		this.qtdUsuario = qtdUsuario;
	}
	
}