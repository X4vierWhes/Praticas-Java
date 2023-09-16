package Service;

import Dao.Servidor;
import Entity.Veiculo;

public class Protocolo {
	Servidor server;

	public Protocolo() {
		server = new Servidor();
	}

	public void Cadastrar(Veiculo cadastro) {
		server.Cadastrar(cadastro);
	}

}
