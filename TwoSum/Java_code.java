import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        int result[] = null;
        for (int index = 0; index < nums.length; index++){
            if (hashMap.containsKey(target-nums[index])){
                result = new int[]{hashMap.get(target-nums[index]), index};
                break;
            }else{
                hashMap.put(nums[index], index);
            }
        }
        return result;
    }
}
