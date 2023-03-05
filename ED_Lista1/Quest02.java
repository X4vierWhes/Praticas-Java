import java.util.Scanner;

public class Quest02 {
    public int age;
    public String name;
    public char first_letter;
    public double height;
    Scanner cin = new Scanner(System.in);

    public void ler() {
        System.out.println("Nome: ");
        name = cin.nextLine();
        System.out.println("Idade: ");
        age = cin.nextInt();
        first_letter = name.charAt(0);
        System.out.println("Altura: ");
        height = cin.nextDouble();

    }

    public void exibir() {
        System.out.println("Nome: " + name + " Idade: " + age +
                " Primeira letra: " + first_letter + " Altura: " + height);
    }
}
