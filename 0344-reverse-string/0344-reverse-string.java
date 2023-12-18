class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i = 0; i < n/2; i++) {
            char x = s[n-i-1], y = s[i];
            s[n-i-1] = y;
            s[i] = x;
        }
    }
}