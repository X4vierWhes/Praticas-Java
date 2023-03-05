import java.util.Scanner;

public class Quest21 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = cin.nextInt();
        int divisores = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("Numero primo.");
        } else {
            System.out.println("Nao primo.");
        }

        cin.close();
    }
}
