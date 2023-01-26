package modelo;

public class Sintomas {
	private String nome;
	private String diaSemana;
	private String mes;
	
	public Sintomas(String nome, String diaSemana, String mes) {
		this.nome = nome;
		this.diaSemana = diaSemana;
		this.mes = mes;
		
	}
	public String getNomeSintomas() {
		return nome;
	}
	public void setNomeSintomas(String nome) {
		this.nome = nome;
	}
	public String getDia() {
		return diaSemana;
	}
	public void setDia(String diaSemana) {
		this.diaSemana = diaSemana;
	} 
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	@Override
	public String toString() {
		return "Nome do sintoma: " + nome + "\n" +
	           "Dia do inicio do sintoma: " + diaSemana + "\n" + 
		       "Mês do inicio do sintoma: " + mes;

    }
	
}
