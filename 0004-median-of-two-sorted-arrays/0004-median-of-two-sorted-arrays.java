class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = new int[nums1.length+nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            mergedArr[i] = nums1[i];
        }
        for (int i = nums1.length, j = 0; i < mergedArr.length; i++, j++) {
            mergedArr[i] = nums2[j];
        }
        Arrays.sort(mergedArr);
        System.out.println(Arrays.toString(mergedArr));
        if (mergedArr.length%2 == 0) {
            return (mergedArr[mergedArr.length/2] + mergedArr[(mergedArr.length/2)-1])/2.0; 
        } else {
            return mergedArr[(mergedArr.length/2)];
        }    
    }
}