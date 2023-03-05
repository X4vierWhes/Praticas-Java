import java.util.Scanner;

public class Quest18_2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String senha = "FEFELINDO2002";

		System.out.println("Digite sua senha: ");
		String tentativa = cin.next();

		while (!(senha.equals(tentativa))) {
			System.out.println("Senha incorreta. Digite novamente.");
			tentativa = cin.next();
		}
		System.out.println("Login bem sucedido");

		cin.close();
	}
}
