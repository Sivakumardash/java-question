package string;

public class reverse_a_string {

	public static void main(String[] args) 
	{
		String s="siva";
		String reverse=" ";
		int n=s.length()-1;
		while(n>=0)
		{
			reverse=reverse+s.charAt(n);
			n--;
		}
		System.out.println("the reverse string is:"+reverse);
		
		
		
	}

}
