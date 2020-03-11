class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length ==0) {
            return;
        }
        int length = nums.length;
        int i = k % length;
        int[] newArr=nums.clone();
        for (int j = 0; j < i; j++) {
            nums[j] = newArr[length - i + j];
        }

        for (int n = i; n < length; n++) {
            nums[n] = newArr[n-i];
        }
    }
}
