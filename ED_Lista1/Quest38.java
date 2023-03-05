import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Quest38 {
	public static void main(String[] args) {
		String path = "bin32.dat";
		List<Pessoa> lista = new ArrayList<Pessoa>();
		try {
			List<Pessoa> listOutput = leitor(path);

			for (Pessoa object : listOutput) {
				Pessoa myObj = (Pessoa) object;
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

	public static <T> void printArray(List<Pessoa> lista) {

		for (Pessoa element : lista) {
			System.out.println(element.toString());
		}

	}

	@SuppressWarnings("unchecked")
	public static List<Pessoa> leitor(String path) throws IOException, ClassNotFoundException {
		List<Pessoa> lista = new ArrayList<Pessoa>();

		File file = new File(path);

		if (file.exists()) {
			ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(file));
			lista = (ArrayList<Pessoa>) objInput.readObject();
			objInput.close();
		}

		return lista;
	}
}
