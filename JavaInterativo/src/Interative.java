import java.util.Scanner;

public class Interative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println(" Digite o seu nome! ");

        String name = scanner.nextLine();

            System.out.println("Olá, " + name );
            System.out.println("Digite qual seu sobrenome? ");

        String sobrenome = scanner.nextLine();

            System.out.println("Olá  " + name  + sobrenome);

            System.out.println("Digite sua idade!");

        int idade = scanner.nextInt();

            System.out.println("Você tem " + idade + " anos!");


    }
}
