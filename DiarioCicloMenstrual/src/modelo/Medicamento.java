package modelo;

/**
 * Classe responsável pelo objeto abstrato Medicamento
 * @author Diógenes Júnior
 * @since 2022
 * 
 */
public abstract class Medicamento {
	protected String nome;
	protected String marca;
	protected String frequencia;
	
	/**
	 * Construtor da classe Medicamento
	 * @param nome
	 * @param marca
	 * @param frequencia
	 * 
	 */
	public Medicamento(String nome, String marca, String frequencia) {
		//super();
		this.nome = nome;
		this.marca = marca;
		this.frequencia = frequencia;
	}

	public Medicamento(String nome, String marca) {
		//super();
		this.nome = nome;
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	
	
}