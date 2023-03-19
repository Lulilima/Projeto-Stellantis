package br.com.globalsolution.teste;

import javax.swing.JOptionPane;

import br.com.globalsolution.beans.FeedBack;
import br.com.globalsolution.beans.PessoaFisica;
import br.com.globalsolution.beans.PessoaJuridica;
import br.com.globalsolution.beans.Veiculo;
import br.com.globalsolution.beans.Viagem;

public class ProgramaGlobal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PESSOA FISICA - CONSTRUTOR VAZIO
		PessoaFisica usuarioFisico = new PessoaFisica();
		
		usuarioFisico.setNome(JOptionPane.showInputDialog("Construtor Vazio/ Digite seu Nome: "));
		usuarioFisico.setSobrenome(JOptionPane.showInputDialog("Construtor Vazio/ Digite seu Sobrenome: "));
		usuarioFisico.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Constutor Vazio/ Digite sua Idade: ")));
		usuarioFisico.setEmail(JOptionPane.showInputDialog("Construtor Vazio/ Digite seu e-mail: "));
		usuarioFisico.setUsername(JOptionPane.showInputDialog("Construtor Vazio/ Digite seu Username: "));
		usuarioFisico.setCelular(Integer.parseInt(JOptionPane.showInputDialog("Construtor Vazio/ Digite seu celular")));
		usuarioFisico.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Construtor Vazio/ Digite seu cpf: ")));
				
		
		
		//PESSOA FISICA - CONSTRUTOR CHEIO
		
		String nomeFisico = JOptionPane.showInputDialog("Construtor Cheio/ Digite seu Nome:");
		String sobrenomeFisico = JOptionPane.showInputDialog("Construtor Cheio/ Digite seu Sobrenome: ");
		int idadeFisico = Integer.parseInt(JOptionPane.showInputDialog("Constutor Cheio/ Digite sua Idade: "));
		String emailFisico = JOptionPane.showInputDialog("Construtor Cheio/ Digite seu e-mail: ");
		String usernameFisico = JOptionPane.showInputDialog("Construtor Cheio/ Digite seu Username: ");
		int celularFisico = Integer.parseInt(JOptionPane.showInputDialog("Construtor Cheio/ Digite seu celular: "));
		int cpfFisico = Integer.parseInt(JOptionPane.showInputDialog("Construtor Cheio/ Digite seu cpf: "));
		
		PessoaFisica usuarioFisicoCheio = new PessoaFisica(nomeFisico, sobrenomeFisico, idadeFisico, emailFisico,
				celularFisico, usernameFisico, cpfFisico);
		
		System.out.println(usuarioFisico.atributosPessoaFisica());
		usuarioFisico.calculoIdade();
		
		System.out.println(usuarioFisicoCheio.atributosPessoaFisica());
		usuarioFisicoCheio.calculoIdade();
		
		
		
		
		//PESSOA JURIDICA - CONSTRUTOR VAZIO
		
		PessoaJuridica usuarioJuridico = new PessoaJuridica();
		
		usuarioJuridico.setRazaoSocial(JOptionPane.showInputDialog("Construtor Vazio/ Digite a Razão social da empresa: "));
		usuarioJuridico.setCnpj(Integer.parseInt(JOptionPane.showInputDialog("Construtor Vazio/ Digite o CNPJ da empresa: ")));
		usuarioJuridico.setNome(JOptionPane.showInputDialog("Construtor Vazio/ Nome do representante: "));
		usuarioJuridico.setSobrenome(JOptionPane.showInputDialog("Construtor Vazio/ Sobrenome do representante: "));
		usuarioJuridico.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Constutor Vazio/ Idade do representante: ")));
		usuarioJuridico.setEmail(JOptionPane.showInputDialog("Construtor Vazio/ E-mail do representante: "));
		usuarioJuridico.setUsername(JOptionPane.showInputDialog("Construtor Vazio/ Username do representante: "));
		usuarioJuridico.setCelular(Integer.parseInt(JOptionPane.showInputDialog("Construtor Vazio/ Celular do representante: ")));
		usuarioJuridico.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Construtor Vazio/ CPF do representante: ")));
		
		
		//PESSOA JURIDICA - CONSTRUTOR CHEIO
		
		String razaoSocial = JOptionPane.showInputDialog("Construtor Cheio/ Digite a Razão social da empresa: ");
		int cnpj = Integer.parseInt(JOptionPane.showInputDialog("Construtor Cheio/Digite o CNPJ da empresa: "));
		String nomeJuridico = JOptionPane.showInputDialog("Construtor Cheio/ Nome do representante:");
		String sobrenomeJuridico = JOptionPane.showInputDialog("Construtor Cheio/ Sobrenome do representante: ");
		int idadeJuridico = Integer.parseInt(JOptionPane.showInputDialog("Constutor Cheio/ Idade do representante: "));
		String emailJuridico = JOptionPane.showInputDialog("Construtor Cheio/ E-mail do representante: ");
		String usernameJuridico = JOptionPane.showInputDialog("Construtor Cheio/ Username do representante: ");
		int celularJuridico = Integer.parseInt(JOptionPane.showInputDialog("Construtor Cheio/ Celular do representante: "));
		int cpfJuridico = Integer.parseInt(JOptionPane.showInputDialog("Construtor Cheio/ CPF do representante: "));
		
		PessoaJuridica usuarioJuridicoCheio = new PessoaJuridica(nomeJuridico, sobrenomeJuridico, idadeJuridico, 
				cpfJuridico, emailJuridico, usernameJuridico, celularJuridico, razaoSocial, cnpj );
		
		System.out.println(usuarioJuridico.atributosPessoaJuridica());
		usuarioJuridico.calculoIdade();
		
		System.out.println(usuarioJuridicoCheio.atributosPessoaJuridica());
		usuarioJuridicoCheio.calculoIdade();
		
		//VIAGEM - CONSTRUTOR VAZIO
		
		Viagem viagemUsuario = new Viagem();
		
		
		viagemUsuario.setNome(JOptionPane.showInputDialog("Construtor Vazio/ Nome do passageiro: "));
		viagemUsuario.setSobrenome(JOptionPane.showInputDialog("Construtor Vazio/ Sobrenome do passageiro: "));
		viagemUsuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Constutor Vazio/ Idade do passageiro: ")));
		viagemUsuario.setEmail(JOptionPane.showInputDialog("Construtor Vazio/ Email do passageiro: "));
		viagemUsuario.setUsername(JOptionPane.showInputDialog("Construtor Vazio/ Username do passageiro: "));
		viagemUsuario.setCelular(Integer.parseInt(JOptionPane.showInputDialog("Construtor Vazio/ Celular do passageiro:")));
		viagemUsuario.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Construtor Vazio/ CPF: do passageiro: ")));
		viagemUsuario.setDestino(JOptionPane.showInputDialog("Construtor Vazio/ Digite o destino do passageiro: "));
		viagemUsuario.setDistancia(Double.parseDouble(JOptionPane.showInputDialog("Construtor Vazio/ Digite a distancia da viagem: ")));
		
		
		//VIAGEM - CONSTRUTOR CHEIO
		
		String nomeViagem = JOptionPane.showInputDialog("Construtor Cheio/ Nome do passageiro:");
		String sobrenomeViagem = JOptionPane.showInputDialog("Construtor Cheio/ Sobrenome do passageiro: ");
		int idadeViagem = Integer.parseInt(JOptionPane.showInputDialog("Constutor Cheio/ Idade do passageiro:: "));
		String emailViagem = JOptionPane.showInputDialog("Construtor Cheio/ Email do passageiro: ");
		String usernameViagem = JOptionPane.showInputDialog("Construtor Cheio/ Username do passageiro: ");
		int celularViagem = Integer.parseInt(JOptionPane.showInputDialog("Construtor Cheio/ Celular do passageiro: "));
		int cpfViagem = Integer.parseInt(JOptionPane.showInputDialog("Construtor Cheio/ CPF: do passageiro: "));
		String DestinoViagem = JOptionPane.showInputDialog("Construtor Cheio/ Digite o destino do passagiero: ");
		double DistanciaViagem = Double.parseDouble(JOptionPane.showInputDialog("Construtor Cheio/ Digite a distancia da viagem: "));
		double recompensaViagem= Double.parseDouble(JOptionPane.showInputDialog("Construtor Cheio/ Recomepnsa da Viagem:"));
		
		Viagem viagemUsuarioCheio = new Viagem(nomeViagem, sobrenomeViagem, idadeViagem, emailViagem, celularViagem,
				usernameViagem, DistanciaViagem, recompensaViagem, cpfViagem, DestinoViagem );
		
		System.out.println(viagemUsuario.atributosViagem());
		viagemUsuario.recompensaViagem();
		
		System.out.println(viagemUsuarioCheio.atributosViagem());
		viagemUsuarioCheio.recompensaViagem();	
		
		
		//VEICULO - CONSTRUTOR VAZIO
		
		Veiculo veiculoViagem = new Veiculo();
		
		veiculoViagem.setTipoVeiculo(JOptionPane.showInputDialog("Construtor Vazio/ Digite o tipo do veiculo Usado: "));
		veiculoViagem.setLocal(JOptionPane.showInputDialog("Construtor Vazio/ Digite o local de entrega do veoculo: "));
		veiculoViagem.setNotaAvaliacao(Integer.parseInt(JOptionPane.showInputDialog("Construtor Vazio/ Digite uma nota de 1 a 10 para o veiculo")));
		veiculoViagem.setDistancia(Double.parseDouble(JOptionPane.showInputDialog("Construtor Vazio/ Digite a Distancia percorrida:")));
		veiculoViagem.setRecompensa(Double.parseDouble(JOptionPane.showInputDialog("Construtor Vazio/ Digite a recompensa gerada:")));
		
		//VEICULO - CONSTRUTOR CHEIO
		
		Double distanciaVeiculo = Double.parseDouble(JOptionPane.showInputDialog("Construtor Cheio/ Digite a Distancia percorrida :"));
		String destinoVeiculo = JOptionPane.showInputDialog("Construtor Cheio/ Digite o destino da viagem: ");
		double recompensaVeiculo = Double.parseDouble(JOptionPane.showInputDialog("Construtor Cheio/ Digite a recompensa gerada:"));
		String tipoVeiculo = JOptionPane.showInputDialog("Construtor Cheio/ Digite o tipo do veiculo Usado: ");
		String localVeiculo = JOptionPane.showInputDialog("Construtor Cheio/ Digite o local de entrega do veoculo: ");
		int notaVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Construtor Cheio/ Digite uma nota de 1 a 10 para o veiculo"));
		
		Veiculo veiculoViagemCheio = new Veiculo(distanciaVeiculo, destinoVeiculo, recompensaVeiculo, tipoVeiculo, localVeiculo, notaVeiculo);
		
		System.out.println(veiculoViagem.atributosVeiculo());
		veiculoViagem.avaliaçãoVeiculo();
		
		System.out.println(veiculoViagemCheio.atributosVeiculo());
		veiculoViagemCheio.avaliaçãoVeiculo();
		
		
		//FEEDBACK
		FeedBack feedback = new FeedBack ();
		feedback.setNotaAvaliativa(Integer.parseInt(JOptionPane.showInputDialog("Digite nota avaliativa 0-10")));
		feedback.setComoConheceu(JOptionPane.showInputDialog("Digite como conheceu o site:"));
		feedback.setComentRecomendacao(JOptionPane.showInputDialog("Digite seu comentário a respeito da plataforma:"));
		
		System.out.println("FEEDBACK" +
				"\n" + "Nota avaliativa: " + feedback.getNotaAvaliativa() +
				"\n" + "Como conheceu a plataforma: " + feedback.getComoConheceu() +
				"\n" + "Comentário sobre a plataforma: " + feedback.getComentRecomendacao());
		
		System.out.println(feedback.mostrarAtributos());
		
		feedback.calcularAvaliacaoPlataforma(Integer.parseInt(JOptionPane.showInputDialog("Nota:")));
			}

}
