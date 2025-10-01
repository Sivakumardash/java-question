package string;
import java.util.HashSet;
public class longest_substring_without_duplicate 

{
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>(); // to store unique characters
        int left = 0;  // start of sliding window
        int maxLen = 0; // result: longest substring length

        // expand the window with right pointer
        for (int right = 0; right < s.length(); right++) {
            // if current character already exists, shrink window from left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // add current character to set
            set.add(s.charAt(right));
            // update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    // Just for quick testing
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(lengthOfLongestSubstring(""));         // 0
        System.out.println(lengthOfLongestSubstring("dvdf"));     // 3 ("vdf")
    }
}
