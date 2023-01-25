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
		String[] s = new String[qtdUsuario];
		for(int i = 0; i < qtdUsuario; i++) {
			s[i] = u[i].getNome();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdUsuario;
	}

	public void setQtd(int qtd) {
		this.qtdUsuario = qtd;
	}
	
	public String getNome(int i) {		
		return u[i].getNome();
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdUsuario = qtdAlunos;
	}
	
}