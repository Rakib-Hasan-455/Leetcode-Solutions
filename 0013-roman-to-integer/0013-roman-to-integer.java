class Solution {
    public int romanToInt(String s) {
        int sum = 0, prevValue = Integer.MAX_VALUE, value = 0;
        for(char c: s.toCharArray()) {
            switch(c){
                case 'I':value=1;break;
                case 'V':value=5;break;
                case 'X':value=10;break;
                case 'L':value=50;break;
                case 'C':value=100;break;
                case 'D':value=500;break;
                case 'M':value=1000;break;
            }
            if(prevValue < value) {
                sum -= prevValue*2;
            }
            sum += value;
            prevValue = value;
        }
        return sum;
    }

}