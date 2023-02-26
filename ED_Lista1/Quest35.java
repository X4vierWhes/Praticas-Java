import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quest35 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String path = "arquivo_csvQ35.csv";
		String frase = "estude muito sempre sempre estude";

		String[] palavras = frase.split(" ");

		DicioPalavra[] dicio = new DicioPalavra[palavras.length];

		for (int i = 0; i < palavras.length; i++) {
			dicio[i] = new DicioPalavra();
			dicio[i].palavra = palavras[i];
			dicio[i].vezes = 1;
		}

		for (int i = 0; i < palavras.length; i++) {
			for (int j = i + 1; j < palavras.length; j++) {
				if (dicio[i].palavra != null && dicio[i].palavra.equals(dicio[j].palavra)) {
					dicio[i].vezes++;
					dicio[j].palavra = null;
				}
			}
		}

		String textoInput = "";
		String textoOutput = "";

		for (int i = 0; i < dicio.length; i++) {
			if (dicio[i].palavra != null) {
				textoInput += dicio[i].palavra + ";" + dicio[i].vezes + ";\n";
			}
		}

		try {
			escritor(path, textoInput);
		} catch (IOException e) {
			System.out.println("Erro na escrita");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Pane geral!");
			e.printStackTrace();
		}

		try {
			textoOutput = leitor(path);
			System.out.print(textoOutput);
		} catch (IOException e) {
			System.out.println("Erro na leitura");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Pane geral!");
			e.printStackTrace();
		}

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
