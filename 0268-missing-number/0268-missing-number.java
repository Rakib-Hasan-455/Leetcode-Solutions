class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = Arrays.stream(nums).sum();
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        return expectedSum-totalSum;
    }
}