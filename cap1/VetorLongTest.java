package cap1;

public class VetorLongTest {

    private static final int TAMANHO = 100000;

    public static void main(String[] args) {
        long[] array = new long[TAMANHO];

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                array[i] += j; 
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução: " +  (endTime - startTime)  +" ms");

        // Tempo de execução: 3716 ms - Para 100000
        /**
         * Explicação:
         *  A demora ocorre devido o algoritmo possuir dois for, fazendo com o grau de complexidade cresça exponencialmente O(n²) 
         *  100.000 x 100.000 = 10 bilhões de operações.
         */

    }

}
