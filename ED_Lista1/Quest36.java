import java.util.Scanner;

public class Quest36 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um n�mero para calcular seu fatorial: ");
    int n = scan.nextInt();
    System.out.println("O fatorial: " + fat(n));

    scan.close();
  }

  public static int fat(int n) {
    if (n == 0) {
      return 1;
    }
    return n * fat(n - 1);
  }
}
