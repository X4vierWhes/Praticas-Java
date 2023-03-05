import java.util.Scanner;

public class Quest14 {

	public static int calcDelta(int a, int b, int c) {
		int delta;

		delta = (b * b) - (4 * a * c);

		return delta;
	}

	public static void calcRaizes(int delta, int a, int b) {
		System.out.println("Raiz 1: " + ((-b + Math.sqrt(delta) / 2 * a)));
		System.out.println("Raiz 2: " + ((-b - Math.sqrt(delta) / 2 * a)));
	}

	public static void main(String[] args) {
		int a, b, c;
		Scanner cin = new Scanner(System.in);
		System.out.println("Digite o coeficiente A: ");
		a = cin.nextInt();

		System.out.println("Digite o coeficiente B: ");
		b = cin.nextInt();

		System.out.println("Digite o coeficiente C: ");
		c = cin.nextInt();

		calcRaizes(calcDelta(a, b, c), a, b);

		cin.close();
	}
}
