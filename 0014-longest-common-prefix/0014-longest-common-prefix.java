class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuffer ans = new StringBuffer();
        char[] charStrFirst = strs[0].toCharArray();
        char[] charStrLast = strs[strs.length-1].toCharArray();
        for(int i = 0; i < Math.min(charStrFirst.length, charStrLast.length); i++) {
            if(charStrFirst[i] != charStrLast[i]) {
                return ans.toString();
            }
            ans.append(charStrFirst[i]);
        }
        return ans.toString();
    }
}