import java.util.Scanner;

public class Quest10 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite um numero: ");
		int num = in.nextInt();

		if ((num % 2) == 0) {
			System.out.println(num + " é par");
		} else {
			System.out.println(num + " é impar");
		}
	}
}
