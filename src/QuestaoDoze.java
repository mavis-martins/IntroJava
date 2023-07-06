public class QuestaoDoze {
    public static void main (String [] args) {
        //Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100,
        // usando os tipos de dados int e double

        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                double divisao = (double) i / 2;
                System.out.println("Número: " + i + " - Divisão: " + divisao);
            }
        }
    }
}
