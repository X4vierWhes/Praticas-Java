import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entity.Condutor;
import Entity.Veiculo;

public class Main {

	public static void main(String [] args) {
		Cliente<Veiculo> client = new Cliente<Veiculo>();
		List<Veiculo> list = new ArrayList<Veiculo>();
		//ArvoreAVL<Veiculo> arvore = new ArvoreAVL<Veiculo>();
		//Veiculo(String placa, String renavam, String modelo, int fabricacao, Condutor condutor)
		
		//client.Cadastrar(new Veiculo("123456", "0003889", "celta", 2007, new Condutor("Whesley", "12345678945")));
		//client.Cadastrar(new Veiculo("123456", "0003888", "celta", 2007, new Condutor("Felipe", "12345678945")));
		//client.Cadastrar(new Veiculo("123456", "0003887", "celta", 2007, new Condutor("Vinicius", "12345678945")));
		//client.Cadastrar(new Veiculo("123456", "0004886", "celta", 2007, new Condutor("Eduardo", "12345678945")));
		//client.Cadastrar(new Veiculo("123456", "0004887", "celta", 2007, new Condutor("Joao", "12345678945")));
		//client.Cadastrar(new Veiculo("123456", "0002887", "celta", 2007, new Condutor("Diogo", "12345678945")));
		//client.Cadastrar(new Veiculo("123456", "0004885", "celta", 2007, new Condutor("Mateus", "12345678945")));
		//client.Cadastrar(new Veiculo("123456", "0004889", "celta", 2007, new Condutor("Nickolas", "12345678945")));
		//client.Cadastrar(new Veiculo("123456", "0004888", "celta", 2007, new Condutor("Valentina", "12345678945")));
		//client.Cadastrar(new Veiculo("123456", "0002885", "celta", 2007, new Condutor("Sarah", "12345678945")));
		//client.Cadastrar(new Veiculo("123456", "0004890", "celta", 2007, new Condutor("Xavier", "12345678945")));
		
		//client.Listar();
		
		client.Cadastrar(new Veiculo("123456", "23", "celta", 2007, new Condutor("Whesley", "12345678945")));
		client.Cadastrar(new Veiculo("123456", "15", "celta", 2007, new Condutor("Felipe", "12345678945")));
		client.Cadastrar(new Veiculo("123456", "25", "celta", 2007, new Condutor("Vinicius", "12345678945")));
		client.Cadastrar(new Veiculo("123456", "12", "celta", 2007, new Condutor("Joao", "12345678945")));
		client.Cadastrar(new Veiculo("123456", "19", "celta", 2007, new Condutor("Jorge", "12345678945")));
		client.Cadastrar(new Veiculo("123456", "29", "celta", 2007, new Condutor("Diogo", "12345678945")));
		client.Cadastrar(new Veiculo("123456", "10", "celta", 2007, new Condutor("Luiz", "12345678945")));
		client.Remover(new Veiculo("123456", "29", "celta", 2007, new Condutor("Vinicius", "12345678945")));
		
		
			boolean flag = true;
			int i = 0;
			Scanner cin = new Scanner(System.in);
			
			while(flag) {
				
				System.out.println(
						"Cadastrar (1) \n" + 
						"Listar (2) \n" +
						"Alterar (3) \n" +
						"Remover (4) \n" +
						"Quantidade (5) \n" +
						"Buscar (6) \n" +
						"Sair (7)"				
						);
				i = cin.nextInt();
				
				switch(i) {
				//Cadastrar
				case 1: 
					System.out.println("Entre com o Nome do Condutor: ");
					String name = cin.next();
					System.out.println("Entre com o CPF do Condutor: ");
					String cpf = cin.next();
					System.out.println("Entre com o MODELO do veiculo: ");
					String modelo = cin.next();
					System.out.println("Entre com o ano de FABRICAÇÃO do veiculo: ");
					int ano = cin.nextInt();
					System.out.println("Entre com o RENAVAM do veiculo: ");
					String renavam = cin.next();
					System.out.println("Entre com o PLACA do veiculo: ");
					String placa = cin.next();
						
			client.Cadastrar(new Veiculo(placa, renavam, modelo, ano, new Condutor(name, cpf)));
					
			break;
			//Listar
				case 2: 
					client.Listar();
					break;
				case 3: 
					break;
			//Remover
				case 4: 
					
					list = client.OrdemToArray();
					Veiculo remover = null;
					boolean achou = false;
					System.out.println("Digite o NOME do condutor que deseja excluir: ");
					String procurando = cin.next();
					
						for(Veiculo a : list) {
							if(a.getName().equalsIgnoreCase(procurando)) {
								remover = a;
								achou = true;
								break;
							}
						}
						
						if(achou) {
							System.out.println("Tem certeza que deseja remover " + remover.getName() + "\n" +
									"Dados: " + "\n" +
									"CPF: " + remover.getCpf() + "\n" +
									"Carro: " + remover.getModelo() + "\n" + 
									"Ano: " + remover.getFabricacao() + "\n" + 
									"Placa: " + remover.getPlaca() + "\n" +
									"Renavam: " + remover.getRenavam() + "\n" +
									"Digite (S) para SIM e (N) para NAO:" );
							
								String escolha = cin.next();
								
								switch(escolha) {
								case "s":
								case"S":
									client.Remover(remover);
									break;
								case "n":
								case "N":
									break;
								}
						}else {
							System.out.println("Não encontrado.");
						}
						
					break;
				case 5: 
					break;
				case 6:
					//Sair
				case 7: flag = false;
					break;
				default: 
					break;
					
				}
				
			}
			
			cin.close();
			
			System.out.println("Volte sempre");
		}

}
