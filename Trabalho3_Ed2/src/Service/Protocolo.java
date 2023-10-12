package Service;

import Dao.Servidor;
import Entity.Veiculo;
import java.util.Scanner;

public class Protocolo {
	Servidor server;
	Huffman huff;
	

	public Protocolo(int tam, boolean adress) {
		server = new Servidor(tam, adress);
		huff = new Huffman();
	}

	public void Cadastrar(Veiculo cadastro) {
		server.Cadastrar(cadastro);
		String tostring = cadastro.toString(1);
		System.out.println(tostring);
		
		
	}

	public void Remover(String placa, long chave) {
		server.Remover(placa, chave);
	}
	
	public Veiculo Buscar(String placa, long chave) {
		return server.Buscar(placa ,chave);
	}
	
	public boolean Editar(String placa, long chave) {
		Veiculo editar = Buscar(placa, chave);
		
		if(editar != null) {
			System.out.println(editar.toString());
			System.out.println("Deseja editar? (S/N)");
			Scanner cin = new Scanner(System.in);
			String escolha = cin.next();
			
			switch(escolha) {
			case "n":
			case "N": 
				break;
			case "s":
			case "S": 
				return server.Editar(placa, chave);
			
			}
			
			
		}
		
		return false;
		
		
	}
	
	public void Listar() {
		server.Listar();
	}

	public int Quantidade() {
		return server.Quantidade();
	}
	
	public void Printar(long keyPrintar) {
		server.Printar(keyPrintar);
	}

	public void Encerrar() {
		server.Encerrar();
		System.out.println("Protocolo encerrado.");
		
	}
}
