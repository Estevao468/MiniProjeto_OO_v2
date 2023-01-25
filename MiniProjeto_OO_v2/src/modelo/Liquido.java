package modelo;

public class Liquido extends Medicamentos{
	private int gotasporDia;
	private Sintomas horario;
	
	public Liquido(String nome, String marca, String frequencia,int gd, Sintomas h) {
		super(nome, marca, frequencia);
		this.gotasporDia = gd;
		this.horario = h;
	}
	
	public Liquido(String nome, String marca, String frequencia,int gd) { 
		super(nome, marca, frequencia);
		this.gotasporDia = gd;
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
	public int getGotasporDia() {
		return gotasporDia;
	}

	public void setGotasporDia(int gotasporDia) {
		this.gotasporDia = gotasporDia;
	}
	public Sintomas getHorario() {
		return horario;
	}

	public void setHorario(Sintomas horario) {
		this.horario = horario;
	}

	
	@Override
	public String toString() {
		return "\n" + "Liquido" + "\n" + 
				"Nome: " + getNome() + "\n" +
				"Marca: " + getMarca() + "\n" +
				"Frequencia: " + getFrequencia() + "\n" + 
		        "Gotas por Dia: " + gotasporDia;
	}

}
