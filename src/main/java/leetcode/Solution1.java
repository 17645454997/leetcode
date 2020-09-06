package leetcode;

public class Solution1 {
    public static int maxSubArray(int[] nums) {
        //定义标识量max
        int max=Integer.MIN_VALUE;
        //定义标识更新量target
         int target=0;
         int total=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            if(nums[i]<0&&(total+nums[i])<0){
                total=0;
                continue;
            }else {
                target=nums[i];
            }
            if(total>=0){
                total=total+target;
            }
            max=Math.max(max,total);
        }
        return max;
    }
    public static void main(String args[]) {
        int []arr={-1,-2};

    		System.out.println(maxSubArray(arr));
    	}
}
