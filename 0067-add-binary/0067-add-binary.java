class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        char[] char1 = a.toCharArray();
        char[] char2 = b.toCharArray();
        int carry = 0;
        while(i >= 0 || j >= 0) {
            int sum = carry;
            if(i >= 0) sum += char1[i--] - '0';
            if(j >= 0) sum += char2[j--] - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) sb.append(carry);
        return sb.reverse().toString();
    }
}