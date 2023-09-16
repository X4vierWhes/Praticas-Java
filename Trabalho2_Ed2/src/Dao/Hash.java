package Dao;

import Entity.Veiculo;

public class Hash {
	Node root;

	public Hash() {

	}
}

class Node {
	private Veiculo valor;
	private Node next;
	private long chave;

	public Node() {
		this.setChave(0);
		this.setValor(null);

	}

	public Node(Veiculo value, long chave) {
		this.setChave(chave);
		this.setValor(value);

	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Veiculo getValor() {
		return valor;
	}

	public void setValor(Veiculo valor) {
		this.valor = valor;
	}

	public long getChave() {
		return chave;
	}

	public void setChave(long chave) {
		this.chave = chave;
	}

}