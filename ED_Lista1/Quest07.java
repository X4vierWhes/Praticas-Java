import java.util.Scanner;

public class Quest07 {

    public static void main(String[] args) {
        System.out.println("Entre com dois numeros reais:");
        Scanner cin = new Scanner(System.in);

        double a = cin.nextDouble();
        double b = cin.nextDouble();

        if (b == 0) {
            System.out.println("Impossivel dividir por 0");
        } else {
            System.out.println("Resultado: " + (a / b));
        }

        cin.close();
    }
}
