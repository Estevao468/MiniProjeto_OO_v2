package objetos;

/**
 * Classe responsável pelo objeto líquido que herda de Medicamento.
 * @author Henrique Pucci
 * @since 2022
 * 
 */
public class Sintoma extends Diario{
	private String tipoSintoma;
	
	/**
	 * Construtor da classe Liquido
	 * @param nome
	 * @param marca
	 * @param frequencia
	 * @param gd
	 * @param mlsT
	 * @param h
	 */
	public Sintoma(String nome, String data, String observacao,String ts) { // construtor para cadastrar comprimido em um paciente
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
		return "\n" + "Liquido" + "\n" + 
				"Nome: " + getNome() + "\n" +
				"Marca: " + getData() + "\n" +
				"Frequencia: " + getObservacao() + "\n" + 
		        "Gotas por Dia: " + tipoSintoma + "\n";
	}

	

}