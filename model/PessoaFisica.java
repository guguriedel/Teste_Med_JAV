package model;


public class PessoaFisica extends Pessoa{
	
	private String cpf;
	
	public PessoaFisica(String nome) {
		super(nome);
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void imprimirInfo() {
		System.out.println("[Pessoa Física] Nome:" + getNome());
	}
	
	public void imprimirInfo(String nomeAdicional) {
		System.out.println("[Pessoa Física] Nome:" + getNome() + nomeAdicional);
	}
	
	
	public void teste() {
		
	}
	
	
	
}
