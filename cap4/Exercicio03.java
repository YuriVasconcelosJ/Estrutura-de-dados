package cap4;

public class Exercicio03 {

    public static int countNames(String arr[], int indice) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("O array não pode estar vazio.");

        if (indice == arr.length)
            return 0;

        return 1 + countNames(arr, indice + 1);
    }

    public static void main(String[] args) {
        String[] names = { "Yuri", "Hillary", "Felipe", "Aquino" }; // 4 elemtos
        System.out.println(countNames(names, 0));

    }
}
