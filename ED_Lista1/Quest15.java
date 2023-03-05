import java.util.Scanner;

public class Quest15 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = cin.nextInt();

		if (num == 1) {
			System.out.println("Um");
		} else if (num == 2) {
			System.out.println("Dois");
		} else if (num == 3) {
			System.out.println("Tr�s");
		} else if (num == 4) {
			System.out.println("Quatro");
		} else if (num == 5) {
			System.out.println("Cinco");
		} else {
			System.out.println("N�mero inv�lido");
		}

		cin.close();
	}
}
