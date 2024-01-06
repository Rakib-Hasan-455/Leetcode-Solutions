class Solution {
    public int minFlips(String s) {
        int n = s.length();
        int[] arr = new int[2*n], arr1 = new int[2*n], arr2 = new int[2*n];
        int flip1 = 0, flip2 = 0, ans = Integer.MAX_VALUE;
        for (int i = 0; i < 2*n; i++) {
            arr[i] = s.charAt(i%n) - '0';
            arr1[i] = (i % 2 == 0) ? 1 : 0;
            arr2[i] = (i % 2 == 0) ? 0 : 1;
            flip1 += (arr[i] == arr1[i]) ? 0 : 1;
            flip2 += (arr[i] == arr2[i]) ? 0 : 1;
            if (i >= n) {
                if (arr[i-n] != arr1[i-n]) flip1--;
                if (arr[i-n] != arr2[i-n]) flip2--;
            }
            if (i >= n-1) {
                ans = Math.min(ans, Math.min(flip1,flip2));
            }
        }
        return ans;
    }
}