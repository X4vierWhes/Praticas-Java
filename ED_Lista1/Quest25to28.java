import java.util.Scanner;

public class Quest25to28 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Defina o tamanho do seu vetor: ");
        int[] vet = new int[cin.nextInt()];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o indice: " + (i + 1));
            vet[i] = cin.nextInt();
        }
        System.out.println("Vetor: ");
        for (int i : vet) {
            System.out.print(i + " ");
        }
        System.out.println(); /* Vetor Invertido */
        System.out.println("Vetor invertido: ");
        int[] invert = invert(vet);

        for (int j : invert) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Analisado: ");
        analisar(invert);

        System.out.println();
        System.out.println("Defina o tamnho da matriz: Linhas/Colunas");
        int linha = cin.nextInt();
        int coluna = cin.nextInt();
        int[][] matriz = new int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite o valor para o indice [" + (i + 1)
                        + "][" + (j + 1) + "]");
                matriz[i][j] = cin.nextInt();
            }
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < linha; i++) {

            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        cin.close();
    }

    public static int[] invert(int[] vet) {
        int[] invert = new int[vet.length];
        int j = 0;
        for (int i = vet.length - 1; i >= 0; i--) {
            invert[j] = vet[i];
            j++;
        }

        return invert;
    }

    public static void analisar(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] > vet[j]) {
                    int aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            }
        }
        System.out.println("Menor numero do vetor: " + vet[0]
                + " Menor numero do vetor: " + vet[vet.length - 1]);

        System.out.println("Vetor em ordem crescente:");

        for (int k : vet) {
            System.out.print(k + " ");
        }
    }
}
