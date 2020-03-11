class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length ==0) {
            return;
        }
        int length = nums.length;
        int i = k % length;

        int temp=0;
        for (int n = 0; n < i; n++) {
            int temp=0;
            for (int j = (length - 1); j >= 1; j--) {
                temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
            }
        }
    }
}
