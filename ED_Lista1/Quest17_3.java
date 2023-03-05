import java.util.Scanner;

public class Quest17_3 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Digite o numero A: ");
		int a = cin.nextInt();

		System.out.println("Digite o numero B: ");
		int b = cin.nextInt();

		for (int i = a; i <= b; i++) {
			if ((i % 2) == 0) {
			} else {
				System.out.println(i);
			}
		}
		cin.close();

	}
}
