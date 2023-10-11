package Service;

public class Huffman {

}

//Classe para representar um nó da árvore de Huffman
class HuffmanNode implements Comparable<HuffmanNode> {
	char data; // Caractere armazenado no nó
	int frequency; // Frequência do caractere
	HuffmanNode left, right; // Filhos esquerdo e direito

	public HuffmanNode(char data, int frequency) {
		this.data = data;
		this.frequency = frequency;
	}

	@Override
	public int compareTo(HuffmanNode other) {
		return this.frequency - other.frequency;
	}
	
}