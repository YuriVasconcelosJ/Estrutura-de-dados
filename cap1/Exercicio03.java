package cap1;

// https://leetcode.com/problems/missing-number

public class Exercicio03 {

    public int numberMissing(int[] nums) {

        int quantityNumsInArray = nums.length;

        int total = (quantityNumsInArray * (quantityNumsInArray + 1)) / 2;

        int totalSumValues = 0;

        for (int i : nums) {
            totalSumValues += i;
        }

         return total - totalSumValues;

    }

}

/**
 * Poderiamos simplesmente subtrair diretamente de total. Economizando memória
 *   for (int i : nums) {
            total -= i;
        }

         return total;
 */