import java.util.Scanner;

public class Quest13 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite a nota 1 do aluno: ");
		float n1 = in.nextFloat();

		System.out.println("Digite a nota 2 do aluno: ");
		float n2 = in.nextFloat();

		System.out.println("Digite a nota 3 do aluno: ");
		float n3 = in.nextFloat();

		float media = (n1 + n2 + n3) / 3;

		if (media >= 7.0) {
			System.out.println("Aprovado");
		} else if ((7.0 > media) && (media >= 3.5)) {
			System.out.println("Recupera��o");

			float n4 = (50 - media * 6) / 4;

			System.out.println("Nota minima necessaria na quarta prova: " + n4);
		} else {
			System.out.println("Reprovado");
		}
	}
}
