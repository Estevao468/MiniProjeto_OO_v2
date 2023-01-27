package modelo;

/**
 * Classe responsável pelos sintomas
 * @author Rhumenigue e Estevão 
 * @since 2023
 */
public class Ciclo {
	private String diadaSemana;
	private String detalhedoCiclo;
	
	/**
	 * Construtor da classe Sintomas
	 * @param diadaSemana
	 * @param detalhedoCiclo
	 */
	public Ciclo(String diadaSemana, String detalhedoCiclo) {
		this.diadaSemana = diadaSemana;
		this.detalhedoCiclo = detalhedoCiclo;
	}
	
	
	public Ciclo(int parseInt, String detalhedoCiclo2) {
		// TODO Stub de construtor gerado automaticamente
	}


	public String getDiadaSemana() {
		return diadaSemana;
	}
	public void setDiadaSemana(String diadaSemana) {
		this.diadaSemana = diadaSemana;
	}
	public String getDetalhedoCiclo() {
		return detalhedoCiclo;
	}
	public void setDetalhedoCiclo(String detalhedoCiclo) {
		this.detalhedoCiclo = detalhedoCiclo;
	}
	

	@Override
	public String toString() {
		return "\n" + "Ciclo"+ "\n" + 
				"Dia da Semana: " + this.diadaSemana + "\n" + 
				"Detalhe do Ciclo: " + this.detalhedoCiclo + "\n";
	}
	
}