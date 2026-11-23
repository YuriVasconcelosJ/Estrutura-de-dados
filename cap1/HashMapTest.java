package cap1;
import java.util.HashMap;

import cap1.dominios.Produto;

public class HashMapTest {

    private static final int TAMANHO = 100000;

    public static void main(String[] args) {

        HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();

        for (int i = 0; i < TAMANHO; i++) {
            mapa.put(i, new Produto(i, "produto" + i, i * 20.00));
        }

        long startTime = System.currentTimeMillis();
        int codigoASerEncontrado = TAMANHO;

        for (int i = 0; i < TAMANHO; i++) {
            Produto p = mapa.get(codigoASerEncontrado);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (endTime - startTime) + " ms");

        // Tempo de execução: 7 ms
        /**
         * Explicação: Um HashMap calcula uma função de hash em cima da chave
         * Em vez dele percorrer os dados por Pesquisa linear O(n), ele vai direto no endereço de memória estimado pelo Hash. Por isso ele, possui uma grau de complexidade de O(1).
         */

    }

}
