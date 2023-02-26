package resolucaoLista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest19 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite um n�mero: ");
		int num = in.nextInt();

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
	}
}
