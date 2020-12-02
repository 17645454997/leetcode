package swordfingeroffer;

public class Soution10 {
    public static  int maxi;
    public static  int maxj;
    public static  int [][] tmpArr;

    public static boolean exist(char[][] board, String word) {
        maxi=board.length;
        maxj=board[0].length;
        char [] wordArr=word.toCharArray();
        if(board.length==0){
            return false;
        }
        if(word == null ||word.length()==0){
            return  true;
        }
        for(int i=0;i<board.length;i++) {
            for (int j = 0; j < board[0].length; j++) {
               if( exist(board,i,j,wordArr,0)){
                   return true;
            }
        }
        }
      return false;
    }

    public static boolean exist(char[][] board,int i,int j,char[]word,int wordIndex) {
       //长度大于word的长度 直接返回
      if(wordIndex >= word.length) {
           return true;
       }
     if (i>maxi||i<0 ||j>maxj||j<0||tmpArr[i][j]==1||board[i][j]!=word[wordIndex]){
         return  false;
     }
        tmpArr[i][j]=1;

     boolean res=exist(board,i-1,j,word,wordIndex+1)||
             exist(board,i,j+1,word,wordIndex+1)||
             exist(board,i,j-1,word,wordIndex+1)||
             exist(board,i+1,j,word,wordIndex+1);

          if(res){
              return  true;
          }
        tmpArr[i][j]=0;
         return  false;
    }

    public static void main(String[] args) {
        // char[][] board= {{'A', 'B', 'C', 'E'},
                          // {'S', 'F', 'C', 'S'},
                         // {'A', 'D', 'E', 'E'}};
        char[][] board = {{'a','b'},{'c','d'}};
        String word = "ABCCED";

        System.out.println(exist(board, word));
    }
}
