package leetcode;

public class Solution6 {
    public static boolean divisorGame(int N) {
        boolean sign = false;
        int j;
        for (int x = 2; x < N; x++) {
            if (N % x == 0 && N % x != 2) {
                continue;
            }
            sign = true;
            for (j = 2; j < Math.sqrt(N); j++) {
                if (N % x % j == 0) {
                    sign = false;
                    break;
                }
            }
        }
        return sign;

    }


    public static void main(String args[]) {
        System.out.println(divisorGame(3));
    }
}
