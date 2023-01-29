package modelo;

/**
 * Classe responsável pelo objeto Comprimido que herda de Ciclo.
 * @author Estevão e Rhumenigue
 * @since 2023
 * @version 1.0
 */
public class Ciclo extends Diario{
	
	private String intensidadeCiclo;
	
	/**
	 * Construtor da classe Comprimido
	 * @param nome
	 * @param data
	 * @param observação
	 * @param ic
	 *
	 * 
	 */
	public Ciclo(String nome, String data, String observacao, String ic) { // construtor para cadastrar ciclo
		super(nome, data, observacao);
		this.intensidadeCiclo = ic;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public String getIntensidadeCiclo() {
		return intensidadeCiclo;
	}
	public void setIntensidadeCiclo(String intensidadeCiclo) {
		this.intensidadeCiclo = intensidadeCiclo;
	}
	@Override
	public String toString() {
		return "\n" + "Ciclo" + "\n" + 
				"Intensidade do Ciclo: " + intensidadeCiclo + "\n" +
				"Nome: " + getNome() + "\n" +
				"Data: " + getData() + "\n" +
				"Observação: " + getObservacao() + "\n";
	}
	
	
	
}