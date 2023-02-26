import java.util.ArrayList;

public class Quest39 {
	public static void main(String[] args) {
		CRUD<PessoaQ32> crud = new CRUD<>();

		PessoaQ32 pessoa1 = new PessoaQ32();
		pessoa1.setNome("Jo�o");
		pessoa1.setCpf("123.456.789-10");
		pessoa1.setIdade(30);
		pessoa1.setAltura(1.75);
		pessoa1.setPeso(70);
		pessoa1.setImc(pessoa1.calcularIMC());

		crud.create(pessoa1);

		PessoaQ32 pessoaLida = crud.read(0);
		System.out.println(pessoaLida.toString());

		pessoaLida.setNome("Jo�o Silva");
		crud.update(0, pessoaLida);
		pessoaLida = crud.read(0);
		System.out.println(pessoaLida.toString());

		crud.delete(0);
		pessoaLida = crud.read(0);
		System.out.println(pessoaLida == null ? "Objeto n�o encontrado" : pessoaLida.toString());
	}
}

class CRUD<T> {
	private ArrayList<T> lista;

	public CRUD() {
		lista = new ArrayList<>();
	}

	public void create(T objeto) {
		lista.add(objeto);
	}

	public T read(int index) {
		if (index >= 0 && index < lista.size()) {
			return lista.get(index);
		}
		return null;
	}

	public void update(int index, T objeto) {
		if (index >= 0 && index < lista.size()) {
			lista.set(index, objeto);
		}
	}

	public void delete(int index) {
		if (index >= 0 && index < lista.size()) {
			lista.remove(index);
		}
	}

	public ArrayList<T> getLista() {
		return lista;
	}

	public void setLista(ArrayList<T> lista) {
		this.lista = lista;
	}

}
