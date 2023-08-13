
import java.util.List;

import Service.Protocolo;

public class Cliente<T> {
	
	Protocolo<T> protocol;
	
	public Cliente() {
		protocol = new Protocolo<T>();
	}
	
	
	public void Buscar() {
		
	}
	
	public void Cadastrar(T elemento) {
		protocol.cadastrar(elemento);
	}
	
	public void Editar() {
		
	}
	
	public void Remover(T elemento) {
		protocol.remover(elemento);
	}
	
	public void Listar() {
		protocol.listar();
	}
	
	public List<T> OrdemToArray(){
		return protocol.OrdemToArray();
	}

	
	
}
