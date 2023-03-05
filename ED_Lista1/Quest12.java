import java.util.Scanner;

public class Quest12 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Digite a m�dia parcial do aluno: ");
		float media = cin.nextFloat();

		if (media > 7.0) {
			System.out.println("Aprovado");
		} else if ((7.0 > media) && (media >= 5.0)) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}

		cin.close();
	}
}
