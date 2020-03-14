import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            System.arraycopy(nums2,0,nums1,nums1.length-nums2.length,nums2.length);
            Arrays.sort(nums1);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
