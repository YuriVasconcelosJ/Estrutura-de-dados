package cap2;

public class BuscaMenor {

    public static int findMinorValue(int[] array) {
    
        int minor = array[0];

        for (int value : array) {
            if (value < minor) {
                minor = value;
            }
        }
        return minor;
    }

    public static void main(String[] args) {
        int[] arr = { 50, 20, 30, 40, 10, 80, 77, 5 };
        System.out.println(findMinorValue(arr));
    }

}
