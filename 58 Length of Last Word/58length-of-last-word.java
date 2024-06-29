class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        String[] words = s.split("\\s+");
        String str = words[words.length - 1];

        return str.length();
    }
}