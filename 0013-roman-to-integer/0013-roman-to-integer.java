class Solution {
    public int romanToInt(String s) {
        int sum = 0, prevValue = Integer.MAX_VALUE;
        for(char c: s.toCharArray()) {
            int value = getValue(c);
            if(prevValue < value) {
                sum -= prevValue*2;
            }
            sum += value;
            prevValue = value;
        }
        return sum;
    }
    
    private int getValue(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}