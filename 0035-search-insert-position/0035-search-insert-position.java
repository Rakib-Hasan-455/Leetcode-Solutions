class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int ans = 0;
        while (left <= right) {
            int middle = (left+right)/2;
            if (nums[middle] == target) {
                ans = middle;
                break;
            } else if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            }
            if (left > right) {
                ans = left;
            }
        }
        return ans;
    }
}