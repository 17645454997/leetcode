package swordfingeroffer;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public int findRepeatNumber(int[] nums) {
        int[] resultNums = new int[nums.length];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                resultNums[nums[i]]++;
            }
        }
        for (int i = 0; i < resultNums.length; i++) {
            if (resultNums[i] > 1) {
                result = i;
            }
        }
        return result;
    }
}
