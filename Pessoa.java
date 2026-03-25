package model;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private Date dataNascimento;
	
	public Pessoa(String nome) {
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void imprimirInfo() {
		System.out.println("[Pessoa] Nome:" + nome);
	}

}
