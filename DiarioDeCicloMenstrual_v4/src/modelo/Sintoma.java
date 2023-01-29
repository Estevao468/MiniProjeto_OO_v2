package modelo;

/**
 * Classe responsável pelo objeto sintoma que herda de Diário.
 * @author Rhumenigue e Estevão
 * @since 2023
 * @version 1.0
 * 
 */
public class Sintoma extends Diario{
	private String tipoSintoma;
	
	/**
	 * Construtor da classe Liquido
	 * @param nome
	 * @param data
	 * @param observacao
	 * @param ts
	 * 
	 */
	public Sintoma(String nome, String data, String observacao,String ts) { // construtor para cadastrar ciclo
		super(nome, data, observacao);
		this.tipoSintoma = ts;
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
	public String getTipoSintoma() {
		return tipoSintoma;
	}

	public void setTipoSintoma(String tipoSintoma) {
		this.tipoSintoma = tipoSintoma;
	}
	
	@Override
	public String toString() {
		return "\n" + "Sintoma" + "\n" + 
				"Nome: " + getNome() + "\n" +
				"Data: " + getData() + "\n" +
				"Observação: " + getObservacao() + "\n" + 
		        "Tipo de Sintoma: " + tipoSintoma + "\n";
	}

}