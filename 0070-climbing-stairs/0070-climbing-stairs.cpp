class Solution {
public:
    int climbStairs(int n) {
        int fibo1 = 0, fibo2 = 1, next = 0;
        for (int i = 0; i < n; i++) {
            next = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = next;
        }
        return next;
    }
};