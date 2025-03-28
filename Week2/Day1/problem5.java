// Problem 5: Climbing stairs

// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

//T.C : O(n) 
//S.C : O(n) 

//Solution

class problem5{
    public int climbStairs(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        for(int i =2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}