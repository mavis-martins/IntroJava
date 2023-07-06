import java.util.Scanner;

public class QuestaoOnze {
    public static void main (String [] args){
        //Utilize a estrutura if para fazer um programa que retorne o nome de um
        //produto a partir do código do mesmo. Considere os seguintes códigos:
        //001 ? Parafuso;
        //002 ? Porca;
        //003 ? Prego;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o produto:\n001 - Parafuso\n002 - Porca\n003 - Prego");
        int codigoProduto = scanner.nextInt();

        String nomeProduto = (codigoProduto == 001) ? "Parafuso" :
                (codigoProduto == 002) ? "Porca" :
                        (codigoProduto == 003) ? "Prego" :
                                "Diversos";

        System.out.println("Produto: " + nomeProduto);
    }
}
