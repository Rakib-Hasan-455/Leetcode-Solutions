class Solution {
    public int countBinarySubstrings(String s) {
        int ans = 0, repeatedCount = 1, previous = 0;
        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                repeatedCount++;
            } else {
                ans += Math.min(repeatedCount, previous);
                previous = repeatedCount;
                repeatedCount = 1;
            }
        }
        return ans  + Math.min(repeatedCount, previous);
    }
}