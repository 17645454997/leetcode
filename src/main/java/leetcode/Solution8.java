package leetcode;

public class Solution8 {
    public int deleteAndEarn(int[] nums) {
        //判空逻辑
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, nums[i]);
        }
        int[] all = new int[max + 1];
         for(int item:nums){
             all[item]++;
         }
         int []dp=new int[max+1];
         dp[1]=all[1]*1;
         dp[2]=Math.max(dp[1],all[2]*2);
        for(int i=2;i<=max;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+all[i]*i);
        }
      return  dp[max];
    }


    public static void main(String[] args) {

    }
}
