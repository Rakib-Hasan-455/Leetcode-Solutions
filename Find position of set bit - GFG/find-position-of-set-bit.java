//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int n) {
        // Your code here
        int count = 0;
        int position = 0;
        while (n > 0){
            count += n & 1;
            position++;
            n >>= 1;
        }
        return count == 1? position: -1;
        }
};