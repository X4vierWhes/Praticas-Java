import java.util.Scanner;

public class Quest22 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("entre com dois numeros inteiros: ");
        int x = cin.nextInt();
        int y = cin.nextInt();
        int somatorio = 0;
        for (int i = x; i <= y; i++) {
            somatorio += i;
        }
        System.out.println("Result: " + somatorio);
        cin.close();
    }
}
