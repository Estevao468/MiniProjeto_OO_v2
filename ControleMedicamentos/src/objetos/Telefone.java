package objetos;

/**
 * Classe responsável pelo objeto telefone
 * @author Diógenes Júnior
 * @since 2022
 * 
 */
public class Telefone {
	private int ddd;
	private String digitos;
	
	/**
	 * Construtor da classe Telefone
	 * @param ddd
	 * @param digitos
	 * 
	 */
	public Telefone(int ddd, String digitos) {
		this.setDdd(ddd);
		this.setDigitos(digitos);
	}
	
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public String getDigitos() {
		return digitos;
	}
	public void setDigitos(String digitos) {
		this.digitos = digitos;
	}

	@Override
	public String toString() {
		return "Telefone: " + ddd + digitos;
	}
	
	
}