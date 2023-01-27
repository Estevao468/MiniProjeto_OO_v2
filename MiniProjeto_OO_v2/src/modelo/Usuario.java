package modelo;

/**
 * Classe responsável pelo objeto usuario
 * @author Rhumenigue e Estevao
 * @since 2023
 * 
 */
public class Usuario {
	private String datadeNascimento;
	private String nome;
	private String email;
	private Medicamentos medicamento;
	private String liquido;
	private String comprimido;
	private String sintomas;
	private String ciclo;
	
	/**
	 * Construtor da classe usuario
	 * @param nome
	 * @param email
	 * @param datadeNascimento
	 * @param medicamento
	 * @param liquido
	 * @param comprimido
	 * @param sintomas
	 * @param ciclo
	 * 
	 */
	public Usuario(String nome, String datadeNascimento, String email, String liquido, String comprimido, String ciclo, String sintomas) {
		this.nome = nome;
		this.datadeNascimento = datadeNascimento;
		this.email = email;
		this.liquido = liquido;
		this.comprimido = comprimido;
		this.ciclo = ciclo;
		this.sintomas = sintomas;
	}

	public String getDatadeNascimento() {
		return datadeNascimento;
	}
	public void setDatadeNascimento(String datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Medicamentos getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamentos medicamento) {
		this.medicamento = medicamento;
	}
	public String getLiquidos() {
		return liquido;
	}
	public void setLiquidos(String liquido) {
		this.liquido = liquido;
	}
	public String getComprimidos() {
		return comprimido;
	}
	public void setComprimidos(String comprimido) {
		this.comprimido = comprimido;
	}
	
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}


	@Override
	public String toString() {
		return "Nome: " + nome + "\n" +
				"Data de Nascimento: " + datadeNascimento + "\n" + 
				"Email: " + email + "\n" + 
				"Medicamento " + medicamento.toString() + "\n";
	}
	

}