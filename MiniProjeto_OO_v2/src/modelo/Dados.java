package modelo;

public class Dados {
	
	private  Usuario[] usuarios = new Usuario[50];
	private int qtdUsuario = 0;
	private Ciclo[] ciclo = new Ciclo[50];
	private int qtdCiclo = 0;
	private Sintomas[] sintomas = new Sintomas[50];
	private int qtdSintomas = 0;

	
	
	public void fillWithSomeData() {
		
		for(int i = 0; i < 5; i++) {
			for(int i1 = 0; i1 < 5; i1++) {
				usuarios[i1] = new Usuario(null, null, null, null, null, null, null);
				sintomas[i1] = new Sintomas(null, null);			
			}	
		}
		
		qtdUsuario = 5;
		qtdCiclo = 5;
		qtdSintomas = 5;
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
	
	public Sintomas[] getSintomas() {
		return sintomas;
	}
	
	public void setSintomas(Sintomas[] sintomas) {
		this.sintomas = sintomas;
	}
	
	public void inserirEditaSintomas(Sintomas s, int pos) {
		this.sintomas[pos] = s;
		if(pos == qtdSintomas) qtdSintomas++;
	}
	public int getQtdSintomas() {
		return qtdSintomas;
	}
	public void setQtdSintomas(int qtdSintomas) {
		this.qtdSintomas = qtdSintomas;
	}

	public Comprimido[] getComprimidos() {
		// TODO Stub de método gerado automaticamente
		return null;
	}

	public int getQtdComprimidos() {
		// TODO Stub de método gerado automaticamente
		return 0;
	}

	public Liquido[] getLiquidos() {
		// TODO Stub de método gerado automaticamente
		return null;
	}

	public int getQtdLiquidos() {
		// TODO Stub de método gerado automaticamente
		return 0;
	}

	public void inserirEditarSintoma(Sintomas l, int par) {
		this.sintomas[par] = l;
		if(par == qtdSintomas) qtdSintomas++;
		
	}

	public void inserirEditarSintomaUsuario(Usuario u, int qtdLiquidos) {
		// TODO Stub de método gerado automaticamente
		
	}

	public void PreencherDados() {
		// TODO Stub de método gerado automaticamente
		
	}

	public void PreencherDadosGerais() {
		// TODO Stub de método gerado automaticamente
		
	}
	

}