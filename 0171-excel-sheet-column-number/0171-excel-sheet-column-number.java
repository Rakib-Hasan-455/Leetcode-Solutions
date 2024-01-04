class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0, i = columnTitle.length()-1;
        for(char c: columnTitle.toCharArray()) {
            int digit = (c-'A')+1;
            sum += digit * Math.pow(26, i--);
        }
        return sum;
    }
}