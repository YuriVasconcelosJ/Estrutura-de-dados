package cap4;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int inicio, int fim) {
        // Caso-base
        if (inicio >= fim)
            return;

        int indicePivo = particionar(arr, inicio, fim);

        quickSort(arr, inicio, indicePivo - 1);
        quickSort(arr, indicePivo + 1, fim);

    }

    private static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (arr[j] <= pivo) {
                i++;
                trocar(arr, i, j);
            }
        }

        trocar(arr, i + 1, fim);
        return i + 1;
    }

    private static void trocar(int[] arr, int a, int b) {
        if (a != b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numeros = { 33, 10, 55, 71, 29, 5 };
        quickSort(numeros, 0, numeros.length - 1);

        System.out.println(Arrays.toString(numeros));
    }

}
