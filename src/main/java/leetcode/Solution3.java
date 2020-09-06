package leetcode;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.math3.util.Pair;
public class Solution3 {
    private Map<Pair<Integer,Integer>,Integer>map=new HashMap<>();
    public Solution3(int[] nums) {
     for(int i=0;i<nums.length;i++){
         int sum=0;
         for(int j=i;j<nums.length;j++){
             sum+=nums[j];
             map.put(Pair.create(i,j),sum);
         }
     }
    }
    public  int sumRange(int i, int j) {
         return  map.get(Pair.create(i,j));
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        Solution3 obj = new Solution3(nums);
        int param_1 = obj.sumRange(2, 5);
        System.out.println(param_1);
    }
}
