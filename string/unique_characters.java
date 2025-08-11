package string;

public class unique_characters {

	
		
		public static boolean hasAllUniqueChars(String s) {
	        // Assuming only ASCII characters (128 possible chars)
	        if (s.length() > 128) return false; // Pigeonhole principle

	        boolean[] charSet = new boolean[128]; // track which chars we've seen

	        for (int i = 0; i < s.length(); i++) {
	            int val = s.charAt(i);
	            if (charSet[val]) {
	                // Already found this char before
	                return false;
	            }
	            charSet[val] = true; // mark this char as found
	        }

	        return true; // all chars were unique
	    }

	    public static void main(String[] args) {
	        String test1 = "hello";
	        String test2 = "world";

	        System.out.println(test1 + ": " + hasAllUniqueChars(test1)); // false
	        System.out.println(test2 + ": " + hasAllUniqueChars(test2)); // true
	    }
	

	}


