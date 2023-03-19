package br.com.globalsolution.beans;

public class PessoaFisica extends Usuario{

	private int cpf;
		
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String receberNome, String receberSobrenome, int receberIdade, String receberEmail, 
			int receberCelular, String receberUsername, int receberCpf) {
		
		super (receberNome, receberSobrenome, receberIdade, receberEmail, receberCelular, receberUsername);
		
		setCpf(receberCpf);
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String atributosPessoaFisica() {
		return "\n"+"CADASTRO PESSOA FISICA"+"\n"+
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
			System.out.println("Idade invalida. Tente Novamente.");
		}
		else {
			System.out.println("Cadastro concluido com sucesso! ");
		}
	}
	
}
