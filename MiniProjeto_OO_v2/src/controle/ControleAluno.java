package controle;
import modelo.*;

public class ControleAluno {
	private Usuario[] a;
	private int qtdAlunos;
	
	public ControleAluno(ControleDados d) {
		a = d.getAlunos();
		qtdAlunos = d.getQtdAlunos();
		
	}
	
	public String[] getNomeAluno() {
		String[] s = new String[qtdAlunos];
		for(int i = 0; i < qtdAlunos; i++) {
			s[i] = a[i].getNome();
		}
		
		return s;
	}
	
	public int getQtd() {
		return qtdAlunos;
	}

	public void setQtd(int qtd) {
		this.qtdAlunos = qtd;
	}
	
	public String getNome(int i) {		
		return a[i].getNome();
	}

	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	
}