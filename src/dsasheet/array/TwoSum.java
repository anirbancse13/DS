package dsasheet.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++){
            int value = target - nums[i];
            map.put(value,i);
        }
        System.out.print(map);
        for (int i = 0; i< nums.length; i++){
            if(null != map.get(nums[i]) && i != map.get(nums[i])){
                result[0] = i;
                result[1] = map.get(nums[i]);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(nums,target));
    }
}
