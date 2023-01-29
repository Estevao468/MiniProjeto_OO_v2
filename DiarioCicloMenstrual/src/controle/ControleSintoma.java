package controle;

import view.*;
import controle.*;
import modelo.*;

/**
 * Classe responsável pelo controle de comprimidos.
 * @author Diógenes Júnior
 * @since 2022
 * 
 */
public class ControleSintoma {
	private Sintoma[] p;
	private int qtdSintoma;

	public ControleSintoma(ControleDados d){
		p = d.getSintoma();
		qtdSintoma = d.getQtdSintoma();
	}

	/**
	 * Método responsável pelo listamento de pacientes pelos seus nomes
	 * @return String com os nomes dos pacientes
	 * 
	 */
	public String[] getNomeSintoma() { //funcao que lista o nome dos pacientes
		String[] nomeSintoma = new String[qtdSintoma];
		for(int i = 0; i < qtdSintoma; i++) {
			nomeSintoma[i] = p[i].getNome();
		}
		return nomeSintoma;	
	}
		
	
	public int getQtd(){
		return qtdSintoma;
	}

	public void setQtd(int qtd){
		this.qtdSintoma = qtd;
	}

	public String getDataSintoma(int i){
		return p[i].getDataSintoma();
	}
	public String getNome(int i){
		return p[i].getNome();
	}
	public Medicamento getMedicamento(int i) {
		return p[i].getMedicamento();
	}
	
	public Liquido getLiquidos(int i){
		return p[i].getLiquidos();
	}
	public Comprimido getComprimidos(int i) {
		return p[i].getComprimidos();
	}
}