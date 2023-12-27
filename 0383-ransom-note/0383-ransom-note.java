class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arrBucket = new int[26];
        for(int i = 0; i < magazine.length(); i++) {
            arrBucket[magazine.charAt(i)-'a']++;
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            arrBucket[ransomNote.charAt(i)-'a']--;
            if(arrBucket[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}