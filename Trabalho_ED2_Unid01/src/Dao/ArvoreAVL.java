package Dao;

public class ArvoreAVL<T> {
	  Node<T> root;
	
	 

////////////////////////////////////////////////////////////
	  //Construtores:
	  public ArvoreAVL() {
		  root = new Node<T>();
	  }
	
	 
/////////////////////////////////////////////////////////////	 
	 //Funções:
	 
	 //Funçao de ordem
	 public void ordem() {
		 ordem(root);
	 }
	 
	 public void ordem(Node<T> node) {
		 if(node != null) {
			 ordem(node.getEsquerda());
			 System.out.println(node.getChave() + " : " + node.getValor());
			 ordem(node.getDireita());
			 
		 }
	 }
	 
	//Funcao para calcular o balanceamento do no
	public void Balanceamento() {
		//Fator balanceamento = alturaDireita - alturaEsquerda;
		//Fator balanceamento deve estar entra -1 >= x <= 1;
		//Se fator de balancemaneto do node pai for +2 esta desbalanceado para a direita, logo será feito balancemento pra esquerda
		//Se fator de balancemaneto do node pai for -2 esta desbalanceado para a esquerda, logo será feito balancemento pra direita
		//Se fator de balancemento do node pai for +2 e do filho -1, sera feito rotaçao dupla direita esquerda
		//Se fator de balancemento do node pai for -2 e do filho +1, sera feito rotaçao dupla esquerda direita
		this.CalcBalanceamento(root);
		
		
	}

	public void CalcBalanceamento(Node<T> nodeAtual) {
		
	}
	 
	 
	//Função para adicionar na arvore
	public void Add(T elemento, int chave) {
		this.root = this.Add(root, elemento, chave);
	}
	
	public Node<T> Add(Node<T> noAtual, T elemento, int chave){
		
		if(noAtual == null) {
			return new Node<T>(elemento, chave);
		}
		
		if(noAtual.getChave() > chave) {
			
		}else if(noAtual.getChave() < chave) {
			
		}
		return noAtual;
		
	}
	
	public void Remove(T elemento){
	}
	
	public void Buscar() {
		
	}
	
	//Função para fazer rotação simples para direita
	public Node<T> RSD(Node<T> node) { 
		Node<T> novo = node.getEsquerda();
		novo.setDireita(node);
		node = novo;
		
		return node;		
	}
	
	//Funçao de rotaçao dupla direita esquerda
	public Node<T> RDDE(Node<T> node){
		return node;
		
	}		
	
	//Função para fazer rotação simples para esquerda
	public Node<T> RSE(Node<T> node) {
		Node<T> novo = node.getDireita();
		novo.setEsquerda(node);
		node = novo;
		
		return node;		
	}
	
	//Funçao de rotaçao dupla esquerda direita
		public Node<T> RDED(Node<T> node){
			return node;
			
		}
		
/////////////////////////////////////////////////////////////////////
		//Getters e Setters
	
}


class Node<T>{
	private T valor;
	private Node<T> direita, esquerda;
	private int chave, balanceamento;
	
	public Node(){
		this.setChave(0);
		this.setBalanceamento(0);
		this.setValor(null);
		this.setDireita(null);
		this.setEsquerda(null);
	}
	
	public Node(T value, int chave){
		this.setChave(chave);
		this.setBalanceamento(0);
		this.setValor(value);
		this.setDireita(null);
		this.setEsquerda(null);
	}

	
	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}


	public Node<T> getDireita() {
		return direita;
	}


	public void setDireita(Node<T> direita) {
		this.direita = direita;
	}


	public Node<T> getEsquerda() {
		return esquerda;
	}


	public void setEsquerda(Node<T> esquerda) {
		this.esquerda = esquerda;
	}


	public int getChave() {
		return chave;
	}


	public void setChave(int chave) {
		this.chave = chave;
	}


	public int getBalanceamento() {
		return balanceamento;
	}


	public void setBalanceamento(int balanceamento) {
		this.balanceamento = balanceamento;
	}
	

	
}