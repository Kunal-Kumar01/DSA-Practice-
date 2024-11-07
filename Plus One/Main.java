import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        
        int rem = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i] + rem;
            if (temp > 9) {
                digits[i] = 0;
                rem = 1;
            } else {
                digits[i] = temp;
                return digits;
            }
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;

        for (int i = 0; i < digits.length; i++) {
            res[i + 1] = digits[i];
        }

        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] digits = {9, 9, 9}; 
        int[] result = solution.plusOne(digits);

        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
