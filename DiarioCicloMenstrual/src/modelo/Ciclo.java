package modelo;

/**
 * Classe responsável pelo modelo ciclo
 * @author Estevão e Rhumenigue
 * @since 2023
 * @version 1.0
 * 
 */
public class Ciclo {
	private String dataPeriodo;
	private String nome;
	
	/**
	 * Construtor da classe Ciclo
	 * @param nome
	 * @param dataPeriodo
	 * @param sexo
	 * @param medicamento
	 * @param liquido
	 * @param comprimido
	 * 
	 */
	public Ciclo(String nome, String dataPeriodo) {
		this.nome = nome;
		this.dataPeriodo = dataPeriodo;
	}


	
	public String getDataPeriodo() {
		return dataPeriodo;
	}
	public void setDataPeriodo(String dataPeriodo) {
		this.dataPeriodo = dataPeriodo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n" +
				"Data do Período: " + dataPeriodo + "\n" ;
	}
	

}