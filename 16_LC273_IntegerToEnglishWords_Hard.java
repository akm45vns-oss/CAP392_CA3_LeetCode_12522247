class Solution {
    String[] a = {
        "", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen",
        "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };
    String[] b = {
        "", "", "Twenty", "Thirty", "Forty",
        "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    public String numberToWords(int n) {
        if (n == 0) {
            return "Zero";
        }
        return c(n);
    }
    String c(int n) {
        if (n < 20) {
            return a[n];
        }
        if (n < 100) {
            return b[n / 10] +
                   (n % 10 != 0 ? " " + c(n % 10) : "");
        }
        if (n < 1000) {
            return a[n / 100] + " Hundred" +
                   (n % 100 != 0 ? " " + c(n % 100) : "");
        }
        if (n < 1000000) {
            return c(n / 1000) + " Thousand" +
                   (n % 1000 != 0 ? " " + c(n % 1000) : "");
        }
        if (n < 1000000000) {
            return c(n / 1000000) + " Million" +
                   (n % 1000000 != 0 ? " " + c(n % 1000000) : "");
        }
        return c(n / 1000000000) + " Billion" +
               (n % 1000000000 != 0 ? " " + c(n % 1000000000) : "");
    }
}
