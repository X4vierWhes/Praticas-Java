import java.util.Scanner;

public class Quest18 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String senha = "FEFELINDO2002";
		String tentativa;

		do {
			System.out.println("Digite sua senha: ");
			tentativa = cin.next();

			if (!(senha.equals(tentativa))) {
				System.out.println("Senha incorreta, tente novamente.");
			}
		} while (!(senha.equals(tentativa)));
		System.out.println("Login bem sucedido");

		cin.close();
	}
}
