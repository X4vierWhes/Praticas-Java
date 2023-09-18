import java.util.InputMismatchException;
import Entity.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int tam = 100;
		Cliente client = new Cliente(tam, true);
		//System.out.println(12345678901l%100);
		//client.Init();
		client.Cadastrar(new Veiculo("ABC1234", "12345678901", "Ford Ka", 2007, new
				  Condutor("Whesley", "11111111111")));

		boolean flag = true;
		int i = 0;
		Scanner cin = new Scanner(System.in);

		while (flag) {

			System.out.println(
					"------------------------------------------------------\n" +
							"Cadastrar (1) \n" +
							"Listar (2) \n" +
							"Editar (3) \n" +
							"Remover (4) \n" +
							"Quantidade (5) \n" +
							"Buscar (6) \n" +
							"Sair (7) \n" +
							"------------------------------------------------------\n" +
							"Digite sua opção: ");

			try {
				i = cin.nextInt();
				cin.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Erro: O valor inserido não é um número inteiro válido.");
				cin.nextLine();
				continue;
			}

			switch (i) {
				// Cadastrar
				case 1:
					
					System.out.println("Entre com o Nome do Condutor: ");
					String name = cin.next();
					System.out.println("Entre com o CPF do Condutor: ");
					String cpf = cin.next();
					System.out.println("Entre com o MODELO do veiculo: ");
					String modelo = cin.next();
					System.out.println("Entre com o ano de FABRICAÇÃO do veiculo: ");
					int ano;
					 try {   
				           ano  = cin.nextInt();
				          cin.nextLine();
				        } catch (InputMismatchException e) {
				            System.out.println("Erro: O valor inserido não é um número inteiro válido.");
				            cin.nextLine();
				            continue;
				        }
					System.out.println("Entre com o RENAVAM do veiculo: ");
					String renavam = cin.next();
					
					try {
						long teste = Long.parseLong(renavam);
					}catch(NumberFormatException e) {
						System.out.println("erro: Renavam invalido, tente novamente");
						continue;
					}
					System.out.println("Entre com o PLACA do veiculo: ");
					String placa = cin.next();
						
						
						
					client.Cadastrar(new Veiculo(placa, renavam, modelo, ano, new Condutor(name, cpf)));
					break;
				// Listar
				case 2:
					 client.Listar();
					break;
				// Editar
				case 3:
					
					System.out.println("Digite a PLACA do veiculo que deseja editar:");
					String placaEditar = cin.next();
					System.out.println("Digite a RENAVAM do veiculo que deseja editar:");
					String renavamEditar = cin.next();
					long keyEditar = -1;
					try {
						 keyEditar = Long.parseLong(renavamEditar);
					}catch(NumberFormatException e) {
						System.out.println("erro: Renavam invalido, tente novamente");
						continue;
					}
					
					System.out.println(client.Editar(placaEditar, keyEditar) ? "Veiculo editado." : "Error.");
					break;
				// Remover
				case 4:
					System.out.println("Digite a PLACA do veiculo que deseja remover:");
					String placaRemover = cin.next();
					System.out.println("Digite a RENAVAM do veiculo que deseja remover:");
					String renavamRemover = cin.next();
					long keyRemover = -1;
					try {
						 keyRemover = Long.parseLong(renavamRemover);
					}catch(NumberFormatException e) {
						System.out.println("erro: Renavam invalido, tente novamente");
						continue;
					}
					
					
					client.Remover(placaRemover, keyRemover);
					break;
				// Quantidade
				case 5:
					System.out.println("Quantidade de elementos na HASH: " + client.Quantidade());
					break;
				// Buscar
				case 6:
					System.out.println("Digite a PLACA do veiculo que deseja buscar:");
					String placaBuscar = cin.next();
					System.out.println("Digite a RENAVAM do veiculo que deseja buscar:");
					String renavamBuscar = cin.next();
					long keyBuscar = -1;
					try {
						 keyBuscar = Long.parseLong(renavamBuscar);
					}catch(NumberFormatException e) {
						System.out.println("erro: Renavam invalido, tente novamente");
						continue;
					}
					
					
					Veiculo a = client.Buscar(placaBuscar, keyBuscar);
					
					System.out.println(a != null ? a.toString(): "Não encontrado.");
					break;
				// Sair
				case 7:
					flag = false;
					break;
				//Listar em formato de vetor para debugação
				case 8:
					client.ListarVet();
					break;
				default:
					System.out.println("Por favor digite um numero valido.");
					break;

			}

		}
		System.out.println("Volte sempre.");
		cin.close();
	}
}
