import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Quest38 {
	public static void main(String[] args) {
		String path = "arquivo_binarioq32.dat";
		List<PessoaQ32> lista = new ArrayList<PessoaQ32>();
		try {
			List<PessoaQ32> listOutput = leitor(path);

			for (PessoaQ32 object : listOutput) {
				PessoaQ32 myObj = (PessoaQ32) object;
				lista.add(myObj);

				printObject(myObj);
				// System.out.print( myObj.toString() );
			}

		} catch (IOException e) {
			System.out.println("Erro na leitura: IOException");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Erro na leitura: ClassNotFoundException");
			e.printStackTrace();
		}
		printArray(lista);
	}

	public static <T> void printObject(T object) {
		System.out.println(object.toString());
	}

	public static <T> void printArray(List<PessoaQ32> lista) {

		for (PessoaQ32 element : lista) {
			System.out.println(element.toString());
		}

	}

	@SuppressWarnings("unchecked")
	public static List<PessoaQ32> leitor(String path) throws IOException, ClassNotFoundException {
		List<PessoaQ32> lista = new ArrayList<PessoaQ32>();

		File file = new File(path);

		if (file.exists()) {
			ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(file));
			lista = (ArrayList<PessoaQ32>) objInput.readObject();
			objInput.close();
		}

		return lista;
	}
}
