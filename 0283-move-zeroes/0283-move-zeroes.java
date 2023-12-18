class Solution {
    public void moveZeroes(int[] nums) {
        int snowBallSize = 0;
        for (int i=0;i<nums.length;i++){
            // System.out.print("iter -> "+i);
            if (nums[i]==0){
                snowBallSize++;
                // System.out.print("; "+snowBallSize);
            } else if (snowBallSize > 0) {
                // System.out.print("; "+snowBallSize);
                int t = nums[i];
                nums[i]=0;
                nums[i-snowBallSize]=t;
                // System.out.print("; swap value "+t);
                // System.out.print("; swaped to "+(i-snowBallSize));
            }
            // System.out.print("; "+Arrays.toString(nums));
            // System.out.println();
        }
    }
}