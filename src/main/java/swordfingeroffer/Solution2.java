package swordfingeroffer;

public class Solution2 {



    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
                if(matrix.length<=0||matrix[0].length<=0){
                    return  false;
                }

                 int  width = matrix[0].length-1;
                 int  hitght = matrix.length-1;

                 int i = hitght;
                 int j =0 ;
                 while (j<=width && i <=hitght && i>=0) {

                     if (target > matrix[hitght][width]) {
                         return  false;
                     }
                     if (target == matrix[i][j]) {
                         return  true;
                     }
                     if (target > matrix[i][j]) {
                         j++;
                     } else if(target < matrix[i][j]) {
                         i--;
                     }

                 }

     return  false;

    }


    public static void main(String[] args) {
        int[][] nums =  {{1, 4, 7, 11, 15},
                         {2, 5, 8, 12, 19},
                         {3, 6, 9, 16, 22},
                         {10,13,14,17, 24},
                         {18,21,23,26, 30}
        };
         int [][]numss={};
        int target = 25;

      System.out.println(findNumberIn2DArray(numss,target));

        
    }
}
