package controle;

import modelo.*;

/**
 * Classe responsável pelo controle de comprimidos.
 * @author Diógenes Júnior
 * @since 2022
 * 
 */
public class ControleCiclo {
	private Ciclo[] p;
	private int qtdCiclos;

	public ControleCiclo(ControleDados d){
		p = d.getCiclos();
		qtdCiclos = d.getQtdCiclos();
	}

	/**
	 * Método responsável pelo listamento de pacientes pelos seus nomes
	 * @return String com os nomes dos pacientes
	 * 
	 */
	public String[] getNomeCiclo() { //funcao que lista o nome dos pacientes
		String[] nomeCiclos = new String[qtdCiclos];
		for(int i = 0; i < qtdCiclos; i++) {
			nomeCiclos[i] = p[i].getNome();
		}
		return nomeCiclos;	
	}
		
	
	public int getQtd(){
		return qtdCiclos;
	}

	public void setQtd(int qtd){
		this.qtdCiclos = qtd;
	}

	public String getDataPeriodo(int i){
		return p[i].getDataPeriodo();
	}

	public String getNome(int i){
		return p[i].getNome();
	}
}