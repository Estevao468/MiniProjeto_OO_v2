package controle;

import modelo.*;
import view.*;
import controle.*;

/**
 * Classe responsável pelo controle dos comprimidos.
 * @author Rhumenigue e Estevao
 * @since 2023
 * 
 */
public class ControleSintomas {
	private Sintomas[] s;
	private int qtdSintomas;

	public ControleSintomas(ControleDados d){
		s = d.getSintomas();
		qtdSintomas = d.getQtdSintomas();
	}

	/**
	 * Método responsável por listar os sintomas dos usuarios 
	 * @return String com os nomes dos usuarios
	 * 
	 */
	public String[] getNomeSintoma() { //funcao para listar o sintoma do Usuario
		String[] nomeSintomas = new String[qtdSintomas];
		for(int i = 0; i < qtdSintomas; i++) {
			nomeSintomas[i] = s[i].getDetalhedoSintoma();
		}
		return nomeSintomas;	
	}
		
	
	
	public String getSintoma(int i){
		return s[i].getDetalhedoSintoma();
	}
	
	


}