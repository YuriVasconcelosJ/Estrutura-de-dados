package cap1;

// https://leetcode.com/problems/search-insert-position

public class Exercicio02 {

    public Integer findIndex(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (numbers[mid] == target)
                return mid;
            else if (numbers[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;

        }

        return start;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 6 };

        Exercicio02 exercicio = new Exercicio02();

        System.out.println(exercicio.findIndex(numbers, 2));
    }

}
