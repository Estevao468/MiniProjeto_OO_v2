package modelo;

public class Dados {
	private  Usuario[] usuarios = new Usuario[50];
	private int qtdUsuario = 0;
	private Ciclo[] ciclo = new Ciclo[50];
	private int qtdCiclo = 0;

	
	
	public void fillWithSomeData() {
		
		for(int i = 0; i < 5; i++) {
			usuarios[i] = new Usuario();
			ciclo[i] = new Ciclo();		
		}
		
		qtdUsuario = 5;
		qtdCiclo = 5;
	}
	
	public Usuario[] getUsuario() {
		return usuarios;
	}
	
	public void setUsuario(Usuario[] usuario) {
		this.usuarios = usuario;
	}
	
	public void inserirEditarUsuario(Usuario u, int pos) {
		this.usuarios[pos] = u;
		if(pos == qtdUsuario) qtdUsuario++;
	}
	
	public int getQtdUsuario() {
		return qtdUsuario;
	}
	public void setQtdUsuario(int qtdUsuario) {
		this.qtdUsuario = qtdUsuario;
	}
	public Ciclo[] getCiclo() {
		return ciclo;
	}
	
	public void setCiclo(Ciclo[] ciclo) {
		this.ciclo = ciclo;
	}
	
	public void inserirEditaCiclo(Ciclo c, int pos) {
		this.ciclo[pos] = c;
		if(pos == qtdCiclo) qtdCiclo++;
	}
	
	
	public int getQtdCiclo() {
		return qtdCiclo;
	}
	public void setQtdCiclo(int qtdCiclo) {
		this.qtdCiclo = qtdCiclo;
	}
	

}