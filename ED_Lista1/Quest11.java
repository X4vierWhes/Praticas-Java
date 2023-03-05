import java.util.Scanner;

public class Quest11 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		double conta1 = 100.00, conta2 = 100.00;

		System.out.println("Saldo conta 1: " + conta1);
		System.out.println("Saldo conta 2: " + conta2);
		System.out.println("\nInsira quanto deseja transferir da conta 1 para conta 2: ");

		double transf = in.nextDouble();

		if ((conta1 - transf) < 0) {
			System.out.println("saldo insuficiente");
		} else {
			conta1 -= transf;
			conta2 += transf;
		}

		System.out.println("Saldo conta 1: " + conta1);
		System.out.println("Saldo conta 2: " + conta2);
	}
}
