import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest08 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite a altura: ");
		float a = in.nextFloat();

		System.out.println("Digite a peso: ");
		float p = in.nextFloat();

		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("IMC: " + df.format(((p) / (a * a))));

	}
}
