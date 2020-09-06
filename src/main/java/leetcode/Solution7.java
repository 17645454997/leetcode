package leetcode;

import java.util.Arrays;

public class Solution7 {
    public int largest1BorderedSquare(int[][] grid) {
        int length=grid.length;
        int width=grid[0].length;
        int res=0;
        // 2标示数组的长度  其中 0标示方向向左   1 标示方向向上
        int [][][]dp=new int[length+1][width+1][2];
        // 2种判断方式 1：去判断值是否为1 不为1 continue  2：直接if 判断 符合条件在进入我的操作
        // 首先令 i ，j 都为 1 判断 grid[i-1][j-1]
        for(int i=1;i<=length;i++){
            for(int j=1;j<length;j++){
                if(grid[i-1][j-1]==1){
                dp[i][j][0]=1+dp[i][j-1][0];
                dp[i][j][1]=1+dp[i-1][j][1];
           int size=Math.min(dp[i][j][0],dp[i][j][1]);
             while (dp[i][j-size+1][1]<size||dp[i-size+1][j][0]<size){
                 size--;

             }
             res=Math.max(res,size*size);
                }
            }
        }
       return  res;
    }





    public static void main(String[] args) {
        
    }
}
