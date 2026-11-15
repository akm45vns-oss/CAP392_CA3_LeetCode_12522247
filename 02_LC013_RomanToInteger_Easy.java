
class Solution {
    public int romanToInt(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            int val = 0;

            switch (s.charAt(i)) {
                case 'I': val = 1;
                break;
                case 'V': val = 5;
                break;
                case 'X': val = 10;
                break;
                case 'L': val = 50;
                break;
                case 'C': val = 100;
                break;
                case 'D': val = 500;
                break;
                case 'M': val = 1000; break;
            }
            if (i + 1 < s.length()) {
                char next = s.charAt(i + 1);
                if ((s.charAt(i) == 'I' && (next == 'V' || next == 'X')) ||
                    (s.charAt(i) == 'X' && (next == 'L' || next == 'C')) ||
                    (s.charAt(i) == 'C' && (next == 'D' || next == 'M'))) {
                    sum -= val;
                } else {
                    sum += val;
                }
            } else {
                sum += val;
            }
        }
        return sum;
    }
}
