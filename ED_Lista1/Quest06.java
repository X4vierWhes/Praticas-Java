import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest06 {

	public static void main(String[] args) {
		final double PRECO_REFRI = 1.50, PRECO_FATIAP = 3.00, TAXA_GARCOM = 1.1;
		Scanner cin = new Scanner(System.in);
		System.out.println("Digite quantos refrigerantes foram comprados: ");
		int consumo_refri = cin.nextInt();

		System.out.println("Digite quantas fatias de pizzas foram consumidas: ");
		int consumo_pizza = cin.nextInt();

		System.out.println("Digite a quantidade de pessoas na mesa: ");
		int qnt_pessoas = cin.nextInt();

		double total = PRECO_REFRI * consumo_refri + PRECO_FATIAP * consumo_pizza;

		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("Total sem taxa: " + df.format(total));
		System.out.println("Total com taxa: " + df.format(total * TAXA_GARCOM));
		System.out.println("Rateio por pessoas na mesa: " + df.format((total * TAXA_GARCOM) / qnt_pessoas));

		cin.close();
	}
}