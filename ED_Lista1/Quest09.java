import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest09 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite o raio: ");
		float r = in.nextFloat();

		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("Area do circulo: " + df.format(Math.PI * r * r));
	}
}
