import java.util.Scanner;

public class Quest12 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite a m�dia parcial do aluno: ");
		float media = in.nextFloat();

		if (media > 7.0) {
			System.out.println("Aprovado");
		} else if ((7.0 > media) && (media >= 5.0)) {
			System.out.println("Recupera��o");
		} else {
			System.out.println("Reprovado");
		}
	}
}
