import java.util.Scanner;

public class Quest30 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = cin.nextLine();

		String fraseReversa = new StringBuilder(frase).reverse().toString();

		System.out.println(fraseReversa);
		cin.close();
	}
}
