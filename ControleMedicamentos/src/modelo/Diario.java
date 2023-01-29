package modelo;

/**
 * Classe responsável pelo objeto abstrato Diario
 * @author Diógenes Júnior
 * @since 2022
 * 
 */
public abstract class Diario {
	protected String nome;
	protected String data;
	protected String observacao;
	
	/**
	 * Construtor da classe Diario
	 * @param nome
	 * @param marca
	 * @param frequencia
	 * 
	 */
	public Diario(String nome, String data, String observacao) {
		//super();
		this.nome = nome;
		this.data = data;
		this.observacao = observacao;
	}

	public Diario(String nome, String data) {
		//super();
		this.nome = nome;
		this.data = data;
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
	
	
}