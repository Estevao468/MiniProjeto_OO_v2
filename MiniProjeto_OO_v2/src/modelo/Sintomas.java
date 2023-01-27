package modelo;

/**
 * Classe responsável pelos sintomas
 * @author Rhumenigue e Estevão 
 * @since 2023
 */
public class Sintomas {
	private String diadaSemana;
	private String detalhedoSintoma;
	
	/**
	 * Construtor da classe Sintomas
	 * @param diadaSemana
	 * @param detalhedoSintoma
	 */
	public Sintomas(String diadaSemana, String detalhedoSintoma) {
		this.diadaSemana = diadaSemana;
		this.detalhedoSintoma = detalhedoSintoma;
	}
	
	
	public String getDiadaSemana() {
		return diadaSemana;
	}
	public void setDiadaSemana(String diadaSemana) {
		this.diadaSemana = diadaSemana;
	}
	public String getDetalhedoSintoma() {
		return detalhedoSintoma;
	}
	public void setDetalhedoSintoma(String detalhedoSintoma) {
		this.detalhedoSintoma = detalhedoSintoma;
	}
	

	@Override
	public String toString() {
		return "\n" + "Sintomas"+ "\n" + 
				"Dia da Semana: " + this.diadaSemana + "\n" + 
				"Detalhe do Sintomas: " + this.detalhedoSintoma + "\n";
	}


}