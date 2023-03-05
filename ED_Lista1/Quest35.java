import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Quest35 {

	public static void main(String[] args) {
		String path = "arquivo35.txt";
		String texto = "Eu eu eu tu tu tu nos bota";
		String[] palavras = texto.split(" ");
		int[] contagemPalavras = new int[palavras.length];

		for (int i = 0; i < palavras.length; i++) {
			String aux = palavras[i];

			int contagem = 0;
			for (int j = 0; j < palavras.length; j++) {
				if (palavras[j].equalsIgnoreCase(aux)) {
					contagem++;
				}
			}
			contagemPalavras[i] = contagem;
		}

		String saida = "";

		for (int i = 0; i < palavras.length; i++) {
			if (contagemPalavras[i] > 0) {
				if (!palavras[i].equals(" ")) {
					saida += palavras[i] + " = " + contagemPalavras[i] + "\n";
					contagemPalavras[i] = 0;
				}
				for (int j = i + 1; j < palavras.length; j++) {
					if (palavras[j].equalsIgnoreCase(palavras[i])) {
						palavras[j] = " ";
					}
				}
			}
		}

		try {
			escritor(path, saida);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String output = "";

		try {
			output = leitor(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(output);
	}

	public static void escritor(String path, String texto) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
		bufferedWriter.append(texto);
		bufferedWriter.close();
	}

	public static String leitor(String path) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

		StringBuffer sbResult = new StringBuffer();
		String linha = "";

		while (linha != null) {
			sbResult.append(linha + "\n");
			linha = bufferedReader.readLine();

			if (linha != null) {
				String[] parts = linha.split(";");
				for (int i = 0; i < parts.length; i++) {
					// System.out.print("[" + parts[i] + "] ");
				}
			}

		}
		bufferedReader.close();

		return sbResult.toString();
	}

}
