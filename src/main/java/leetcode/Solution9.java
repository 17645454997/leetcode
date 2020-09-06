package leetcode;

public class Solution9 {




    public int process(int aim,int index,int []arr){
        int res=0;
        if(index==arr.length){
            return  aim==0?1:0;
        }
        for(int i=0;i*arr[index]<=aim;i++){
          res+=process(aim-arr[index]*i,index+1,arr);
        }
       return  res;
    }
    public int waysToChange(int n) {
        int[] coins = new int[]{1, 5, 10, 25};
        int[][] dp = new int[5][n + 1];  // 一般多开一个位置，0 空着不用
        // base case
        for (int i = 1; i <= 4; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= n; j++) {
                // 下面👇这部分代码是可以进一步改写的，因为从状态转移方程里面可以看到都有 dp[i-1][j],
                // 因此可以直接不用判断就赋值给 dp[i][j]，判断后再加上『 选择当前硬币时 』的补偿值就可以了

                if (j - coins[i-1] < 0){                   // 要组成的面值比当前硬币金额小，该硬币不可以选择
                    dp[i][j] = dp[i - 1][j] % 1000000007;  // 只能由 i - 1 中硬币来组成面值 j
                } else {
                    // 当前硬币可以不选，也可以选择
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - coins[i-1]]) % 1000000007;
                }
            }
        }
        return dp[4][n];
    }



}
