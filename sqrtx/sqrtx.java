class sqrtx {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1, right = x, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (mid <= x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args ){
        int result1 = mySqrt(4);
        System.out.println("Square root of 4: " + result1);
        int result2 = mySqrt(8);
        System.out.println("Square root of 8: " + result2);
        int result3 = mySqrt(17);
        System.out.println("Square root of 16: " + result3);
    }
}
