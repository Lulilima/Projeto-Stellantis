package br.com.globalsolution.beans;

public class FeedBack extends Usuario{

	private int notaAvaliativa;
	private String comoConheceu;
	private String comentRecomendacao;
	
	//construtor vazio
	public FeedBack () {
		
	}
	
	//construtor cheio
	public FeedBack (int receberNotaAvaliativa, String receberComoConheceu, String receberComentRecomendacao) {
		setNotaAvaliativa(receberNotaAvaliativa);
		setComoConheceu(receberComoConheceu);
		setComentRecomendacao(receberComentRecomendacao);
	}
		
	public int getNotaAvaliativa() {
		return notaAvaliativa;
	}

	public void setNotaAvaliativa(int notaAvaliativa) {
		this.notaAvaliativa = notaAvaliativa;
	}

	public String getComoConheceu() {
		return comoConheceu;
	}

	public void setComoConheceu(String comoConheceu) {
		this.comoConheceu = comoConheceu;
	}

	public String getComentRecomendacao() {
		return comentRecomendacao;
	}

	public void setComentRecomendacao(String comentRecomendacao) {
		this.comentRecomendacao = comentRecomendacao;
	}
	//método mostrar atributos
	public String mostrarAtributos() {
		return "\n" + "FEEDBACK" + '\n' + 
				"Minha nota para o site é: " + getNotaAvaliativa() + "\n" +
				"Conheci o site através: " + getComoConheceu() + "\n" +
				"Meu comentário a respeito da plataforma é: " + getComentRecomendacao() + "\n";
	}
	public void calcularAvaliacaoPlataforma(int receberNota) {
		int novaNota = getNotaAvaliativa();
		if(novaNota >= 6) {
			System.out.println("Avaliação positiva da plataforma!" + "\n");
		}
		else {
			System.out.println("Avaliação negativa da plataforma!" + "\n");
		}
	}

}


