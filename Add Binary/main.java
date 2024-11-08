class Solution {
    public String addBinary(String a, String b) {
        int minlen = Math.min(a.length(), b.length());
        String maxstr = (a.length() > b.length()) ? a : b;
        String res = "";
        int rem = 0;

        for (int i = 0; i < minlen; i++) {
            int sum = Character.getNumericValue(a.charAt(a.length() - 1 - i)) + 
                      Character.getNumericValue(b.charAt(b.length() - 1 - i)) + 
                      rem;
            
            if (sum == 3) {
                res = '1' + res;
                rem = 1;
            } else if (sum == 2) {
                res = '0' + res;
                rem = 1;
            } else if (sum == 1) {
                res = '1' + res;
                rem = 0;
            } else {
                res = '0' + res;
                rem = 0;
            }
        }
        
        for (int i = maxstr.length() - minlen - 1; i >= 0; i--) {
            int sum = Character.getNumericValue(maxstr.charAt(i)) + rem;
            
            if (sum == 2) {
                res = '0' + res;
                rem = 1;
            } else if (sum == 1) {
                res = '1' + res;
                rem = 0;
            } else {
                res = '0' + res;
                rem = 0;
            }
        }

        if (rem == 1) {
            res = '1' + res;
        }

        return res;
    }

    public static void main(String[] args) { 
        Solution solution = new Solution();
        String result1 = solution.addBinary("1001", "101");
        System.out.println("Result of adding 1001 and 101: " + result1);
        String result2 = solution.addBinary("111", "1");
        System.out.println("Result of adding 111 and 1: " + result2);
        String result3 = solution.addBinary("1010", "1011");
        System.out.println("Result of adding 1010 and 1011: " + result3);
    }
}
