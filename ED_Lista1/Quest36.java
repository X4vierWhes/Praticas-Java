import java.util.Scanner;

public class Quest36 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um n�mero para calcular seu fatorial: ");
    int n = scan.nextInt();

    // Chama a fun��o recursiva que calcula o fatorial
    int resultado = fatorial(n);
    System.out.println("O fatorial de " + n + " � " + resultado);

    scan.close();
  }

  // Fun��o recursiva para calcular o fatorial
  public static int fatorial(int n) {
    // Condi��o de parada da recurs�o
    if (n == 0) {
      return 1;
    }
    // Chama a si mesma, decrementando o valor de n a cada chamada
    // At� chegar ao caso base (n = 0)
    return n * fatorial(n - 1);
  }
}
