 import java.util.*; 
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
Set set= new HashSet();
        for (int value : nums) {
            if(!set.contains(value)) {
            set.add(value);
            nums[j++] = value;
            }
}
      return j;
    }
}