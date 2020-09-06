package leetcode;

import com.sun.tools.javac.util.StringUtils;

import java.util.Stack;

public class Solution2 {
    public static boolean isSubsequence(String s, String t) {
        if (s == null || s == "") {
            return false;
        }
        char[] son = s.toCharArray();
        char[] dad = t.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : son) {
            stack.push(c);
        }
        for (int i = dad.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                break;
            } else if (dad[i] == stack.peek()) {
                stack.pop();
            } else {
                continue;
            }
        }
        return stack.isEmpty();
    }


    public static void main(String args[]) {
        System.out.println(isSubsequence("twn", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxtxxxxxxxxxxxxxxxxxxxxwxxxxxxxxxxxxxxxxxxxxxxxxxn"));
    }
}
