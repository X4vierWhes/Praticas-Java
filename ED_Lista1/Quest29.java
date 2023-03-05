
public class Quest29 {

	public static void main(String[] args) {

		int[] array = { 8, 2, 1, 6, 5 };
		int index = 2;

		System.out.println("Entrada: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}

		while (index > 0 && (array[index] < array[index - 1])) {

			int temp = array[index];
			array[index] = array[index - 1];
			array[index - 1] = temp;
			index--;
		}

		System.out.println("\nSaida: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
	}
}
