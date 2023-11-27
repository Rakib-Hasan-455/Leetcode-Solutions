//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        int xXorY = 0;
        for (int i = 0; i < nums.length; i++) {
            xXorY ^= nums[i];
        }
        // 3 ^ 4 = 7 = 111
        int rSbm = xXorY & -xXorY; // 111 ka right most bit 001
        int x = 0, y = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & rSbm) == 0) { // 001 & 001 = 1, 
                x ^= nums[i];
            } else { // 001 ^ 000 = 0, 000 ^ 
                y ^= nums[i]; 
            }
        }
        return x < y ? new int[]{x, y}: new int[]{y, x};
    }
}