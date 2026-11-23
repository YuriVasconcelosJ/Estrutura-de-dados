package cap1;

public class Exercicio01 {

    public static int findMinorValue(int[] numbers) {
        int inicio = 0;
        int fim = numbers.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            if (numbers[meio] == meio) {
                inicio = meio + 1;
            } else if (numbers[meio] != meio) {
                fim = meio - 1;
            }

        }

        return inicio;
    }

    public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 4, 5, 6, 11, 15 }; // Resultado esperado: 3
        int[] numbers2 = { 1, 2, 3, 4, 6, 9, 11, 15 }; // Resultado esperado: 0
        int[] numbers3 = { 0, 1, 2, 3, 4, 5, 6 }; // Resultado esperado: 7

        int value = findMinorValue(numbers);
        int value2 = findMinorValue(numbers2);
        int value3 = findMinorValue(numbers3);
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);

    }
}
