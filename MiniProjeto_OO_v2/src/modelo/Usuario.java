package modelo;

/**
 * Classe responsável pelo objeto usuario
 * @author Rhumenigue e Estevao
 * @param <Medicamento>
 * @since 2023
 * 
 */
public class Usuario<Medicamento> {
	private String datadeNascimento;
	private String nome;
	private String email;
	private Medicamento medicamento;
	private Liquido liquido;
	private Comprimido comprimido;
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
	public Usuario(String nome, String datadeNascimento, String email, Liquido liquido, String ciclo, String sintomas) {
		this.nome = nome;
		this.datadeNascimento = datadeNascimento;
		this.email = email;
		this.liquido = liquido;
		this.ciclo = ciclo;
		this.sintomas = sintomas;
	}
	
	public Usuario() {
		this.nome = nome;
		this.datadeNascimento = datadeNascimento;
		this.email = email;
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
	
	
	public String getNomeUsuario() {
		return nome;
	}
	public void setNomeUsuario(String nome) {
		this.nome = nome;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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

	public String getNomeSintomas() {
		return nome;
	}
	public void setNomeSintomas(String nome) {
		this.nome = nome;
	}
	
}