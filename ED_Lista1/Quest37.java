
public class Quest37 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println(sumRecursive(a, b));
		System.out.println(sumLoop(a, b));
	}

	public static int sumRecursive(int start, int end) {
		if (start > end) {
			return 0;
		} else {
			return start + sumRecursive(start + 1, end);
		}
	}

	public static int sumLoop(int start, int end) {
		int total = 0;
		for (int i = start; i <= end; i++) {
			total += i;
		}
		return total;
	}
	/*
	 * Pr�s da solu��o recursiva:
	 * 
	 * � uma solu��o elegante e concisa para problemas que s�o naturalmente
	 * recursivos.
	 * Pode ser mais f�cil de entender e explicar para outros programadores.
	 * 
	 * Contras da solu��o recursiva:
	 * 
	 * Pode consumir muita mem�ria devido � pilha de chamadas recursivas.
	 * Pode ser mais lento do que uma solu��o com estrutura de repeti��o,
	 * especialmente para problemas de tamanho grande.
	 * 
	 * Pr�s da solu��o com estrutura de repeti��o:
	 * 
	 * � mais eficiente em termos de uso de mem�ria.
	 * Pode ser mais r�pido do que uma solu��o recursiva, especialmente para
	 * problemas de tamanho grande.
	 * 
	 * Contras da solu��o com estrutura de repeti��o:
	 * 
	 * Pode ser menos elegante e mais dif�cil de entender e explicar para outros
	 * programadores.
	 * Pode ser mais dif�cil de implementar corretamente para problemas que s�o
	 * naturalmente recursivos.
	 * 
	 */
}
