package br.com.globalsolution.beans;

public class Veiculo extends Viagem {

	private String tipoVeiculo;
	
	private String local;
	
	private int notaAvaliacao;
	

	public Veiculo() {
		
	}
	
	public Veiculo(double receberDistancia, String receberDestino, Double receberRecompensa, String receberTipoVeiculo, 
			String receberLocal, int receberNotaAvaliacao) {
			setTipoVeiculo(receberTipoVeiculo);
			setLocal(receberLocal);
			setNotaAvaliacao(receberNotaAvaliacao);
	}
	
	public int getNotaAvaliacao() {
		return notaAvaliacao;
	}

	public void setNotaAvaliacao(int notaAvaliacao) {
		this.notaAvaliacao = notaAvaliacao;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	public String atributosVeiculo(){
		return "\n" + " ATRIBUTOS VEICULO " + "\n" +
				"Tipo do veiculo usado: " + getTipoVeiculo() + "\n" +
				"Local de entrega do veiculo: " + getLocal() + "\n" +
				"Distancia Percorrida: " + getDistancia() + "\n" +
				"Recompensa Gerada: " + getRecompensa() + "\n" +
				"Nota atribuida ao veiculo: " + getNotaAvaliacao();
	}
	
	public void avaliaçãoVeiculo() {
			int novaNota = getNotaAvaliacao();
			if(novaNota >= 6) {
				System.out.println("Avaliação positiva sobre o veiculo!" + "\n");
			}
			else {
				System.out.println("Avaliação negativa sobre o veiculo!" + "\n");
			}
	}
	
	
}
