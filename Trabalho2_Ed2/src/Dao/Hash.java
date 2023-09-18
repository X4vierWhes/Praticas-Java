package Dao;

import java.util.Scanner;

import Entity.Veiculo;

public class Hash {
	Node[] root;
	private int tam;
	private int elementos;
	private boolean openAdress;
	private Scanner cin = new Scanner(System.in);
	///////////////////////////////////////////////////////////////////////////////
	//Construtores
	public Hash(int tam, boolean adress) {
		if(adress) { //Endereçamento aberto
			this.tam = calcTam(tam);
			root = new Node[this.tam];
			this.elementos = 0;
			
			if(this.tam >= tam) {
				for(int i = 0; i < this.tam; i++) {
					root[i] = new Node();
				}
			}else {
				System.out.println("Error");
			}
			
			this.openAdress = true;
			
		}else { //Endereçamento fechado
			this.openAdress = false;
		}
	}
	
	//Função que calcula o tamanho procurando o primo mais proximo;
	public int calcTam(int tam) {
		int newTam = tam*2;
		boolean flag = true;
		
		while(flag) {
			if(isPrimo(newTam)) {
				flag = false;
			}else {
				newTam--;
			}
		}
		
		return newTam;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	//Funções de inserir
	
	public void Insert(Veiculo inserir) {
		//////////////////////////////////////////////////////////////////////////
		//Calculando index que o veiculo será inserido
		int index = (int) (inserir.getChave()%100);
		
		/////////////////////////////////////////////////////////////////////////
		//acrescentar
		if(openAdress) { //Se escolhido opção de endereçamento aberto
			this.OpenInsert(this.root, inserir, index);
		}else { //Se escolhido opção de endereçamento exterior/Fechado
			this.ClosedInsert(this.root, inserir, index);
		}
		
	}
	
	//Inserir em endereçamento aberto
	private void OpenInsert(Node[] root, Veiculo cadastrar, int index) {
		boolean flag = true;
		while(flag) {
			if(root[index] != null) {
				if(root[index].getValor() == null) {
					root[index] = new Node(cadastrar);
					this.elementos++;
					flag = false;
				}else {
					index++;
				}
			}
		}
	}
	
	//Inserir em endereçamento exterior/fechado
	private void ClosedInsert(Node[]root, Veiculo cadastrar, int index) {
		
	}
	

	////////////////////////////////////////////////////////////////////////////////////////////////
	//Funções de Remover	
	public void Remove(String placa,long key) {
		//////////////////////////////////////////////////////////////////////////
		//Calculando index que o veiculo será removido
		int index = (int)key%100;
		
		//////////////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////////////
		//acrescentar
		if(openAdress) { //Se escolhido opção de endereçamento aberto
			this.OpenRemove(this.root, index, placa);
		}else { //Se escolhido opção de endereçamento exterior/Fechado
			this.ClosedRemove(this.root, index, placa);
		}
		
	}
	
	private void ClosedRemove(Node[] root2, int index, String placa) {
		// TODO Auto-generated method stub
		
	}

	private void OpenRemove(Node[] root, int index, String placa) {
	    boolean flag = true;
	    int indexEscolhido = index;
	    
	    while (flag) {
	        if (root[index] != null && root[index].getValor() != null && root[index].getValor().getPlaca().equals(placa)) {
	            // Encontrou o nó a ser removido
	            while (flag) {
	                if (index + 1 < root.length && root[index + 1] != null && root[index + 1].getIndex() == indexEscolhido) {
	                    root[index] = root[index + 1];
	                    index++;
	                } else {
	                    root[index] = null;
	                    elementos--;
	                    flag = false;
	                }
	            }
	        } else {
	            // Não encontrou, passa para o próximo índice
	            index++;
	            
	            // Verifica se atingiu o final do array
	            if (index >= root.length) {
	                flag = false;
	            }
	        }
	    }
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	//Funções de Edição
	public boolean Edit(String placa, long chave) {
		int index = (int) (chave%100);
		if(openAdress) {
			if(this.OpenEdit(this.root, placa, index)) {
				return true;
			}
			return false;
		}else {
			
		}
		
		return false;
	}
	
	private boolean OpenEdit(Node[] root, String placa, int index) {
		 
		 boolean flag = true;
		    while (flag) {
		        if (index >= 0 && index < root.length && root[index] != null && root[index].getValor() != null) {
		            if (root[index].getValor().getPlaca().equals(placa)) {
		            	System.out.println("Editar NOME do condutor: ");
		            	root[index].getValor().setName(cin.next());
		            	System.out.println("Editar CPF do condutor: ");
		            	root[index].getValor().setCpf(cin.next());
		            	System.out.println("Editar PLACA do veiculo: ");
		            	root[index].getValor().setPlaca(cin.next());
		            	System.out.println("Editar Modelo do veiculo: ");
		            	root[index].getValor().setModelo(cin.next());
		            	System.out.println("Editar Ano de FABRICACAO do veiculo: ");
		            	root[index].getValor().setFabricacao(cin.nextInt());
		                return true; // Retorna o valor encontrado
		            } else {
		                index++;
		            }
		        } else {
		            flag = false; // Não encontrou o elemento, pode sair do loop
		        }
		    }
		    cin.close();
		    return false; // Retorna null se o valor não for encontrado
		
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	//Funções de Buscar	
	public Veiculo Search(String placa, long key) {
	    int index = (int)(key%100);
	    if (openAdress) { // Buscar por endereçamento aberto
	        Veiculo encontrado = this.OpenSearch(root, placa, index);
	        if (encontrado != null) {
	            return encontrado;
	        } else {
	           return null;
	        }
	    } else { // Buscar por endereçamento fechado
	        // Lógica para endereçamento exterior/Fechado, se necessário
	    }
	    
	    return null;
	}
	private Veiculo ClosedSearch(Node[] root, String placa, int index) {
		return null;
	}

	private Veiculo OpenSearch(Node[] root, String placa, int index) {
	    boolean flag = true;
	    while (flag) {
	        if (index >= 0 && index < root.length && root[index] != null && root[index].getValor() != null) {
	            if (root[index].getValor().getPlaca().equals(placa)) {
	                return root[index].getValor(); // Retorna o valor encontrado
	            } else {
	                index++;
	            }
	        } else {
	            flag = false; // Não encontrou o elemento, pode sair do loop
	        }
	    }
	    return null; // Retorna null se o valor não for encontrado
	}

	////////////////////////////////////////////////////////////////////////////////////////////////
	//Funções de listagem
	public void List() {
	    System.out.println(this.tam);
	    if (openAdress) {
	        if (elementos != 0) {
	            for (int i = 0; i < this.tam; i++) {
	                if (root[i] != null && root[i].getValor() != null) { // Verifique se root[i] e root[i].getValor() não são nulos
	                    System.out.println(root[i].getValor().toString());
	                }
	            }
	        } else {
	            System.out.println("Hash vazia.");
	        }
	    } else {
	        // Lógica para endereçamento exterior/Fechado, se necessário
	    }
	}
	
	public void ListarVet() {
		if(openAdress) { //Listar em fomato de endeçamento aberto
			if(elementos!= 0) {
				for(int i = 0; i < this.tam; i++) {
					System.out.println(root[i].getIndex() + " --- " + root[i].getChave());
				}
			}else {
				System.out.println("Hash vazia.");
			}
		}else {
			
		}
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	//Funções de suporte
	// Função para verificar se um número é primo
    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false; // 0 e 1 não são primos
        }
        if (num <= 3) {
            return true; // 2 e 3 são primos
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false; // Números divisíveis por 2 ou 3 não são primos
        }

        // Verifica divisibilidade a partir de 5
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false; // Se for divisível por i ou i + 2, não é primo
            }
        }

        return true; // Se não foi divisível por nenhum número até a raiz quadrada, é primo
    }

	public int Amount() {
		return this.elementos;
	}
}

class Node {
	private Veiculo valor;
	private Node next, prev;
	private long chave;
	private int index;

	public Node() {
		this.setChave(-1);
		this.setValor(null);
		this.setNext(null);
		this.setPrev(null);
		this.setIndex(-1);

	}

	public Node(Veiculo value) {
		this.setIndex(value.getChave());
		this.setChave(value.getChave());
		this.setValor(value);
		this.setNext(null);
		this.setPrev(null);
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

	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = (int)index%100;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}