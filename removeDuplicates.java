import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        nums = set.stream().mapToInt(Integer::intValue).toArray();
        return nums.length;
    }
}
