class Solution {
    public int divide(int dividend, int divisor) {
        
        int sign = 1;
        boolean add = false;
        if (dividend == divisor) return 1;
        if (divisor == Integer.MIN_VALUE) return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) 
            return Integer.MAX_VALUE;
        if (divisor == 1 ) return dividend;
        else if (divisor == -1) return -dividend;
        sign = (dividend >=0) == (divisor>=0) ? 1 : -1;
        divisor = Math.abs(divisor);
        if (dividend == Integer.MIN_VALUE) {
            dividend = Integer.MIN_VALUE + divisor;
            add = true;
        }
        dividend = Math.abs(dividend);
        int ans = 0;
        while (dividend >= divisor){
            dividend -= divisor;
            ans++;
        }
        if (add) return sign*(ans+1);
        return sign*ans;

    }
}