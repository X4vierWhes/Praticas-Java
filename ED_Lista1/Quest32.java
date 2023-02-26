import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quest32 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String path = "arquivo_binarioq32.dat";

		System.out.println("Digite quantas pessoas quer cadastrar: ");
		int qnt = in.nextInt();
		in.nextLine();
		List<PessoaQ32> lista = new ArrayList<>(qnt);

		for (int i = 0; i < qnt; i++) {
			PessoaQ32 p = new PessoaQ32();
			System.out.println("Pessoa n " + (i + 1));
			System.out.println("Digite o nome: ");
			p.setNome(in.nextLine());
			System.out.println("Digite o sexo: ");
			p.setSexo(in.next());
			System.out.println("Digite o cpf: ");
			p.setCpf(in.next());
			System.out.println("Digite a idade: ");
			p.setIdade(in.nextInt());
			System.out.println("Digite a altura: ");
			p.setAltura(in.nextDouble());
			System.out.println("Digite o peso: ");
			p.setPeso(in.nextDouble());

			p.setImc(p.calcularIMC());
			lista.add(p);
		}

		try {
			escritor(path, lista);
		} catch (IOException e) {
			System.out.println("Erro na escrita");
			e.printStackTrace();
		}

		// LEITURA

		try {
			List<PessoaQ32> listOutput = leitor(path);

			for (PessoaQ32 object : listOutput) {
				PessoaQ32 myObj = (PessoaQ32) object;
				System.out.print(myObj.toString());
			}

		} catch (IOException e) {
			System.out.println("Erro na leitura: IOException");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Erro na leitura: ClassNotFoundException");
			e.printStackTrace();
		}

	}

	public static void escritor(String path, List<PessoaQ32> lista) throws IOException {
		File file = new File(path);
		file.delete();
		file.createNewFile();

		ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file));

		objOutput.writeObject(lista);
		objOutput.close();
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

class PessoaQ32 implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sexo;
	private String cpf;
	private int idade;
	private double altura;
	private double peso;
	private double imc;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public double calcularIMC() {
		return peso / (altura * altura);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nSexo: " + sexo + "\nCPF: " + cpf + "\nIdade: " + idade + "\nAltura: " + altura
				+ "\nPeso: " + peso + "\nIMC: " + imc + "\n";
	}
}