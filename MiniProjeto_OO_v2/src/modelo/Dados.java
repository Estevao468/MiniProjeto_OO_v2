package modelo;

import java.util.*;

public class Dados {
	private  Usuario[] usuarios = new Usuario[50];
	private int qtdAlunos = 0;
	private Curso [] cursos = new Curso[50];
	private int qtdCursos = 0;
	private Ciclo[] profs = new Ciclo[50];
	private int qtdProfs = 0;

	
	
	public void fillWithSomeData() {
		Date d = Calendar.getInstance().getTime();
		for(int i = 0; i < 5; i++) {
			usuarios[i] = new Usuario();
			profs[i] = new Ciclo();
			cursos[i] = new Curso();			
		}
		
		qtdAlunos = 5;
		qtdCursos = 5;
		qtdProfs = 5;
	}
	
	public Usuario[] getAlunos() {
		return usuarios;
	}
	
	public void setAlunos(Usuario[] alunos) {
		this.usuarios = alunos;
	}
	
	public void inserirEditarAluno(Usuario a, int pos) {
		this.usuarios[pos] = a;
		if(pos == qtdAlunos) qtdAlunos++;
	}
	
	public int getQtdAlunos() {
		return qtdAlunos;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
	public Curso[] getCursos() {
		return cursos;
	}
	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}
	public int getQtdCursos() {
		return qtdCursos;
	}
	public void setQtdCursos(int qtdCursos) {
		this.qtdCursos = qtdCursos;
	}
	
	public Ciclo[] getProfs() {
		return profs;
	}
	
	public void setProfs(Ciclo[] profs) {
		this.profs = profs;
	}
	
	public void inserirEditaProf(Ciclo p, int pos) {
		this.profs[pos] = p;
		if(pos == qtdProfs) qtdProfs++;
	}
	
	
	public int getQtdProfs() {
		return qtdProfs;
	}
	public void setQtdProfs(int qtdProfs) {
		this.qtdProfs = qtdProfs;
	}
	

}