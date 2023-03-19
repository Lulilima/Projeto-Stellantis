package br.com.globalsolution.beans;

public class PessoaJuridica extends Usuario {

	private String razaoSocial;
	private int cnpj;
	private int cpf;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String receberNome, String receberSobrenome, int receberIdade, int receberCpf, 
			String recerberEmail, String receberUsername, int receberCelular, String receberRazaoSocial, 
			int receberCnpj) {
		
		super(receberNome, receberSobrenome, receberIdade, recerberEmail, receberCelular, receberUsername);
		setRazaoSocial(receberRazaoSocial);
		setCnpj(receberCnpj);
		
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String atributosPessoaJuridica() {
		return "\n"+ "CADASTRO PESSOA JURIDICA" + "\n" +
				"Razão Social: " + getRazaoSocial() + "\n" +
				"CNPJ: " + getCnpj() + "\n" +
				"Nome: " + getNome() + " " + getSobrenome()+"\n" +
				"Idade: " + getIdade() + "\n" +
				"CPF: " + getCpf() + "\n" +
				"Email: " + getEmail() + "\n" + 
				"Celular: " + getCelular() + "\n" +
				"Username: " + getUsername() + "\n";
	}
	
	public void calculoIdade() {
		int maiorIdade = 18;
		if (getIdade() < maiorIdade) {
			System.out.println("Data de idade invalida. Tente Novamente.");
		}
		else {
			System.out.println("Cadastro concluido com sucesso");
		}
	}	
	
}
