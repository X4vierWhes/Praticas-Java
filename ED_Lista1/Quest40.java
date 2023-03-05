import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Quest40 {
	public static void main(String[] args) {
		String path = "codifica.txt";

		String textoOutput = "";
		String textoInput = "";

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

		char[] codificado = zenitpolar(textoOutput);

		for (int i = 0; i < codificado.length; i++) {
			textoInput += codificado[i];
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

		System.out.println("\n" + textoInput);
		// System.out.println(zenitpolar("zenit polar"));

	}

	public static char[] zenitpolar(String texto) {

		char[] zenit = { 'z', 'e', 'n', 'i', 't' };
		char[] polar = { 'p', 'o', 'l', 'a', 'r' };

		char[] chars = texto.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < zenit.length; j++) {
				if (chars[i] == zenit[j]) {

					chars[i] = polar[j];
				} else if (chars[i] == polar[j]) {
					chars[i] = zenit[j];
				}
			}
		}

		return chars;
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
		String somalinha = "";
		while (linha != null) {
			sbResult.append(linha + "\n");
			linha = bufferedReader.readLine();

			if (linha != null) {
				somalinha += linha;
			}

		}
		bufferedReader.close();

		return somalinha;
	}
}
