package modelo;

import java.util.*;

public class Usuario extends Medicamentos { 
	private Date dataNasc;
	private String sexo;
	
	public Usuario(){
		super();
	}
	
	//Sobrecarga
	public Usuario(String n, String e, String s, Date dt) {
		nome = n;
		dataNasc = dt;
		sexo = s;
	}
	
	
	public Usuario(String n, String e,String s) {
		nome = n;
		sexo = s;
		
	}

	public String toString() {	
		return "Nome do aluno: " + nome;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
}