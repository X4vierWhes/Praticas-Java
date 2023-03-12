import java.util.Scanner;

public class Quest24 {
    public static void main(String[] args) {
        /*
         * Potencializacao
         * Raiz Quadrada
         * Fatorial
         * Sair
         */

        System.out.println("1 Potencialização");
        System.out.println("2 Raiz Quadrada");
        System.out.println("3 Fatorial");
        System.out.println("0 Sair");
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        while (num != 0) {
            switch (num) {
                case 1:
                    System.out.println("Digite o numero que deseja elevar: ");
                    int power = cin.nextInt();
                    System.out.println("Resultado: " + Math.pow(power, 2));
                    break;
                case 2:
                    System.out.println("Digite o numero que deseja saber a raiz: ");
                    int raiz = cin.nextInt();
                    System.out.println("Resultado: " + Math.sqrt(raiz));
                    break;
                case 3:
                    System.out.println("Digite o numero que deseja fatorar: ");
                    int fat = cin.nextInt();
                    System.out.println("Resultado: " + Fat(fat));
                    break;
                case 0:
                    break;
            }

            System.out.println("1 Potencialização");
            System.out.println("2 Raiz Quadrada");
            System.out.println("3 Fatorial");
            System.out.println("0 Sair");

            num = cin.nextInt();

        }

        System.out.println("SAIU");

        cin.close();
    }

    public static int Fat(int num) {

        if (num == 0) {
            return 1;
        } else {
            return num * Fat(num - 1);
        }
    }
}
