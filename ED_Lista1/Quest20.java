import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest20 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		float invest_inicial, invest_mensal, saldo_acumulado, juros_Mensal, rendimento_Mensal;
		int qnt_meses;

		System.out.println("Digite o investimento inicial: ");
		invest_inicial = in.nextFloat();

		System.out.println("Digite o investimento mensal: ");
		invest_mensal = in.nextFloat();

		System.out.println("Digite a quantidade de meses no investimento: ");
		qnt_meses = in.nextInt();

		System.out.println("Digite a taxa mensal dos juros(%): ");
		juros_Mensal = in.nextFloat();
		juros_Mensal = juros_Mensal / 100;

		saldo_acumulado = invest_inicial;

		DecimalFormat df = new DecimalFormat("#.##");
		DecimalFormat dn = new DecimalFormat("00");

		for (int i = 1; i <= qnt_meses; i++) {
			rendimento_Mensal = saldo_acumulado * juros_Mensal;
			saldo_acumulado += rendimento_Mensal + invest_mensal;

			System.out.println("Mes " + dn.format(i) + " com saldo de: " + df.format(saldo_acumulado));
		}

	}
}