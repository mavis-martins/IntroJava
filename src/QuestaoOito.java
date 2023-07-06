import java.util.Scanner;

public class QuestaoOito {
    public static void main (String [] args) {
        //Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if(numero %2 == 0) {
            System.out.println(numero + " é um número par!");
        } else {
            System.out.println(numero + " é um número ímpar!");
        }
    }
}
