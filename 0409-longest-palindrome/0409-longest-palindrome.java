class Solution {
    public int longestPalindrome(String s) {
        int[] countArr = new int[128];
        int palinCount = 0;
        for(char c: s.toCharArray()) {
            countArr[c-'A'] += 1;
        }
        int maxOdd = 0;
        boolean oddExists = false;
        for(int count: countArr) {
            if (count % 2 == 0) {
                palinCount += count;
                count = 0;
            } else {
                oddExists = true;
                palinCount += (count - 1);
            }
        }
        return oddExists?palinCount+1: palinCount;
    }
}