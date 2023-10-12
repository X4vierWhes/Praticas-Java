package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffman {
    Map<Character, String> Codificacao = new HashMap<>();
    Map<String, Character> Decodificacao = new HashMap<>();
    
    public String comprimir(String comprimir) {
    	HashMap<Character, Integer> freqs = new HashMap<>();
    	
    	for(char a : comprimir.toCharArray()) { //Extraindo as frequencias e colocando num hash map
    		freqs.put(a, freqs.getOrDefault(a, 0) + 1);
    	}
    	
    	PriorityQueue<HuffmanNode> priority = new PriorityQueue<>();
    	
    	for(char key : freqs.keySet()) {
    		priority.add(new HuffmanNode(key, freqs.get(key)));
    	}
    	
    	HuffmanNode root = construir(priority);
    	
		return comprimir;
    	
    }
    
    public String descomprimir(String descomprimir) {
		return descomprimir;
    	
    }
    
    public HuffmanNode construir(PriorityQueue<HuffmanNode> pq) {
    	while(pq.size() > 1) {
    		HuffmanNode left = pq.poll(); //Primeira menor frenquencia vai para a esquerda
    		HuffmanNode right = pq.poll(); //Segunda menor frequencia vai para a direita
    	}
		return pq.poll();
    	
    }
    
    void criarTabelaDeCodigos(HuffmanNode node, String codigo) {
   
    }
    
}

//Classe para representar um nó da árvore de Huffman
class HuffmanNode implements Comparable<HuffmanNode> {
	char data; // Caractere armazenado no nó
	int frequency; // Frequência do caractere
	private HuffmanNode left, right; // Filhos esquerdo e direito

	public HuffmanNode(char data, int frequency) {
		this.data = data;
		this.frequency = frequency;
		setLeft(null);
		setRight(null);
	}
	
	public HuffmanNode(int frequencia, HuffmanNode left, HuffmanNode right) {
		this.frequency = frequencia;
		setLeft(left);
		setRight(right);
	}
	
	public HuffmanNode(char caracter, HuffmanNode left, HuffmanNode right) {
		this.data = caracter;
		setLeft(left);
		setRight(right);
	}

	@Override
	public int compareTo(HuffmanNode other) {
		return this.frequency - other.frequency;
	}

	public HuffmanNode getLeft() {
		return left;
	}

	public void setLeft(HuffmanNode left) {
		this.left = left;
	}

	public HuffmanNode getRight() {
		return right;
	}

	public void setRight(HuffmanNode right) {
		this.right = right;
	}
	
}