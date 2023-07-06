public class QuestaoSete {
    public static void main (String [] args) {

        //Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que a variável A passe
        //a possuir o valor da variável B e que a variável B passe a possuir o valor da variável A.
        // Apresentar os valores trocados.

        int a = 15;
        int b = 3;
        int c = a;

        a = b;
        b = c;

        System.out.println("O valor de a é: " + a + "\nE o valor de b é: " + b);

    }
}
