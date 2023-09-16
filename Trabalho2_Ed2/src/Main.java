import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente client = new Cliente();

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

					break;
				// Listar
				case 2:
					// client.Listar();
					break;
				// Editar
				case 3:
					break;
				// Remover
				case 4:
					break;
				// Quantidade
				case 5:

					break;
				// Buscar
				case 6:

					break;
				// Sair
				case 7:
					flag = false;
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
