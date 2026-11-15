
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[65536];
        int a = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
            while (freq[ch] > 1) {
                freq[s.charAt(a)]--;
                a++;
            }
            int length = i - a + 1;
            if (length > max) {
                max = length;
            }
        }
                return max;
    }
}

