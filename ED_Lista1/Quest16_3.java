import java.util.Scanner;

public class Quest16_3 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite o numero A: ");
		int a = in.nextInt();

		System.out.println("Digite o numero B: ");
		int b = in.nextInt();

		while (a <= b) {
			System.out.println(a);
			a++;
		}

	}
}
