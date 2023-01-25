package modelo;

public class Comprimido extends Medicamentos{
		
		private int comprimidosporDia;
		private int comprimidosTotal;
		private Sintomas horario;
		
		public Comprimido(String nome, String marca, String frequencia, int c, int ct, Sintomas h) { 
			super(nome, marca, frequencia);
			this.comprimidosporDia = c;
			this.comprimidosTotal = ct;
			this.horario = h;
		}
		
		public Comprimido(String nome, String marca, String frequencia, int c, int ct) { 
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
		
		public Sintomas getHorario() {
			return horario;
		}
		public void setHorario(Sintomas horario) {
			this.horario = horario;
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

