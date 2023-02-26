import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quest31 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite quantas pessoas quer cadastrar: ");
		int qnt = in.nextInt();

		List<Pessoa> lista = new ArrayList<Pessoa>(qnt);

		for (int i = 0; i < qnt; i++) {
			Pessoa p = new Pessoa();
			System.out.println("Pessoa n " + i);
			System.out.println("Digite o nome: ");
			p.setNome(in.next());
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

		System.out.println(lista);

	}
}

class Pessoa {
	private String cpf, nome, sexo;
	private int idade;
	private double altura, peso, imc;

	public String toString() {
		String info = "Nome: " + nome + " Sexo: " + sexo + " Cpf: " + cpf
				+ " Idade: " + idade + " Altura: " + altura + " Peso: " + peso + " Imc: " + imc + "\n";
		return info;
	}

	public double calcularIMC() {
		imc = peso / (altura * altura);
		return imc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

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
}
