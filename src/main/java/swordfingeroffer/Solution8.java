package swordfingeroffer;

public class Solution8 {

    public static int fib(int n) {
        int model=1000000007;

         if(n==0){
          return 0;
         }
          if (n==1){
              return 1;
         }
          int a,b,c=0;
              a = 0;
              b = 1;
          while (n>=2) {
               c = (a + b)%model;
               a = b ;
               b = c ;
               n--;
          }
          return  c%model;
    }

    public static void main(String[] args) {
        System.out.println(fib(48));
    }
}
