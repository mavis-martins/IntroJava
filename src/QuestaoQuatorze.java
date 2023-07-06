import java.util.Scanner;

public class QuestaoQuatorze {
    public static void main (String [] args) {
        //Faça um programa que utilize a estrutura while para ler 50 números
        // e calcule e exiba a média aritmética deles. (Pesquise sobre como realizar entrada de dados)
        Scanner scanner = new Scanner(System.in);

        int x = 1;
        int cont = 0;

        while(x <= 50){
            System.out.println("Digite um número ");
            int numero = scanner.nextInt();

            cont += numero;
            x++;

        }
        double media = (double) cont/(x-1);
        System.out.println("Média = " + media);
    }
}
