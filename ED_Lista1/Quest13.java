import java.util.Scanner;

public class Quest13 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		System.out.println("Digite a nota 1 do aluno: ");
		float n1 = cin.nextFloat();

		System.out.println("Digite a nota 2 do aluno: ");
		float n2 = cin.nextFloat();

		System.out.println("Digite a nota 3 do aluno: ");
		float n3 = cin.nextFloat();

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

		cin.close();
	}
}
