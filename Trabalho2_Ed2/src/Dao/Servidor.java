package Dao;

import Entity.Veiculo;

public class Servidor {
	Hash root;

	// Construtores
	public Servidor(int tam, boolean adress) {
		root = new Hash(tam, adress);
	}

	public void Cadastrar(Veiculo cadastro) {
		root.Insert(cadastro);
	}
	
	public void Remover(String placa, long chave) {
		root.Remove(placa, chave);
	}
	
	public Veiculo Buscar(String placa, long chave) {
		return root.Search(placa ,chave);
	}
	
	public boolean Editar(String placa, long chave) {
		if(root.Edit(placa, chave)) {
			return true;
		}
		return false;
	}
	
	public void Listar() {
		root.List();
	}
	
	public void ListarVet() {
		root.ListarVet();
	}

	public int Quantidade() {
		
		return root.Amount();
	}

}
