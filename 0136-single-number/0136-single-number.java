class Solution {
    public int singleNumber(int[] nums) {
        // soln can be done with hashmap count or set remove
        int result = 0;
        for(int i: nums) {
            result ^= i;
        }
        return result;
    }
}