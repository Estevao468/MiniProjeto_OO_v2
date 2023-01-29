package modelo;

/**
 * Classe responsável pelo modelo sintoma
 * @author Estevão e Rhumenigue
 * @since 2023
 * @version 1.0
 * 
 */
public class Sintoma {
	private String dataSintoma;
	private String nome;
	private Medicamento medicamento;
	private Liquido liquido;
	private Comprimido comprimido;
	
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
	public Sintoma(String nome, String dataSintoma, Liquido liquido) {
		this.nome = nome;
		this.dataSintoma = dataSintoma;
		this.liquido = liquido;
	}
	
	public Sintoma(String nome, String dataSintoma, String dadosSintoma, String dadosSintoma2, String dadosSintoma3, Comprimido comprimido) {
		this.nome = nome;
		this.dataSintoma = dataSintoma;
		this.comprimido = comprimido;
	}

	
	public String getDataSintoma() {
		return dataSintoma;
	}
	public void setDataSintoma(String dataPeriodo) {
		this.dataSintoma = dataPeriodo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Medicamento getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	public Liquido getLiquidos() {
		return liquido;
	}
	public void setLiquidos(Liquido liquido) {
		this.liquido = liquido;
	}
	public Comprimido getComprimidos() {
		return comprimido;
	}
	public void setComprimidos(Comprimido comprimido) {
		this.comprimido = comprimido;
	}


	@Override
	public String toString() {
		return "Nome: " + nome + "\n" +
				"Data do Período: " + dataSintoma + "\n" + 
				"Medicamento " + medicamento.toString();
	}

}