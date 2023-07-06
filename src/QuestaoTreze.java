public class QuestaoTreze {
    public static void main (String [] args) {
        // Escreva uma classe que imprima todas as possibilidades de que no lançamento
        // de dois dados tenhamos o valor 7 como resultado da soma dos valores de cada dado.

        for(int dado1 = 1; dado1 <= 7; dado1++) {
            for(int dado2 = 1; dado2 <7; dado2++){
                int somaDados = dado1 + dado2;
                if(somaDados == 7) {
                    System.out.println("Dado1 = " + dado1 + " - Dado 2 = " + dado2);
                }
            }
        }
    }
}
