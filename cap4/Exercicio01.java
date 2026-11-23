package cap4;

public class Exercicio01 {

    public static int sum(int[] arr, int indice) {

        if (arr.length == indice)
            return 0;

        return arr[indice] + sum(arr, indice + 1);
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 50, 60 };
        System.out.println(sum(numbers, 0));
    }

}
