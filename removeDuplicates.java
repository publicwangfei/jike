import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int removeDuplicates(int[] nums) {
                if(nums == null || nums.length == 0){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return ++i;
    }
}
