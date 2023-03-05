import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {
        System.out.println("Digite dois numeros X/Y:");
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        System.out.println("Soma:" + (a + b));

        System.out.println("Subtração: " + (a - b));

        System.out.println("Multiplicação:" + (a * b));

        System.out.println("Divisao:" + (a / b));

        System.out.println("Resto: " + (a % b));

        cin.close();
    }
}
