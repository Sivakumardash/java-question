package string;

public class is_anagram {

	 public boolean isAnagram(String s, String t) {
	        if (s.length() != t.length()) return false;

	        int[] count = new int[26]; // by default it create a array with all value 0
	        for (int i = 0; i < s.length(); i++) {
	            count[s.charAt(i) - 'a']=count[s.charAt(i) - 'a']+1; // add 1 where character appears
	            count[t.charAt(i) - 'a']--; //subtract 1 where character appears
	        }

	        for (int c : count)
	            if (c != 0) return false;

	        return true;
	    }

	    // Optional: main method to test the function
	    public static void main(String[] args) {
	        is_anagram solution = new is_anagram();

	        System.out.println(solution.isAnagram("listen", "silent")); // true
	        System.out.println(solution.isAnagram("apple", "papel"));   // true
	        System.out.println(solution.isAnagram("rat", "car"));       // false
	        System.out.println(solution.isAnagram("aabbcc", "abcabc")); // true
	        System.out.println(solution.isAnagram("hello", "helloo"));  // false
	    }
	}