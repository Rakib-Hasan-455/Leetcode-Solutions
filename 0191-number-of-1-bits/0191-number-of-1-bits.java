public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) { // 11 = 1011
    int count = 0;
    while(n != 0) {
        count += (n & 1); // 1011 and 0001 = 0001
        n >>>= 1;         // n = 0101
    }
    return count;
    }
}