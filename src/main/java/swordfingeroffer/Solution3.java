package swordfingeroffer;

public class Solution3 {

    public static String replaceSpace(String s) {
        return  s.replace(" ","%20");

    }

    public static void main(String[] args) {

        System.out.println(replaceSpace("We are happy."));

    }
}
