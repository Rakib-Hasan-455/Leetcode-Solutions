class Solution {
    public int[] countBits(int n) {
        int[] counted1Bits = new int[n+1];
        for (int i = 0; i <= n; i++) {
            int counted1Bit = 0;
            int digit = i;
            while (digit > 0) {
                counted1Bit += digit & 1;
                digit >>= 1;
            }
            counted1Bits[i] = counted1Bit;
        }
        return counted1Bits;
    }
}