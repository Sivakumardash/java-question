package string;

public class is_string_palimdrome {

	public static void main(String[] args) 
	{
		String s="madam";
		boolean palimdrome=true;
		int i=0;int j=s.length()-1;
		s = s.toLowerCase();
		while(i<=j)
		{
			
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				palimdrome=false;
				break;
			}
		}
		if(palimdrome==true)
		{
			System.out.println("yes the string is a palimdrome :"+ s);
		}
		else
		{
			System.out.println("not a palimdrome no");
		}
		

	}

}
