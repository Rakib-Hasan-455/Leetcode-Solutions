class Solution {
    public int firstMissingPositive(int[] nums) {
        // -1 1 1 3
        boolean[] positiveExist = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= nums.length) {
                positiveExist[nums[i]-1] = true;
            }
        }
        for (int i = 0; i < positiveExist.length; i++) {
            if (!positiveExist[i]) {
                return i+1;
            }
        }
        return nums.length+1;
    }
}