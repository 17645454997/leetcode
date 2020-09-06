package leetcode;

import org.apache.commons.math3.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class Solution4 {
    private int[]sum;
    public Solution4(int[] nums) {
        sum=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
           sum[i+1]=sum[i]+nums[i];
        }
    }
    public  int sumRange(int i, int j) {
        return  sum[j+1]-sum[i];
    }
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        Solution4 obj = new Solution4(nums);
        int param_1 = obj.sumRange(2, 5);
        System.out.println(param_1);
    }
}
