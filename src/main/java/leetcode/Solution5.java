package leetcode;

public class Solution5 {



    public static int climbStairs(int n) {
       int []memo=new int[n+1];
       return   climbStairsMemo(n,memo);
    }
    public static int  climbStairsMemo(int n,int []memo){
        if(memo[n]>0){
            return memo[n];
        }
         if(n<=3){
             return n;
         }else {
      return   memo[n]=climbStairsMemo(n-1,memo)+climbStairsMemo(n-2,memo);
         }
    }
    public static void main(String args[]) {

    		System.out.println(climbStairs(40));
    	}
}
