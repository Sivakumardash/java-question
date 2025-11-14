package interview_practise;

public class reverse_string {

	public static void main(String[] args) {

		
		String s="siva kumar dash";
		String reverse="";
		int n=s.length()-1;
		while(n>=0)
		{
			reverse=reverse+s.charAt(n--);
		}
		System.out.print(reverse);
	}

}
