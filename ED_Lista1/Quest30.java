import java.util.Scanner;

public class Quest30 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite uma frase: ");
		String frase = in.nextLine();

		String fraseReversa = new StringBuilder(frase).reverse().toString();

		System.out.println(fraseReversa);

	}
}
