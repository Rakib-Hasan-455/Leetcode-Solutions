class Solution {
    public int maxArea(int[] height) {
        int tempMax = 0, max = 0, left = 0, right = height.length-1, minPoint = 0;
        while(left < right) {
            minPoint = Math.min(height[left], height[right]);
            tempMax = minPoint * (right - left);
            if (max < tempMax) {
                max = tempMax;
            }
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}