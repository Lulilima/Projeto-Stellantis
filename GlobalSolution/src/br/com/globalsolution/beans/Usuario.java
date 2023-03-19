package br.com.globalsolution.beans;

public class Usuario {

	private String nome;
	private String sobrenome;
	private int idade;
	private String email;
	private int celular;
	private String username;
	
	
	//construtor vazio
		public Usuario(){
			
		}
		
		//construtor cheio
		public Usuario(String receberNome, String receberSobrenome, int receberIdade, String receberEmail, 
				int receberCelular, String receberUsername){
			setNome(receberNome);
			setSobrenome(receberSobrenome);
			setIdade(receberIdade);
			setEmail(receberEmail);
			setCelular(receberCelular);
			setUsername(receberUsername);
			
			
		}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	
}
