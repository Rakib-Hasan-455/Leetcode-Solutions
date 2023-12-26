class Solution {
    public String reverseVowels(String s) {
        char[] myNameChars = s.toCharArray();
        int leftPointer = 0, rightPointer = s.length() - 1;
        while (leftPointer < rightPointer) {
            boolean leftIsVowel = isVowel(myNameChars[leftPointer]);
            boolean rightIsVowel =  isVowel(myNameChars[rightPointer]);

            if (leftIsVowel && rightIsVowel) {
                char temp = myNameChars[leftPointer];
                myNameChars[leftPointer] = myNameChars[rightPointer];
                myNameChars[rightPointer] = temp;
                leftPointer++;
                rightPointer--;
            }
            if (!leftIsVowel) {
                leftPointer++;
            } else if (!rightIsVowel) {
                rightPointer--;
            }
        }
        return new String(myNameChars);
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}