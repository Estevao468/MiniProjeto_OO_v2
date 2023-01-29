package modelo;

/**
 * Classe responsável pelo objeto Comprimido que herda de Medicamento.
 * @author Henrique Pucci
 * @since 2022
 * 
 */
public class Comprimido extends Medicamento{
	
	private int comprimidosporDia;
	private int comprimidosTotal;
	
	/**
	 * Construtor da classe Comprimido
	 * @param nome
	 * @param c
	 * @param ct
	 * @param h
	 * 
	 */
	public Comprimido(String nome, String marca, String frequencia, int c, int ct) { // construtor para cadastrar comprimido em um paciente
		super(nome, marca, frequencia);
		this.comprimidosporDia = c;
		this.comprimidosTotal = ct;
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
	
	public int getComprimidosporDia() {
		return comprimidosporDia;
	}
	public void setComprimidosporDia(int comprimidosporDia) {
		this.comprimidosporDia = comprimidosporDia;
	}
	public int getComprimidosTotal() {
		return comprimidosTotal;
	}
	public void setComprimidosTotal(int comprimidosTotal) {
		this.comprimidosTotal = comprimidosTotal;
	}
	@Override
	public String toString() {
		return "\n" + "Comprimido" + "\n" + 
				"Comprimidos por Dia=" + comprimidosporDia + "\n" +
				"ComprimidosTotal=" + comprimidosTotal + "\n" + 
				"Nome: " + getNome() + "\n" +
				"Marca: " + getMarca() + "\n" +
				"Frequencia: " + getFrequencia() + "\n";
	}
	
	
	
}