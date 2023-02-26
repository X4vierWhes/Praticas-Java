import java.util.Scanner;

public class Quest05 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite o num A: ");
		float a = in.nextFloat();

		System.out.println("Digite o num B: ");
		float b = in.nextFloat();

		System.out.println("Digite o num C: ");
		float c = in.nextFloat();

		System.out.println("Media aritimetica: " + ((a + b + c) / 3));

	}
}