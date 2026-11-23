package cap4;

public class Exercicio2 {

    public static int findMaxValue(int[] arr, int indice) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("O array não pode estar vazio.");

        if (indice == arr.length - 1)
            return arr[indice];

        // Passo recursivo: maior valor entre o elemento atual e o restante do array
        int maiorDoResto = findMaxValue(arr, indice + 1);
        return Math.max(arr[indice], maiorDoResto);
    }

    public static void main(String[] args) {
        int[] values = { 1, 5, 7, 2, 4, 6, 9 };

        System.out.println(findMaxValue(values, 0));
    }

}
