package Eventos;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarEvento {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		ArrayList<Evento> lista = new ArrayList<Evento>();
		int opcao = 1;

		while (opcao != 0) {

			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
				case 1:
					cadastrarEvento(scan, lista);
					break;
				case 2:
					alterarEvento(scan, lista);
					break;
				case 3:
					consultarEventoPosicao(scan, lista);
					break;
				case 4:
					excluirPorPosicao(scan, lista);
					break;
				case 5:
					exibirEventos(lista);
					break;
				case 6:
					excluirEventos(lista);
					break;
				case 7:
					verificarTamanho(lista);
					break;
				default:
					break;
			}
		}

		System.out.println("Usuário digitou 0, programa terminado");
	}

	protected static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {

			System.out.println("\nDigite a opção desejada:");
			System.out.println("1: Cadastrar Evento");
			System.out.println("2: Editar Evento");
			System.out.println("3: Consultar um evento de uma posição específica");
			System.out.println("4: Excluir evento por posição");
			System.out.println("5: Exibir todos os eventos da lista");
			System.out.println("6: Excluir todos os evento da lista");
			System.out.println("7: Verifica tamanho da lista");
			System.out.println("0: Sair\n\n");

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 7) {
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e) {

				System.out.println("Entrada inválida, digite novamente\n\n");
			}
		}

		return opcao;
	}

	protected static String leInformacao(String msg, Scanner scan) {

		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	protected static int leInformacaoInt(String msg, Scanner scan) {

		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida) {

			try {

				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente");
			}
		}

		return num;
	}

	private static void cadastrarEvento(Scanner scan, ArrayList<Evento> lista) {

		System.out.println("Criando um evento, entre com as informações:");
		String nome = leInformacao("Entre com o nome do evento", scan);
		String data = leInformacao("Entre com a data do evento", scan);
		String horario = leInformacao("Entre com o horário do evento", scan);

		String nomeRua = leInformacao("Entre com o nome da rua", scan);
		String numero = leInformacao("Entre com o numero da casa", scan);
		String complemento = leInformacao("Entre com o complemento", scan);
		String cep = leInformacao("Entre com o cep", scan);
		String cidade = leInformacao("Entre com o cidade", scan);
		String estado = leInformacao("Entre com o estado", scan);

		String nomeConvidado = leInformacao("Entre com o nome do convidado", scan);
		String rg = leInformacao("Entre com o rg do convidado", scan);

		Convidado convidado = new Convidado(rg, nomeConvidado);
		Convidado[] convidados = new Convidado[4];
		
		for(int i = 0; i<convidados.length; i++){
			convidados[i] = convidado;
			//convidados.add(convidado);
		}
		/*ArrayList<Convidado> convidados = new ArrayList<Convidado>(5);*/
		

		Endereco endereco = new Endereco(nomeRua, numero, complemento, cep, cidade, estado);

		Evento evento = new Evento(nome, endereco, data, horario, convidados);

		evento.setEndereco(endereco);
		evento.setConvidados(convidados);
		lista.add(evento);

		System.out.println("Evento adicionado com sucesso!");
		System.out.println(evento);
	}

	private static void alterarEvento(Scanner scan, ArrayList<Evento> lista) {

		System.out.println("Criando um evento, entre com as informações:");
		String nome = leInformacao("Entre com o nome do evento", scan);
		String data = leInformacao("Entre com a data do evento", scan);
		String horario = leInformacao("Entre com o horário do evento", scan);

		String nomeRua = leInformacao("Entre com o nome da rua", scan);
		String numero = leInformacao("Entre com o numero da casa", scan);
		String complemento = leInformacao("Entre com o complemento", scan);
		String cep = leInformacao("Entre com o cep", scan);
		String cidade = leInformacao("Entre com o cidade", scan);
		String estado = leInformacao("Entre com o estado", scan);

		String nomeConvidado = leInformacao("Entre com o nome do convidado", scan);
		String rg = leInformacao("Entre com o rg do convidado", scan);

		Endereco endereco = new Endereco(nomeRua, numero, complemento, cep, cidade, estado);

		Convidado convidado = new Convidado(rg, nomeConvidado);
		ArrayList<Convidado> convidados = new ArrayList<Convidado>(5);
		convidados.add(convidado);

		Evento evento = new Evento(nome, endereco, data, horario, convidados);

		evento.setEndereco(endereco);
		evento.setConvidados(convidados);

		int pos = leInformacaoInt("Entre com a posição a adicionar o evento", scan);

		try {
			lista.set(pos, evento);

			System.out.println("Evento adicionado com sucesso!");
			System.out.println(evento);

		} catch (Exception e) {
			System.out.println("Posição inválida, evento não adicionado");
		}

	}

	private static void consultarEventoPosicao(Scanner scan, ArrayList<Evento> lista) {

		int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

		try {

			Evento evento = lista.get(pos);

			System.out.println("Evento existe, seguem dados:");
			System.out.println(evento);

		} catch (Exception e) {
			System.out.println("Posição inválida");
		}
	}

	private static void excluirPorPosicao(Scanner scan, ArrayList<Evento> lista) {
		int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

		try {

			lista.remove(pos);

			System.out.println("Evento excluido");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void verificarTamanho(ArrayList<Evento> lista) {

		System.out.println("Tamanho da lista é de: " + lista.size());
	}

	private static void excluirEventos(ArrayList<Evento> lista) {

		lista.clear();

		System.out.println("Todos os eventos da lista foram excluidos");
	}

	protected static void criarEventosDinamicamente(int qtd, ArrayList<Evento> lista) {
		Evento evento;
		Endereco endereco;
		Convidado convidado;
		ArrayList<Convidado> convidados;

		for (int i = 1; i <= qtd; i++) {
			evento = new Evento();
			endereco = new Endereco();
			convidado = new Convidado();
			convidados = new ArrayList<Convidado>(5);

			evento.setNome("vazio");
			evento.setData("vazio");
			evento.setHorario("vazio");

			convidado.setNomeConvidado("vazio");
			convidado.setRg("vazio");
			convidados.add(convidado);
			evento.setConvidados(convidados);

			endereco.setNomeRua("vazio");
			endereco.setNumero("vazio");
			endereco.setComplemento("vazio");
			endereco.setCep("vazio");
			endereco.setCidade("vazio");
			endereco.setEstado("vazio");

			evento.setEndereco(endereco);

			lista.add(evento);

		}

	}

	private static void exibirEventos(ArrayList<Evento> lista) {

		System.out.println(lista);
	}

}
