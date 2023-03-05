import java.util.Scanner;

public class Quest04 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite o num A: ");
		int a = in.nextInt();

		System.out.println("Digite o num B: ");

		int b = in.nextInt();

		System.out.println("Digite o num C: ");
		int c = in.nextInt();

		System.out.println("Media aritimetica: " + ((a + b + c) / 3));

	}
}
