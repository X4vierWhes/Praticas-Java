import java.util.Scanner;

public class Quest37 {
	public static void main(String[] args) {

		System.out.println("Digite o valor de X ate Y para somar:");
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();

		System.out.println("Recursiva: " + Recursiva(a, b));
		System.out.println("Loop: " + Loop(a, b));

		cin.close();
	}

	public static int Recursiva(int x, int y) {
		if (x == y) {
			return x;
		} else {
			if (x <= y) {
				return x + Recursiva(x + 1, y);
			} else if (y <= x) {
				return y + Recursiva(y + 1, x);
			}
		}
		return 0;
	}

	public static int Loop(int x, int y) {
		int total = 0;

		if (x <= y) {
			for (int i = x; i <= y; i++) {
				total += i;
			}
		} else if (x >= y) {
			for (int i = y; i <= x; i++) {
				total += i;
			}
		}
		return total;
	}
}
