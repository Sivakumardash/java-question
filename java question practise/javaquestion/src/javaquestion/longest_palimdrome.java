package javaquestion;


public class longest_palimdrome  {
    // Function to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";  // Edge case: empty string

        String longest = "";  // To store the result

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome (center at i)
            String odd = expand(s, i, i);

            // Even length palindrome (center between i and i+1)
            String even = expand(s, i, i + 1);

            // Pick the longer one between odd/even
            String current = odd.length() > even.length() ? odd : even;

            // Update longest if current is bigger
            if (current.length() > longest.length()) {
                longest = current;
            }
        }

        return longest;
    }

    // Expand from the center and return palindrome substring
    private static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;   // move left pointer outward
            right++;  // move right pointer outward
        }
        // substring from (left+1) to right (exclusive)
        return s.substring(left + 1, right);
    }

    // Main function to test
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // "bab" or "aba"
        System.out.println(longestPalindrome("cbbd"));  // "bb"
        System.out.println(longestPalindrome("a"));     // "a"
        System.out.println(longestPalindrome("ac"));    // "a" or "c"
    }
}
