package br.com.globalsolution.beans;

public class Viagem extends Usuario{

	private double distancia;
	
	private String destino;
	
	private double recompensa;
	
	private int cpf;
	
	public Viagem(){
		
	}
	
	public Viagem(String receberNome, String receberSobrenome, int receberIdade, String receberEmail, 
			int receberCelular, String receberUsername, double receberDistancia, 
			double receberRecompensa, int receberCpf, String receberDestino){
		
		super (receberNome, receberSobrenome,receberIdade, receberEmail, receberCelular,  receberUsername);
		
		setDestino(receberDestino);
		setDistancia(receberDistancia);
		setRecompensa(receberRecompensa);
	}


	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getRecompensa() {
		return recompensa;
	}

	public void setRecompensa(double recompensa) {
		this.recompensa = recompensa;
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String atributosViagem() {
		return "\n" + "ATIBUTOS VIAGEM" + "\n" +
				"Nome do passageiro: " + getNome() + " " + getSobrenome() + "\n" +
				"Idade do passageiro: " + getIdade() + "\n" +
				"CPF: do passageiro:" + getCpf() + "\n" +
				"Email do passageiro: " + getEmail() + "\n" + 
				"Celular do passageiro: " + getCelular() + "\n" +
				"Username do passageiro: " + getUsername() + "\n" +
				"Distancia da viagem: " + getDistancia() + "\n"+
				"Destino da viagem: " + getDestino() + "\n" +
				"Recompensa da viagem: " + getDistancia() + "\n";
	}
		
	public void recompensaViagem() {
		double totalDistancia = (getDistancia() * 1);
		if (totalDistancia > 3) {
		System.out.println("\n" +"Pontuação adicionada com sucesso! ");
		}
		else {
			System.out.println("Distancia insuficiente para adição de pontos! ");
		}
				
	}
	
}
