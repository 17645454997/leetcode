package swordfingeroffer;

public class Solution12 {

    public static int hammingWeight(int n) {
     int result=0;
     while (n!=0){
         result+=n&1;
         n=n>>>1;
     }
     return  result;
    }


    public static void main(String[] args) {
      System.out.println(hammingWeight(9));
    }
}
