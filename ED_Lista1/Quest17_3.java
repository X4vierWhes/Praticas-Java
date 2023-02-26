import java.util.Scanner;

public class Quest17_3 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite o numero A: ");
		int a = in.nextInt();

		System.out.println("Digite o numero B: ");
		int b = in.nextInt();

		for (int i = a; i <= b; i++) {
			if ((i % 2) == 0) {
			} else {
				System.out.println(i);
			}
		}

	}
}
