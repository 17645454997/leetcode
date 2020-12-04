package swordfingeroffer;
// leetcode 显示为错误答案
public class Solution11 {
    private static int  result;
    private static int  target;

    public static int movingCount(int m, int n, int k) {
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                result= movingCount(m,n,i,j,k);
            }
        }
        return result;
    }
    private static int movingCount(int m, int n,int i,int j, int k) {
        if(i>m-1||j>n-1){
            return target;
        }
        if((i/10+i%10+j/10+j%10)<=k&&i<=m-1&&j<=n-1){
            target++;
        }

        return target;
    }
    public static void main(String[] args) {
        System.out.println(movingCount(2,3,17));
    }
}
