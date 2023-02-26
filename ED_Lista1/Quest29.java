
public class Quest29 {
	private static int[] array = { 8, 2, 1, 6, 5 }; // Define o array de n�meros
	private static int index = 2; // Define o �ndice a ser movido

	public static void main(String[] args) {
		System.out.println("Entrada: ");
		// Imprime o array de entrada
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}

		// O loop a seguir move o n�mero na posi��o "index" para a primeira posi��o,
		// caso seja necess�rio
		while (index > 0 && (array[index] < array[index - 1])) {
			// Armazena o n�mero na posi��o "index" em uma vari�vel tempor�ria
			int temp = array[index];
			// Move o n�mero da posi��o "index - 1" para a posi��o "index"
			array[index] = array[index - 1];
			// Move o n�mero armazenado na vari�vel tempor�ria para a posi��o "index - 1"
			array[index - 1] = temp;
			// Decrementa o �ndice para continuar comparando e movendo o n�mero
			index--;
		}

		System.out.println("\nSaida: ");
		// Imprime o array de sa�da
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
	}
}
