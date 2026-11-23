package cap2;

import java.util.Arrays;

public class Ordenacao {

    // public static int findMinorValue(int[] arr) {}
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Encontra o ÍNDICE do menor elemento a partir de 'i'
            int menorIndice = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menorIndice]) {
                    menorIndice = j;
                }
            }
            // Troca o menor elemento encontrado com a posição atual 'i'
            int temp = array[i];
            array[i] = array[menorIndice];
            array[menorIndice] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 50, 20, 30, 40, 10, 80, 77, 5 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
