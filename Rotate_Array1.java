class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length ==0) {
            return;
        }
        int length = nums.length;
        int i = k % length;

        int temp=0;
        for (int n = 0; n < i; n++) {
            for (int j = (length - i + n); j > n; j--) {
                temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
    }
}
