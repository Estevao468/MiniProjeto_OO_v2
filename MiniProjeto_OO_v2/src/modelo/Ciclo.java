package modelo;

public class Ciclo extends Medicamentos {
	
	private int diaSemana;
	private String mes;

	public Ciclo(){
		super();
	}
	
	public Ciclo(String n, int a, String m) {
		this.nome = n;
		this.diaSemana = a;
		this.mes = m;
				
	}
	
		public String toString() {
		return "Nome d@ sintoma@: " + nome + ", Dia da Semana: " + diaSemana+ ", Mês de ocorrencia: "+mes;
	}


	public String getNomeCiclo() {
		return nome;
	}

	public void setNomeCiclo(String nome) {
		this.nome = nome;
	}

	public double getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(int diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	
}