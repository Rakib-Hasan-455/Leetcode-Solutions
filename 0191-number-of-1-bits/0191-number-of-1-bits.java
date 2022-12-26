public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    String s = Integer.toBinaryString(n);
    return s.replace("0", "").length();
    }
}