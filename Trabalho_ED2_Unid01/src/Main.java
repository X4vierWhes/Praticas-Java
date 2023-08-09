import Dao.ArvoreAVL;
import Entity.Condutor;
import Entity.Veiculo;

public class Main {

	public static void main(String[] args) {
		ArvoreAVL<Veiculo> arvore = new ArvoreAVL<Veiculo>();
		//Veiculo(String placa, String renavam, String modelo, int fabricacao, Condutor condutor)
		
		arvore.Add(new Veiculo("123456", "0003889", "celta", 2007, new Condutor("Whesley", "12345678945")));
		arvore.Add(new Veiculo("123456", "0003888", "celta", 2007, new Condutor("Felipe", "12345678945")));
		arvore.Add(new Veiculo("123456", "0003887", "celta", 2007, new Condutor("Vinicius", "12345678945")));
		arvore.Add(new Veiculo("123456", "0004886", "celta", 2007, new Condutor("Eduardo", "12345678945")));
		
		arvore.ordem();
		
		}

}
