import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Quest31to32 {

    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        String caminho = "pessoa.txt";
        /* Quest31, 32 */

        System.out.println("Informe quantas pessoas serão listadas");
        int qnt = cin.nextInt();
        List<Pessoa> arrayPessoas = new ArrayList<Pessoa>(qnt);

        for (int i = 0; i < qnt; i++) {
            System.out.println("Nome/Cpf/genero/Idade/Peso/Altura para a pessoa " + (i +
                    1));
            String name = cin.next();
            String cpf = cin.next();
            String gen = cin.next();
            int idade = cin.nextInt();
            double peso = cin.nextDouble();
            double altura = cin.nextDouble();

            Pessoa aux = new Pessoa(name, cpf, gen, idade, peso, altura);
            arrayPessoas.add(aux);
        }

        Arquivo.Write(caminho, arrayPessoas);
        System.out.println("Array: ");
        for (Pessoa i : arrayPessoas) {
            System.out.println(i.getName() + " " +
                    i.getCpf() + " " +
                    i.getGenero() + " " +
                    i.getIdade() + " " +
                    i.getPeso() + " " +
                    i.getAltura() + " " +
                    i.getIMC());

        }
        System.out.println("Aquivo TXT:");
        String get = Arquivo.Read(caminho);
        System.out.println(get);
        cin.close();

        System.out.println("Aquivo DAT:");

        FileOutputStream arquivo = new FileOutputStream("texto.dat");

        DataOutputStream gravadorBin = new DataOutputStream(arquivo);

        for (Pessoa i : arrayPessoas) {

            gravadorBin.writeUTF(i.getName()); // i.getName();
            gravadorBin.writeUTF(i.getCpf());// i.getCpf()
            gravadorBin.writeUTF(i.getGenero());// i.getGenero()
            gravadorBin.writeInt(i.getIdade());// i.getIdade()
            gravadorBin.writeDouble(i.getPeso());// i.getPeso()
            gravadorBin.writeDouble(i.getAltura());// i.getAltura()
            gravadorBin.writeDouble(i.getIMC());// i.getIMC());
        }
        gravadorBin.close();
        arquivo.close();

        FileInputStream input = new FileInputStream("texto.dat");
        DataInputStream data = new DataInputStream(input);
        List<Pessoa> arrayDat = new ArrayList<Pessoa>(qnt);

        for (int i = 0; i < arrayDat.size(); i++) {
            Pessoa aux2 = new Pessoa(data.readUTF(), data.readUTF(), data.readUTF(),
                    data.readInt(), data.readDouble(), data.readDouble());

            arrayDat.add(aux2);
        }

        for (Pessoa i : arrayDat) {
            System.out.println(i.getName() + " " +
                    i.getCpf() + " " +
                    i.getGenero() + " " +
                    i.getIdade() + " " +
                    i.getPeso() + " " +
                    i.getAltura() + " " +
                    i.getIMC());

        }

        input.close();
        data.close();

    }
}
