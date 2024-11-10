class climbingStairs {
    public static int climbStairs(int n) {
        if(n==1) return 1; 
        if(n==2) return 2; 
        int dp[] = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for(int i = 2; i<n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        System.out.println("Number of ways to climb 2 stairs: " + climbStairs(2));

        System.out.println("Number of ways to climb 3 stairs: " + climbStairs(8));

        System.out.println("Number of ways to climb 4 stairs: " +climbStairs(16));
    }
}