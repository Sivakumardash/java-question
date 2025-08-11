package string;

public class palimdrome_with_alphanumeric {

	public static void main(String[] args) 
	{
		 String str = "A man, a plan, a canal: Panama";

	        if (isAlphaNumericPalindrome(str)) {
	            System.out.println("The alphanumeric part is a palindrome.");
	        } else {
	            System.out.println("The alphanumeric part is NOT a palindrome.");
	        }
	    }

	    public static boolean isAlphaNumericPalindrome(String str) {
	        // Remove non-alphanumeric characters and make lowercase
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        int left = 0;
	        int right = cleaned.length() - 1;

	        while (left < right) {
	            if (cleaned.charAt(left) != cleaned.charAt(right)) {
	                return false; // mismatch found
	            }
	            left++;
	            right--;
	        }
	        return true; // no mismatches found
	    }
	}
	