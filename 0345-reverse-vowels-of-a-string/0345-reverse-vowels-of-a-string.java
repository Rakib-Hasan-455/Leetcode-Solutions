class Solution {
    public String reverseVowels(String s) {
        char[] myNameChars = s.toCharArray();
        boolean[] vowels = new boolean[128];
        for(char c : "aeiouAEIOU".toCharArray()) vowels[c]=true;
        int leftPointer = 0, rightPointer = s.length() - 1;
        while (leftPointer < rightPointer) {
            boolean leftIsVowel = vowels[myNameChars[leftPointer]];
            boolean rightIsVowel =  vowels[myNameChars[rightPointer]];

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
        return String.valueOf(myNameChars);
    }
}