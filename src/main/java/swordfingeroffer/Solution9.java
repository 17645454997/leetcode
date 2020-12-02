package swordfingeroffer;

public class Solution9 {


    public static boolean exist(char[][] board, String word) {
        char[] wordArray = word.toCharArray();
        int k = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == wordArray[k]&& k + 1 < wordArray.length) {
                    k++;
                    if (i - 1 >= 0) {
                        if (board[i - 1][j] == wordArray[k] && k + 1 < wordArray.length) {
                            k++;
                            break;
                        }
                    }
                    if (i + 1 < board.length) {
                        if (board[i + 1][j] == wordArray[k] && k + 1 < wordArray.length) {
                            k++;
                            break;
                        }

                    }
                    if (j - 1 >= 0) {
                        if (board[i][j - 1] == wordArray[k] && k + 1 < wordArray.length) {
                            k++;
                            break;
                        }

                    }
                    if (j + 1 < board[0].length) {
                        if (board[i][j + 1] == wordArray[k] && k + 1 < wordArray.length) {
                            k++;
                            break;
                        }

                    }

                }

            }
        }
        return k == wordArray.length - 1;
    }

    public static void main(String[] args) {
         // char[][] board= {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        char[][] board = {{'a','b'},{'c','d'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
}
