import java.util.Scanner;

public class Quest16_3 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Digite o numero A: ");
		int a = cin.nextInt();

		System.out.println("Digite o numero B: ");
		int b = cin.nextInt();

		while (a <= b) {
			System.out.println(a);
			a++;
		}
		cin.close();
	}
}
