class Solution {
    public int romanToInt(String s) {
        int[] symbArr = new int[26];
        symbArr['I'-'A']=1;
        symbArr['V'-'A']=5;
        symbArr['X'-'A']=10;
        symbArr['L'-'A']=50;
        symbArr['C'-'A']=100;
        symbArr['D'-'A']=500;
        symbArr['M'-'A']=1000;
        int sum = 0, prevValue = Integer.MAX_VALUE;
        for(char c: s.toCharArray()) {
            int value = symbArr[c - 'A'];
            if(prevValue < value) {
                sum -= prevValue*2;
            }
            sum += value;
            prevValue = value;
        }
        return sum;
    }
}