import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest19 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int num = cin.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " + " + i + " = " + (num + i));
		}

		System.out.println("");

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " - " + i + " = " + (num - i));
		}

		System.out.println("");

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

		System.out.println("");

		DecimalFormat nf = new DecimalFormat("#.###");

		for (int i = 1; i <= 9; i++) {
			double numI = num / i;
			System.out.println((num + " : " + i + " = " + nf.format(numI)));
		}

		cin.close();
	}
}
