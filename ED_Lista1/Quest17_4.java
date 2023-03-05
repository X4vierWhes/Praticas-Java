import java.util.Scanner;

public class Quest17_4 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Digite o numero A: ");
		int a = cin.nextInt();

		System.out.println("Digite o numero B: ");
		int b = cin.nextInt();

		do {
			if ((a % 2) == 0) {
			} else {
				System.out.println(a);
			}
			a++;
		} while (a <= b);

		cin.close();
	}
}
