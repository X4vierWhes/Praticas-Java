import java.util.Scanner;

public class Quest17_2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Digite o num A: ");
		float a = cin.nextFloat();

		System.out.println("Digite o num B: ");
		float b = cin.nextFloat();

		if (b == 0) {
			System.out.println("Imposs�vel dividir por ZERO!");
		} else {
			System.out.println("A/B = " + (a / b));
		}
		cin.close();
	}
}
