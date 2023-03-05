import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest09 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Digite o raio: ");
		float r = cin.nextFloat();

		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("Area do circulo: " + df.format(Math.PI * r * r));

		cin.close();
	}
}
